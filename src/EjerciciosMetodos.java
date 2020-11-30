import java.util.Scanner;

public class EjerciciosMetodos {
    private static final int VALOR_IVA = 22;
    private static final float VALOR_PI = 3.14F;
    private static final float COTIZACION_DOLAR = 181.0F;
    private static final float COTIZACION_EURO = 230.0F;

    public EjerciciosMetodos() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número mínimo");
        int min = teclado.nextInt();
        System.out.println("Ingrese otro número máximo");
        int max = teclado.nextInt();
        boolean esMayor = esMayorQue(min, max);
        if (!esMayor) {
            String mensaje = "Por favor ingrese un número en el rango del " + min + " y del " + max;
            String error = "El número ingresado no está en el rango solicitado";
            validarNumero(mensaje, error, min, max);
        }

    }

    public static int multiplicar(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static double multiplicarDouble(int num1, double num2) {
        double multiplicacion = (double)num1 * num2;
        return multiplicacion;
    }

    public static int sumarDesdeUno(int num1) {
        int sum = 0;

        for(int i = 1; i <= num1; ++i) {
            sum += i;
        }

        return sum;
    }

    public static void pasoADolaresYEuros(float num1) {
        float numADolar = num1 / 181.0F;
        float numAEuros = num1 / 230.0F;
        System.out.println("La conversión de número ingresao " + num1 + " es equivalente a " + numADolar + " dólares y es equivalente a " + numAEuros + " euros");
    }

    public static int validarNumero(String mensaje, String error, int min, int max) {
        boolean fueraRango = true;
        int num1 = 0;

        while(fueraRango) {
            Scanner teclado = new Scanner(System.in);
            System.out.println(mensaje);
            num1 = teclado.nextInt();
            fueraRango = num1 < min || num1 > max;
            if (fueraRango) {
                System.out.println(error);
            }
        }

        return num1;
    }

    public static boolean esMayorQue(int num1, int num2) {
        return num1 > num2;
    }
}
