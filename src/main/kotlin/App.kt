import shape.Paper
import shape.Rock
import shape.Scissors

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.printHeader()
            app.input()
        }
    }

    fun printHeader() {
        println("""
        ==========================
        GAME SUIT TERMINAL VERSION
        ==========================
        """.trimIndent())
    }

    private fun input() {
        print("1. Masukkan pemain 1: ")
        val player1 = readLine()!!
        print("2. Masukkan pemain 2: ")

        readLine()?.let {
            when (it) {
                "gunting" -> {
                    Scissors(player1).printResult()
                }
                "kertas" -> {
                    Paper(player1).printResult()
                }
                "batu" -> {
                    Rock(player1).printResult()
                }
            }
        }
    }
}

