package com.example.tuan4_bt1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.tuan4_bt1.navigation.NavGraph
import com.example.tuan4_bt1.ui.theme.Tuan4_Bt1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuan4_Bt1Theme {
                MaterialTheme {
                    NavGraph()
                }
            }
        }
    }
}