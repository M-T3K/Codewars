// Kata located at: https://www.codewars.com/kata/555eded1ad94b00403000071

#include <math.h>
#include <sstream>
#include <iomanip>

std::string seriesSum(int n)
{
    // Happy Coding ^_^
    double val = 0;
    
    //Series simplification -> Sum(1/(1+3n)) :: n = 0 -> oo
    
    for(int i = 0; i < n; i++)  {
    
      double number = (1 + 3*i);
      
      val += 1/number;
      
    }
    
    val = round(val * 100);
    
    std::stringstream strStream;
    strStream << std::setprecision(2) << std::fixed << val / 100 ;
        
    return strStream.str();
}
