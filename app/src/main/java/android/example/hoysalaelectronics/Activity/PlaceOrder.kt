package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlaceOrder : AppCompatActivity() {

    lateinit var orderToolbar : androidx.appcompat.widget.Toolbar
    lateinit var placeOrderBtn : Button
    lateinit var changeAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_order)

        orderToolbar = findViewById(R.id.confirm_order_toolbar)
        placeOrderBtn = findViewById(R.id.continue_order_btn)
        changeAdd = findViewById(R.id.change_address)

        changeAdd.setOnClickListener {
            val intent = Intent(this@PlaceOrder,CheckoutPage :: class.java)
            startActivity(intent)
        }

        placeOrderBtn.setOnClickListener {
            val intent = Intent(this@PlaceOrder,PaymentMethod::class.java)
            startActivity(intent)
        }



        setSupportActionBar(orderToolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}