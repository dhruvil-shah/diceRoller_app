package com.example.dicerollingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*
import kotlin.random.Random as Random1

lateinit var img:ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn)
        img=findViewById(R.id.img)
        btn.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val x= Random().nextInt(6)+1
        val myImage=when(x)
        {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        img.setImageResource(myImage)

    }
}