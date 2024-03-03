package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestMain implements billdetails {
    private bill billObj;

    public TestMain() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Meter Number:");
            String meterNum = br.readLine();
            System.out.println("Enter Name:");
            String name = br.readLine();
            System.out.println("Enter Email:");
            String email = br.readLine();
            System.out.println("Enter Phone Number:");
            String phoneNumber = br.readLine();
            System.out.println("Enter Address:");
            String address = br.readLine();

            billObj = new bill(meterNum, name, email, phoneNumber, address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestMain e = new TestMain();
        e.unitCalc();
        System.out.println(" ");
        e.e_tariff();
    }

    @Override
    public void e_tariff() {
        System.out.println("Electricity Tariff");
        System.out.println("Units 100 or below = free of cost");
        System.out.println("Units 101 - 300 = Rs.4.5/unit");
        System.out.println("Units 301 - 500 = Rs.6.25/unit");
        System.out.println("Above 500 units = Rs.7/unit");

    }

    @Override
    public void unitCalc() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("1-தமிழ், 2-English");
            int r = Integer.parseInt(br.readLine());
            switch (r) {
                case 1:
                    System.out.println("அலகுகளின் எண்ணிக்கையை உள்ளிடவும்");
                    int uts = Integer.parseInt(br.readLine());
                    if (uts > 300 && uts <= 500) {
                        double x = uts * 6.25;
                        System.out.println("\n" + "உங்கள் பில் தொகை:" + x);
                    } else if (uts <= 300 && uts > 100) {
                        double y = uts * 4.5;
                        System.out.println("உங்கள் பில் தொகை:" + y);
                    } else if (uts <= 100) {
                        System.out.println("தொகை இல்லை");
                    } else {
                        double m = uts * 7;
                        System.out.println("உங்கள் பில் தொகை:    " + m);
                    }
                    break;

                case 2:
                    System.out.println("Enter number of units");
                    int bn = Integer.parseInt(br.readLine());
                    if (bn > 300 && bn <= 500) {
                        double x = bn * 6.25;
                        System.out.println("Your bill amount: " + x);
                    } else if (bn <= 300 && bn > 100) {
                        double y = bn * 4.5;
                        System.out.println("Your bill amount: " + y);
                    } else if (bn <= 100) {
                        System.out.println("No cost");
                    } else {
                        double m = bn * 7;
                        System.out.println("Your bill amount: " + m);
                    }
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
