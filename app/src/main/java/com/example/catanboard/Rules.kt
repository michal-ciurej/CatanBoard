package com.example.catanboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Rules : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)


    }

    fun gotoBoard(view: View) {
        intent = Intent(this, MainActivity::class.java)

        startActivity(intent)


    }

    fun gotoDice(view: View) {
        intent = Intent(this, Dice::class.java)

        startActivity(intent)


    }

}
