package courses.algorithms;

public class Task5 {
    public static void main(String[] args) {
        String password = "hello world";
        String encipher = encipher("hello world");
        System.out.println(encipher + "\n");
        System.out.println(decryption(encipher));
    }

    static String encipher(String string) {
        System.out.println("Текст шифрується...");
        char[] chars = string.toCharArray();
        string = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            string += chars[i];
        }
        return string;
    }

    static String decryption(String string) {
        System.out.println("Текст розшифровується...");
        char[] chars = string.toCharArray();
        string = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            string += chars[i];
        }
        return string;
    }
}