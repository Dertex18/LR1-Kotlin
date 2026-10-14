fun greet(name: String?): String {
    val finalName = name?.takeIf { it.isNotEmpty() } ?: "Guest"
    return "Welcome, $finalName!"
}
