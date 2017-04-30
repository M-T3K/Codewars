package kata
import "sort"

func TwoOldestAges(ages []int) [2]int {

  sort.Ints(ages);
  return [2]int{ages[len(ages) - 2], ages[len(ages) - 1]};

}
