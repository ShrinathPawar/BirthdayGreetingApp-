package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }

    fun createBirthdayCard(view: View) {

        val intent = Intent(this, BirthdayGreetingActivity::class.java)



        val name = nameInput.editableText.toString()
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)


        Toast.makeText(this,"You clicked बाळ $name", Toast.LENGTH_SHORT).show()
    }

}