package com.example.azultilecounter

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference the square image buttons
        val buttonBlue: Button = findViewById(R.id.button_blue)
        val buttonYellow: Button = findViewById(R.id.button_yellow)
        val buttonRed: Button = findViewById(R.id.button_red)
        val buttonBlack: Button = findViewById(R.id.button_black)
        val buttonWhite: Button = findViewById(R.id.button_white)


        // Reference and set onClick for the Confirm button
        val confirmButton: Button = findViewById(R.id.confirm_button)
        confirmButton.setOnClickListener {
            // Handle confirm button click
            println("confirm_pressed")
        }
    }
}
