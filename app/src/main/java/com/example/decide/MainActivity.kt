package com.example.decide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val text: TextView = findViewById(R.id.answer)
            answer.text = decision()
        }
    }
    private fun decision(): String {
        when ((0..8).random()){
            0 -> return("Do it")
            1 -> return("You should probably do it")
            2 -> return("You should probably do it")
            3 -> return("Follow your gut")
            4 -> return("You probably should not do it")
            5 -> return("You probably should not do it")
            6 -> return("Do not do it")
            7 -> return("Flip a coin with heads to do it")
            8 -> return("Flip a coin with tails to do it")
        }
        return("Error: decision out of bounds")
    }
}