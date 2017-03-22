import java.util.Scanner;

class Sum_i{

    public static void main(String[] args){
    
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Sum up from 1 to n.");
            int n;
            do{
                System.out.print("n is :");
                n = stdIn.nextInt();
            }while(n <= 0);

            int sum = 0;
            int i = 1;

            while(i <= n);{
                sum += i;
                i++;
            }
        
        System.out.println("The sum from 1 to" + n + "is" + sum);

    }
}
