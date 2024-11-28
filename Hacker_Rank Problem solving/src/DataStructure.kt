

//1st Number of DataStructure Problem Solve

fun reverseArray(a: Array<Int>): Array<Int> {
    return a.reversedArray()
}

fun main(args: Array<String>) {
    val arrCount = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}