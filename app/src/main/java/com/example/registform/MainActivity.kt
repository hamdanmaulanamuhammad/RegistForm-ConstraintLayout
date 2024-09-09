package com.example.registform

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.registform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set OnClickListener pada tombol Sign Up
        binding.signUpButton.setOnClickListener {
            // Ambil data dari inputan pengguna
            val email = binding.EmailEditText.text.toString()
            val fullname = binding.FullnameEditText.text.toString()
            val username = binding.UsernameEditText.text.toString()
            val password = binding.PasswordEditText.text.toString()

            // Tampilkan Toast dengan data inputan pengguna
            val message = "Email: $email Fullname: $fullname\nUsername: $username Password: $password"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
