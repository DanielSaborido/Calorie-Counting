fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))

    val tama=input.count() {it.isBlank() }+1

    val listacalorias= MutableList<Int>(tama, {0})
    var grupo=0
    input.forEach {
        if (it.isBlank())
            grupo++
        else
            listacalorias[grupo]=+it.toInt()
    }
    println(listacalorias.max())
    println(listacalorias.indexOf(listacalorias.max()))
}
