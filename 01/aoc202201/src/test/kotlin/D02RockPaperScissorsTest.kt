import org.testng.annotations.Test
import java.io.File
import java.nio.charset.Charset

class D02RockPaperScissorsTest {
    data class TestInput(val input: String, val output: Int)

    @Test
    fun testRps() {
        val tests = listOf(
//            TestInput(
//                input = """
//                    A Y
//                    B X
//                    C Z
//                """.trimIndent(),
//                output = 15
//            ),
//            TestInput(
//                input = """
//                    A Y
//                    B Z
//                    C X
//                """.trimIndent(),
//                output = (1 + 0 + 2 + 0 + 3 + 0)
//            ),
            TestInput(
                input = File("/home/niklas/downloads/input.txt").readText(Charset.defaultCharset()),
                output = 14299
            ),
//            TestInput(
//                input = """
//                    B Y
//
//                    C X
//
//
//                       A X
//                    B X
//                """.trimIndent(),
//                output =  (2 + 3 + 3 + 0 + 1 + 3 + 2 + 6)
//            )
        )

        tests.forEach {
            assert(D02RockPaperScissors.playRounds(it.input) == it.output)
        }
    }
}