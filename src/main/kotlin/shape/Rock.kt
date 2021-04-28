package shape

class Rock(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "batu" -> {
                println("DRAW!")
            }
            "kertas" -> {
                println("Pemain 1 MENANG!")
            }
            "gunting" -> {
                println("Pemain 2 Menang!")
            }
        }
    }

}