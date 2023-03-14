package homework;

/* Java programme using the following steps.
        *4.1 Declare two instance and two static variables.
        *4.2 Declare one instance method.
        *4.3 Declare one static method.
        * 4.4 Call all four instance and static variables into both instance and static methods inside the
        *print statement.
        * 4.5 Declare the Main method.
        * 4.6 Call both instance and static methods into the Main method and run the programme.
      */
public class Question_4 {

    String Name = "Paryank Patel";
    int Num = 07400000000;

    static String Job = "Software Testing";
    static int Age = 38;

    public void myName(){
        System.out.println("Name = Paryank Patel");
        System.out.println("Num = 07400000000");
    }

    public static void myJob(){
        System.out.println("Job = Software Testing");
        System.out.println("Age = 38");

    }

    public static void main(String[] args) {
        Question_4 rrr = new Question_4();
        rrr.myName();
        myJob();
    }


}
