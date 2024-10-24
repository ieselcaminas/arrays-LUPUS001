public class DNI {
    public static void main(String[] args) {

        final char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
        'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int dni = 54516524;
        int resto = dni % 23;
        //System.out.println(resto);

        char letraDNI = letras[resto];

        System.out.println(dni + "" + letraDNI);
    }
}

/*int dni = 54516524;
        int division = dni / 23;
        int resto = dni % 23;
        int letra;

        switch (resto){
            case 0:
                letra =

        }*/