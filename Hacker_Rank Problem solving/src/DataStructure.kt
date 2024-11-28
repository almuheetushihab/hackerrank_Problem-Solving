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

