public class Vocales {
    public static int contarVocales(String cadena) {
        int contA = 0, contE = 0, contI = 0, contO =  0, contU = 0, suma = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'A' || cadena.charAt(i) == 'a') {
                contA++;
            }
            if (cadena.charAt(i) == 'E' || cadena.charAt(i) == 'e') {
                contE++;
            }
            if (cadena.charAt(i) == 'I' || cadena.charAt(i) == 'i') {
                contI++;
            }
            if (cadena.charAt(i) == 'O' || cadena.charAt(i) == 'o') {
                contO++;
            }
            if (cadena.charAt(i) == 'U' || cadena.charAt(i) == 'u') {
                contU++;
            }
        }
        suma = contA + contE + contI + contO + contU;
        return suma;
    }
}
