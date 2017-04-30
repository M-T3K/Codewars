// Kata located at: https://www.codewars.com/kata/554e4a2f232cdd87d9000038

std::string DNAStrand(std::string dna)
{
  for(int i = 0; i < dna.length(); i++)  {
  
      if(dna[i] == 'A')  dna[i] = 'T';
      else if(dna[i] == 'T')  dna[i] = 'A';
      else if(dna[i] == 'C') dna[i] = 'G';
      else  dna[i] = 'C';
  
  }
  return dna;
}
