package homework;
/*1.1 Declare two instance variables.
 *1.2 Declare one instance method.
 *1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme.

 /* 1.1 Declare two instance variables.
       * 1.2 Declare one instance method.
       * 1.3 Call both instance variables into the instance method inside the print statement.
       * 1.4 Declare the Main method.
       * 1.5 Call the above instance method into the Main method and Run the programme.

 */

public class Question_1 {

    int a = 10;
    int b = 20;

    public void myInsMethod(){
        System.out.println("a = 10");
        System.out.println("b = 20");



    }

    public static void main(String[] args) {
        Question_1 obj = new Question_1();
        obj.myInsMethod();

    }


}
