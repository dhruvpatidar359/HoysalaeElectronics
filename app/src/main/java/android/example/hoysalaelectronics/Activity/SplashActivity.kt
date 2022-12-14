package android.example.hoysalaelectronics.Activity

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.example.hoysalaelectronics.Fragments.Homefragment
import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.util.ConnectionManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities.NET_CAPABILITY_INTERNET
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.core.content.getSystemService

class SplashActivity : AppCompatActivity() {

    lateinit var myContext: Context
    lateinit var dialog: Dialog
    lateinit var splashLayout: RelativeLayout
    lateinit var internetLayout: LinearLayout
    lateinit var retryButton: Button

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        supportActionBar?.hide()

        splashLayout = findViewById(R.id.splash_logo)
        internetLayout = findViewById(R.id.internet_layout)
        retryButton = findViewById(R.id.retry_button)

        Handler(Looper.getMainLooper()).postDelayed({

        openScreen()

         retryButton.setOnClickListener {
             if (isNetworkAvailable()) {
                 splashLayout.visibility = GONE
                 internetLayout.visibility = GONE
                 val intent = Intent(this, LoginActivity::class.java)
                 startActivity(intent)
                 finish()
             }
            }

        }, 3000)

    }

    @RequiresApi(Build.VERSION_CODES.M)

    //checking if user is connected to internet or not

    private fun isNetworkAvailable(): Boolean {

        val cm = getSystemService(CONNECTIVITY_SERVICE) as ConnectivityManager
        val capabilities = cm.getNetworkCapabilities(cm.activeNetwork)

        return (capabilities != null && capabilities.hasCapability(NET_CAPABILITY_INTERNET))
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun openScreen() {

        if (isNetworkAvailable()) {
            splashLayout.visibility = VISIBLE
            internetLayout.visibility = GONE
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            splashLayout.visibility = GONE
            internetLayout.visibility = VISIBLE

        }
    }
}
