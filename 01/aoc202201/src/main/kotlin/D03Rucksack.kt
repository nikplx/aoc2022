fun getCharScore(c: Char): Int {
   if (c in 'a'..'z') {
      return c.code - 96
   }

   if (c in 'A'..'Z') {
      return c.code - 64 + 26
   }

   return 0
}

object D03Rucksack {
   fun getDuplicateScore(inp: String): Int {
      return inp.split("\n")
         .map { it.chunked(it.length / 2) }
         .map { it[0].toSet().intersect(it[1].toSet()) }
         .map {
            it
               .map { c -> getCharScore(c) }
               .reduce { acc, i -> acc + i}
         }
         .reduce {acc, i -> acc + i}
   }
}