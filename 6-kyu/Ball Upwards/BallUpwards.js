//Kata found at : https://www.codewars.com/kata/566be96bb3174e155300001b

function maxBall(v0) {
    var cv = v0 * 0.277777777;
    var t = 10 * cv / 9.81;
    if (t - parseInt(t, 10) > 0.5)  {return parseInt(t, 10) + 1;}
    else  {return parseInt(t, 10);}
}
