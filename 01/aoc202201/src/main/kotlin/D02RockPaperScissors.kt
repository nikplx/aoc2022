import java.lang.IllegalArgumentException

sealed class Outcome(val points: Int) {
    class Loose: Outcome(0)
    class Draw: Outcome(3)
    class Win: Outcome(6)
}

sealed class Move (val points: Int) {
    class Rock: Move(1)
    class Paper: Move(2)
    class Scissors: Move(3)

    companion object Factory {
        fun fromString(inp: String): Move {
            return when (inp) {
                "A", "X" -> Rock()
                "B", "Y" -> Paper()
                "C", "Z" -> Scissors()
                else -> throw IllegalArgumentException("input must be in [ABC] or [XYZ]")
            }
        }
    }

    fun compare(m: Move): Outcome {
        if ((this is Paper && m is Rock)
                || (this is Rock && m is Scissors)
                || (this is Scissors && m is Paper)) {
            return Outcome.Win()
        }

        if ((this is Paper && m is Paper)
            || (this is Rock && m is Rock)
            || (this is Scissors && m is Scissors)) {
            return Outcome.Draw()
        }

        return Outcome.Loose()
    }
}

class Round(private val first: Move, private val second: Move)  {
    companion object Factory {
        fun fromString(inp: String): Round {
            val splits = inp.split(" ")
            if (splits.size != 2) {
                throw IllegalArgumentException("more than two arguments in round string")
            }

           return Round(Move.fromString(splits[0]), Move.fromString(splits[1]))
        }
    }

    fun play(): Int {
        val out = this.second.compare(this.first)
        val p1 = second.points
        val p2 = out.points
        return p1 + p2
    }
}

object D02RockPaperScissors {
   fun playRounds(input: String): Int {
       return input.split("\n")
           .asSequence()
           .filter(String::any)
           .map(String::trim)
           .map(Round::fromString)
           .map(Round::play)
           .reduce { acc, i -> acc + i}
   }
}