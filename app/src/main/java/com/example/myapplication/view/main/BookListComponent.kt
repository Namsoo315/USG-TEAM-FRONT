package com.example.myapplication.view.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

object BookListComponent {
    @Composable
    fun view() {
        BookList()
    }
    
    @Composable
    private fun BookList() = LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
//        itemsIndexed(dummyData) { index, book ->
//            Column {
//                Row {
//                    BookImage()
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(22.dp),
//                        verticalArrangement = spacedBy(8.dp)
//                    ) {
//                        ContentText(text = book.postTitle)
//                        ContentText(text = book.title)
//                        ContentText(text = book.salePrice + " / " + book.originalPrice)
//                        ContentText(text = book.publisher + ", " + book.author)
//                    }
//                }
//                Divider(
//                    modifier = Modifier.padding(top = 30.dp, bottom = 30.dp, start = 20.dp, end = 20.dp),
//                    color = Color.Black
//                )
//            }
//        }
    }

    @Composable
    private fun BookImage() = Image(
        painter = painterResource(id = R.drawable.ic_main_mypage),
        contentDescription = "책 이미지",
        modifier = Modifier
            .width(112.dp)
            .height(150.dp)
            .padding(start = 19.dp)
    )

    @Composable
    private fun ContentText(text: String) = Text(
        text = text,
        fontSize = 20.sp
    )
}