//Kata found at: https://www.codewars.com/kata/58989a079c70093f3e00008d

package kata

func CartesianNeighbor(x,y int)  [][]int {
  
  return [][]int{[]int{x - 1, y - 1}, []int{x - 1, y}, []int{x - 1, y + 1},
                  []int{x, y - 1}, []int{x, y + 1},
                  []int{x + 1, y - 1}, []int{x + 1, y}, []int{x + 1, y + 1}};
}
