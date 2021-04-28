package shape

class Paper(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "kertas" -> {
                println("DRAW!")
            }
            "gunting" -> {
                println("Pemain 1 MENANG!")
            }
            "batu" -> {
                println("Pemain 2 Menang!")
            }
        }
    }

}