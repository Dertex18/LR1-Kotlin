fun createWindow(width: Int = 800, height: Int = 600, title: String = "Untitled"): String =
    "$title ${width}x$height"

fun callCreateWindow(): String {
    return createWindow(title = "My App")
}
