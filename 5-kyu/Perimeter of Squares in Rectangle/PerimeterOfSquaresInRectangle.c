// Kata located at: https://www.codewars.com/kata/559a28007caad2ac4e000083

typedef unsigned long long ull;
ull perimeter(int n) {

 		ull prev = 1;
    ull curr = 1;
    ull answr = (n == 0) ? 1 : 2;
    
    for (int i=2; i<=n; ++i) {
    
      curr = prev + curr;
      prev = curr - prev;
      answr += curr;
      
    }
    return answr*4;
}
