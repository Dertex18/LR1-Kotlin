fun Column(content: () -> String): String = content()
fun Row(content: () -> String): String = content()

fun callTree(): String {
    return Column { Row { "Text" } }
}
