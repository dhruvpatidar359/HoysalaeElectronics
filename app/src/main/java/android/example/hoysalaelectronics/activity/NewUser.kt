package android.example.hoysalaelectronics.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.example.hoysalaelectronics.api.RegisterPost
import android.example.hoysalaelectronics.HomeActivity
import android.example.hoysalaelectronics.modelClasses.User
import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.util.ApiResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import java.util.regex.Pattern

class NewUser : AppCompatActivity() {
    lateinit var btnRegister: Button
    lateinit var tvSign: TextView
    private lateinit var input1 : TextInputEditText
    private lateinit var input2 : TextInputEditText
    private lateinit var input3 : TextInputEditText
    private lateinit var input4 : TextInputEditText
    private lateinit var input5 : TextInputEditText


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_user)

        btnRegister = findViewById(R.id.btnSignUp);
        input1 = findViewById(R.id.reg_name)
        input2 = findViewById(R.id.reg_mail)
        input4 = findViewById(R.id.reg_pass)

        btnRegister.setOnClickListener {

            validation()
           // val intent = Intent(this@new_userActivity, HomeActivity::class.java)
           // startActivity(intent)

        }
//        tvSign.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//        }
    }

        private fun validation(){
        val name = input1.text.toString()
        val mail = input2.text.toString()
        val password = input4.text.toString()


        if (name.isEmpty()) {
            input1.error = "Enter name"
            input1.requestFocus()
            return
        }
        if (mail.isEmpty()) {
            input2.error = "Enter mail"
            input2.requestFocus()
            return
        } else if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()) {
            input2.error = "Enter valid email address"
            input2.requestFocus()
            return
        }

        if (password.isEmpty()) {
            input4.error = "Enter password"
            input4.requestFocus()
            return
        } else if (password.length<6) {
            input4.error = "Enter minimum 6 characters"
            input4.requestFocus()
            return
        }

         // val cal :  Call<RegisterPost> = ApiResponse()::class.java.getInstance()

            val retIn = ApiResponse.getRetrofitInstance().create(RegisterPost::class.java)
            val registerInfo = User(mail,name,password)
            retIn.addUser(registerInfo).enqueue(object :
                Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    Toast.makeText(
                        this@NewUser,
                        t.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                override fun onResponse(call: Call<ResponseBody>, response: retrofit2.Response<ResponseBody>) {
                    if (response.code() == 201) {
                        Toast.makeText(this@NewUser, "Registration success!", Toast.LENGTH_SHORT)
                            .show()

                    }
                    else{
                        Toast.makeText(this@NewUser, "Registration failed!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            })
        }

}