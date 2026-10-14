fun MyText(text: String, fontSize: Int = 14, color: String = "Black"): String =
    "$text $fontSize $color"

fun callMyText(): String {
    return MyText(text = "Compose", fontSize = 24)
}
