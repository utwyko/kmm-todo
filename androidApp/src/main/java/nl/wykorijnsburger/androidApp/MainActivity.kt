package nl.wykorijnsburger.androidApp

import android.app.Activity
import android.os.Bundle
import androidx.compose.material.Text
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}
