package com.example.playlistmaker

import android.os.Bundle
import android.widget.ImageView
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val search_button = findViewById<LinearLayout>(R.id.search_button)

        val searchButtonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на кнопку!", Toast.LENGTH_SHORT).show()
            }
        }

        search_button.setOnClickListener(searchButtonClickListener)

        val music_library_button = findViewById<LinearLayout>(R.id.music_library_button)

        music_library_button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажали на кнопку!", Toast.LENGTH_SHORT).show()
        }

        val settings_button = findViewById<LinearLayout>(R.id.settings_button)

        settings_button.setOnClickListener {
            setContentView(R.layout.settings)
        }
    }
}