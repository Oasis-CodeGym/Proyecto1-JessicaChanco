public class Cipher {
    private static final char[] ALPHABET = {
            'a','á','à','ä','â','b','c','ç','d','e','é','è','ë','ê','f','g','h','i','í','ì','ï','î','j','k','l','m','n','ñ','o','ó','ò','ö','ô','p','q',
            'r','s','t','u','v','w','x','y','z','A','Á','À','Ä','Â','B','C','Ç','D','E','É','È','Ë','Ê','F','G','H','I','Í','Ì','Ï','Î','J','K','L','M','N','Ñ','O','Ó','Ò','Ö','Ô','P','Q',
            'R','S','T','U','V','W','X','Y','Z',' ','.',',','!','¿',';',':','-','_','+','=','*','/','%','&','@','#','$','^','`','~','|','\n','\t','1','2','3','4','5','6','7','8','9','0'};

    }
    public Cipher() {}

    public String encrypt(String text, int shift) {
        StringBuilder encryptText = new StringBuilder();

        for (char c : encryptText.toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index + shift) % ALFABETO.lenght;
                encryptText.append(c) (ALFABETO[newIndex]);
            } else {
                encryptText.append(c);
            }
        }
        return encryptText.toString();
    }

    public String decryption(String cifrarText, int shift) {
        StringBuilder decryptionText = new StringBuilder();
        for (char c : cifrarText.toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index - shift + ALFABETO.lenght) % ALFABETO.lenght;
                decryptionText.append(ALFABETO[newIndex]);

            } else {
                decryptionText.append(c);
            }
        }
        return decryptionText.toString();

    }
    private int hallarUnAlfabeto(char c) {
        for (int i = 0; i < ALFABETO.lenght; i++) {
            if (ALFABETO[i] == c) {

            }

        }

}
