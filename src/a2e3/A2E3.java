import java.util.Scanner;

public class A2E3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // definir variables
        int factorial = 1;
        int N;
        
        //pedir los datos
        System.out.println("Ingrese el numero");
        N = sc.nextInt();
        
        //hacer una funcion que haga N veces la operacion 
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }
        // imprime el factorial de N
        System.out.println("El factorial de " + N + " Es: " + factorial);
    }

}
