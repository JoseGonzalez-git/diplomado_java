import java.util.Scanner;

public class CondicionalesSimples {
    
    public static void compareNumber(int number1, int number2){
        int exponent =0;
        if (number1 > number2){
            System.out.println("\n"+ number1 +" > "+ number2);
            exponent =0;
            exponent = (int)(Math.pow(number1,number2));
            System.out.println("\n the exponent is "+ exponent);
        }else if (number1<number2){
            System.out.println("\n"+number1+" < " +number2);
            exponent =0;
            exponent = (int)(Math.pow(number2,number1));
            System.out.println("\n the exponent is "+ exponent);
        }else{
            System.out.println("The numbers are same: "+ number1);
        }
    }
    public static void main(String[] args) throws Exception {
        
        //* Exercise number 1
        int number =0;
        int number2 =0;
        number = 50;
        number2 = (int)(Math.random()*100);
        compareNumber(number, number2);

        //* Exercise number 2
        number =0;
        number2 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        number = sc.nextInt();
        System.out.println("Input number2: ");
        number2 = sc.nextInt();
        compareNumber(number, number2);

        //* Exercise number 3
        number2 =0;
        number = 0;
        System.out.println("Input number: ");
        number = sc.nextInt();
        if (number > number2) {
            System.out.println("Is positive");
        }else if (number<number2){
            System.out.println("Is negative");
        }
        else{
            System.out.println("El numero es 0");
        }

        //* Exercise number 4
        number = 0;
        number2 = 0;
        System.out.println("Input number: ");
        number = sc.nextInt();
        System.out.println("Input number 2: ");
        number2 = sc.nextInt();
        int multiplo1 = number % number2 ;
        int multiplo2 = number2 % number;
        if (multiplo1 == 0){
            System.out.println(number2+" es multiplo de "+number);
        }else if (multiplo2 == 0){
            System.out.println(number+" es multiplo de "+number2);
        }else{
            System.out.println("Los numeros no son multiplos uno del otro");
        }

        //* Exercise number 5
        double nota1 = 0;
        nota1 = sc.nextInt();
        if (nota1 < 6){
            System.out.println("Clase Reprobada");
        }else if (nota1<=10){
            System.out.println("Clase Aprobada");
        }
    }
}
