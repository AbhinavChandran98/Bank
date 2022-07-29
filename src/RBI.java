import java.util.Scanner;

public class RBI {
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.07);
        System.out.println("Rate of interest of RBI =7%");
        System.out.println("Toatal amount to be paid :"+total);
    }
}
class SBI extends RBI{
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.071);
        System.out.println("Rate of interest of RBI =7.1%");
        System.out.println("Toatal amount to be paid :"+total);
    }
}
class ICICI extends RBI{
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.075);
        System.out.println("Rate of interest of RBI =7.5%");
        System.out.println("Toatal amount to be paid :"+total);
    }

}
class HDFC extends RBI{
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.0745);
        System.out.println("Rate of interest of HDFC =7.45%");
        System.out.println("Toatal amount to be paid :"+total);
    }
}
class Axis extends RBI{
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.075);
        System.out.println("Rate of interest of Axis =7.5%");
        System.out.println("Toatal amount to be paid :"+total);
    }
}
class PNB extends RBI{
    void rateOfInterest(int amount){
        int amt=amount;
        double total= amount+(amount*.071);
        System.out.println("Rate of interest of PNB =7.1%");
        System.out.println("Toatal amount to be paid :"+total);
    }
}

class Banking{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the money to be ");
        int amt=sc.nextInt();

        RBI ob=new RBI();
        ob.rateOfInterest(amt);

        RBI ob1=new SBI();
        ob1.rateOfInterest(amt);

        RBI ob2=new ICICI();
        ob2.rateOfInterest(amt);

        RBI ob3=new Axis();
        ob3.rateOfInterest(amt);

        RBI ob4=new PNB();
        ob4.rateOfInterest(amt);

        RBI ob5=new HDFC();
        ob5.rateOfInterest(amt);
    }
}