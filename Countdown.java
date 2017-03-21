import java.util.Scanner;

class Countdown{
    public static void main(String[] args){
    
    Scanner stdIn = new Scanner(System.in);

    System.out.println("Start Countdown.");
    int x;

    do {
        System.out.print("Integer:");
        x = stdIn.nextInt();
    }while(x <= 0);

    while(x >= 0){
        System.out.println(x);
        x--;
    }
    
  }

}
