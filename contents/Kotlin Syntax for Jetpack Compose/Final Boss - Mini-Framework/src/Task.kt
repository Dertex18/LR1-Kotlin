fun Column(content: () -> String): String = content()
fun Button(onClick: String, content: () -> String): String = "$onClick ${content()}"
fun Text(text: String): String = "[Text: $text]"

fun buildUi(): String {
    return Column {
        Button(onClick = "Save") {
            Text("Save")
        }
    }
}
