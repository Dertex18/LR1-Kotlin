class User(val name: String?)

fun getNameLength(user: User?): Int? = user?.name?.length
