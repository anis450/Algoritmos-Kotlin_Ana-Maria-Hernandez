
tailrec fun mcd(a: Int, b: Int): Int =
    if (b == 0) a else mcd(b, a % b)


fun main() {
    println("MCD de 48 y 18: ${mcd(48, 18)}")
    println("MCD de 270 y 192: ${mcd(270, 192)}")
}
