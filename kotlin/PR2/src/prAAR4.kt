fun main() {
    println("vvedite prermennu:")
    var n = readln().toInt()

    for (i in 1 .. n){
        if ( i % 2 == 0){
            println(i)
        }
        n++
    }
}