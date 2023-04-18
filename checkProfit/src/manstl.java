import java.util.Scanner;

public class manstl implements itemP{

    private int Wutong;
    private int VolAsh;
    private int selling;
    private int earn;
    private int expences;

    public manstl() {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("     Wutong Flower Price: ");
        this.Wutong = sc.nextInt();
        System.out.print("     Volcanic Ash Price: ");
        this.VolAsh = sc.nextInt();
        System.out.print("     Current Selling Price: ");
        this.selling = sc.nextInt();
        this.earn = (this.selling*9/10);
        this.expences = (this.Wutong*13)+(this.VolAsh*7);
    }


    @Override
    public void itemlist() {
        System.out.println("\n==Memory alloy==");
        System.out.println("   Wutong Flower: 13");
        System.out.println("   Manganese Ore: 12");
        System.out.println("   Volcanic Ash: 7");
        System.out.println("   Poison Gland: 4\n");
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

    // public void hundo(){
    //     System.out.println("if you make 100 then toatl profit will be: " + ((this.profit()*100) + this.selling*18) );
    // }

}
