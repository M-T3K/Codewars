// Kata located at: https://www.codewars.com/kata/559a28007caad2ac4e000083

function perimeter(n) {
    var prev = 1;
    var curr = 1;
    var ans = (n == 0) ? 1 : 2;
    for(var i = 2; i <= n; ++i)	{
    
    	curr = prev + curr;
      prev = curr - prev;
      ans += curr;
    
    }
    return ans * 4;
}
