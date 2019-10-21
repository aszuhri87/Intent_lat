package com.example.intent_lat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dua.*


class ActivityDua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        val bundle: Bundle? = intent.extras
        val id=bundle?.get("id_value")
        val language = bundle?.get("language_value")

        Toast.makeText(applicationContext,id.toString()+""+language, Toast.LENGTH_LONG).show()

        btn_back.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
