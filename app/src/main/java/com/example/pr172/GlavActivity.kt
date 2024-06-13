package com.example.pr172

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class GlavActivity : AppCompatActivity() {
    private lateinit var SP: SharedPreferences
    private lateinit var TC: TextView
    private var count = 0
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glav)
        TC = findViewById(R.id.txtcol)
        SP = getSharedPreferences("LaunchCount", MODE_PRIVATE)
        count = SP.getInt("count", 0)
        count++
        val ed: SharedPreferences.Editor = SP.edit()
        ed.putInt("count", count)
        ed.apply()
        val Cl = findViewById<ConstraintLayout>(R.id.cl)
        if (count == 1) {
            Cl.setBackgroundColor(R.color.red)
            TC.text="Красный"
        } else if (count % 2 == 0) {
            Cl.setBackgroundColor(R.color.green)
            TC.text="Зеленый"
        } else {
            Cl.setBackgroundColor(R.color.blue)
            TC.text="Синий"
        }
    }
}