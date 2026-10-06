package com.example.kotlinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val student = Student(
//            name = "Ammara",
//            score = 90
//        )

        val students = listOf(
            Student(name = "Ammara", score = 90),
            Student(name = null, score = 75),
            Student(name = "Budi", score = 55)
        )

        val result = formatStudents(students)

        setContent {
            StudentResult(result)
        }

        analisisKode()
    }
}

@Composable
fun StudentResult(result: String) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 50.dp,
                start = 20.dp,
                end = 20.dp
            )
    ) {

        Text(
            text = result,
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}

