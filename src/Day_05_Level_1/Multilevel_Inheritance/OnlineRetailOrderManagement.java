package Day_05_Level_1.Multilevel_Inheritance;
class Order{
    protected String orderId;
    protected String orderDate;

    public Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order placed : "+orderDate);
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
class ShippedOrder extends Order{
    protected int trackingNumber;
    public ShippedOrder(int trackingNumber,String orderId,String orderDate){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Shipped Order with tracking number: "+trackingNumber);
    }
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

}
class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;
    public DeliveredOrder(String deliveryDate,int trackingNumber,String orderId,String orderDate){
        super(trackingNumber,orderId,orderDate);
        this.deliveryDate=deliveryDate;
    }
    @Override
    public void getOrderStatus(){
        System.out.println("Order Delivered on " +deliveryDate);
    }
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

}
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o1=new Order("O1254","15-1-2025");
        o1.displayOrderDetails();
        o1.getOrderStatus();
        System.out.println();

        ShippedOrder s1 = new ShippedOrder(45475854, "O1254", "15-1-2025");
        s1.displayOrderDetails();
        s1.getOrderStatus();
        System.out.println();


        DeliveredOrder d1=new DeliveredOrder("20-1-2025",45475854,"O1254","15-1-2025");
        d1.displayOrderDetails();
        d1.getOrderStatus();

    }
}
