public class pitagoras {
    public static void main(String[] args) {
        calculadora calculoH = new calculadora();
        double hipotenusa = calculoH.calcularHipotenusa(10.0, 5.0);
        System.out.println("la hipotenusa es: " + hipotenusa);
    }
}