public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        // * Cuadrado
        int ladoCuadrado =  8;
        int area = 4*ladoCuadrado;
        int perimetro = ladoCuadrado*ladoCuadrado;
        // * Triangulo
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        double areaTriangulo = (baseTriangulo* alturaTriangulo)/2;
        int perimetroTriangulo = ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;
        // * Rectuangulo
        int baseRectuangulo = 8;
        int alturaRectuangulo = 6;
        int areaRectangulo = baseRectuangulo * alturaRectuangulo;
        int perimetroRectuangulo = 2*baseRectuangulo + 2*alturaRectuangulo;
        System.out.println("\nArea Cuadrado: " + area
                            +"\nPerimetro Cuadrado: "+ perimetro
                            +"\nArea Triangulo: "+ areaTriangulo
                            +"\nPerimetro Triangulo: "+ perimetroTriangulo
                            +"\nArea Rectangulo: "+ areaRectangulo
                            +"\nPerimetro Rectangulo: "+ perimetroRectuangulo);

    }
}
