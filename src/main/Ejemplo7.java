package main;

import java.util.Scanner;

class Ejemplo7 {
	public static int masLargo(String[] cadenas){
		int largo = 0;
		//int largo = cadenas.length[0];
		for (int i = 0; i < cadenas.length; i++) {
			if (cadenas[i].length() > largo){
				largo = cadenas[i].length();
			}
		}
		return largo;
	}
	public static String asteriscos(int largo){
		String asteriscos = "";
		for (int i = 0; i < largo + 4; i++) {
			//System.out.print("*");
			asteriscos += "*";
		}
		return asteriscos;
	}


	public static void main(String[] args){
		String[] cadenas = new String[5];
		System.out.println("Introduce 5 cadenas de texto:");
		Scanner miScanner;
		int largo;
        miScanner = new Scanner(System.in);

		//para introducir los 5 valores dentro de la variabe cadenas
		for (int i = 0; i < cadenas.length; i++){
			cadenas[i] = miScanner.next();
		}

		largo = masLargo(cadenas);

		//Versión sin metodo
		/*//linea de arriba
		for (int i = 0; i < largo + 4; i++) {
			System.out.print("*");
		}
		System.out.println();*/

		System.out.println(asteriscos(largo));

		//imprimir las palabraas
		for (String array : cadenas){

			System.out.print("* " + array);

			for (int i = array.length(); i < largo; i++) {
					System.out.print(" ");

			}
			System.out.print(" *");
			System.out.println();
		}

		//Versión sin metodo
		/*//linea de abajo
		for (int i = 0; i < largo + 4; i++) {
			System.out.print("*");
		}
		System.out.println();*/

		System.out.println(asteriscos(largo));
	}
}

//Versión beta
/*//imprimir las palabraas
		for (String array : cadenas){

			System.out.print("* " + array);

			for (int i = 0; i < array.length(); i++) {
				if (array.length() < largo + 1){
					System.out.print(" ");
				}
			}
			System.out.print(" *");
			System.out.println();
		}*/
