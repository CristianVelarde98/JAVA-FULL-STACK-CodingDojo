import java.util.Arrays;

public class Test {

    public static void main (String[] args){
        BasicJava ejercicio = new BasicJava();

        // ejercicio.imprimirTodos();

        // ejercicio.imprimirImpares();

        // ejercicio.imprimirSuma();

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 5, 10, 7, -2};

        // ejercicio.recorrerArreglo(arr);       
        // ejercicio.recorrerArreglo(arr2);

        /************************************************************ */

        // ejercicio.encontrarElMaximo(arr);        
        // ejercicio.encontrarElMaximo(arr2);

        /************************************************************ */

        // ejercicio.obtenerPromedio(arr2);
        // ejercicio.obtenerPromedio(arr);

        /************************************************************ */

        // int[] res = ejercicio.arregloImpares();
        // System.out.println(Arrays.toString(res));
        
        /************************************************************ */

        // int res1 = ejercicio.mayorQue(arr2,5);
        // int res2 = ejercicio.mayorQue(arr,2);
        // System.out.println(res1);
        // System.out.println(res2);

        /************************************************************ */

        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));

        // ejercicio.valoresAlCuadrado(arr2);
        // ejercicio.valoresAlCuadrado(arr);
        
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr2));

        /************************************************************* */

        // System.out.println(Arrays.toString(arr2));

        // ejercicio.eliminarNegativos(arr2);

        // System.out.println(Arrays.toString(arr2));

        /************************************************************ */

        // int[] res1 = ejercicio.minMaxAvrg(arr);
        // int[] res2 = ejercicio.minMaxAvrg(arr2);

        // System.out.println(Arrays.toString(res1));
        // System.out.println(Arrays.toString(res2));

        /************************************************************ */

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        ejercicio.cambiarValores(arr);
        ejercicio.cambiarValores(arr2);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}