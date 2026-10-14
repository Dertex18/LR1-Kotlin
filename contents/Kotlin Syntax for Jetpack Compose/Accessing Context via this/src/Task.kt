class ColumnScope {
    val name: String = "ColumnScope"
}

fun Column(content: ColumnScope.() -> String): String = ColumnScope().content()

fun callColumn(): String {
    return Column { this.name }
}
