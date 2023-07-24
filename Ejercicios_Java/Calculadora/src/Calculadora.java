public class Calculadora implements java.io.Serializable{
    private double operandOne;
    private double operandTwo;
    private String operation;

    public Calculadora(){
    }
    public Calculadora(double operandOne, String operation, double operandTwo){
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
    }

    public double getOperandOne(){
        return operandOne;
    }

    public void setOperandOne(double operandOne){
        this.operandOne = operandOne;
    }

    public double getOperandTwo(){
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo){
        this.operandTwo = operandTwo;
    }

    public String getOperation(){
        return operation;
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void performOperation(double num1, String operation, double num2){
        if(operation == "+"){
            System.out.println(num1 + num2);
        } else if(operation == "-"){
            System.out.println(num1 - num2);
        } else {
            System.out.println("El operador no es valido, porfavor use '+' o '-'.");
        }
    }
}
