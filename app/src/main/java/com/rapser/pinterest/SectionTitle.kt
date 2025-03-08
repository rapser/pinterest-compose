package com.rapser.pinterest

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSectionTitle() {
    MaterialTheme {
        SectionTitle(title = "Popular on Pinterest")
    }
}
