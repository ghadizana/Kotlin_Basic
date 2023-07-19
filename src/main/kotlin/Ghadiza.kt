fun main() {
    //imutable : tidak dapat berubah
    val name = "Ghadiza Naura Aliya"

    //mutable : dapat berubah, usually use in constant
    var nick = "Ghadiza"

    println("Good Morning, $name")
    println("Thank you, $nick")
    println("See you, $nick")

    nick = "Diza"
    println("Nice to meet you, $nick")
}