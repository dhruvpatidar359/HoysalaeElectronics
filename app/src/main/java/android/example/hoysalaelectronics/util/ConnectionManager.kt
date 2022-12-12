package android.example.hoysalaelectronics.util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import java.lang.NullPointerException

open class ConnectionManager : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {


    }

    public fun isConnected(context: Context?): Boolean {

         try{

        val connectivityManager =
                context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo

             return (activeNetwork != null && activeNetwork.isConnected)

         }
         catch (e : NullPointerException){
             e.printStackTrace()
             return false
         }
    }
}

