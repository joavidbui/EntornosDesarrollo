import es.iesmz.prueba.Coche;
import java.util.Scanner;



public class Main {

    static Scanner sc;

    public static void main(String[] args) {
        /*Crear un cotxe Marca “Fiat” Model “Panda” Color “Groc”
        Mostre un menú per a poder provar les opcions de la classe Cotxe:
        • Imprimir dades del cotxe
        • Pintar el cotxe
        • Establir Marca (demanant per teclat)
        • Establir Model (demanant per teclat)
        • Establir Color (demanant per teclat)
        • Accelerar (Demanant la velocitat per teclat)
        • Frenar (Demanant la velocitat per teclat)
        • Parar*/

        sc = new Scanner(System.in);
        int opcionMenu;

        Coche coche = new Coche("Fiat", "Panda", "Amarillo");

        do{
            opcionMenu = imprimeMenu();

            switch (opcionMenu) {
                case 1 -> coche.imprime();
                case 2 -> coche.pinta();
                case 3 -> coche.setMarca(scannerString("Introduce la marca del coche: "));
                case 4 -> coche.setModelo(scannerString("Introduce el modelo del coche: "));
                case 5 -> coche.setColor(scannerString("Introduce el color del coche: "));
                case 6 -> coche.acelera(scannerInt("Introduce el aumento de velocidad: "));
                case 7 -> coche.frena(scannerInt("Introduce la reducción de velocidad: "));
                case 8 -> coche.para();
            }
        }while (opcionMenu != 0);
    }

    static int imprimeMenu(){
        System.out.println();
        System.out.println("0 - Salir.");
        System.out.println("1 - Imprime los datos del coche.");
        System.out.println("2 - Dibuja el coche.");
        System.out.println("3 - Establece la marca del coche.");
        System.out.println("4 - Establece el modelo del coche.");
        System.out.println("5 - Establece el color del coche.");
        System.out.println("6 - Acelera el coche.(x km/h)");
        System.out.println("7 - Frena el coche (x km/h).");
        System.out.println("8 - Para el coche.");
        System.out.println("------------------------------------");
        return scannerIntMinMax("Elige una opción: ", 0, 8);
    }

    static String scannerString(String text) {

        String inputStr;
        do {
            System.out.print(text);
            inputStr = sc.nextLine();
        } while (inputStr == null);
        return inputStr;
    }

    static int scannerInt(String text) {
        String inputStr;
        Integer inputInt = null;
        do{
            System.out.print(text);
            inputStr = sc.nextLine();
            try{
                inputInt = Integer.valueOf(inputStr);
            }
            catch (NumberFormatException nfe){
                System.out.print("Input Error." + text);
            }
        }while(inputInt == null);
        return inputInt;
    }

    static int scannerIntMinMax(String text, int min, int max) {

        String inputStr;
        Integer inputInt;
        do {
            do {
                inputInt = null;
                System.out.print(text);
                inputStr = sc.nextLine();
                try {
                    inputInt = Integer.valueOf(inputStr);
                } catch (NumberFormatException nfe) {
                    System.out.print("Input Error. ");
                }
            } while (inputInt == null);
        } while (inputInt < min || inputInt > max);
        return inputInt;
    }
}