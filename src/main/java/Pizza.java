public abstract class Pizza {
    int itenId;
    int billId;
    String category;
    String type;
    String size;

    public Pizza(int itenId, String category, String type, String size) {
        this.itenId = itenId;
        this.category = category;
        this.type = type;
        this.size = size;
    }

    public int getItenId() {
        return itenId;
    }

    public int getBillId() {
        return billId;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean validageCategory(String category){
     if(category.equalsIgnoreCase("Veg")) return true;
     else if (category.equalsIgnoreCase("Non-Veg")) return true;
     else return false;
    }

    public boolean validateSize(String size){
    if(size.equalsIgnoreCase("Small")) return true;
    else if (size.equalsIgnoreCase("Medium")) return true;
    else if(size.equalsIgnoreCase("Large")) return true;
    else return false;
    }

    abstract public boolean validateType(String type);

    abstract public float identifyCost(String type, String size);

    abstract public float calculateBillAmount(String category,String type, String size );
}
