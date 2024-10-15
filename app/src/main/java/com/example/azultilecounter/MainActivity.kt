package com.example.azultilecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialise the current tile counts
        var currentBlue = 0
        var currentYellow = 0
        var currentRed = 0
        var currentBlack = 0
        var currentWhite = 0

        // Initialise the starting tile counts
        val totalTiles = 20

        // Reference the tile buttons
        val buttonBlue: Button = findViewById(R.id.button_blue)
        val buttonYellow: Button = findViewById(R.id.button_yellow)
        val buttonRed: Button = findViewById(R.id.button_red)
        val buttonBlack: Button = findViewById(R.id.button_black)
        val buttonWhite: Button = findViewById(R.id.button_white)

        // Reference the total tile counts
        val blueTotalCount: TextView = findViewById(R.id.textViewTotalBlue)
        val yellowTotalCount: TextView = findViewById(R.id.textViewTotalYellow)
        val redTotalCount: TextView = findViewById(R.id.textViewTotalRed)
        val blackTotalCount: TextView = findViewById(R.id.textViewTotalBlack)
        val whiteTotalCount: TextView = findViewById(R.id.textViewTotalWhite)

        // Reference the current tile counts
        val blueCurrentCount: TextView = findViewById(R.id.textViewCurrentBlue)
        val yellowCurrentCount: TextView = findViewById(R.id.textViewCurrentYellow)
        val redCurrentCount: TextView = findViewById(R.id.textViewCurrentRed)
        val blackCurrentCount: TextView = findViewById(R.id.textViewCurrentBlack)
        val whiteCurrentCount: TextView = findViewById(R.id.textViewCurrentWhite)

        // Set the total tile count values
        blueTotalCount.text = totalTiles.toString()
        yellowTotalCount.text = totalTiles.toString()
        redTotalCount.text = totalTiles.toString()
        blackTotalCount.text = totalTiles.toString()
        whiteTotalCount.text = totalTiles.toString()

        // Set the current tile count values
        blueCurrentCount.text = currentBlue.toString()
        yellowCurrentCount.text = currentYellow.toString()
        redCurrentCount.text = currentRed.toString()
        blackCurrentCount.text = currentBlack.toString()
        whiteCurrentCount.text = currentWhite.toString()

        // Set onClick for the tile buttons
        buttonBlue.setOnClickListener {
            currentBlue++
            blueCurrentCount.text = currentBlue.toString()
        }
        buttonYellow.setOnClickListener {
            currentYellow++
            yellowCurrentCount.text = currentYellow.toString()
        }
        buttonRed.setOnClickListener {
            currentRed++
            redCurrentCount.text = currentRed.toString()
        }
        buttonBlack.setOnClickListener {
            currentBlack++
            blackCurrentCount.text = currentBlack.toString()
        }
        buttonWhite.setOnClickListener {
            currentWhite++
            whiteCurrentCount.text = currentWhite.toString()
        }

        // Reference and set onClick for the Confirm button
        val confirmButton: Button = findViewById(R.id.confirm_button)
        confirmButton.setOnClickListener {
            // Handle confirm button click
            blueTotalCount.text = ((blueTotalCount.text as String).toInt() - currentBlue).toString()
            yellowTotalCount.text = ((yellowTotalCount.text as String).toInt() - currentYellow).toString()
            redTotalCount.text = ((redTotalCount.text as String).toInt() - currentRed).toString()
            blackTotalCount.text = ((blackTotalCount.text as String).toInt() - currentBlack).toString()
            whiteTotalCount.text = ((whiteTotalCount.text as String).toInt() - currentWhite).toString()

            // Reset the current tile counts
            currentBlue = 0
            currentYellow = 0
            currentRed = 0
            currentBlack = 0
            currentWhite = 0

            // Reset the current tile count values
            blueCurrentCount.text = currentBlue.toString()
            yellowCurrentCount.text = currentYellow.toString()
            redCurrentCount.text = currentRed.toString()
            blackCurrentCount.text = currentBlack.toString()
            whiteCurrentCount.text = currentWhite.toString()
        }
    }
}
