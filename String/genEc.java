package String;

import java.util.Scanner;

class genEc {
    String p, c;  // p = plaintext, c = ciphertext

    // Default constructor
    genEc() {
        p = c = " ";
    }

    // Constructor with plaintext
    genEc(String s) {
        p = s;
        c = " ";
    }

    // Copy constructor
    genEc(genEc g) {
        p = g.p;
        c = g.c;
    }

    // Encryption: Ye encryption C = (P + K) % 26
    void StdForm(int key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (Character.isUpperCase(ch)) {
                int encryptedChar = (ch - 'A' + key) % 26;
                result.append((char) (encryptedChar + 'A'));
            } else if (Character.isLowerCase(ch)) {
                int encryptedChar = (ch - 'a' + key) % 26;
                result.append((char) (encryptedChar + 'a'));
            } else {
                result.append(ch);  // Non-alphabetic characters remain same
            }
        }
        c = result.toString();
    }

    // Decryption: Ye decryption D = (C - K + 26) % 26
    void decrypt(int key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c.length(); i++) {
            char ch = c.charAt(i);
            if (Character.isUpperCase(ch)) {
                int decryptedChar = (ch - 'A' - key + 26) % 26;
                result.append((char) (decryptedChar + 'A'));
            } else if (Character.isLowerCase(ch)) {
                int decryptedChar = (ch - 'a' - key + 26) % 26;
                result.append((char) (decryptedChar + 'a'));
            } else {
                result.append(ch);
            }
        }
        p = result.toString();
    }

    // Read plaintext from user
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        p = sc.nextLine();
    }

    // Display results
    void display() {
        System.out.println("Plaintext  : " + p);
        System.out.println("Ciphertext : " + c);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        genEc obj = new genEc();

        obj.read();

        System.out.print("Enter key (0–25): ");
        int key = sc.nextInt();

        obj.StdForm(key); // Encrypt
        System.out.println("\nAfter Encryption:");
        obj.display();

        obj.decrypt(key); // Decrypt
        System.out.println("\nAfter Decryption:");
        obj.display();
    }
}
