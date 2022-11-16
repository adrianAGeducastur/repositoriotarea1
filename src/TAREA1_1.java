import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Random;
import java.time.format.DateTimeFormatter;
/**
 * Write a description of class TAREA1_1 here.
 * 
 * @author (Adrián Aragón) 
 * @version (a version number or a date)
 */
public class TAREA1_1
{
    public static void main(String[] args){
        int eleccion = -1;
        Scanner sc = new Scanner(System.in);
        do{
            mostrarMenu();
            eleccion = sc.nextInt();
            
            switch(eleccion){
                case 1:
                    System.out.println("Introduzca el primer número:");
                    int numA = sc.nextInt();
                    System.out.println("Ahora introduzca el segundo número:");
                    int numB = sc.nextInt();
                    
                    if(numA > numB){
                        System.out.println("El número " + numA + " es mayor que el número " + numB);
                    }else if(numA == numB){
                        System.out.println("Los números " + numA + " y " + numB + " son iguales");
                    }else{
                        System.out.println("El número " + numA + " es menor que el número " + numB);
                    }
                    sc.nextLine();
                break;
                case 2:
                    sc = new Scanner(System.in);
                    String cadena;
                    boolean isValid = false;
                    do{
                        System.out.println("Introduzca una cadena de caracteres:");
                        cadena = sc.nextLine();
                        isValid = (cadena.length() > 1);
                        if(!isValid){
                            System.out.println("La longitud debe ser mayor que 1 caracter, vuelva a introducir la cadena.");
                        }
                    }while(!isValid);
                    
                    isValid = false;
                    char index = 0;
                    do{
                        
                        System.out.println("Introduzca un caracter:");
                        String caracter = sc.nextLine();
                        isValid = (caracter.length() == 1);
                        if(!isValid){
                            System.out.println("Introduzca de nuevo un solo caracter");
                        }else{
                            index = caracter.charAt(0);
                        }
                        System.out.println(index);
                    }while(!isValid);
                    
                    if(cadena.indexOf(index) == -1){
                        System.out.println("El caracter no fue encontrado");
                    }else{
                        System.out.println("El primer caracter igual al introducido fue encontrado en la posición " + cadena.indexOf(index));
                    }
                    break;   
                
                case 3:
                    char[] vocals = {'a', 'e', 'i', 'o', 'u'};
                    Random random = new Random();
                    int randomInt = random.nextInt(4-0) + 0;
                    System.out.println("Se ha generado la siguiente vocal: "+ vocals[randomInt]);
                    break;
                
                case 4:
                    LocalDateTime now = LocalDateTime.now(); 
                    System.out.println("Esta es la hora actual: " + now.format(DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-YYY")));
                    break;   
                
                case 0:
                    System.out.println("Se ha cerrado el programa correctamente");
                    break;
                
                default:
                    System.out.println("Número erróneo, escoja uno de nuevo");
            }            
        }while(eleccion > 0);
    }
    
    private static void mostrarMenu(){
        System.out.println("\nPulse 0 para salir y finalizar el programa.\n"
            + "Pulse 1 para introducir 2 números enteros y que se muestre por \npantalla un mensaje indicando si un valor es mayor que el otro o si son iguales.\n"
            + "Pulse 2 para introducir una cadena de caracteres de longitud mayor de 1 carácter, \njunto a otro carácter, y el programa determina si el carácter está incluido en la cadena o no,mostrando un mensaje al usuario.\n"
            + "Pulse 3 para generar aleatoriamente el valor de una \nde las 5 vocales y que se muestre por pantalla dicho valor.\n"
            + "Pulse 4 para mostrar la fecha y hora actual, a través ed un objeto java.time.LocalDateTime.");
            
    }
}
