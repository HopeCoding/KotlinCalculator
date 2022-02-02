package com.hopecoding.dortislemkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @SuppressLint("SetTextI18n")
    fun topla(view: View) {
        val s1 = txtFirst.text.toString().toDoubleOrNull()
        val s2 = txtSecond.text.toString().toDoubleOrNull()
        if (s1 == null || s2 == null) {
            txtSonuc.text = "Do not forget to enter the numbers"
        } else {
            val sonuc = s1.plus(s2)
            println(sonuc)
            txtSonuc.text = "Result:${sonuc}"
        }
    }

    fun cikar(view: View) {
        val s1 = txtFirst.text.toString().toDoubleOrNull()
        val s2 = txtSecond.text.toString().toDoubleOrNull()
        if (s1 == null || s2 == null) {
            txtSonuc.text = "Do not forget to enter the numbers"
        } else {
            val sonuc = s1.minus(s2)
            txtSonuc.text = "Result:${sonuc}"
        }
    }

    fun bolme(view: View) {
        val s1 = txtFirst.text.toString().toDoubleOrNull()
        val s2 = txtSecond.text.toString().toDoubleOrNull()
        if (s1 == null || s2 == null) {
            txtSonuc.text = "Do not forget to enter the numbers"
        } else {
            val sonuc = s1.div(s2)
            txtSonuc.text = "Result:${sonuc}"
        }
    }

    fun carpma(view: View) {
        val s1 = txtFirst.text.toString().toDoubleOrNull()
        val s2 = txtSecond.text.toString().toDoubleOrNull()
        if (s1 == null || s2 == null) {
            txtSonuc.text = "Do not forget to enter the numbers"
        } else {
            val sonuc = s1.times(s2)
            txtSonuc.text = "Result:${sonuc}"
        }
    }

}