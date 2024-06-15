package com.example.tutorial3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.tutorial3.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1:EditText
    lateinit var edtNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edtNumber1)
        edtNumber2 = findViewById(R.id.edtNumber2)
    }

    fun buttonClick(v:View){
        var ans = 0.0

        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when(v.id){
            R.id.btnAdd -> ans = calculator.add()
            R.id.btnSbutract -> ans = calculator.subtract()
            R.id.btndivide -> ans = calculator.divide()
            R.id.btnMultifly -> ans = calculator.multiply()
        }

        Toast.makeText(this,"Answer = $ans", Toast.LENGTH_LONG).show()
    }

}