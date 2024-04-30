import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
       // Clase scanner que nos permite que el usuaurio escriba
        Scanner scanner = new Scanner(System.in);
        
        // Declaraciones y Asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        // Estructura de control: Iterativa (bucle for)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i] );
        }
        //Estructura de control: Iterativa (Bucle)
        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " (" + palabraSecreta.length()+ "Letras)");
            System.out.println("introduce una letra, por favor");
            char letra = Character.toLowerCase( scanner.next().charAt(0));

            boolean letraCorrecta = false;
            //Estructura de Control
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto Te quedan : " + (intentosMaximos - intentos + "intentos"));
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Ganaste, la palabra secreta es : i"+ palabraSecreta);

            }

        }
        if(!palabraAdivinada){
            System.out.println("Perdiste");
        }
          
        
        scanner.close();

    }
}
