package Harry_Java_Tutorial.ChapterPracticeSet.T39_Chapter_08;

class CellPhone{
    public void ringing(){
        System.out.println("Ringing....");
        System.out.println();
    }
    public void Vibrating(){
        System.out.println("Vibrating.....");
        System.out.println();
    }
    public void CallFriend(){
        System.out.println("Calling Aryan ....");
        System.out.println();
    }
    public void FriendsContact(){
        System.out.println("Ashish...");
        System.out.println("Yash...");
        System.out.println("Harry...");
        System.out.println("Anshika...");
        System.out.println("Bhavishya...");
    }
}
public class Que2 {
    public static void main(String[] args) {
        CellPhone Samsung=new CellPhone();
        Samsung.CallFriend();
        Samsung.ringing();
        Samsung.Vibrating();
        Samsung.FriendsContact();
    }
}
