package android.example.hoysalaelectronics.Activity

import android.example.hoysalaelectronics.Adapters.MyCartAdapter
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    lateinit var cartRecycler : RecyclerView
    lateinit var cartAdapter : MyCartAdapter
    lateinit var layoutManager : LinearLayoutManager
    lateinit var cartToolbar : androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        cartRecycler = findViewById(R.id.cart_recycler)
        cartToolbar = findViewById(R.id.cart_toolbar)

        setSupportActionBar(cartToolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        layoutManager = LinearLayoutManager(applicationContext)

        cartAdapter = MyCartAdapter(applicationContext)
        cartRecycler.layoutManager = layoutManager
        cartRecycler.adapter = cartAdapter
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}