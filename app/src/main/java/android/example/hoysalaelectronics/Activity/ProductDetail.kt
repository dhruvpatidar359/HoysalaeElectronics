package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ProductDetail : AppCompatActivity(), AdapterView.OnItemSelectedListener{

    lateinit var backImage : ImageView
    lateinit var spinner: Spinner
    lateinit var arrayAdapter : ArrayAdapter<CharSequence>
    lateinit var button1 : Button
    lateinit var button2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        spinner = findViewById(R.id.quantity_spinner)
        button1 = findViewById(R.id.buy_now)
        button2 = findViewById(R.id.add_to_cart)

        arrayAdapter = ArrayAdapter.createFromResource(
            this@ProductDetail,
            R.array.number,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = this




        backImage = findViewById(R.id.back_image)
        backImage.setOnClickListener {
            onBackPressed()
        }

    button1.setOnClickListener {
        val intent = Intent(this@ProductDetail,CheckoutPage :: class.java)
        startActivity(intent)
    }
    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

       // var string = parent?.getItemAtPosition(position).toString()



    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

}