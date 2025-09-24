import java.math.BigInteger
import kotlin.math.sqrt


fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}


tailrec fun mcd(a: Int, b: Int): Int =
    if (b == 0) a else mcd(b, a % b)


fun factorial(n: Int): BigInteger {
    require(n >= 0) { "El factorial no esta definido para numeros negativos" }
    return (1..n).fold(BigInteger.ONE) { acc, i -> acc * i.toBigInteger() }
}


fun dfs(
    grafo: Map<Int, List<Int>>,
    inicio: Int,
    visitado: MutableSet<Int> = mutableSetOf()
) {
    if (!visitado.add(inicio)) return
    println(inicio)
    for (vecino in grafo[inicio].orEmpty()) {
        dfs(grafo, vecino, visitado)
    }
}

fun main() {
    println("¿7 es primo? ${esPrimo(7)}")
    println("MCD de 48 y 18: ${mcd(48, 18)}")
    println("Factorial de 20: ${factorial(20)}") 

    val grafo = mapOf(
        1 to listOf(2, 3),
        2 to listOf(4),
        3 to listOf(3),
        4 to listOf(1)
    )

    println("DFS desde el nodo 1:")
    dfs(grafo, 1)
