class LazyItemScope {
    fun item(content: () -> String): String = content()
}

fun LazyColumn(content: LazyItemScope.() -> String): String = LazyItemScope().content()

fun callLazyColumn(): String {
    return LazyColumn { item { "Data" } }
}
