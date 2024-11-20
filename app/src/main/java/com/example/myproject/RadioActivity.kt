package com.example.myproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var dog:RadioButton
    lateinit var cat:RadioButton
    lateinit var rabbit:RadioButton
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)

        dog = findViewById(R.id.radioDog)
        cat = findViewById(R.id.radioCat)
        rabbit = findViewById(R.id.radioRabbit)
        image = findViewById(R.id.imageView)

        dog.setOnClickListener{
            image.setImageResource(R.drawable.dog)
        }

        cat.setOnClickListener{
            image.setImageResource(R.drawable.cat)
        }
        rabbit.setOnClickListener{
            image.setImageResource(R.drawable.rabbit)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}