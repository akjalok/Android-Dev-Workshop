package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice1()
            rollDice2()
        }
    }

    private fun rollDice1() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dice.roll().toString()
    }
    private fun rollDice2() {
        val dice2 = Dice(6)
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = dice2.roll().toString()
    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}