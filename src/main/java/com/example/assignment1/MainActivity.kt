package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the button, Text View and Edit Text using the id we set on the user face.

        val submitButton= findViewById<Button>(R.id.submitButton)
        val resetButton= findViewById<Button>(R.id.resetButton)
        val editName= findViewById<EditText>(R.id.editName)
        val textDisplay= findViewById<TextView>(R.id.textDisplay)

        // add code to the button that happen when it is clicked
        submitButton?.setOnClickListener {
            Toast.makeText(
            this@MainActivity ,
                "WELCOME TO KWA MNATHOS" , Toast.LENGTH_SHORT
            ).show()
        }

        // type of meal suggestions that are based on time of day
        val mealS= mapOf(
            "morning" to " white bread with scrambled eggs and orange juice, Movite, or Mieliepap",
            "mid-morning" to "Fruit salad and smooothie",
            "afternoon" to "Grilled chicken sandwich with side of salad, or Bunny Chow",
            "mid-afternoon" to "Tea with biscuits or a light snack",
            "dinner" to "Spaghetti with tinfish , or Chakalaka and pap"
        )

        submitButton.setOnClickListener {
            val inputText =
                editName.text.toString().trim().lowercase()

            if (inputText in mealS ) {
                textDisplay.text = "Meals: ${mealS[inputText]}"
            } else {
                textDisplay.text =
                    "Error: Kindly enter a genuine time of day (Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner)."
                Toast.makeText(
                    this , "Invaild input. PLEASE try again!" ,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        resetButton.setOnClickListener {
            editName.text.clear()
            textDisplay.text= ""
        }
            }
        }

