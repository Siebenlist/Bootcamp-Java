public class Project{
    public static void main(String[] args) {
        
        //Test 1
        ProjectTest project1 = new ProjectTest("Nombre");
        String prueba1 = project1.getNombre();
        System.out.println(prueba1);

        //Test 2
        ProjectTest project2 = new ProjectTest("Nombre", "Descripcion");
        String prueba2 = project2.getAll();
        System.out.println(prueba2);
        
    }
}