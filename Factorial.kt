import java.math.BigInteger

fun factorial(n: Int): BigInteger {
    require(n >= 0) { "El factorial no está definido para números negativos" }
    return (1..n).fold(BigInteger.ONE) { acc, i -> acc * i.toBigInteger() }
}


fun main() {
    println("Factorial de 5: ${factorial(5)}")
    println("Factorial de 50: ${factorial(50)}")
}
