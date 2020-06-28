public class Veg extends Pizza{

    String vegToppings;
    static int counter = 1;

    public Veg(int itenId, String category, String type, String size, String vegTop) {
        super(itenId, category, type, size);
        this.vegToppings = vegTop;
        counter++;
        billId = itenId + counter;
    }


    public String getVegToppings() {
        return vegToppings;
    }

    @Override
    public boolean validateType(String type) {
        if(type.equalsIgnoreCase("VegStuffed")) return  true;
        else if (type.equalsIgnoreCase("VegNotStuffed")) return true;
        else return false;
    }

    @Override
    public float identifyCost(String type, String size) {
        float cost = 0;
        if(!validateType(type) && !validateSize(size)) {
            System.out.println("Invalid type and size");
            return 0;
        }else {
            if(type.equalsIgnoreCase("VegStuff")){
                if (size.equalsIgnoreCase("Small")) return cost = 30;
                else if (size.equalsIgnoreCase("Medium")) return cost = 60;
                else if (size.equalsIgnoreCase("Large")) return cost = 90;
            }
            else if(type.equalsIgnoreCase("VegNotStuffed")){
                if (size.equalsIgnoreCase("Small")) return cost = 20;
                else if (size.equalsIgnoreCase("Medium")) return cost = 40;
                else if (size.equalsIgnoreCase("Large")) return cost = 80;
            } else{
                return 0;
            }

        }
        return cost;
    }

    @Override
    public float calculateBillAmount(String category,String type, String size ) {
        float billAmount = 0;
        float tax = 5/100;
        if (!validageCategory(category)) {
            System.out.println("Wrong category entered and bill can not be calculated..!!");
            return 0;
        }else{
            billAmount = identifyCost(type, size)*(1 + 5/100);
            System.out.println("Your total bill is bill ID " + billId + " Rs "+ billAmount+ " Thank you !!");
            return billAmount;
        }
    }
}
