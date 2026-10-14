fun ListItem(content: (Int) -> String): String = content(42)

fun callListItem(): String {
    return ListItem { "Item $it" }
}
