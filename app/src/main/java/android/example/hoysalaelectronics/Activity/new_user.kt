package android.example.hoysalaelectronics.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class new_user : AppCompatActivity() {
    lateinit var btn_register: Button
    lateinit var tv_sign_in: TextView
    lateinit var rl_newuser: RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

        btn_register = findViewById(R.id.btn_register);
        tv_sign_in = findViewById(R.id.tv_sign_in);
        rl_newuser = findViewById(R.id.rl_newuser);

        btn_register.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        rl_newuser.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}