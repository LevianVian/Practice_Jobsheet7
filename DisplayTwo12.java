import java.util.Scanner;


public class DisplayTwo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input some number: ");
        int numInput = input.nextInt();

        for (int i = 1; i <= numInput; i++){
            if (i % 2 == 0){
                System.out.println("2 multiple: "+i);
            }
        }
    }
}
