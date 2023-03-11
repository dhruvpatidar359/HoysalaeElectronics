package android.example.hoysalaelectronics.api

import android.example.hoysalaelectronics.modelClasses.User
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterPost {

    @POST("auth/local/register")
    fun addUser(@Body registerPost : User) : retrofit2.Call<ResponseBody>

}