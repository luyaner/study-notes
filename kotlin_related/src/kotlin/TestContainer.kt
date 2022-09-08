fun main() {
    val fullName = listOf("Anna Liu", "Jane Liu")
    val pairs = fullName.associate { it.split(" ").let { (firstName, lastName) -> lastName to firstName } }
    println(pairs) // {Liu=Jane}
}