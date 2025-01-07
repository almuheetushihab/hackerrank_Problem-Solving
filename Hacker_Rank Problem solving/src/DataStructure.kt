//1st Number of DataStructure Problem Solve

fun reverseArray(a: Array<Int>): Array<Int> {
    return a.reversedArray()
}


//2nd Number of DataStructure Problem Solve

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxSum = Int.MIN_VALUE
    for (i in 0..3) {
        for (j in 0..3) {
            val sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                    arr[i + 1][j + 1] +
                    arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]

            maxSum = maxOf(maxSum, sum)
        }
    }
    return maxSum
}


//3 Number of DataStructure Problem Solve


fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    val seqList = Array(n) { mutableListOf<Int>() }
    val result = mutableListOf<Int>()
    var lastAnswer = 0

    for (query in queries) {
        val type = query[0]
        val x = query[1]
        val y = query[2]

        val seqIndex = (x xor lastAnswer) % n

        if (type == 1) {
            seqList[seqIndex].add(y)
        } else if (type == 2) {
            lastAnswer = seqList[seqIndex][y % seqList[seqIndex].size]
            result.add(lastAnswer)
        }
    }

    return result.toTypedArray()
}


// 4th Number of DataStructure Problem Solve

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    val n = arr.size
    val effectiveD = d % n


    val rotatedArray = Array(n) { 0 }


    for (i in 0 until n) {
        rotatedArray[i] = arr[(i + effectiveD) % n]
    }

    return rotatedArray

}


//5th Number of Algorithm Problem Solve

//You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).
//
//The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
//The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
//You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

//=>

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 == v2) {
        return if (x1 == x2) "YES" else "NO"
    }

    val n = (x2 - x1).toDouble() / (v1 - v2).toDouble()

    return if (n > 0 && n % 1 == 0.0) "YES" else "NO"
}
//6th Number of Algorithm Problem Solve

//There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
//
//The elements of the first array are all factors of the integer being considered
//The integer being considered is a factor of all elements of the second array
//These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

//=>

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    fun gcd(x: Int, y: Int): Int {
        return if (y == 0) x else gcd(y, x % y)
    }

    fun lcm(x: Int, y: Int): Int {
        return (x / gcd(x, y)) * y
    }

    val lcmA = a.reduce { acc, num -> lcm(acc, num) }

    val gcdB = b.reduce { acc, num -> gcd(acc, num) }

    var count = 0
    var multiple = lcmA

    while (multiple <= gcdB) {
        if (gcdB % multiple == 0) {
            count++
        }
        multiple += lcmA
    }

    return count
}

//7th Number of DataStructure Problem Solve
//Maria plays college basketball and wants to go pro.
//Each season she maintains a record of her play.
//She tabulates the number of times she breaks her season record for most points and least points in a game.
//Points scored in the first game establish her record for the season, and she begins counting from there.

//=>
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var highest = scores[0]
    var lowest = scores[0]
    var highBreaks = 0
    var lowBreaks = 0

    for (i in 1 until scores.size) {
        if (scores[i] > highest) {
            highest = scores[i]
            highBreaks++
        } else if (scores[i] < lowest) {
            lowest = scores[i]
            lowBreaks++
        }
    }
    return arrayOf(highBreaks, lowBreaks)
}

//8th Number of Algorithms Problem Solve
//Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
//Lily decides to share a contiguous segment of the bar selected such that:
//The length of the segment matches Ron's birth month, and,
//The sum of the integers on the squares is equal to his birth day.
//Determine how many ways she can divide the chocolate.

//=>
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var count = 0
    var sum = 0

    for (i in 0 until m) {
        sum += s[i]
    }

    if (sum == d) {
        count++
    }

    for (i in m until s.size) {
        sum = sum - s[i - m] + s[i]
        if (sum == d) {
            count++
        }
    }

    return count
}


//9th Number of Algorithms Problem Solve
//Given array of integers and a positive integer k. determine the number of (i,j) pairs where i<j and ar[j] is divisible by k.

//=>
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var count = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if ((ar[i] + ar[j]) % k == 0) {
                count++
            }
        }
    }
    return count
}

//10 Number of DataStructure Problem Solve


//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
