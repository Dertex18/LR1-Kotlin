class RowScope {
    fun weight(): String = "weight"
}
class ColumnScope {
    fun gravity(): String = "gravity"
}

fun Row(content: RowScope.() -> String): String = RowScope().content()
fun Column(content: ColumnScope.() -> String): String = ColumnScope().content()

fun build(): String {
    return Row { weight() } + Column { gravity() }
}
