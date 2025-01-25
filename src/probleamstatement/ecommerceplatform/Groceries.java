package probleamstatement.ecommerceplatform;

public class Groceries extends Product implements Taxable{
    private double discount;
    private double totalTax;
    public Groceries(String productId,String name,double price,double discount){

        super(productId, name, price);
        this.discount=discount;
    }
    @Override

    public double calculateDiscount(){
        return getPrice()*discount/100;
    }

    public void calculateTax(){
        totalTax=getPrice() * 0.15;
    }
    public double getTaxDetails(){
        System.out.println("Total tax "+totalTax);
        return totalTax;
    }


}
