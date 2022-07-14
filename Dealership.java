import java.util.Scanner;

public class Dealership {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nWelcome to the jaswanth Dealership.");


        System.out.println("\n~ Select option 'a' to buy a car");
        System.out.println("\n~ Select option 'b' to sell a car");
        String option = sc.nextLine();
        switch(option)
        {
            case "a":  System.out.println("\n You choosen option "+ option); 
                       System.out.println("\n What is your Budget?");
                       long budget=sc.nextLong();
                       if(budget>=450000 && budget<800000)
                       {
                        System.out.println("\nGreat! TATA Altroz available..");
                        System.out.println("\nDo you have Insurance? say 'yes' or 'no'..");
                        sc.nextLine();
                        String insurance=sc.nextLine();
                        System.out.println("\nDo you have a license? say 'yes' or 'no'..");
                        String license=sc.nextLine();
                        System.out.println("\nWhat is your credit score?");
                        int creditscore=sc.nextInt();
                        if(insurance.equals("yes") && license.equals("yes") && creditscore>650)
                        {
                            System.out.println("\nSold! Pleasure doing bussiness with you..");

                        }
                        else

                        System.out.println("\nWe're sorry you are not eligible..");
                        
                       }
                        else if(budget>=800000 && budget<2500000)
                       {
                        System.out.println("\nGreat! suzuki Baleno available..");
                        System.out.println("\nDo you have Insurance? say 'yes' or 'no'..");
                        sc.nextLine();
                        String insurance=sc.nextLine();
                        System.out.println("\nDo you have a license? say 'yes' or 'no'..");
                        String license=sc.nextLine();
                        System.out.println("\nWhat is your credit score?");
                        int creditscore=sc.nextInt();
                        if(insurance.equals("yes") && license.equals("yes") && creditscore>650)
                        {
                            System.out.println("\nSold! Pleasure doing bussiness with you..");

                        }
                        else

                        System.out.println("\nWe're sorry you are not eligible..");
                       }
                        else if(budget>=2500000)
                        {
                            System.out.println("\nGreat! BMW X5 available..");
                            System.out.println("\nDo you have Insurance? say 'yes' or 'no'..");
                            sc.nextLine();
                            String insurance=sc.nextLine();
                            System.out.println("\nDo you have a license? say 'yes' or 'no'..");
                            String license=sc.nextLine();
                            System.out.println("\nWhat is your credit score?");
                            int creditscore=sc.nextInt();
                            if(insurance.equals("yes") && license.equals("yes") && creditscore>650)
                            {
                                System.out.println("\nSold! Pleasure doing bussiness with you..");
    
                            }
                            else
    
                            System.out.println("\nWe're sorry you are not eligible..");
                        } else 
                        {
                            System.out.println("\nWe don't sell cars under 4,00,000 Sorry!..");
                        }
                       
                         break;
            case "b":  System.out.println("\n You choosen option "+ option);
                       System.out.println("\n What is your Car valued at?");
                       long value=sc.nextLong();
                       System.out.println("\n What is your Selling price?");
                       long price=sc.nextLong();
                       System.out.println("\n What is your Car brand and version of it?");
                       sc.nextLine();
                       String car=sc.nextLine();
                       
                       if(value>price)
                       {
                        System.out.println("\n We will buy your "+car+", Pleasure doing bussiness with you!");

                       } else 
                       System.out.println("\n Sorry! we are not interested.. ");
                       break;
            default : System.out.println("\nInvalid option"); 
        }
        sc.close();
        


    }
    
}
