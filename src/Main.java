public class Main {
    public static void main(String[] args) {

        //If
        int numeroIf = 1 ;

        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Cero");
        }

        //While
        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //DoWhile

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3) ;

        //For

        for (int numeroFor = 0;numeroFor <= 3;numeroFor ++) {
            System.out.println(numeroFor);
        }

        //Switch
        String estacion = "Invierno";

        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera" :
                System.out.println("Es primavera");
                break;
            case "Invierno" :
                System.out.println("Es invierno");
                break;
            case "Otoño" :
                System.out.println("Es otoño");
                break;
            default :
                System.out.println("Estación inexistente");

        }
    }
}