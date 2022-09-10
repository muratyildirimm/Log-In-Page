package com.muratyildirim.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.sign_up.*

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        signuploginbtn.setOnClickListener({

            val gecisyap=Intent(applicationContext,MainActivity::class.java)
            startActivity(gecisyap)
        })

    }
}