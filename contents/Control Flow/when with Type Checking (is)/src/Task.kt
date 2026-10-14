fun describe(obj: Any): Int {
    return when (obj) {
        is String -> obj.length
        is Int -> obj * 2
        else -> 0
    }
}
