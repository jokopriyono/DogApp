package com.jokopriyono.dogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra("name", "Joko Priyono")
        intent.putExtra("city", "Tangerang Selatan")
        intent.putExtra("country", "Indonesia")

        findViewById<MaterialButton>(R.id.btnBook).let {
            it.setOnClickListener {
                startActivity(intent)
            }
        }
    }
}