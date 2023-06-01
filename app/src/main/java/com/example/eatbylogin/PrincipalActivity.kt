package com.example.eatbylogin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.eatbylogin.databinding.ActivityMainBinding
import com.example.eatbylogin.databinding.ActivityPrincipalBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class PrincipalActivity : AppCompatActivity() {

        private lateinit var binding: ActivityPrincipalBinding
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrincipalBinding.inflate(layoutInflater)

        window.statusBarColor = Color.parseColor("#5E8BC8")

        val view = binding.root
        setContentView(view)

        auth = Firebase.auth


        binding.botaoSair.setOnClickListener() {
        auth.signOut()

            val intent = Intent(this,
                MainActivity::class.java)

            startActivity(intent)

            finish()
        }

    }
}