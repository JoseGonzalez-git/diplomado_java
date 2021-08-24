
public class Ejercicio4 {
    public static void main(String[] args) {
        
        double numero1 = Math.random()*50;
        double numero2 = Math.random()*50;
        double x= Math.ceil(numero1);
        double y= Math.round(numero2);
        double mayor1 = Math.max(x, y);
        System.out.println("\nNumero 1: " + numero1 
                            +"\nNumero 2: " + numero2
                            +"\nRedondeado 1: " + x
                            +"\nRedondeado 2: " + y
                            +"\nMayor : " + mayor1 );
    }
}
