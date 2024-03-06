import java.util.Scanner;

public class Literals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a = sc.nextInt();

        if(a%2 == 0){
            System.out.println("Number is an Even Number.");
        }
        else {
            System.out.println("Number is an Odd Number.");
        }

    }
}
