//Kata located at: https://www.codewars.com/kata/559ce00b70041bc7b600013d
package kata

func Finance(n int) int {
    m := n * (n + 1) * (n + 2);
    return int(m / 2);
}
