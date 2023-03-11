package android.example.hoysalaelectronics.util

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiResponse {

   companion object {

       private val base_Url = "http://192.168.215.25:1337/api/"
       val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
           this.level = HttpLoggingInterceptor.Level.BODY
       }

       val client: OkHttpClient = OkHttpClient.Builder().apply {
           this.addInterceptor(interceptor)
       }.build()
       fun getRetrofitInstance(): Retrofit {
           return Retrofit.Builder()
               .baseUrl(base_Url)
               .client(client)
               .addConverterFactory(GsonConverterFactory.create())
               .build()

       }
//192.168.215.25

   }


}