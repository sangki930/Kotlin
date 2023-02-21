package kotlinexample.loopexample

class TailRecursionExample {
    // 다음 두 클래스는 tailrec을 쓴 이진탐색과 쓰지 않은 이진탐색 함수가 있다.
    class ExampleOne{
        tailrec fun binIndexOf(
            x:Int,
            array: IntArray,
            from: Int = 0,
            to: Int = array.size
        ): Int {
            if(from==to) return -1
            val midIndex = (from+to-1)/2
            val mid = array[midIndex]
            return when{
                mid < x -> binIndexOf(x,array,midIndex+1,to)
                mid > x -> binIndexOf(x,array,from, midIndex)
                else -> midIndex
            }
        }
    }

    class ExampleTwo{

        fun binIndexOf(
            x:Int,
            array: IntArray,
            from: Int = 0,
            to: Int = array.size
        ): Int {
            var fromIndex = from
            var toIndex = to

            while (true){
                if(fromIndex == toIndex) return -1
                val midIndex = (fromIndex + toIndex - 1) / 2
                val mid = array[midIndex]

                when{
                    mid < x -> fromIndex = midIndex + 1
                    mid > x -> toIndex = midIndex
                    else -> return midIndex
                }

            }
        }
    }
}