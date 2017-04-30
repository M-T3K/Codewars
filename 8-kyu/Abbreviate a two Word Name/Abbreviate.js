//Kata can be found at: https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
function abbrevName(name){

    return (name[0] + "." + name[name.indexOf(" ") + 1]).toUpperCase();

}
