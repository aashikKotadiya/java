import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        // else if statement use to check another condition whean the previous if 
        // condition a false.then program test multiple conditions only one by obe
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
         age = sc.nextInt();

        if(age>56){
            System.out.println("you are experieced");
        }
        else if(age>45){
            System.out.println("you are btave");
        }
        else if(age>25){
            System.out.println("you are young");
        }
        else if(age>12){
            System.out.println("you are small");
        }
        else{
            System.out.println("you are not experienced");
        }
        sc.close();
    }
    
}
