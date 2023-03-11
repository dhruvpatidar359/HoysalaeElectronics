package android.example.hoysalaelectronics.modelClasses

data class Register(
    val jwt: String,
    val user: User,
)

data class User(
    //val id: Int,
    val email: String,
    val username: String,
    val password: String
)
