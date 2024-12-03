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


//4th Number of DataStructure Problem Solve

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    val n = arr.size
    val effectiveD = d % n


    val rotatedArray = Array(n) { 0 }


    for (i in 0 until n) {
        rotatedArray[i] = arr[(i + effectiveD) % n]
    }

    return rotatedArray

}



//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
//2nd Number of DataStructure Problem Solve
