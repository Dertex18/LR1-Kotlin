class Worker(val name: String, val hourlyRate: Int) {
    init {
        if (hourlyRate <= 0) throw IllegalArgumentException("Rate must be positive")
    }

    var hoursWorked: Int = 0
        set(value) {
            if (value >= 0) field = value
        }

    val salary: Int
        get() = hourlyRate * hoursWorked
}
