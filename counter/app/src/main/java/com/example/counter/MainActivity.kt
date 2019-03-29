package com.example.counter

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<LinearLayout>(R.id.caja1).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja2).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja3).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja4).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja5).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja6).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja7).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja8).setOnClickListener { counter(it) }
        findViewById<LinearLayout>(R.id.caja9).setOnClickListener { counter(it) }
        findViewById<Button>(R.id.send).setOnClickListener { otherActivity() }

    }

    private fun counter(v: View){


    }

    private fun otherActivity(){
        val ints = Intent(this@MainActivity, Main2::class.java)
        startActivity(ints)
    }
}
