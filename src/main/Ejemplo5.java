package main;

public class Ejemplo5 {
    public static int mayorNumero(int mayor){
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 14, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            int numero2 = numeros[i];
            if (numero2 > mayor){
                mayor = numero2;
            }
        }
        return mayor;
    }
    public static void main(String[] args) {
        int mayor = 0;

        System.out.println("El máximo número es " + mayorNumero(mayor));
    }
}

//Versión sin metodo
/*public class Ejercicio5 {
   public static void main(String[] args) {
       int numeros[] = {1, 2, 3, 4, 5, 6, 7, 12, 9, 10};
       int mayor = 0;

       for (int i = 0; i < numeros.length; i++) {
           int numero2 = numeros[i];
           if (numero2 > mayor){
               mayor = numero2;
           }
       }
       System.out.println("El máximo número es " + mayor);
   }
}
*/