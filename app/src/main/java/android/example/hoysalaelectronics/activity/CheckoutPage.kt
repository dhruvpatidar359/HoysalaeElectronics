package android.example.hoysalaelectronics.activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class CheckoutPage : AppCompatActivity() {

    lateinit var toolbar : Toolbar
    lateinit var deliverAdd : Button
    lateinit var newAddress : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_page)

        deliverAdd = findViewById(R.id.deliver_address)
        newAddress = findViewById(R.id.deliver_new_add)
        toolbar = findViewById(R.id.checkout_toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        deliverAdd.setOnClickListener {

            val intent = Intent(this@CheckoutPage,PaymentMethod :: class.java)
            startActivity(intent)
        }

        newAddress.setOnClickListener {
            val intent = Intent(this@CheckoutPage,NewAddress :: class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}