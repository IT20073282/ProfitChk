import java.util.Scanner;

public class steelplastic implements itemP{

    private int BiBa;
    private int selling;


    public steelplastic() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Need this information: ");
        System.out.print("     Birch Bark Price: ");
        this.BiBa = sc.nextInt();
        System.out.print("     Current Selling Price: ");
        this.selling = sc.nextInt();
    }


    @Override
    public void itemlist() {
        System.out.println("\n==Memory alloy==");
        System.out.println("   Birch Bark: 13");
        System.out.println("   Urtica Leaf: 4");
        System.out.println("   Tentacle: 4\n");
    }

    @Override
    public int profit() {
        return ((this.selling*9/10)-( this.BiBa*13));
        }

    
}
