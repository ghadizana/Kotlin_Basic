//fun main() {
//    val alamatRumah = """
//        |Komplek De Fatmawati
//        |Blok C No.29
//        |Kecamatan Limo, Depok
//    """.trimIndent()
//
//    println(alamatRumah)
//}

fun main() {
    val fName = "Ghadiza"
    val lName = "Naura"

//    val fullname = fName + " " + lName
    val fullname = "$fName ${lName.length}"
    print(fullname)
}