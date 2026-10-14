data class Book(val title: String, val price: Int)

fun discount(book: Book): Book {
    return book.copy(price = 150)
}
