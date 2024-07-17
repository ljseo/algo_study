class Solution {
    fun solution(input : Int) {
        var n = input
        var num1 = 0
        var arrayList : ArrayList<Int> = arrayListOf()
        while (true) {
            if (n < 3){
                arrayList.add(n)
                break
            }else {
                num1 = n % 3
                n /= 3

                arrayList.add(num1)
            }
        }
        println(arrayList.reversed().toString())


        val reversedArrayList = arrayList.reversed()

        // 뒤집힌 3진법을 10진법으로 변환
        var result = 0
        for (i in reversedArrayList.indices) {
            result += reversedArrayList[i] * Math.pow(3.0, i.toDouble()).toInt()
        }
        println(result)
    }

}