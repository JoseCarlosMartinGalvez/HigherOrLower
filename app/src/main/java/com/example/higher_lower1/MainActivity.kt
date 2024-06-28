package com.example.higher_lower1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var topImage:ImageView
    private lateinit var bottomImage:ImageView
    private lateinit var title1:TextView
    private lateinit var title2:TextView
    private lateinit var viewTexts:TextView
    private lateinit var higherBtn:Button
    private lateinit var lowerBtn:Button
    private lateinit var testInfo:Array<Info>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

    }

    private fun printStage()
    {
        title1 = findViewById(R.id.title1)
        title2 = findViewById(R.id.title2)
        topImage = findViewById(R.id.topImage)
        bottomImage = findViewById(R.id.bottomImage)
        viewTexts = findViewById(R.id.textViews)
        higherBtn = findViewById(R.id.higherBtn)
        lowerBtn = findViewById(R.id.lowerBtn)

        title1.setText(testInfo[GameManager.currentQuiz].name)
        title2.setText(testInfo[GameManager.currentQuiz + 1].name)
        topImage.setImageResource(testInfo[GameManager.currentQuiz].image)
        bottomImage.setImageResource(testInfo[GameManager.currentQuiz+1].image)
        viewTexts.setText(testInfo[GameManager.currentQuiz].views.toString())
    }

    public fun checkHigher(view: View) {
        if (testInfo[GameManager.currentQuiz+1].views >= testInfo[GameManager.currentQuiz].views)
        {
            GameManager.currentQuiz++
            if (GameManager.currentQuiz +1 >= testInfo.size)
            {
                setContentView(R.layout.win)
                return
            }
            else
            {
                printStage()
            }

        }
        else
        {
            setContentView(R.layout.loose)
            //Lose
        }
    }

    public fun checkLower(view: View){
        if (testInfo[GameManager.currentQuiz+1].views <= testInfo[GameManager.currentQuiz].views)
        {
            GameManager.currentQuiz++
            if (GameManager.currentQuiz +1 >= testInfo.size) {

                setContentView(R.layout.win)
                return
                //Win
            }
            else
            {
                printStage()
            }

        }
        else
        {
            setContentView(R.layout.loose)
            //Lose
        }
    }

    public fun menu(view: View){
        setContentView(R.layout.menu)
    }

    public fun vehiclesBtn(view:View){
        testInfo = GameManager.GetNewInfo(0)
        setContentView(R.layout.activity_main)
        printStage()
    }

    public fun deportesBtn(view:View){
        testInfo = GameManager.GetNewInfo(2)
        setContentView(R.layout.activity_main)
        printStage()
    }

    public fun animalesBtn(view:View){
        testInfo = GameManager.GetNewInfo(1)
        setContentView(R.layout.activity_main)
        printStage()
    }

    public fun randomBtn(view:View){
        testInfo = GameManager.GetNewInfo(3)
        setContentView(R.layout.activity_main)
        printStage()
    }

}