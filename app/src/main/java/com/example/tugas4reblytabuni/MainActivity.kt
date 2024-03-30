package com.example.tugas4reblytabuni

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.btnLogin)
        val nomember = findViewById<TextView>(R.id.linkRegister)
        val register = findViewById<Button>(R.id.linkLogin)
        val openweb = findViewById<Button>(R.id.intentOpenWeb)
        val  listitem = findViewById<Button>(R.id.datalist)

        login.setOnClickListener {
            startActivity(Intent(this, Activity_Home::class.java))
            finish()
        }
        nomember.setOnClickListener {
            startActivity(Intent(this, Activity_register::class.java))
            finish()
        }
        register.setOnClickListener {
            startActivity(Intent(this, Login_Activity::class.java))
            finish()
        }

        listitem.setOnClickListener {
            startActivity(Intent(this, Data_Item::class.java))
            finish()
        }

        openweb.setOnClickListener {
            val url = "https://anjastabuni.github.io/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Tidak ada aplikasi yang tersedia untuk membuka URL", Toast.LENGTH_SHORT).show()
            }
        }
    }
}