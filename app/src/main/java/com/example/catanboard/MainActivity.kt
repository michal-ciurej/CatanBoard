package com.example.catanboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ToggleButton
import com.example.catanboard.R.layout.board
import kotlinx.android.synthetic.main.board.*


import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(board)
        val btnn = findViewById<View>(R.id.Butt)


        val toggle: ToggleButton = findViewById(R.id.toggleButton)

        val tokenbottom = findViewById<View>(R.id.tokenbottombottom)
        val tokencenterbottom = findViewById<View>(R.id.tokencenterbottom)
        val tokencenter = findViewById<View>(R.id.tokencenter)
        val tokencentertop = findViewById<View>(R.id.tokencentertop)
        val tokentop = findViewById<View>(R.id.tokentoptop)


//right so generally the logic is pretty simple: every loop of the function I'm building some Lists of both the empty placeholders for the Hexes and Tokens as well as the Hex and token Resources

        fun dothing(){


            //These are the placeholders for the tokens, empty imageViews arranged right on top of the Hexes

            var tokenList = mutableListOf<Int>(

                    R.drawable.token0,
                    R.drawable.token1,
                    R.drawable.token2,
                    R.drawable.token3,
                    R.drawable.token4,
                    R.drawable.token5,
                    R.drawable.token6,
                    R.drawable.token7,
                    R.drawable.token8,
                    R.drawable.token9,
                    R.drawable.token10,
                    R.drawable.token11,
                    R.drawable.token12,
                    R.drawable.token14,
                    R.drawable.token15,
                    R.drawable.token16,
                    R.drawable.token17,
                    R.drawable.token18
            )
//THESE ARE TOKEN images, theres only 17 of them cause black doesnt have a token, notice theres no 13
//test
            var TokenIdList = mutableListOf<ImageView>(
                    token0,
                    token1,
                    token2,
                    token3,
                    token4,
                    token5,
                    token6,
                    token7,
                    token8,
                    token9,
                    token10,
                    token11,
                    token12,
                    token13,
                    token14,
                    token15,
                    token16,
                    token17,
                    token18

            )
            //token placeholders, with one being removed

            var placeholderlist = mutableListOf<ImageView>(
                    hex0,
                    hex1,
                    hex2,
                    hex3,
                    hex4,
                    hex5,
                    hex6,
                    hex7,
                    hex8,
                    hex9,
                    hex10,
                    hex11,
                    hex12,
                    hex13,
                    hex14,
                    hex15,
                    hex16,
                    hex17,
                    hex18
            )



            //fun tester(placeholderlist, TokenIdList: , tokenList: , ){

            //this is the code to populate on of the hexes with the black tile, the thief
            var randomnumer: Int = (0..18).random()
            placeholderlist[randomnumer].setImageResource(R.drawable.hex18)
            TokenIdList[randomnumer].setImageResource(R.drawable.empty)
            //for now the empty is just a pink drawn token but it'll be a transparent png with the same dimensions
            TokenIdList.removeAt(randomnumer)
            //This removes the newly populated View from the lists so it doesn't get overwritten lower down
            placeholderlist.removeAt(randomnumer)

            //up until now, not shuffled
            placeholderlist.shuffle()
            TokenIdList.shuffle()
            //this is why Im using lists and not arrays: shuffle works on them




            for (i in 0..2) {
                var imageView = placeholderlist[i]
                var tokenView = TokenIdList[i]
                imageView.setImageResource(R.drawable.stone)
                tokenView.setImageResource(tokenList[i])

                //all this code repeats every loop so I'm gonna do it with a class but I haven't gotten round to it


            }



            for (i in 3..5) {
                var imageView = placeholderlist[i]
                var tokenView = TokenIdList[i]
                imageView.setImageResource(R.drawable.brick)
                tokenView.setImageResource(tokenList[i])

            }



            for (i in 6..9) {
                var imageView = placeholderlist[i]
                var tokenView = TokenIdList[i]
                imageView.setImageResource(R.drawable.hay)
                tokenView.setImageResource(tokenList[i])

            }

            //these sleeps are remains from tests when I checked live which bit is being executed and which bit works so I'm keeping them for future tests xD


            for (i in 10..13) {
                var imageView = placeholderlist[i]
                var tokenView = TokenIdList[i]
                imageView.setImageResource(R.drawable.sheep)
                tokenView.setImageResource(tokenList[i])

            }

            for (i in 14..17) {
                var imageView = placeholderlist[i]
                var tokenView = TokenIdList[i]
                imageView.setImageResource(R.drawable.wood)
                tokenView.setImageResource(tokenList[i])

            }


        }



        btnn.setOnClickListener{dothing()}



        toggle.setOnCheckedChangeListener{ toggle, isChecked ->

            if (isChecked) {

                tokentop.visibility = View.INVISIBLE
                tokencentertop.visibility = View.INVISIBLE
                tokencenter.visibility = View.INVISIBLE
                tokencenterbottom.visibility = View.INVISIBLE
                tokenbottom.visibility = View.INVISIBLE

            }

            else {
                tokentop.visibility = View.VISIBLE
                tokencentertop.visibility = View.VISIBLE
                tokencenter.visibility = View.VISIBLE
                tokencenterbottom.visibility = View.VISIBLE
                tokenbottom.visibility = View.VISIBLE

            }

        }

    }
}
