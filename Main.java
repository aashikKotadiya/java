import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your maths number:");
    int maths = sc.nextInt();
    System.out.println("enter your physics number:");
    int physics = sc.nextInt();
    System.out.println("enter your english marks:");
    int english = sc.nextInt();
    
    double percentage = ((maths+physics+english)*100)/300;
    System.out.println("percentage:");
    System.out.println(percentage);
    }
}


o/p
nter your maths number:
80
enter your physics number:
90
enter your english marks:
70
percentage:
80.0
