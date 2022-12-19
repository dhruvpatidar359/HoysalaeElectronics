package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ProductDetail : AppCompatActivity(), AdapterView.OnItemSelectedListener{

    lateinit var spinner: Spinner
    lateinit var arrayAdapter : ArrayAdapter<CharSequence>
    lateinit var btn_buy_now : Button
    lateinit var btn_add_to_cart : Button
    lateinit var toolbar : androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        spinner = findViewById(R.id.quantity_spinner)
        btn_buy_now = findViewById(R.id.buy_now)
        btn_add_to_cart = findViewById(R.id.add_to_cart)
        toolbar = findViewById(R.id.toolbar_all_categories)

        arrayAdapter = ArrayAdapter.createFromResource(
            this@ProductDetail,
            R.array.number,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = this


        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btn_buy_now.setOnClickListener {
        val intent = Intent(this@ProductDetail,CheckoutPage :: class.java)
        startActivity(intent)
    }
        btn_add_to_cart.setOnClickListener{
            val intent = Intent(this@ProductDetail,CartActivity :: class.java)
            startActivity(intent)
        }

    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

       // var string = parent?.getItemAtPosition(position).toString()



    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    //back toolbar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}