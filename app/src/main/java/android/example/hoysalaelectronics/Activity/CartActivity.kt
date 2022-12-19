package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.Adapters.MyCartAdapter
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    lateinit var cartRecycler : RecyclerView
    lateinit var cartAdapter : MyCartAdapter
    lateinit var layoutManager : LinearLayoutManager
    lateinit var cartToolbar : androidx.appcompat.widget.Toolbar
    lateinit var btn_place_order : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        cartRecycler = findViewById(R.id.cart_recycler)
        cartToolbar = findViewById(R.id.cart_toolbar)
        btn_place_order = findViewById(R.id.place_order)

        setSupportActionBar(cartToolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        layoutManager = LinearLayoutManager(applicationContext)

        cartAdapter = MyCartAdapter(applicationContext)
        cartRecycler.layoutManager = layoutManager
        cartRecycler.adapter = cartAdapter

        //place order
        btn_place_order.setOnClickListener{
            val intent = Intent(this@CartActivity,CheckoutPage::class.java)
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}