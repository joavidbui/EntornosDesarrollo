import java.util.Scanner;

public class Main {

    static Scanner sc;
    private static MZFecha[] mzFechas = new MZFecha[2];


    public static void main(String[] args) {

        for (int i = 0; i < mzFechas.length; i++) {
            mzFechas[i] = new MZFecha();
        }

        sc = new Scanner(System.in);
        int caso;

        do {
            System.out.println("----------------------------------");
            System.out.println("0. Salir");
            System.out.println("1. Establecer fecha.");
            System.out.println("2. Imprimir fecha.");
            System.out.println("3. Comparar fecha con una segunda.");
            System.out.println("----------------------------------");
            caso = scannerInt("Selecciona una opción: ");
            switch (caso) {
                case 1 -> establecerFecha();
                case 2 -> imprimirFecha();
                case 3 -> compararFechas();
            }
        }while(caso != 0);
    }

    static void establecerFecha(){
        mzFechas[0].setFecha(scannerInt("Introduce el día: "),
                scannerInt("Introduce el mes: "),
                scannerInt("Introduce el año: "));
    }
    static void imprimirFecha(){
        mzFechas[0].imprime();
    }
    static void compararFechas(){
        mzFechas[1].setFecha(scannerInt("Introduce el día con la que comparar: "),
                scannerInt("Introduce el mes con el que comparar: "),
                scannerInt("Introduce el año con el que comparar: "));

        System.out.println(""+ mzFechas[0].diferenciaDias(mzFechas[1]));
    }

    static int scannerInt(String s){
        String inputStr;
        Integer inputInt = null;
        System.out.print(s);
        do{
            inputStr = sc.nextLine();
            try{
                inputInt = Integer.valueOf(inputStr);
            }
            catch (NumberFormatException nfe){
                System.err.print("Input Error.");
                System.out.print(s);
            }
        }while(inputInt == null);
        return inputInt;
    }
}