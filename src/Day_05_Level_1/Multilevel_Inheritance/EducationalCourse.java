package Day_05_Level_1.Multilevel_Inheritance;
class Course{
    protected String courseName;
    protected String duration;

    public Course(String courseName,String duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void display(){
        System.out.println("course Name: "+courseName);
        System.out.println("duration: "+duration);
    }

}

class OnlineCourse extends Course{
    protected String platform ;
    protected boolean isRecorded;
    public OnlineCourse(String platform,boolean isRecorded,String courseName,String duration){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    public void display(){
        super.display();
        System.out.println("platform: "+platform);
        System.out.println("isRecorded: "+isRecorded);
    }

}

class PaidOnlineCourse extends OnlineCourse{

    private double fee;
    private double discount;
    public PaidOnlineCourse(double fee,double discount,String platform,boolean isRecorded,String courseName,String duration) {
        super(platform, isRecorded, courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }
    public void display(){
        super.display();
        System.out.println("fee: "+fee);
        System.out.println("discount: "+discount+ "%");
    }


}
public class EducationalCourse {
    public static void main(String[] args) {
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse(5000,10,"BridgeLab",false,"Java Full Stack","4 month");

        paidOnlineCourse.display();


    }
}
