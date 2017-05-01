// Kata can be found at: https://www.codewars.com/kata/56747fd5cb988479af000028

std::string get_middle(std::string input) 
{
  if (input.length() % 2 == 0) return input.substr(input.length() /2 - 1, 2);
	return input.substr(input.length() /2, 1);
}
