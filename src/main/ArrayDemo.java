public class ArrayDemo {
    public static void main(String[] args) {
        int [] anArray;
        anArray = new int [10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        //hay que poner (anArray.length - 1) porque tiene que empezar a contar desde el 9 ya que un array de 10, cuenta desde el 0 hasta el 9
        //al no poner el (-1) empezaría a contar desde el array anArray[10] y como este no existe da error
        for (int i = anArray.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i +": " + anArray[i]);

        }

    }
}