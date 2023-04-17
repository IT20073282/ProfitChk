import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
       
        do{
            System.out.println("\nWhat item do you need to check..?");
            System.out.println("  1. Memory Alloy");
            System.out.println("  2. Manganese Steel Pipe");
            System.out.println("  3. Steel Plastic Composite Pipe");
            System.out.println("  0. Exit...");
            System.out.print("  Enter the number: ");

            int Label = 0;
            do{
                x = sc.nextInt();

                switch(x){
                    case 1:
                        Label = 0;
                        memoAllo m1 = new memoAllo();
                        System.out.println("\nProfit for a one item is: " + m1.profit() + " Gold Bars");
                        break;
                    
                    case 2:
                        Label = 0;
                        manstl a1 = new manstl();
                        System.out.println("\nProfit for a one item is: " + a1.profit() + " Gold Bars");
                        break;
                        
                    case 3:
                        Label = 0;
                        steelplastic s1 = new steelplastic();
                        System.out.println("\nProfit for a one item is: " + s1.profit() + " Gold Bars");
                        break;

                    case 0:
                        Label =0;
                        break;

                    default:
                    System.out.print("Invalid input..! Please try again: ");
                        Label = 1;
                        break;
                }

            }while(Label == 1);

        }while (x!=0);
        

    }
}
