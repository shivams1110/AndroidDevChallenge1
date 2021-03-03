package com.beuni.puppyadoption

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.core.Text
import com.beuni.puppyadoption.model.DogData
import com.beuni.puppyadoption.util.UtilData

class DogDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data = intent.getParcelableExtra<DogData>("data")

        setContent {
            data?.let { showContent(data = it) }
        }
    }

    @Composable
    fun showContent(data: DogData) {

        LazyColumn {
            item {
                data.bread?.let { UtilData.getDrawableResource(it) }
                    ?.let { painterResource(id = it) }?.let {
                    Image(
                        painter = it,
                        contentDescription = null,
                        modifier = Modifier
                            .height(250.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(4.dp)),
                        contentScale = ContentScale.Crop
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                Row {
                    Spacer(modifier = Modifier.width(16.dp))
                    data.name?.let {
                        showText(
                            firstString = it,
                            secondString = "",
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.h4
                        )
                    }
                    showText(firstString = ",", secondString = "", fontSize = 16.sp)
                    data.gender?.let {
                        showText(
                            firstString = it,
                            secondString = "",
                            fontSize = 16.sp
                        )
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.height(12.dp))
            }
            item {
                Row {
                    Spacer(modifier = Modifier.width(16.dp))
                    data.bread?.let {
                        showText(
                            firstString = "Breed:",
                            secondString = it,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.h5
                        )
                    }
                    Spacer(modifier = Modifier.width(16.dp))
                    data.age?.let {
                        showText(
                            firstString = "Age:",
                            secondString = it,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.h5
                        )
                    }
                }
            }
            item {
                Spacer(modifier = Modifier.height(12.dp))
            }
            item {
                Row {
                    Spacer(modifier = Modifier.width(16.dp))
                    showText(firstString = "About", secondString = "", fontSize = 18.sp)
                }
            }
            item {
                Spacer(modifier = Modifier.height(8.dp))
            }

            item {
                Row {
                    Spacer(modifier = Modifier.width(16.dp))
                    data.description?.let {
                        showText(
                            firstString = it,
                            secondString = "",
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }

    }

    @Composable
    fun showText(
        firstString: String,
        secondString: String,
        fontSize: TextUnit,
        style: androidx.compose.ui.text.TextStyle = MaterialTheme.typography.body1
    ) {
        Row {
            androidx.compose.material.Text(firstString, style = style, fontSize = fontSize)
            Spacer(modifier = Modifier.width(4.dp))
            androidx.compose.material.Text(secondString, style = style, fontSize = fontSize)
        }
    }
}