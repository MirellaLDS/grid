package com.example.mirella.gridcontent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cancel_button.setOnClickListener{v -> doSomething(v)}
    }

    private fun doSomething(v: View?) {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
