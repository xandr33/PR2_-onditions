fun main() {
    println("vvedite prermennu:")
    var a = 1
    val n = readln().toInt()

    while (a <= n){
        if (n % a == 0) {
            println("$a")
        }
        a++
    }
}