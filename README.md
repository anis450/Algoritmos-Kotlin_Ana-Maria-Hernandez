# Algoritmos-Kotlin_Ana-Maria-Hernandez
# Utilidades en Kotlin

Este proyecto contiene varias funciones útiles implementadas en Kotlin:

- **`esPrimo(n: Int): Boolean`** → Verifica si un número es primo.
- **`mcd(a: Int, b: Int): Int`** → Calcula el máximo común divisor usando el algoritmo de Euclides.
- **`factorial(n: Int): BigInteger`** → Calcula el factorial de un número (soporta valores grandes con `BigInteger`).
- **`dfs(grafo: Map<Int, List<Int>>, inicio: Int)`** → Realiza un recorrido en profundidad (Depth-First Search) en un grafo.

## Cómo ejecutar

### 1. Con `main` (programa tradicional)
1. Guarda el archivo como `Main.kt`.
2. Compila y ejecuta con Kotlin CLI:
   ```bash
   kotlinc Main.kt -include-runtime -d Main.jar
   java -jar Main.jar
   ```
3. Verás en consola:
   ```
   ¿7 es primo? true
   MCD de 48 y 18: 6
   Factorial de 20: 2432902008176640000
   DFS desde el nodo 1:
   1
   2
   4
   3
   ```

### 2. Como script sin `main`
1. Guarda el código en un archivo con extensión `.kts`, por ejemplo:  
   `script.kts`
2. Dentro puedes escribir directamente:
   ```kotlin
   println(esPrimo(7))
   println(mcd(48, 18))
   println(factorial(20))
   dfs(mapOf(1 to listOf(2,3), 2 to listOf(4)), 1)
   ```
3. Ejecútalo con:
   ```bash
   kotlinc -script script.kts
   ```

### 3. Online
Si no quieres instalar nada, copia el código en [play.kotlinlang.org](https://play.kotlinlang.org/) y haz clic en Run.

## Estructura recomendada
```
project/
│── Main.kt        # con la función main()
│── script.kts     # ejemplo de ejecución sin main
│── README.md
```

## Notas
- `factorial` usa `BigInteger`, lo que permite calcular factoriales de números grandes sin desbordar.
- `dfs` usa un `Set` para evitar ciclos infinitos en el grafo.
- Todas las funciones están implementadas de forma idiomática en Kotlin.
