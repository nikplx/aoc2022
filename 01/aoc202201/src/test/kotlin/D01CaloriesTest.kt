import org.testng.annotations.Test

class D01CaloriesTest {
    data class TestInput(val input: String, val output: Int)

    @Test
    fun testCalories() {
        val tests = listOf(
            TestInput(
                input = """
                    10
                    15
                    
                    2
                    5
                    
                    9
                """.trimIndent(),
                output = 25
            ),
            TestInput(
                input = """
                    1000
                    2000
                    3000

                    4000

                    5000
                    6000

                    7000
                    8000
                    9000

                    10000
                """.trimIndent(),
                output = 24000
            ),
            TestInput(
                // with whitespace
                input = """
                    100    
                """.trimIndent(),
                100
            ),
            TestInput(
                // empty
                input = "",
                output = 0
            )
        )

        tests.forEach {
            assert(D01Calories.getCalories(it.input) == it.output)
        }
    }
}