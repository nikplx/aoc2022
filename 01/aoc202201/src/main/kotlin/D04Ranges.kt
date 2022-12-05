object D04Ranges {
    fun getFullyContainedPairs(inp: String): Int {
        return inp.split("\n")
            .map { it.split(",") }
            .map { scoreFromRange(it) }
            .reduce { acc, i -> acc + i}
    }

    fun scoreFromRange(r: List<String>): Int {
        val (r1, r2) = r.map { s ->
            val splitted = s.split("-").map(String::toInt)
            (splitted[0]..splitted[1])
        }

        if (r1.intersect(r2).size == r1.toList().size || r2.intersect(r1).size == r2.toList().size) {
            return 1
        }

        return 0
    }
}