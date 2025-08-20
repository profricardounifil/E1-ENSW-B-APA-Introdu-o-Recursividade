import java.util.Scanner;

public class Fibonacci {

    public static int calcularFibonacci(int n) {
        int resultado = 0, anterior = 1, anteriorDoAnterior = 0;
        if(n <= 1) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                resultado = anterior + anteriorDoAnterior;
                anteriorDoAnterior = anterior;
                anterior = resultado;
            }
        }
        return resultado;
    }

    public static int calcularFibonacciRecursivo(int n) {
        if(n <= 1) {
            return n;
        }
        return calcularFibonacciRecursivo(n-1) + calcularFibonacciRecursivo(n-2);
    }

    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para cálculo do Fibonacci: ");
        numero = scanner.nextInt();
        System.out.println("O Fib(" + numero + ") = " + calcularFibonacciRecursivo(numero));
    }
}
