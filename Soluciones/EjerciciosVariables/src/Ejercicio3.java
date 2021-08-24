public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        int numeroUno = 8;
        int numeroDos = 2;
        int variableAux = 0;
        
        variableAux = numeroUno;
        numeroUno = numeroDos;
        numeroDos = variableAux;
        System.out.println("\nNumero uno: " + numeroUno+
                            "\nNumero dos: " + numeroDos);
    }
}
