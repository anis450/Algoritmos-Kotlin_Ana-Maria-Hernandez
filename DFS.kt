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
    val grafo = mapOf(
        1 to listOf(2, 3),
        2 to listOf(4),
        3 to listOf(3),
        4 to listOf(1)
    )

    println("DFS desde el nodo 1:")
    dfs(grafo, 1)
}
