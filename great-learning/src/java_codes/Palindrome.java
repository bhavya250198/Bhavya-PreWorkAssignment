package java_codes;
import java.util.Scanner;
public class Palindrome {
    public int countDigitNumbers(int number)
    {
        int k=0;
        int modulus=0;
        int quotient=0;
        while(number >0){
            modulus= number%10;
            quotient=number/10;
            number=quotient;
            k++;
        }
        return k;
    }
    public void performPalindrome(int number)
    {
        int c = number;
        int reverseNumber=0;
        int modulus=0;
        int quotient=0;
        double result=0.0;
        int countDigits = countDigitNumbers(number);

        while(number > 0)
        {
            modulus= number%10;
            quotient=number/10;
            result= (Math.pow(10.0,countDigits-1) * modulus);
            countDigits -= 1;

            reverseNumber+=(int)result;
            number=quotient;
        }

        boolean answer = c==reverseNumber ? true:false;
        System.out.println(answer);


    }
    public void primeNumber(int number)
    {
        int k =0;
        for(int i =1;i<=number;i++)
        {
            if(number%i ==0)
            {
                k++;
            }
        }
        boolean answer = k ==2 ? true:false;
        System.out.println(answer);
    }
    public void printStars(int number){
        for(int i =0;i<number;i++)
        {
            for(int j =number-1;j>=i;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
    public void printFibbonaci(int number){
        if(number == 1)
        {
            System.out.print(0);
        }
       else if(number == 2){
            for(int i=0;i<number;i++){
                System.out.print(i);
            }

        }
        else{
            for(int i =0;i<number;i++){
                if(i == 0)
                {
                    System.out.print(i);
                }
                else if(i ==1)
                {
                    System.out.print(i);
                }
                else {
                    int k = (i-1) +(i-2);
                    System.out.print(k);
                }
                }
            System.out.println(" ");
            }
        }

    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        Palindrome pal = new Palindrome();
        int a  = ob.nextInt();
        do {
            switch (a) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    pal.performPalindrome(a);
                    break;
                case 2:
                    pal.printStars(a);
                    break;
                case 3:
                    pal.primeNumber(a);
                    break;
                case 4:
                    pal.printFibbonaci(a);
                    break;
                default:
                    break;
            }
            a--;
        }
        while(a != 0);
            System.out.println("Exited Successfully");

    }
}
