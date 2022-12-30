package android.example.hoysalaelectronics.APIs

import android.example.hoysalaelectronics.ModelClasses.User
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterPost {

    @POST("/api/auth/local/register")
    fun addUser(@Body registerPost: User) : retrofit2.Call<ResponseBody>
}