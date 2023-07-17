public class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
        // return str1 + str2;
    }

    public static int getIndexOrNull(String str, char letra){
        return str.indexOf(letra);
    }

    public static int getIndexOrNull(String cadena1, String cadena2){
    //  char letra = cadena2.charAt(0);
     return cadena1.indexOf(cadena2, 0);
    }

    public String concatSubstring(String cadena1, int inicio, int fin, String cadena2){
        String nuevaCadena = cadena1.substring(inicio, fin);
        return nuevaCadena + cadena2;
    }
}