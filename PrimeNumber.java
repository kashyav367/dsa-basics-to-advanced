//Prime Number (Number is divisible 1 & itself)
//(No. of factors = 2)

public class PrimeNumber {
    

    public static void main(String[] args) {
        int n = 19;
        int count = 0;

        for(int i=2;  i <=n ; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(n == 20){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
