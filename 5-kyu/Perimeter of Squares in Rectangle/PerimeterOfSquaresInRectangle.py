# Kata located at: https://www.codewars.com/kata/559a28007caad2ac4e000083

def perimeter(n):
	i = 2
	prev = 1
	curr = 1
	res = 1 if n == 0 else 2
	while i <= n:
		curr += prev
		prev = curr - prev
		res += curr
		i += 1
	return res * 4
    
