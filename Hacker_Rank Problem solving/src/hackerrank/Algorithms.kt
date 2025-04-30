package hackerrank

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


fun main() {
    print("day or program result: ${dayOfProgrammer(1918)}")
}