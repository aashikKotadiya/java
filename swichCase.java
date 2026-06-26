import java.util.Scanner;

public class swichCase {
    public static void main(String[] args) {
      //switch case is used when we have to make a choice 
      // between number of alternative for a given variable.
      
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

swich(age){
        case 23:
        System.out.println("you are enjoy life");
        break;
        case 43:
        System.out.println("you are work");
        break;
        case 54:
        System.out.println("you are rest");
        break;
        default:
            System.out.println("you are beautiful");
        }
            sc.close();
        }
    }

