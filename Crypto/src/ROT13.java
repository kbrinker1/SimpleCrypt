package Crypto.src;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder enigma = new StringBuilder();
        for (int i = 0; i<text.length(); i++){
            char coder = text.charAt(i);
            if (coder >= 'A' && coder <= 'M'){
                coder+=13;
            }
            else if (coder >= 'N' && coder <= 'Z'){
                coder-=13;
            }
            else if (coder >= 'a' && coder <= 'm'){
                coder+=13;
            }
            else if (coder >= 'n' && coder <= 'z'){
                coder-=13;
            }
            enigma.append(coder);
        }
        return enigma.toString();
    }

    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
