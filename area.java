import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double raio = s.nextDouble();
        double area = 3.14159 * (raio * raio);
        System.out.printf("A=%.4f%n",area);

    }
}