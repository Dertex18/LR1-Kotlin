fun Row(modifier: String, content: () -> String): String = "$modifier ${content()}"

fun callRow(): String {
    return Row("Fill") { "Child" }
}
