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
            //check if the EditText have values or not
            if (fullName.text.toString().trim().isNullOrBlank()) {
                fullName.error = "Required"
                Toast.makeText(applicationContext, "Full Name Required ", Toast.LENGTH_SHORT).show()
            } else if (email.text.toString().trim().isNullOrBlank()) {
                email.error = "Required"
                Toast.makeText(applicationContext, "Email Required ", Toast.LENGTH_SHORT).show()
            } else if (password.text.toString().trim().isNullOrBlank()) {
                password.error = "Required"
                Toast.makeText(applicationContext, "Password Required ", Toast.LENGTH_SHORT).show()
            } else if (passwordConfirm.text.toString().trim().isNullOrBlank()){
                passwordConfirm.error = "Required"
                Toast.makeText(applicationContext, "Password Confirmation Required ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Login Successful", Toast.LENGTH_SHORT).show()
            }
        }
    }




}
