package com.example.pr172

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var log: EditText
    private lateinit var por: EditText
    private lateinit var gobut: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        log = findViewById(R.id.login)
        por = findViewById(R.id.password)
        gobut = findViewById(R.id.go)
    }

    fun letsgo(view: View) {
        if (log.text.toString() == "ekts" && por.text.toString() == "ekts2024") {
            val intent = Intent(this, GlavActivity::class.java)
            startActivity(intent)
        }
        else
            Toast.makeText(this, "Не верный логин или пароль", Toast.LENGTH_SHORT).show()
    }
}