// Kata can be found at: https://www.codewars.com/kata/511f11d355fe575d2c000001
//Primera vez que usé Golang, sin tener mucha idea de él.

package kata

func TwoOldestAges(ages []int) [2]int {

   var arr [2]int;
   temp := 0;
   
   for i := 1; i < len(ages); i++  {     
     
     if (ages[temp] < ages[i])  {
     
        temp = i;
     
     }
     
   }
   
   arr[0] = ages[temp];
   ages[temp] = -1;
   
   temp = 0;
   
   for i := 0; i < len(ages); i++   {
     
     if (ages[temp] < ages[i])  {
     
        temp = i;
     
     }
   
   }
   
  arr[1] = ages[temp];
  temp = arr[0];
  arr[0] = arr[1];
  arr[1] = temp;
  
  return arr;

}
