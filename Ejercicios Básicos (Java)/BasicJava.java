public class BasicJava {
    public static void imprimirTodos() {
        // imprime de 1 al 255
        int i = 1;
        while(i < 256){
            System.out.println(i);
            i++;
        }        
    }

    public static void imprimirImpares() {
       // imprime solo los impares del 1 al 255
        int i = 1;
        while(i < 256){
          if(i % 2 == 0){
           System.out.println(i);
          } 
          i++;
        }    

    }

    public static void imprimirSuma() {
        // imprime :
        // Nuevo numero: 1 Suma: 1
        // Nuevo numero: 2 Suma: 3
        int i = 1;
        int suma = 0;
        while(i < 256) {
          suma += i;
          System.out.println("Nuevo numero: " + i + " "+ "Suma: " + suma);
          i++;
        }

    }

    public static void recorrerArreglo(int[] arr){
        // recorre un arreglo e imprime sus valores
        for(int num: arr){
            System.out.println(num);
        }
    }

    public static void encontrarElMaximo(int[] arr){
        // Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo.
        int max = Integer.MIN_VALUE;
        for(int num: arr){
            if(num > max) max = num;
        }
        System.out.println(max);
    }

    public static void obtenerPromedio(int[] arr){
        // recorrer el array e imprimir el promedio
        int suma = 0;
        for(int num: arr){
            suma += num;
        }
        System.out.println(suma / arr.length) ;
    }

    public static int[] arregloImpares(){
        // Escribir un método que cree un arreglo ‘arr’ que contenga todos los números impares entre 1 - 255. 
        // Cuando el método haya terminado, ‘arr’ debe tener los valores de [1,3,5,7…255]
        int[] arr = new int[128];
        int index = 0;
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                arr[index]= i;
                index ++;
            } 
        }
        return arr;
    }

    public static int mayorQue(int[] arr, int i){
        // Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor dado
        int aux = 0;
        for(int num: arr){
            if(num > i){aux++;}
        }
        return aux;
    }

    public static void valoresAlCuadrado(int[] arr){
        // escribir un método que multiplique cada valor en el arreglo por sí mismo.
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
    }

    public static void eliminarNegativos(int[] arr){
        // escribir un método que reemplace cualquier número negativo por 0
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            } 
        }

    }

    public static int[] minMaxAvrg(int[] arr){
       // escribir un método que devuelva un arreglo con el número máximo, 
       // el número mínimo y el valor promedio que hay en el arreglo
       int[] minMaxAvg = new int[3];
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       int sum = 0;
       for (int num : arr) {
        sum += num;
        if(num < min){ min = num;}
        if(num > max){ max = num;}
       }
       minMaxAvg[0] = max;
       minMaxAvg[1] = min;
       minMaxAvg[2] = sum / arr.length;

       return minMaxAvg;
    }

    public static void cambiarValores(int[] arr){
        // escribir un método que cambie cada valor por el valor que sigue. 
        // Por ejemplo, cuando el método haya terminado, un arreglo x [1,5,10,7,-2] se convertirá en 
        // [5,10,7,-2,0]. Observe que el último número es 0. 
        // El método no necesita ajustarse para los valores que están fuera de los límites.
        
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}