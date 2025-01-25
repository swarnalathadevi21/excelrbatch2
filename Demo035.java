import java.util.Scanner;
public class Demo035 {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the vlue of a: ");
      int a = obj.nextInt();
      System.out.println("Enter the vlue of b: ");
      int b = obj.nextInt();
      if(a>b){
        System.out.println("a is greater value b");
      }
      else if(b>a){
        System.out.println("b is greater value a"); 
      }
      else {
        System.out.println("both are equal");
      }


    }

