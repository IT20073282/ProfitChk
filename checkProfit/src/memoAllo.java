import java.util.Scanner;



public class memoAllo implements itemP{

    private int wo_ash;
    private int ch_stalk;
    private int selling;
    private int earn;
    private int expences;

    public memoAllo() {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("     Wood Ash Price: ");
        this.wo_ash = sc.nextInt();
        System.out.print("     China-Hemp Stalk Price: ");
        this.ch_stalk = sc.nextInt();
        System.out.print("     Current Selling Price: ");
        this.selling = sc.nextInt();
        this.earn = (this.selling*9/10);
        this.expences = (this.wo_ash*15)+(this.ch_stalk*4);
    }


    @Override
    public void itemlist() {
        System.out.println("\n==Memory alloy==");
        System.out.println("   Wood Ash: 15");
        System.out.println("   Zink Ore: 14");
        System.out.println("   China-Hemp Stalk: 4");
        System.out.println("   Sharp Fang: 4\n");
    }

    @Override
    public int profit() {
        return (this.earn - this.expences);
        }


    @Override
    public int earn() {
        return this.earn;
    }


    @Override
    public int expences() {
        return this.expences;
    }

       
    
}
