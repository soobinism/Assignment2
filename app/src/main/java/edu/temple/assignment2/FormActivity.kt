package edu.temple.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fullName = findViewById<EditText>(R.id.editTextName)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextPassword)
        val passwordConfirm = findViewById<EditText>(R.id.editTextPasswordConfirm)
        val saveButton: Button = findViewById<Button>(R.id.saveButton)
        
        saveButton.setOnClickListener {
            when {
                fullName.text.toString().trim().isNullOrBlank() -> fullName.setError("Full name required")
                email.text.toString().trim().isNullOrBlank() -> email.setError("Email Required")
                password.text.toString().trim().isNullOrBlank() -> password.setError("Password Required")
                passwordConfirm.text.toString().trim().isNullOrBlank() -> passwordConfirm.setError("Password Confirmation Required")
                !(password.text.toString().trim() == passwordConfirm.text.toString().trim()) -> passwordConfirm.setError(
                    "Passwords do not match"
                )
                else -> Toast.makeText(applicationContext,
                    "Welcome, " + fullName.text.toString() + ", to the Sign Up Form App!",
                    Toast.LENGTH_SHORT).show()
            }

        }
    }




}
