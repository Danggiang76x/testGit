fun createPrinter() {
    // Khai báo một đối tượng ẩn danh
    val printer = object {
        val message = "Hello from the Printer object"

        fun printMessage() {
            println(message)
        }
    }

    // Sử dụng đối tượng ẩn danh trong hàm
    printer.printMessage()
}

fun main() {
    createPrinter() // Gọi hàm và sử dụng đối tượng ẩn danh bên trong nó
}
