package com.dev_challenge.bloom

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class ImageItem(val imageRes: Int, val name: String, initialChecked: Boolean = false) {
    var checked by mutableStateOf(initialChecked)
}

private val imageList: List<ImageItem> = listOf(
    ImageItem(R.drawable.monstera, "Monstera"),
    ImageItem(R.drawable.aglaonema, "Aglaonema"),
    ImageItem(R.drawable.peace_lily, "Peace lily"),
    ImageItem(R.drawable.fiddle_leaf, "Fiddle leaf tree"),
    ImageItem(R.drawable.snake_plant, "Snake plant"),
    ImageItem(R.drawable.pothos, "Pothos")
)

class BloomViewModel : ViewModel() {
    private val _items = imageList.toMutableStateList()
    val items: List<ImageItem>
        get() = _items
    fun changeItemChangeStatus(item: ImageItem, checked: Boolean) {
        items.find { it.name == item.name }?.let { it.checked = checked }
    }
}

