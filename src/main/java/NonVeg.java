public class NonVeg extends Pizza{
    String nonVegToppings;
    static int counter;

    public NonVeg(int itenId, String category, String type, String size, String nonVegTop) {
        super(itenId, category, type, size);
        this.nonVegToppings = nonVegTop;
        counter++;
        billId = itenId + counter;
    }


    public String getNonVegToppings() {
        return nonVegToppings;
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
            if(type.equalsIgnoreCase("NonVegStuffed")){
                if (size.equalsIgnoreCase("Small")) return cost = 50;
                else if (size.equalsIgnoreCase("Medium")) return cost = 100;
                else if (size.equalsIgnoreCase("Large")) return cost = 150;
            }
            else if(type.equalsIgnoreCase("NonVegNotStuffed")){
                if (size.equalsIgnoreCase("Small")) return cost = 40;
                else if (size.equalsIgnoreCase("Medium")) return cost = 80;
                else if (size.equalsIgnoreCase("Large")) return cost = 120;
            }else {
                return 0;
            }

        }
        return cost;
    }

    @Override
    public float calculateBillAmount(String category,String type, String size ) {
        float billAmount = 0;
        float tax = 10/100;
        if (!validageCategory(category)) {
            System.out.println("Wrong category entered and bill can not be calculated..!!");
            return 0;
        }else{
            billAmount = identifyCost(type, size)*(1+ 1/10);
            System.out.println("Your total bill is bill ID " + billId + " Rs "+ billAmount+ " Thank you !!");
            return billAmount;
        }
    }
}
