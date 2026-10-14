fun getOrThrow(text: String?): String = text ?: throw IllegalArgumentException()
