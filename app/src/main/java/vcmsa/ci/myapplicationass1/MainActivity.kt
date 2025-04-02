package vcmsa.ci.myapplicationass1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode


class MainActivity : AppCompatActivity() {

    private lateinit var answer: TextView
    private lateinit var input1: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialize the textview


        val btnmorning = findViewById<Button>(R.id.morning)
        val btnmid_morning = findViewById<Button>(R.id.mid_morning)
        val btnafternoon = findViewById<Button>(R.id.afternoon)
        val btnMid_afternoon = findViewById<Button>(R.id.mid_afternoon)
        val btnDinner = findViewById<Button>(R.id.btnDinner)
        val btnClear= findViewById<Button>(R.id.btnclear)
        // button is the type of the view you're trying reference
        //the findviewbyid is how you get the view with the ID
        answer = findViewById(R.id.mealDisplay)
        input1 = findViewById(R.id.input1)


        btnmorning.setOnClickListener()
        {
            morning()
        }

        btnmid_morning.setOnClickListener()
        {
            mid_morning()
        }
        btnafternoon.setOnClickListener()
        {
            afternoon()
        }
        btnMid_afternoon.setOnClickListener()
        {
           mid_afternoon()
        }
        btnDinner.setOnClickListener()
        {
               Dinner()
        }
        btnClear.setOnClickListener(){
            input1.text.clear()
            answer.text = ""
            // clear the text in the answer Textview
        }

    }

    private fun afternoon() {
        val userInput = input1.text.toString().trim().lowercase()

        if (userInput.isEmpty()) {
            input1.error = "please enter the time of day"
            answer.text = ""
        } else {
            answer.text = "Salads"
            input1.error = null
            // Input1.error should show an error message
        }
    }


    private fun morning() {
        val userInput = input1.text.toString().trim().lowercase()

        if (userInput.isEmpty()) {
            input1.error = "please enter the time of day"
            answer.text = ""
        } else {
            answer.text = "chia Pudding"
            input1.error = null
            //this is a placeholder for the actual output
        }

    }


    private fun mid_morning() {
        val userInput = input1.text.toString().trim().lowercase()


        if (userInput.isEmpty()) {
            input1.error = "please enter the time of day"
            answer.text = ""
        } else {
            answer.text = " fruit"
            input1.error = null
            // the midMorning as kotlin uses camelCase for function names


        }
    }
    private fun Dinner(){
        val userInput = input1.text.toString().trim().lowercase()

        if (userInput.isEmpty()){
            input1.error="please enter the time of day"
            answer.text=""
        }else{
            answer.text="Pasta"
            input1.error=null
            //when userinput is empty, it sets an error message for input1
        }
    }
    private fun mid_afternoon(){
        val userInput=input1.text.toString().trim().lowercase()
        if(userInput.isEmpty()){
            input1.error="please enter the time of day"
            answer.text=""
        } else{
            answer.text="Hummus with Vegetables"
            input1.error=null
            // an error message is set when the input is empty and the answer text is cleared
        }
    }


}


//    private fun Afternoon() {
//        if (inputIsNotEmpty()) {
//            val input1 = "salads"
//            answer.text
//        }
//
//    }
//
//    private fun mid_afternoon() {
//        if (inputIsNotEmpty()) {
//            val input1 = "Hummus with Vegetables"
//
//             {
//
//            }
//
//            answer.text = "Hummus with Vegetables"
//
//
//
//        }
//    }
//
//        }
//            private fun Dinner()
//            {
//                if (inputIsNotEmpty())
//                {
//                    val input1 = "Pasta"
//                    answer.text = "Pasta"
//
//                    {
//
//                    }
//
//
//
//        }

















