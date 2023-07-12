public class PitagorasLogic {
    public double calcularHipotenusa(int catetoA, int catetoB) {
        //Creo una variable que multiplica el catetoA y el catetoB por si mismos y suma las multiplicaciones
        double resultado = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        return resultado;
    }
}
