export class G964 {

    public static nbYear = (p0, percent, aug, p) => {
        
        let res: number = p0;
        percent /= 100;
        let y: number = 0; // Number of years
        while( res < p) {

            res += res * percent + aug;
            console.log(`${res}`);
            ++y;
        }
        return y;
    }
}

console.log(G964.nbYear(1500, 5, 100, 5000));