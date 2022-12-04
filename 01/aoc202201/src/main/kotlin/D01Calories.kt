object D01Calories {
   fun getCalories(input: String): Int {
      val spl = input.split("\n").map(String::trim)

      var max = 0
      var group = 0
      var sum = 0
      for (v: String in spl) {
         if (v == "") {
            sum = 0
            group++

            continue
         }

         val parsed = v.toInt()
         sum += parsed

         if (sum > max) {
            max = sum
         }
      }

      return max
   }
}