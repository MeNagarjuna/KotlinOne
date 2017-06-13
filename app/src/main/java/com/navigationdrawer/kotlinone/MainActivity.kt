package com.navigationdrawer.kotlinone

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var --> variables defined with var are mutable(Read and Write)
        //val --> variables defined with val are immutable(Read only)

        /* Fetching Id's */
        var textView: TextView = findViewById(R.id.textview) as TextView
        var buttonSecond: Button = findViewById(R.id.button_second) as Button
        var buttonThird: Button = findViewById(R.id.button_third) as Button
        var buttonBaseActivity: Button = findViewById(R.id.button_base) as Button

        /* Setting values to textviews and buttons */
        textView.text = "Click ME"
        buttonSecond.text = "Second Activity"
        buttonThird.text = "Third Activity"

        /*Click listener and navigating to different screens*/
        buttonSecond.setOnClickListener {
            var activityIntent = Intent(this, Main2Activity::class.java)
            startActivity(activityIntent)
        }

        buttonThird.setOnClickListener {
            var activityThree = Intent(this, Main3Activity::class.java)
            startActivity(activityThree)
        }

        buttonBaseActivity.setOnClickListener {
            var baseActivity = Intent(this, BaseActivity::class.java)
            startActivity(baseActivity)
        }

        /**/
        var z: View = findViewById(R.id.my_view)
        if (z is TextView) {
            z.text = "I am Textview "
        }
    }
}