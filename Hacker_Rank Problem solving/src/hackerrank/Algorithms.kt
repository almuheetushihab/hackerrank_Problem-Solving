package hackerrank

import kotlin.math.abs

// now start Algorithms problem_solving with hackerRank🙂

/* 1: Marie has invented a Time Machine and wants to travel back in time to Russia to celebrate the Day of the Programmer,
 which is the 256th day of the year. Your task is to determine the exact date of that day for any given year between 1700 and 2700,
  based on the official calendar used in Russia during that time.
 */

//=>
fun dayOfProgrammer(year: Int): String {
    return when {
        year == 1918 -> "26.09.1918"
        year in 1700..1917 -> {
            if (year % 4 == 0) "12.09.$year" else "13.09.$year"
        }

        year >= 1919 -> {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) "12.09.$year" else "13.09.$year"
        }

        else -> "Invalid Year"
    }
}

/*
2. Two cats and a mouse are at various positions on a line. You will be given their starting positions.
 Your task is to determine which cat will reach the mouse first,
  assuming the mouse does not move and the cats travel at equal speed. If the cats arrive at the same time,
   the mouse will be allowed to move and it will escape while they fight.
*/

//=>
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val distanceA = abs(x - z)
    val distanceB = abs(y - z)

    return when {
        distanceA < distanceB -> "Cat A"
        distanceA > distanceB -> "Cat B"
        else -> "Mouse C"
    }
}


/*
3. Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse.
 For instance, given the number , its reverse is . Their difference is .
 The number  reversed is , and their difference is .

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.
*/

//=>
fun beautifulDays(i: Int, j: Int, k: Int): Int {
    // Write your code here

    var count = 0

    for (day in i..j) {
        val reversedDay = day.toString().reversed().toInt()
        val difference = Math.abs(day - reversedDay)

        if (difference % k == 0) {
            count++
        }
    }

    return count
}


fun main() {
    print("day or program result: ${dayOfProgrammer(1918)}")
}