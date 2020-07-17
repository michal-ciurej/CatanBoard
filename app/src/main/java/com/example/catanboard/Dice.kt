package com.example.catanboard

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class Dice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
//here's the roller listener gonna go with a new function being called onclick


    }

    fun diceroller(view: View) {

        val randomno = Random.nextInt(6) + 1
        val randomtwo = Random.nextInt(6) + 1

        val imagedice1 = findViewById<ImageView>(R.id.dice1)
        val imagedice2 = findViewById<ImageView>(R.id.dice2)

        val drawableres = when (randomno) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableres2 = when (randomtwo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imagedice1.setImageResource(drawableres)
        imagedice2.setImageResource(drawableres2)
    }

    fun gotoBoard(view: View) {
        intent = Intent(this, MainActivity::class.java)

        startActivity(intent)


    }

    fun gotoRules(view: View) {
        intent = Intent(this, Rules::class.java)

        startActivity(intent)


    }
}
