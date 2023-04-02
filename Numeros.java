public class Numeros {
    public static int sonIguales(int a, int b, int c) {
        int resultado = -1;
        if (a == b && b== c) {
            resultado = 0;
        } else if (a == b && a != c || a == c && a != b || b == c && b != a) {
            resultado = 1;
        } else if (a != b && b != c) {
            resultado = 2;
        }
        return resultado;
    }
}