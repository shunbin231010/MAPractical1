package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var buttonView: Button
    lateinit var numberText:TextView
    lateinit var diceImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonView = findViewById(R.id.buttonView)
        diceImg=findViewById(R.id.diceImg)
        buttonView.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT).show()

        val drawbleResource = when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImg.setImageResource(drawbleResource)
        numberText = findViewById(R.id.numberTextView)
        numberText.text = randomInt.toString()
    }
}