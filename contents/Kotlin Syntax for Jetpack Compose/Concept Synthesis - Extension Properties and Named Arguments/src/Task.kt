val Int.dp: String
    get() = "${this}dp"

fun Padding(all: String): String = "Padding($all)"

fun callPadding(): String {
    return Padding(all = 16.dp)
}
