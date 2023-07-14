public class Test {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 
    
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", 'n');
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int a1 = manipulator.getIndexOrNull(word, subString);
        int b1 = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a1); // 2
        System.out.println(b1); // -1

        String word2 = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word2); // olmundo
    }
}