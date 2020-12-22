package com.vipuldamor87.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //val bt1 = findViewById<Button>(R.id.bt1)
val max= 4;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener {
            var a: String = edt1.text.toString()
            Log.i("MainActivity","this button has been clicked")
            Toast.makeText(this,a,Toast.LENGTH_LONG).show()
        }

    }
}