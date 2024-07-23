package com.example.question3_app
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.question3_app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCalculator(view: View) {
        val intent = Intent()
        intent.setClassName("com.example.question1_cal", "com.example.question1_cal.MainActivity")
        intent.putExtra("message", "Data from Main App: Calculator")
        startActivity(intent)
    }

    fun openQuiz(view: View) {
        val intent = Intent()
        intent.setClassName("com.example.question2_app", "com.example.question2_app.MainActivity")
        intent.putExtra("message", "Data from Main App: Quiz")
        startActivity(intent)
    }
}
