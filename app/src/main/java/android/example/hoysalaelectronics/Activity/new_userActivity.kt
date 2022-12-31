package android.example.hoysalaelectronics.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.example.hoysalaelectronics.APIs.RegisterPost
import android.example.hoysalaelectronics.HomeActivity
import android.example.hoysalaelectronics.ModelClasses.User
import android.example.hoysalaelectronics.R
import android.example.hoysalaelectronics.util.ApiResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import java.util.regex.Pattern

class new_userActivity : AppCompatActivity() {
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

        btnRegister = findViewById(R.id.btn_register);
        tvSign = findViewById(R.id.tv_sign_in);
        input1 = findViewById(R.id.reg_name)
        input2 = findViewById(R.id.reg_mail)
        input3 = findViewById(R.id.reg_num)
        input4 = findViewById(R.id.reg_pass)
        input5 = findViewById(R.id.reg_confirm_pass)

        btnRegister.setOnClickListener {

            validation()
           // val intent = Intent(this@new_userActivity, HomeActivity::class.java)
           // startActivity(intent)

        }
        tvSign.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

        private fun validation(){
        val name = input1.text.toString()
        val mail = input2.text.toString()
        val phoneNum = input3.text.toString()
        val password = input4.text.toString()
        val confirmPass = input5.text.toString()

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
        if(phoneNum.isEmpty()){
            input3.error = "Enter Phone number"
            input3.requestFocus()
            return
        }
        else if(!numberCheck(phoneNum)){
            input3.error = "Enter valid mobile number"
            input3.requestFocus()
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
        if (confirmPass.isEmpty()) {
            input5.error = "Enter confirm password"
            input5.requestFocus()
            return
        }
        if (confirmPass != password) {
            input5.error = "Password and confirm password must same"
            input5.requestFocus()
            return
        }
         // val cal :  Call<RegisterPost> = ApiResponse()::class.java.getInstance()

            val retIn = ApiResponse.getRetrofitInstance().create(RegisterPost::class.java)
            val registerInfo = User(mail,name,password)
            retIn.addUser(registerInfo).enqueue(object :
                Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    Toast.makeText(
                        this@new_userActivity,
                        t.message,
                        Toast.LENGTH_SHORT
                    ).show()
                }
                override fun onResponse(call: Call<ResponseBody>, response: retrofit2.Response<ResponseBody>) {
                    if (response.code() == 201) {
                        Toast.makeText(this@new_userActivity, "Registration success!", Toast.LENGTH_SHORT)
                            .show()

                    }
                    else{
                        Toast.makeText(this@new_userActivity, "Registration failed!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            })
        }

    private fun numberCheck(strPhoneNum : String) : Boolean{
        val p = Pattern.compile("[0-9]{10}")
        val m = p.matcher(strPhoneNum)
        return m.matches()
    }

}