package com.metehanbolat.newnotificationsstructure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.newnotificationsstructure.ui.theme.NewNotificationsStructureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewNotificationsStructureTheme {

            }
        }
    }
}
