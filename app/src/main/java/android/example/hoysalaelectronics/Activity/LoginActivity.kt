package android.example.hoysalaelectronics.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    lateinit var btn_login: Button
    lateinit var tv_register: TextView
    lateinit var rl_newuser: RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      btn_login = findViewById(R.id.btn_login);
      tv_register = findViewById(R.id.tv_register);
      rl_newuser = findViewById(R.id.rl_newuser);

      btn_login.setOnClickListener{
          val intent = Intent(this, HomeActivity::class.java)
          startActivity(intent)
      }

        rl_newuser.setOnClickListener{
          val intent = Intent(this, new_user::class.java)
          startActivity(intent)
      }
    }
}

