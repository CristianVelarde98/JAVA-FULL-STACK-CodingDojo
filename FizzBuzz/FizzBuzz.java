public class FizzBuzz {
    public static String fizzBuzz(int num){
        String respuesta = "";
        if(num % 3 == 0){
            respuesta = "Fizz";
        }

        if(num % 5 == 0) {
            respuesta = respuesta + "Buzz";
        }

        if(respuesta.length() != 0){
            return respuesta;
        } else {
            String aux = String.valueOf(num);
            return aux;
        }
    }
}