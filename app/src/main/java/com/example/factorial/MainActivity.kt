package com.example.factorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var txtNumber:EditText
    lateinit var txtFactorial:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         txtNumber = findViewById<EditText>(R.id.txtNumber)
         txtFactorial = findViewById<TextView>(R.id.txtFactorial)
    }
        fun factorial(n:Float):Float{
            var num:Float= 1F
            for( i in 1..n.toInt() ) {
            num*=i
        }
         return num
    }
        fun calcular(view: View){
            val result = factorial(txtNumber.text.toString().toFloat())
            txtFactorial.text = result.toString()
        }

    }



