import kotlin.math.sqrt

fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    println("¿7 es primo? ${esPrimo(7)}")
    println("¿15 es primo? ${esPrimo(15)}")
}
