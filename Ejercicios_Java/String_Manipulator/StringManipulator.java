public class StringManipulator {
    public static void main(String[] args) {
        StringManipulatorLogic manipulator = new StringManipulatorLogic();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 

        StringManipulatorLogic manipulator2 = new StringManipulatorLogic();
        char letter = 'n';
        int a = manipulator2.getIndexOrNull("Coding", letter);
        int b = manipulator2.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator2.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        StringManipulatorLogic manipulator3 = new StringManipulatorLogic();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = manipulator3.getIndexOrNullString(word, subString);
        int e = manipulator3.getIndexOrNullString(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1

        StringManipulatorLogic manipulator4 = new StringManipulatorLogic();
        String word2 = manipulator4.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word2); // olmundo


    }
}