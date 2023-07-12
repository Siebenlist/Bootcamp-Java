public class Pitagoras{
    public static void main(String[] args) {
        //Importo la funcion del archivo PitagorasLogic
        PitagorasLogic iD = new PitagorasLogic();
        //Creo una variable con la funcion que calcula el resultado
        double resultadoPitagora = iD.calcularHipotenusa(3, 5);
        //Hago un println del resultado final.
        System.out.println("El resultado es: " + resultadoPitagora);
    }
}