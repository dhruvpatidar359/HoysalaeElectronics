package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfirmOrder : AppCompatActivity() {

    lateinit var btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)
        btn1 = findViewById(R.id.submit)
        btn1.setOnClickListener {
            val intent = Intent(this@ConfirmOrder,OrderComplete :: class.java)
            startActivity(intent)

        }
    }
}