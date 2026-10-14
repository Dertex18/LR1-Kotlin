fun Icon(iconId: Int, size: Int = 24, tint: String = "Black", contentDescription: String = ""): String =
    "$iconId $size $tint $contentDescription"

fun callIcon(): String {
    return Icon(101, contentDescription = "Search")
}
