import java.util.Scanner;
public class hola {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
        int valor;
        System.out.println("Escribe el valor");
        valor=teclado.nextInt();
        
        for(int fila=1;fila<=valor;fila++){
            for (int columna = 1; columna <= valor; columna++){
                    System.out.print("* ");	
            }
                    System.out.println();
        }
        System.out.println("Un cambio");
	}
}
