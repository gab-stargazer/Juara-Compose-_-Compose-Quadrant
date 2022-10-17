package com.lelestacia.juaracomposecomponentquadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lelestacia.juaracomposecomponentquadrant.ui.theme.JuaraComposeComponentQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JuaraComposeComponentQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SetContentView()
                }
            }
        }
    }
}

@Composable
fun SetContentView() {
    val titleList = stringArrayResource(id = R.array.title)
    val descList = stringArrayResource(id = R.array.desc)
    Column {
        Row {
            Box(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color.Green)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = titleList[0],
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                    Text(text = descList[0], textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color.Yellow)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = titleList[1],
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                    Text(text = descList[1], textAlign = TextAlign.Justify)
                }
            }
        }
        Row {
            Box(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color.Cyan)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = titleList[2],
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                    Text(text = descList[2], textAlign = TextAlign.Justify)
                }
            }
            Box(
                modifier = Modifier
                    .height(LocalConfiguration.current.screenHeightDp.dp / 2)
                    .width(LocalConfiguration.current.screenWidthDp.dp / 2)
                    .background(Color.LightGray)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .wrapContentWidth(Alignment.CenterHorizontally)
                        .wrapContentHeight(Alignment.CenterVertically)
                ) {
                    Text(
                        text = titleList[3],
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                    )
                    Text(text = descList[3], textAlign = TextAlign.Justify)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JuaraComposeComponentQuadrantTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            SetContentView()
        }
    }
}