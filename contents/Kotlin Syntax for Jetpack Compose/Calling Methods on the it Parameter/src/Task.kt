fun clickable(onEvent: (String) -> String): String = onEvent("click")

fun callClickable(): String {
    return clickable { it.uppercase() }
}
