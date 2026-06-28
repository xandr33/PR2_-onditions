fun main() {
    println("vvedite chislo:")
    var i = readln().toInt()

    if (i >= 10 && i <= 99){
        println("chislo diapazon 10 to 99")
    } else {
        println("chislo vne diapazona")
    }
}