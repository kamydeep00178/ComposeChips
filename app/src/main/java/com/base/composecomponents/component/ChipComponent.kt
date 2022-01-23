package com.base.composecomponents.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.base.composecomponents.ui.theme.Shapes

@Composable
fun TextChip(
    isSelected: Boolean,
    text: String,
    onChecked: (Boolean) -> Unit,
    selectedColor: Color = DarkGray
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                vertical = 2.dp,
                horizontal = 4.dp
            )
            .border(
                width = 1.dp,
                color = if (isSelected) selectedColor else LightGray,
                shape = Shapes.medium
            )
            .background(
                color = if (isSelected) selectedColor else Transparent,
                shape = Shapes.medium
            )
            .clip(shape = Shapes.medium)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(4.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) White else Unspecified
        )
    }
}

@Composable
fun TextChipWithIcon(
    @DrawableRes iconId: Int,
    tintColor: Color,
    isSelected: Boolean,
    text: String,
    onChecked: (Boolean) -> Unit,
    selectedColor: Color = DarkGray
) {
    val shape = CircleShape
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                vertical = 2.dp,
                horizontal = 4.dp
            )
            .border(
                width = 1.dp,
                color = if (isSelected) selectedColor else LightGray,
                shape = shape
            )
            .background(
                color = if (isSelected) selectedColor else Transparent,
                shape = shape
            )
            .clip(shape = shape)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(4.dp)
    ) {
        Icon(
            painter = painterResource(id = iconId),
            tint = if (isSelected) White else tintColor,
            contentDescription = null
        )
        Text(
            text = text,
            color = if (isSelected) White else Unspecified
        )
    }
}


@Composable
fun TextChipWithIconVisibility(
    @DrawableRes iconId: Int,
    isSelected: Boolean,
    text: String,
    onChecked: (Boolean) -> Unit,
) {
    val shape = RoundedCornerShape(8.dp)
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                vertical = 2.dp,
                horizontal = 4.dp
            )
            .border(
                width = 1.dp,
                color = LightGray,
                shape = shape
            )
            .background(
                color = LightGray,
                shape = shape
            )
            .clip(shape = shape)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(4.dp)
    ) {
        if (isSelected) {
            Icon(
                painter = painterResource(id = iconId),
                tint = DarkGray,
                contentDescription = null
            )
        }
        Text(
            text = text,
            color = Unspecified
        )
    }
}

@Composable
fun ImageChip(
    @DrawableRes iconId: Int,
    isSelected: Boolean,
    onChecked: (Boolean) -> Unit,
    tintColor: Color
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(
                vertical = 1.dp,
                horizontal = 2.dp
            )
            .border(
                width = 1.dp,
                color = if (isSelected) tintColor else LightGray,
                shape = Shapes.small
            )
            .background(
                color = if (isSelected) tintColor else Transparent,
                shape = Shapes.small
            )
            .clip(shape = Shapes.small)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(2.dp)
    ) {
        Icon(
            painter = painterResource(id = iconId),
            tint = if (isSelected) White else tintColor,
            contentDescription = null
        )
    }
}
