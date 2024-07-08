val pi: Double by lazy {
    println("Calculating PI")
    3.14159
}

fun main() {
    println("Before accessing pi")
    println(pi)  // Output: Calculating PI 3.14159
    println(pi)  // Output: 3.14159 (không tính toán lại)
}