// Kata can be found at: https://www.codewars.com/kata/51b6249c4612257ac0000005
// At this point in time, this kata is not available in C. Therefore, I translated it to C. This is the solution in C:

#include <stdio.h>
#include <string.h>

int romanToInt(const char romNumeral)	{
	
	switch(toupper(romNumeral))	{

		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		default:
			return 0;

	}

}

int solution(const char *roman)	{

	if (strlen(roman) == 1) {
		return romanToInt((char)roman[0]);
	}

  int total = 0;
  
  for(int i = 0; i < strlen(roman); ++i) {

		//This is to avoid out of Bounds error
    if (i == strlen(roman) - 1) {
    	total += romanToInt((char)roman[i]);
      break;
    }

    int curr = romanToInt((char)roman[i]);
    int nxt = romanToInt((char)roman[i+1]);

    if (nxt > curr) {

      total -= curr;

    } else {

      total += curr;

    }
  }

	return total;

}
