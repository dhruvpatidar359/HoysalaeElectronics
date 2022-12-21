package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.HomeActivity
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OrderComplete : AppCompatActivity() {

    lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_complete)

        btn1 = findViewById(R.id.back)

        btn1.setOnClickListener {

           val intent = Intent(this@OrderComplete,HomeActivity :: class.java)
            startActivity(intent)

        }

    }

}