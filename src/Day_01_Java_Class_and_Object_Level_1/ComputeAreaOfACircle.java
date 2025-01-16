package Day_01_Java_Class_and_Object_Level_1;
class AreaOfCircle{
    double radius;

    public AreaOfCircle(double radius){
        this.radius=radius;
    }

    public void calculateArea(){
        double areaOfCircle=3.14*radius*radius;
        System.out.println("Area Of Circle is  :" +areaOfCircle);
    }
    public void calculateCircumference(){
        double circumferenceOfCircle=2*3.14*radius;
        System.out.println("Area Of Circumference is  :" +circumferenceOfCircle);
    }


}


public class ComputeAreaOfACircle {
    public static void main(String[] args) {
        AreaOfCircle ac1=new AreaOfCircle(2.5);
        ac1.calculateArea();
        ac1.calculateCircumference();

    }
}
