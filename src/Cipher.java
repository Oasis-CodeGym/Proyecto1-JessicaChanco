public class Cipher {
    private static final char[] ALPHABET = {
            'a','á','à','ä','â','b','c','ç','d','e','é','è','ë','ê','f','g','h','i','í','ì','ï','î','j','k','l','m','n','ñ','o','ó','ò','ö','ô','p','q',
            'r','s','t','u','v','w','x','y','z','A','Á','À','Ä','Â','B','C','Ç','D','E','É','È','Ë','Ê','F','G','H','I','Í','Ì','Ï','Î','J','K','L','M','N','Ñ','O','Ó','Ò','Ö','Ô','P','Q',
            'R','S','T','U','V','W','X','Y','Z',' ','.',',','!','¿',';',':','-','_','+','=','*','/','%','&','@','#','$','^','`','~','|','\n','\t','1','2','3','4','5','6','7','8','9','0'};

    }
    public Cipher() {}

    public String cifrar(String text, int shift) {
        StringBuilder cifrarText = new StringBuilder();

        for (char c : cifrarText.toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index + shift) % ALFABETO.lenght;
                cifrarText.append(c) (ALFABETO[newIndex]);
            } else {
                cifrarText.append(c);
            }
        }
        return cifrarText.toString();
    }

    public String descifrar(String cifrarText, int shift) {
        StringBuilder descifrarText = new StringBuilder();
        for (char c : cifrarText.toCharArray()) {
            int index = hallarUnAlfabeto(c);
            if (index != -1) {
                int newIndex = (index - shift + ALFABETO.lenght) % ALFABETO.lenght;
                descifrarText.append(ALFABETO[newIndex]);

            } else {
                descifrarText.append(c);
            }
        }
        return descifrarText.toString();

    }
    private int hallarUnAlfabeto(char c) {
        for (int i = 0; i < ALFABETO.lenght; i++) {
            if (ALFABETO[i] == c) {

            }

        }

}
