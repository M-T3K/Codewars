//Kata located at: https://www.codewars.com/kata/binary-calculator/train/javascript

function calculate(n1, n2, o)   {

    var a = parseInt(n1, 2);
    var b = parseInt(n2, 2);
    switch(o)   {

        case 'add':
            return (a + b).toString(2);
        case 'subtract':
            return (a - b).toString(2);
        case 'multiply':
            return (a * b).toString(2);
        default:
            return null;

    }

}
