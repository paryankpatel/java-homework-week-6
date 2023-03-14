package homework;
/*3.1 Declare one instance and one static variable.
 *3.2 Declare one instance method.
 *3.3 Declare one static method.
 *3.4 Call both instance and static variables into both instance and static methods inside the
 *print statement.
 *3.5 Declare the Main method.
 *3.6 Call both instance and static methods into the Main method and run the programme.

 */
public class Question_3 {

    String Name = ("Paryank Patel");
    static String Job = ("Software Testing");


    public void myName(){
        System.out.println("Name = Paryank patel");

    }
    public static void myJob(){
        System.out.println("Job = Software Testing");

    }

    public static void main(String[] args) {
        Question_3 sss = new Question_3();
        sss.myName();
        myJob();
    }

}
