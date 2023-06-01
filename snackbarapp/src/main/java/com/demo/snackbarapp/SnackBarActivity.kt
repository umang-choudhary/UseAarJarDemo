package com.demo.snackbarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.snackbarlib.showSnackBar
import com.demo.validationlib.isValidEmail

class SnackBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snack_bar)

        val email = "umang@gmail.com"
        val result = isValidEmail(email)
        val msg = if(result) "Email is valid" else "Email is not valid"
        showSnackBar(findViewById(android.R.id.content), msg)
    }
}