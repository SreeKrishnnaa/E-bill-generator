package project;

import java.util.Scanner;

public class TestMain implements billdetails {

	public static void main(String[] args) {
		   bill i=new bill("5676","SRI RAM","ram@mymail","78696867","ram street,thindal");
	        System.out.println(" ");
	        bill s=new bill("5656","ஸ்ரீ ராம்","ram@mymail","78696867","ராம் தெரு, திண்டல்");
	        TestMain e=new TestMain();
	        e.unitCalc();
	        System.out.println(" ");
	       e.e_tariff();
	    }

    @Override
    public void e_tariff() {
        System.out.println("Electricity Tariff");
        System.out.println("units 100 or below=free of cost");
        System.out.println("units 101 - 300= Rs.4.5/unit");
        System.out.println("units 301 - 500= Rs.6.25/unit");
        System.out.println("Above 500 units= Rs.7/unit");

    }

    @Override
    public void unitCalc() {
        Scanner s=new Scanner(System.in);
        System.out.println("1-tamil,2-english");
        int r=s.nextInt();
        switch(r){
            case 1:
                System.out.println("அலகுகளின் எண்ணிக்கையை உள்ளிடவும்");
                int uts = s.nextInt();
        if (uts > 300 && uts <= 500) {
            double x = uts * 6.25;
            System.out.println("\n" +
                    "உங்கள் பில் தொகை:" + x);
        } else if (uts <= 300 && uts > 100) {
            double y = uts * 4.5;
            System.out.println("உங்கள் பில் தொகை:" + y);
        } else if (uts <= 100) {
            System.out.println("தொகை இல்லை");
        } else {
            double m = uts * 7;
            System.out.println("உங்கள் பில் தொகை:    " + m);
        }break;

            case 2:
                System.out.println("enter no.of units");
                int bn = s.nextInt();
                if (bn > 300 && bn <= 500) {
                    double x = bn * 6.25;
                    System.out.println("your bill amount:-" + x);
                } else if (bn <= 300 && bn > 100) {
                    double y = bn * 4.5;
                    System.out.println("your bill amount:-" + y);
                } else if (bn <= 100) {
                    System.out.println("no cost");
                } else {
                    double m = bn * 7;
                    System.out.println("your bill amount:-    " + m);
                }
                break;




    }
}

	

}
