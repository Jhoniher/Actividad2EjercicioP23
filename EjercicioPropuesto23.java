//Soluciones de Ecuacion de segundo grado
import java.util.Scanner;
public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Teniendo en cuenta una ecuacion de segundo grado  (Ax^2+Bx+C): ");
        System.out.println("Ingrese el valor de A: ");
        double A=entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        double B=entrada.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        double C=entrada.nextDouble();
        double x1=(-1*B+Math.sqrt(Math.pow(B,2)-(4*A*C)))/(2*A); //aplicando la formula general
        double x2=(-1*B-Math.sqrt(Math.pow(B,2)-(4*A*C)))/(2*A); //aplicando la formula general
        System.out.println("Las soluciones de la ecuacion son: \nX1="+x1+", X2="+x2);


    }
}
