import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double gasto1, gasto2, gasto3, gasto_total;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.print("INGRESE EL VALOR DEL GASTO DE SU PRIMER HIJO: "); // Carpinteria de salida
        gasto1 = teclado.nextDouble(); //Datos de entrada
        System.out.print("INGRESE EL VALOR DEL GASTO DE SU SEGUNDO HIJO: ");
        gasto2 = teclado.nextDouble();
        System.out.println("INGRESE EL VALOR DEL GASTO DE SU TERCER HIJO: ");
        gasto3 = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        gasto_total = gasto1 + gasto2 + gasto3;
        //PRESENTACION DE DATOS DE SALIDA
        System.out.println("El gasto total es: " + gasto_total);
    }
}


