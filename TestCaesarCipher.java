import java.util.Scanner;

public class TestCaesarCipher {

    // CaesarCipher class
    static class CaesarCipher {
        private String alphabet;
        private String shiftedAlphabet;
        private int mainKey;

        public CaesarCipher(int key) {
            alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
            mainKey = key;
        }

        public String encrypt(String input) {
            StringBuilder encrypted = new StringBuilder(input);

            for (int i = 0; i < encrypted.length(); i++) { 
                char currChar = encrypted.charAt(i);
                char upperChar = Character.toUpperCase(currChar);
                int idx = alphabet.indexOf(upperChar);

                if (idx != -1) {
                    char newChar = shiftedAlphabet.charAt(idx);
                    if (Character.isLowerCase(currChar)) {
                        newChar = Character.toLowerCase(newChar);
                    }
                    encrypted.setCharAt(i, newChar);
                }
            }

            return encrypted.toString();
        }

        public String decrypt(String input) {
            CaesarCipher cc = new CaesarCipher(26 - mainKey);
            return cc.encrypt(input);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String input = scanner.nextLine();

        CaesarCipher cipher = new CaesarCipher(2);
        String encrypted = cipher.encrypt(input);

        System.out.println("Encrypted: " + encrypted);

        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);

        scanner.close();
    }
}

