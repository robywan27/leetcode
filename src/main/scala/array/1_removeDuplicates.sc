def removeDuplicates(nums: Array[Int]): Int = {
  var ph = Int.MinValue
  var k = 0
  var i = 0
  var l = nums.length
  while (i < l) {
    if (nums(i) != ph) {
      ph = nums(i)
      k += 1
      i += 1
    }
    else {
      for (j <- Range(i, l - 1))
        nums(j) = nums(j + 1)
      l -= 1
    }
  }
  k
}

val a = Array(1, 1, 2)
val b = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
removeDuplicates(a)
removeDuplicates(b)
a
b
