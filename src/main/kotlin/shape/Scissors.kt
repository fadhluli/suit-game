package shape

class Scissors(private val player1: String): Shape() {

    override fun printResult() {
        println("Hasil: ")
        when(player1){
            "gunting" -> {
                println("DRAW!")
            }
            "batu" -> {
                println("Pemain 1 MENANG!")
            }
            "kertas" -> {
                println("Pemain 2 Menang!")
            }
        }
    }

}