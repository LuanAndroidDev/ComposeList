package com.luan.composelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.luan.composelist.model.Beer
import com.luan.composelist.model.beerList
import com.luan.composelist.ui.theme.ComposeListTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeListTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { paddings ->
                    ShowList(
                        modifier = Modifier.padding(paddings),
                        beers = beerList
                    )
                }
            }
        }
    }
}

@Composable
fun ShowList(beers: List<Beer>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
    ) {
        items(beers) { beer ->
            Card(modifier = Modifier.padding(8.dp)) {
                Column {
                    Image(
                        painter = rememberAsyncImagePainter(beer.imageURL),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(194.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = beer.name,
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeListTheme {
        ShowList(beerList)
    }
}