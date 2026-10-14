class Modifier

fun Box(modifier: Modifier): String = "Box"

fun createBox(): String {
    return Box(Modifier())
}
