object D06ConsecutiveChars {
    fun getBeginning(inp: String): Int {
        var last = inp.take(4)
        for (i in inp.indices.drop(4)) {
            if (last.toSet().size == 4) {
                return i
            }

            last = last.drop(1) + inp[i]
        }

        return 0
    }
}