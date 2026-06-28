fun main() {
    println("vvedite chislo:")
    val a = readln().toInt()

    when(a){
        1 -> println("vvod")
        2 -> println("redoctirovanie")
        3 -> println("udalenie")
        4 -> println("prosmotr")
        else -> println("net takoi komandi")
    }
}