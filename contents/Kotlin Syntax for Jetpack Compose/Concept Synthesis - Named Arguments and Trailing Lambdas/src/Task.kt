fun Card(elevation: Int = 0, content: () -> String): String = "$elevation ${content()}"

fun callCard(): String {
    return Card(elevation = 4) { "CardText" }
}
