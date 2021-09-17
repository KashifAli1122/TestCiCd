package com.examples.cicdtestingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
import com.microsoft.appcenter.crashes.Crashes

import com.microsoft.appcenter.analytics.Analytics

import com.microsoft.appcenter.AppCenter








class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "e7ae82c7-3f76-41aa-88ad-5ab0f56deb19",
            Analytics::class.java, Crashes::class.java
        )

        val btn_click_me = findViewById(R.id.loginButton) as TextView
        btn_click_me.setOnClickListener {

            val i = Intent(applicationContext, MainActivity2::class.java)
            startActivity(i)
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }
}