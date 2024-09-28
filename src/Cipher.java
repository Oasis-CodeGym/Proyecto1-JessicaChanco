public class Cipher {
    private static final char[] ALPHABET = {
            'a','á','à','ä','â','b','c','ç','d','e','é','è','ë','ê','f','g','h','i','í','ì','ï','î','j','k','l','m','n','ñ','o','ó','ò','ö','ô','p','q',
            'r','s','t','u','v','w','x','y','z','A','Á','À','Ä','Â','B','C','Ç','D','E','É','È','Ë','Ê','F','G','H','I','Í','Ì','Ï','Î','J','K','L','M','N','Ñ','O','Ó','Ò','Ö','Ô','P','Q',
            'R','S','T','U','V','W','X','Y','Z',' ','.',',','!','¿',';',':','-','_','+','=','*','/','%','&','@','#','$','^','`','~','|','\n','\t','1','2','3','4','5','6','7','8','9','0'};


    //public Cipher() {}

    public String encrypt(String text, int shift) {
        StringBuilder encryptText = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index + shift) % ALPHABET.length;
                encryptText.append(ALPHABET[newIndex]);
            } else {
                encryptText.append(c);
            }
        }
        return encryptText.toString();
    }

    public String decryption(String decryptionText, int shift) {
        StringBuilder decryptionText1 = new StringBuilder();
        for (char c : decryptionText.toString().toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index - shift + ALPHABET.length) % ALPHABET.length;
                decryptionText1.append(ALPHABET[newIndex]);

            } else {
                decryptionText1.append(c);
            }
        }
        return decryptionText1.toString();

    }
    private int hallarUnAlfabeto(char c) {
        for (int i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;

            }

        }
        return -1;
    }

}
