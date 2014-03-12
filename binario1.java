import java.util.*;
public class binario1{
	public static void main(String [] Args){
		System.out.println("");
		System.out.println("Escriba el número binario convertir (solo 12 dígitos)");
		String numerobinario;
		Scanner entrada = new Scanner(System.in);
		numerobinario = entrada.nextLine();
		String espaciado[] = new String[11];
		espaciado = numerobinario.split("");
		int binarios = Integer.parseInt(numerobinario,2);
		String numerodecimal = Integer.toString(binarios);
		System.out.println("El número decimal es: "+ numerodecimal);

	}
}