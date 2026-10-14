class RowScope {
    fun align(): String = "align"
}

fun Row(content: RowScope.() -> String): String = RowScope().content()

fun callRow(): String {
    return Row { align() }
}
