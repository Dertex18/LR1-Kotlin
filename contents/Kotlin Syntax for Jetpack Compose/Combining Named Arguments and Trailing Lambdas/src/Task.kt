fun Button(onClick: String, content: () -> String): String = "$onClick ${content()}"

fun callButton(): String {
    return Button(onClick = "Submit") { "Text inside" }
}
