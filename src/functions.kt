fun like(vararg fruits: String) {
    for (fruit in fruits) {
        println("I like $fruit")
    }
}

infix fun Int.cong(x: Int): Int = this + x
