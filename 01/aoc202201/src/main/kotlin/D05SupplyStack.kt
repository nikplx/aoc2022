import java.lang.IllegalArgumentException
import java.util.Stack

typealias Port = List<Stack<Container>>

@JvmInline
value class Container(val s: String? = null) {
    fun empty(): Boolean {
        return s == null
    }
    companion object {
        fun fromString(inp: String): Container {
            val containerRegex = Regex("\\[([a-zA-Z])\\]")

            if (!inp.trim().any()) {
                return Container()
            }

            val match = containerRegex.find(inp) ?: throw IllegalArgumentException("blah")
            val (name) = match.destructured

            return Container(name)
        }
    }
}

fun Port.move(d: Direction) {
    for (i in 1..d.amount) {
        this[d.to].add(this[d.from].pop())
    }
}

data class Direction(val amount: Int, val from: Int, val to: Int) {
    companion object Factory {
        private val parseExp = Regex("move (\\d+) from (\\d+) to (\\d+)")

        fun fromString(inp: String): Direction {
            val (amount, from, to) = parseExp.find(inp)!!.destructured
            return Direction(amount.toInt(), from.toInt()-1, to.toInt()-1)
        }
    }
}

object D05SupplyStack {

    fun moveContainers(inp: String): String {
        val (init, moves) = inp.split("\n\n")

        val port = parseInit(init)
        val directions = moves.split("\n")
            .map{ Direction.fromString(it) }

        directions.forEach {
            port.move(it)
        }

        val out = port.fold("") { acc, item ->
            acc + item.pop()
        }

        return out
    }

    private fun parseInit(inp: String): Port {
        val result = mutableListOf<Stack<Container>>()

        inp.split("\n")
            .reversed()
            .drop(1)
            .map { it.chunked(4) }
            .forEach {
                it
                    .map { item -> Container.fromString(item) }
                    .forEachIndexed { idx, item ->
                        if (result.size < idx+1)
                            result.add(idx, Stack())

                        if (!item.empty())
                            result[idx].add(item)
                }
            }

       return result
    }
}

