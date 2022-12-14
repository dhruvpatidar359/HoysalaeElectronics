package android.example.hoysalaelectronics.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class AccountFragment : Fragment() {

    lateinit var accountToolbar : Toolbar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_user_account, container, false)
        accountToolbar = view.findViewById(R.id.account_toobar)

       //
        // (activity as AppCompatActivity)!!.setSupportActionBar(accountToolbar)



        return view
    }
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }
}