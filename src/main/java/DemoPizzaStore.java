import java.util.Scanner;

public class DemoPizzaStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pizza shop, what type of pizza you like? We have following selections \n " +
                "1. Veg" + " \n 2. Non-Veg");
        String category = sc.nextLine();

        if(category.equalsIgnoreCase("Veg")){
            System.out.println("Please tell me do you like VegStuff or VegNotStuffed");
            String type = sc.nextLine();

            if(type.equalsIgnoreCase("VegStuff")){
                System.out.println("Please enter your size (Small, Medium, Large)");
                String size = sc.nextLine();
                Pizza vegStuff = new Veg(5,category, type, size, "VegTop");
                vegStuff.calculateBillAmount(category, type, size);
            }
            else if(type.equalsIgnoreCase("VegNotStuffed")){
                System.out.println("Please enter your size (Small, Medium, Large)");
                String size = sc.nextLine();
                Pizza vegNotStuff = new Veg(5,category, type, size, "VegNotTop");
                vegNotStuff.calculateBillAmount(category, type, size);
            }
            else {
                System.out.println( "Sorry your order is invalid..!");
            }
        }
        else if(category.equalsIgnoreCase("Non-Veg")){
            System.out.println("Please tell me do you like NonVegStuffed or NonVegNotStuffed");
            String type = sc.nextLine();

            if(type.equalsIgnoreCase("NonVegStuffed")){
                System.out.println("Please enter your size (Small, Medium, Large)");
                String size = sc.nextLine();
                Pizza noVegStuff = new NonVeg(5,category, type, size, "VegTop");
                noVegStuff.calculateBillAmount(category, type, size);
            }
            else if(type.equalsIgnoreCase("NonVegNotStuffed")){
                System.out.println("Please enter your size (Small, Medium, Large)");
                String size = sc.nextLine();
                Pizza noVegNoStuff = new NonVeg(5,category, type, size, "VegTop");
                noVegNoStuff.calculateBillAmount(category, type, size);
            }
            else {
                System.out.println( "Sorry your order is invalid..!");
            }
        }
        else {
            System.out.println("Please enter a valid selection..!!");
        }

    }
}
