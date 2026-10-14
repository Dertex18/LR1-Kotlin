fun Column(content: () -> String): String = content()

fun callColumn(): String {
    return Column { "Item" }
}
