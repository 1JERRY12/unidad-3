package cajero;
import java.util.Scanner;
public class Cajero {
    public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
        System.out.println("Bienvenido a su cajero automatico");
        System.out.println("Seleccione una de las opciones");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Depositar dinero");
        System.out.println("3 Retirar dinero");
        int opciones = Scanner.nextInt();
        
        double saldo = 3203.49;
      
        
        switch (opciones){
            case 1:
                saldo = saldo;
                    System.out.println("Tu saldo es " +saldo);
                break;
            case 2:
                System.out.println("Cual es la cantidad a depositar");
                double deposito = Scanner.nextDouble();
                saldo += deposito;
            System.out.println("El saldo es " +saldo);
                break;
            case 3:
                System.out.println("Cual es la cantidad a retirar");
                double retiro = Scanner.nextDouble();
                saldo -= retiro;
                if (retiro <=(3203.49)){
                    System.out.println("El retiro fue existoso");
                }else{
                    System.out.println("Fondos insuficientes");
                }
            break;
            default: 
                System.out.println("Por favor selecciona una opcion valida");
                break;
        }
    }
    
}
