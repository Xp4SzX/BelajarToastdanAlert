package com.example.latihan3

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast_button = findViewById<Button>(R.id.toast_button)

        toast_button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Login")
            builder.setMessage("Apakah kamu yakin ingin login?")
            builder.setPositiveButton("Ya") { dialog, _ ->
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            builder.setNegativeButton("Batal") { dialog, _ ->
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            builder.create().show()
        }
    }
}