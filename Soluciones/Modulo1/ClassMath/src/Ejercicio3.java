public class Ejercicio3 {
    public static void main(String[] args) {
        double nota1 = Math.random()*10;
        double nota2 = Math.random()*10;
        double nota3 = Math.random()*10;
        double nota4 = Math.random()*10;
        double nota5 = Math.random()*10;
        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        System.out.println("\nNota1 = " + nota1 
                            +"\nNota2 = " + nota2
                            +"\nNota3 = " + nota3
                            +"\nNota4 = " + nota4
                            +"\nNota5 = " + nota5
                            +"\nPromedio = " + promedio);
    }
}
