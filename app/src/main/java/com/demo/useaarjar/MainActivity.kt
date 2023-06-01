package com.demo.useaarjar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codeinger.codeingertoast.showToast
import com.codeinger.dateformatter.formatDate
import com.demo.snackbarlib.showSnackBar
import com.demo.validationlib.isValidEmail

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = "umang@gmail.com"
        val result = isValidEmail(email)
        val msg = if(result) "Email is valid" else "Email is not valid"
        showSnackBar(findViewById(android.R.id.content), msg)


        val date = "14/08/2022"
        val inputFormat = "dd/MM/yyyy"
        val outputFormat = "dd MMM, yyyy"
        val newDate = date.formatDate(inputFormat, outputFormat)
        showToast(newDate)


    }
}