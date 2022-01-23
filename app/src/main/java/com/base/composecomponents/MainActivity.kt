package com.base.composecomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.base.composecomponents.component.ImageChip
import com.base.composecomponents.component.TextChip
import com.base.composecomponents.component.TextChipWithIcon
import com.base.composecomponents.component.TextChipWithIconVisibility
import com.base.composecomponents.ui.theme.ComposeComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier.padding(8.dp)) {

                        Text(text = "Select Food")

                        Row(modifier = Modifier.padding(vertical = 16.dp, horizontal = 4.dp)) {
                            //Custom Chip 1
                            val textChipRememberOneState = remember {
                                mutableStateOf(false)
                            }
                            TextChip(
                                isSelected = textChipRememberOneState.value,
                                text = "Fries",
                                selectedColor = Color.DarkGray,
                                onChecked = {
                                    textChipRememberOneState.value = it
                                }
                            )
                            //Custom Chip 2
                            val textChipRememberSecondState = remember {
                                mutableStateOf(true)
                            }
                            TextChip(
                                isSelected = textChipRememberSecondState.value,
                                selectedColor = Color.Red,
                                text = "Sandwich",
                                onChecked = {
                                    textChipRememberSecondState.value = it
                                })
                            //Custom Chip 3
                            val textChipRememberThirdState = remember {
                                mutableStateOf(true)
                            }
                            TextChip(
                                isSelected = textChipRememberThirdState.value,
                                selectedColor = Color.Blue,
                                text = "Burger",
                                onChecked = {
                                    textChipRememberThirdState.value = it
                                })
                        }

                        Row(modifier = Modifier.padding(vertical = 16.dp, horizontal = 4.dp)) {
                            //Custom Chip 1
                            val textChipRememberOneState = remember {
                                mutableStateOf(false)
                            }
                            TextChipWithIcon(
                                iconId = R.drawable.ic_favorite,
                                tintColor = Color.Red,
                                isSelected = textChipRememberOneState.value,
                                text = "Pizza",
                                selectedColor = Color.Red,
                                onChecked = {
                                    textChipRememberOneState.value = it
                                }
                            )
                            //Custom Chip 2
                            val textChipRememberSecondState = remember {
                                mutableStateOf(true)
                            }
                            TextChipWithIcon(
                                iconId = R.drawable.ic_favorite,
                                tintColor = Color.Green,
                                isSelected = textChipRememberSecondState.value,
                                text = "Subway",
                                selectedColor = Color.Green,
                                onChecked = {
                                    textChipRememberSecondState.value = it
                                }
                            )
                        }

                        Row(modifier = Modifier.padding(vertical = 16.dp, horizontal = 4.dp)) {
                            //Custom Chip 1
                            val textChipRememberOneState = remember {
                                mutableStateOf(false)
                            }
                            TextChipWithIconVisibility(
                                iconId = R.drawable.ic_done,
                                isSelected = textChipRememberOneState.value,
                                text = "Pizza",
                                onChecked = {
                                    textChipRememberOneState.value = it
                                }
                            )
                            //Custom Chip 2
                            val textChipRememberSecondState = remember {
                                mutableStateOf(true)
                            }
                            TextChipWithIconVisibility(
                                iconId = R.drawable.ic_done,
                                isSelected = textChipRememberSecondState.value,
                                text = "Pizza",
                                onChecked = {
                                    textChipRememberSecondState.value = it
                                }
                            )
                        }

                        Row(modifier = Modifier.padding(vertical = 16.dp, horizontal = 4.dp)) {
                            //Custom Chip 1
                            val textChipRememberOneState = remember {
                                mutableStateOf(false)
                            }
                            ImageChip(
                                iconId = R.drawable.ic_filter,
                                isSelected = textChipRememberOneState.value,
                                onChecked = {
                                    textChipRememberOneState.value = it
                                },
                                tintColor = Color.Blue
                            )
                            //Custom Chip 2
                            val textChipRememberSecondState = remember {
                                mutableStateOf(true)
                            }
                            ImageChip(
                                iconId = R.drawable.ic_delete,
                                isSelected = textChipRememberSecondState.value,
                                onChecked = {
                                    textChipRememberSecondState.value = it
                                },
                                tintColor = Color.Red
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeComponentsTheme {
        Greeting("Android")
    }
}