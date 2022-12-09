package android.example.hoysalaelectronics.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.example.hoysalaelectronics.HomeActivity
import android.example.hoysalaelectronics.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var btn_login: Button
    lateinit var tv_register: TextView
    lateinit var tv_forgetpassword: TextView
    lateinit var rl_newuser: RelativeLayout

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      btn_login = findViewById(R.id.btn_login);
      tv_register = findViewById(R.id.tv_register);
      rl_newuser = findViewById(R.id.rl_newuser);
      tv_forgetpassword = findViewById(R.id.tv_forgetpassword);

      btn_login.setOnClickListener{
//          mutation Login($input: UsersPermissionsLoginInput!) {
//          login(input: $input) {
//          jwt
//          user {
//              email
//          }
//      }
//      }
          val intent = Intent(this, HomeActivity::class.java)
          startActivity(intent)
      }

        rl_newuser.setOnClickListener{
          val intent = Intent(this, new_userActivity::class.java)
          startActivity(intent)
      }

        tv_forgetpassword.setOnClickListener{
            val intent = Intent(this, Forget_Password_Activity::class.java)
            startActivity(intent)
        }
    }
}

