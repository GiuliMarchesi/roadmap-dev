public class Giuli01 {

    public static void main(String[] args) {
        System.out.println("Operadores ");
        operadoresAritmeticos();
        operadoresLogicos();
        operadoresComparacion();
        operadoresAsignacion();
        operadoresBits();
        
        System.out.println("\n=== Estructuras de Control ===");
        condicionales();
        iterativas();
        manejoExcepciones();
        extra();
    }
    private static void operadoresAritmeticos() {
        System.out.println("-> Operadores Aritméticos");
        int suma = 5 + 3;
        int resta = 10 - 4;
        int multiplicacion = 7 * 2;
        double division = 10.0 / 3.0;
        int modulo = 10 % 3;
        System.out.printf("Suma: %d, Resta: %d, Multiplicación: %d, División: %.2f, Módulo: %d%n", 
                        suma, resta, multiplicacion, division, modulo);
    }

    private static void operadoresLogicos() {
        System.out.println("-> Operadores Lógicos");
        boolean a = true;
        boolean b = false;
        System.out.println("AND: " + (a && b));
        System.out.println("OR: " + (a || b));
        System.out.println("NOT: " + (!a));
    }

    private static void operadoresComparacion() {
        System.out.println("-> Operadores de Comparación");
        int a = 10;
        int b = 20;
        System.out.println("Igual: " + (a == b));
        System.out.println("Distinto: " + (a != b));
        System.out.println("Mayor: " + (a > b));
        System.out.println("Menor: " + (a < b));
    }

    private static void operadoresAsignacion() {
        System.out.println("-> Operadores de Asignación");
        int a = 10;
        int b = a++;
        System.out.println("Asignacion: " + a);   
    }
    private static void operadoresBits() {
        System.out.println("-> Operadores de Bits");
        int bitA = 5; // 0101 en binario
        int bitB = 3; // 0011 en binario
        System.out.println("AND: " + (bitA & bitB)); // 0001
        System.out.println("OR: " + (bitA | bitB));  // 0111
        System.out.println("XOR: " + (bitA ^ bitB)); // 0110
        System.out.println("Desplazamiento Izquierda: " + (bitA << 1)); // 1010
        System.out.println("Desplazamiento Derecha: " + (bitA >> 1)); // 0010
    }

    private static void condicionales() {
        System.out.println("-> Condicionales");
        int a = 10;
        if (a > 5) {
            System.out.println("A es mayor que 5");
        }else{
            System.out.println("A es menor que 5");
        }
        switch (a) {
            case 10:
                System.out.println("A es 10");
                break;
            default:
                System.out.println("A es diferente de 10");
        }
    }
    
    private static void iterativas() {
        System.out.println("-> Iterativas");
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: " + i);
        }
        int a = 10;
        while (a > 5) {
            a--;
        }
        do {
            a--;
        } while (a > 5);
    }

    private static void manejoExcepciones() {
        System.out.println("-> Manejo de Excepciones");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error: no se puede dividir por 0");
        }
    }

    private static void extra(){
        System.out.println("-> Extra");
        int a = 10;
        while (a <= 55){
            if (a!=16 && a % 3 != 0 && a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }

}
