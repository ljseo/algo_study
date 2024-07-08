class `0707_p가장가까운같은글자` {

    fun solution(s: String): List<Int> {
        val arr = s.map { it.toString() }
        val arr2 = MutableList(s.length) { 0 }
        val hashSet = mutableSetOf<String>()
        var count = 0

        // 문자열의 각 문자를 hashSet에 추가
        for (i in arr) {
            hashSet.add(i)
        }

        // hashSet의 각 문자에 대해 첫 등장 위치에 -1 할당
        for (i in hashSet) {
            val value = arr.indexOf(i)
            arr2[value] = -1
        }

        // 거리 계산
        for (i in arr.indices) {
            for (j in i downTo 1) {
                if (arr2[i] == -1) {
                    break
                }

                if (arr[i] == arr[j - 1]) {
                    arr2[i] = count + 1
                    count = 0
                    break
                }
                count += 1
            }
        }

        return arr2
    }

}