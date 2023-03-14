package homework;
 /*Write a program for a calculator with addition, subtraction, multiplication
  *      and division methods all with parameters and use string concatenation
  *       methods.(Note: Two static and Two instance methods.)

  */
public class Question_5 {

public void addition(){
    int a = 10;
    int b = 20;
    int ans = a + b;
    System.out.println("Addition of two numbers = " + ans);


}
public void Subtraction(){
    int a = 30;
    int b = 10;
    int ans = a-b;
    System.out.println("Subtraction of two numbers = " + ans);

}

public static void Multiplication(){
    int a = 5;
    int b = 5;
    int ans = a * b;
    System.out.println("Multiplication of two numbers are = " + ans);

}
public static void Division(){

    int a = 50;
    int b = 25;
    int ans = a/b;
    System.out.println("Divison of two numbers are = " + ans);


}

    public static void main(String[] args) {
        Question_5 rrr = new Question_5();
        rrr.addition();
        rrr.Subtraction();
        Multiplication();
        Division();
    }
}
