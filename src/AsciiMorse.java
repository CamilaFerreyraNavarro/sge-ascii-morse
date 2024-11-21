import java.util.HashMap;
import java.util.Scanner;

public class AsciiMorse {
    public static void main(String[] args) {

        HashMap<Character, String> mapaMorse = new HashMap<>();

        mapaMorse.put('A', ".-");
        mapaMorse.put('B', "-...");
        mapaMorse.put('C', "-.-.");
        mapaMorse.put('D', "-..");
        mapaMorse.put('E', ".");
        mapaMorse.put('F', "..-.");
        mapaMorse.put('G', "--.");
        mapaMorse.put('H', "....");
        mapaMorse.put('I', "..");
        mapaMorse.put('J', ".---");
        mapaMorse.put('K', "-.-");
        mapaMorse.put('L', ".-..");
        mapaMorse.put('M', "--");
        mapaMorse.put('N', "-.");
        mapaMorse.put('O', "---");
        mapaMorse.put('P', ".--.");
        mapaMorse.put('Q', "--.-");
        mapaMorse.put('R', ".-.");
        mapaMorse.put('S', "...");
        mapaMorse.put('T', "-");
        mapaMorse.put('U', "..-");
        mapaMorse.put('V', "...-");
        mapaMorse.put('W', ".--");
        mapaMorse.put('X', "-..-");
        mapaMorse.put('Y', "-.--");
        mapaMorse.put('Z', "--..");
        mapaMorse.put(' ', " ");

        mapaMorse.put('0', "-----");
        mapaMorse.put('1', ".----");
        mapaMorse.put('2', "..---");
        mapaMorse.put('3', "...--");
        mapaMorse.put('4', "....-");
        mapaMorse.put('5', ".....");
        mapaMorse.put('6', "-....");
        mapaMorse.put('7', "--...");
        mapaMorse.put('8', "---..");
        mapaMorse.put('9', "----.");

        mapaMorse.put('-', "-....-");
        mapaMorse.put('/', "-..-.");
        mapaMorse.put('(', "-.--.");
        mapaMorse.put(')', "-.--.-");
        mapaMorse.put('"', ".-..-.");
        mapaMorse.put('=', "-...-");
        mapaMorse.put('+', ".-.-.");
        mapaMorse.put('@', ".--.-.");
        mapaMorse.put('!', "-.-.--");
        mapaMorse.put('.', ".-.-.-");
        mapaMorse.put(',', "--..--");
        mapaMorse.put(':', "---...");
        mapaMorse.put('?', "..--..");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué deseas pasar a código morse?");
        String textoIntroducido = sc.nextLine();
        textoIntroducido = textoIntroducido.toUpperCase();

        StringBuilder morse = new StringBuilder();

        // para pasar cada letra a morse
        for (char letra : textoIntroducido.toCharArray()){ //pasa el texto que introducimos en la consola a caracteres individuales
            String codigoMorse = mapaMorse.get(letra);

            if (codigoMorse != null) { // para buscar el equivalente del caracter en morse
                morse.append(codigoMorse).append(" "); // con el append se añade algo después de lo que ya está en el SB
            }
        }

        System.out.println(morse.toString().trim()); // trim es simplemente para sacar esapacios de sobra al final
        sc.close();
    }
}