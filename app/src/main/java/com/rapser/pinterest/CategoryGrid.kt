package com.rapser.pinterest

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CategoryGrid() {
    val categories = listOf(
        Category("Blue Wallpaper", R.drawable.blue_wallpaper),
        Category("Beach pictures", R.drawable.beach_pictures),
        Category("Dp for whatsapp", R.drawable.dp_for_whatsapp),
        Category("Purple aesthetic", R.drawable.purple_aesthetic),
        Category("Selfie poses", R.drawable.selfie_poses),
        Category("Easy dinner recipe", R.drawable.easy_dinner_recipe)
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(categories) { category ->
            CategoryItem(category)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoryGrid() {
    MaterialTheme {
        CategoryGrid()
    }
}
