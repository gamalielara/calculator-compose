package com.example.calculator_jetpack_compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: androidx.compose.ui.Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = androidx.compose.ui.Modifier.clip(CircleShape).clickable { onClick.invoke() }.then(modifier)
    ){
        Text(text = symbol, fontSize = 36.sp, color = androidx.compose.ui.graphics.Color.White)
    }

}