fun MyButton(onClick: String, enabled: Boolean): String = "$onClick $enabled"

fun callMyButton(): String {
    return MyButton(enabled = false, onClick = "Action")
}
