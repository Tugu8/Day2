import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class employee {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double salary = scanner.nextDouble();
        
        double increaseRate = 0;
        if (salary <= 400.00) {
            increaseRate = 0.15;
        } else if (salary <= 800.00) {
            increaseRate = 0.12;
        } else if (salary <= 1200.00) {
            increaseRate = 0.10;
        } else if (salary <= 2000.00) {
            increaseRate = 0.07;
        } else {
            increaseRate = 0.04;
        }
        
        double moneyEarned = salary * increaseRate;
        double newSalary = salary + moneyEarned;
        
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %.0f %%\n", increaseRate * 100);
    }
 
}