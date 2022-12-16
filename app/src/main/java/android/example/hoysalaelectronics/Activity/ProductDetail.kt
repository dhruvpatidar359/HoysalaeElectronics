package android.example.hoysalaelectronics.Activity

import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProductDetail : AppCompatActivity() {

    lateinit var backImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        backImage = findViewById(R.id.back_image)
        backImage.setOnClickListener {
            onBackPressed()
        }
    }
}