package com.rapser.pinterest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(Color.LightGray.copy(alpha = 0.3f))
        ) {
            Text(
                text = "Search for ideas",
                color = Color.Gray,
                modifier = Modifier.align(Alignment.CenterStart).padding(start = 16.dp)
            )

            Icon(
                imageVector = Icons.Default.PhotoCamera,
                contentDescription = "Camera",
                tint = Color.Gray,
                modifier = Modifier.align(Alignment.CenterEnd).padding(end = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSearchBar() {
    MaterialTheme {
        SearchBar()
    }
}
