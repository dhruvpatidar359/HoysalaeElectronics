package android.example.hoysalaelectronics.Activity

import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toolbar

class PaymentMethod : AppCompatActivity() {

    lateinit var toolbar : androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)

        toolbar = findViewById(R.id.payment_toolbar)

        setSupportActionBar(toolbar)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.cb_pay_paypal -> {
                    if (checked) {
                       val Intent = Intent(this@PaymentMethod,Order_Confirm_Activity::class.java)
                       startActivity(Intent)
                    } else {

                    }
                }
                R.id.cb_razor_pay -> {
                    if (checked) {
                        val Intent = Intent(this@PaymentMethod,Order_Confirm_Activity::class.java)
                        startActivity(Intent)
                    } else {

                    }
                }
                R.id.cb_cash -> {
                    if (checked) {
                        val Intent = Intent(this@PaymentMethod,Order_Confirm_Activity::class.java)
                        startActivity(Intent)
                    } else {

                    }
                }
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}