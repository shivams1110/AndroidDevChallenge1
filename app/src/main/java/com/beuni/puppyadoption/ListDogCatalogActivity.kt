package com.beuni.puppyadoption

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.beuni.puppyadoption.model.DogData
import com.beuni.puppyadoption.util.UtilData

class MainActivity : AppCompatActivity() {

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContent {
            context = this.applicationContext
            getListOfPets(dogsCatalogs = UtilData.getDogData())
        }
    }

    @Composable
    fun getListOfPets(dogsCatalogs: List<DogData>) {
        LazyColumn {
            items(dogsCatalogs) { dogsCatalog ->
                DogCard(data = dogsCatalog)
            }
        }
    }

    @Composable
    fun DogCard(data: DogData) {

        Card(
            Modifier
                .fillMaxWidth()
                .clickable {
                    val intent = Intent(context, DogDetailActivity::class.java)
                    intent.putExtra("data", data)
                    startActivity(intent)
                }
                .padding(8.dp), elevation = 8.dp
        ) {
            Row {
                data.bread?.let { UtilData.getDrawableResource(it) }?.let { painterResource(id = it) }?.let {
                    Image(
                        painter = it,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(120.dp)
                            .width(100.dp)
                            .clip(shape = RoundedCornerShape(4.dp))
                    )
                }
                Spacer(modifier = Modifier.width(24.dp))
                Column {
                    data.name?.let {
                        showText(
                            firstString = it,
                            secondString = "",
                            style = MaterialTheme.typography.h6,
                            fontSize = TextUnit.Unspecified
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    data.bread?.let {
                        showText(
                            firstString = "Breed:",
                            secondString = it,
                            style = MaterialTheme.typography.body1,
                            fontSize = 16.sp
                        )
                    }
                    data.age?.let {
                        showText(
                            firstString = "age:",
                            secondString = it,
                            style = MaterialTheme.typography.body1,
                            fontSize = 16.sp
                        )
                    }
                    data.gender?.let {
                        showText(
                            firstString = it,
                            style = MaterialTheme.typography.body1,
                            secondString = "",
                            fontSize = 16.sp
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
            Text(firstString, style = style, fontSize = fontSize)
            Spacer(modifier = Modifier.width(10.dp))
            Text(secondString, style = style, fontSize = fontSize)
        }
    }
}