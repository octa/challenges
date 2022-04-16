package com.octa.challenges.dsalgo.arrays;

public class CaesarCipher {

    public static int CHARACTERS = 26;
    public static char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public char[] encrypt;
    public char[] decrypt;

    public CaesarCipher() {
        encrypt = new char[CHARACTERS];
        decrypt = new char[CHARACTERS];
        for(int i=0; i<CHARACTERS; i++) {
            encrypt[i] =alphabets[(i+3)%CHARACTERS];
        }
        for(int i=0; i<CHARACTERS; i++) {
            decrypt[encrypt[i] - 'A'] = alphabets[i];
        }
    }

    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        String encrypted = caesarCipher.encrypt("HELLO");
        String decrypted = caesarCipher.decrypt(encrypted);
        System.out.println(encrypted);
        System.out.println(decrypted);

        System.out.println(caesarCipher.encrypt);
        System.out.println(caesarCipher.decrypt);
    }

    public String encrypt(String plainText) {
        char[] a = plainText.toCharArray();
        for(int i=0; i<a.length; i++) {
            a[i] = encrypt[a[i] - 'A'];
        }
        return new String(a);
    }

    public String decrypt(String encryptedText) {
        char[] a = encryptedText.toCharArray();
        for(int i=0; i<a.length; i++) {
            a[i] = decrypt[a[i] - 'A'];
        }
        return new String(a);
    }

}
