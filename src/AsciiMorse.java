import java.util.HashMap;
import java.util.Map;
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

        HashMap<String, Character> morse_ascii = new HashMap<>();
        morse_ascii.put(".-", 'a');
        morse_ascii.put("-...", 'b');
        morse_ascii.put("-.-.", 'c');
        morse_ascii.put("-..", 'd');
        morse_ascii.put(".", 'e');
        morse_ascii.put("..-.", 'f');
        morse_ascii.put("--.", 'g');
        morse_ascii.put("....", 'h');
        morse_ascii.put("..", 'i');
        morse_ascii.put(".---", 'j');
        morse_ascii.put("-.-", 'k');
        morse_ascii.put(".-..", 'l');
        morse_ascii.put("--", 'm');
        morse_ascii.put("-.", 'n');
        morse_ascii.put("--.--", 'ñ');
        morse_ascii.put("---", 'o');
        morse_ascii.put(".--.", 'p');
        morse_ascii.put("--.-", 'q');
        morse_ascii.put(".-.", 'r');
        morse_ascii.put("...", 's');
        morse_ascii.put("-", 't');
        morse_ascii.put("..-", 'u');
        morse_ascii.put("...-", 'v');
        morse_ascii.put(".--", 'w');
        morse_ascii.put("-.--", 'y');
        morse_ascii.put("-..-", 'x');
        morse_ascii.put("--..", 'z');
        morse_ascii.put("......", ' ');
        morse_ascii.put("-----", '0');
        morse_ascii.put(".----", '1');
        morse_ascii.put("..---", '2');
        morse_ascii.put("...--", '3');
        morse_ascii.put("....-", '4');
        morse_ascii.put(".....", '5');
        morse_ascii.put("-....", '6');
        morse_ascii.put("--...", '7');
        morse_ascii.put("---..", '8');
        morse_ascii.put("----.", '9');
        morse_ascii.put("-.-.--", '!');
        morse_ascii.put("..--..", '?');
        morse_ascii.put("--..--", ',');
        morse_ascii.put(".-.-.-", '.');
        morse_ascii.put("---...", ':');
        morse_ascii.put("-.--.", '(');
        morse_ascii.put("-.--.-", ')');
        morse_ascii.put(".--.-.", '@');
        morse_ascii.put("...-..-", '$');
        morse_ascii.put(".-...", '&');
        morse_ascii.put("-..-.", '/');
        morse_ascii.put("-...-", '=');
        morse_ascii.put(".-.-.", '+');
        morse_ascii.put("-....-", '-');
        morse_ascii.put("..--.-", '_');


        String frase = ".... --- .-.. .- --..-- ...... -- ..- -. -.. ---";
        String [] cadaChar = frase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        try{

            for (String s : cadaChar) {
                for (Map.Entry<String, Character> entry : morse_ascii.entrySet()) {
                    if (s.equals(entry.getKey())) {
                        stringBuilder.append(entry.getValue());
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("La frase insertada en código morse es la siguiente:");
        System.out.println(stringBuilder);

    }
}
