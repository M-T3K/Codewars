export class G964 {

    public static digPow = (n, p) => {
    
        let list: number[] = n.toString().split('').map((num: number) => Math.pow(num, p++));
        
        let sum: number = 0;
        list.forEach((num: number) => sum += num);
        
        return (sum % n === 0)? sum / n : -1;
    }

}

console.log(`${G964.digPow(695, 2)}`);