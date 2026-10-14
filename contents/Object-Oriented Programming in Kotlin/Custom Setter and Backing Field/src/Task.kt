class Account {
    var balance: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
}
