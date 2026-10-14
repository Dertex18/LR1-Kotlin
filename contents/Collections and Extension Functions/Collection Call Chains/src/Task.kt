fun process(numbers: List<Int>): List<Int> {
    return numbers.filter { it > 0 }.map { it * 2 }
}
