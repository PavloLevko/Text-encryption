public class BruteForce {
    private static final String MASSAGE = "Encryption does not math the conditions!";
    private static final String BRUTE_FORCE_COMPLITE = "Brute Force is complite!";
    private static final char SPACE_THREE= '#';
    private static final char SPACE_SIX = '&';
    public static int getValueSpaceThree() {
        return valueSpaceThree;
    }
    public static int valueSpaceThree =0;

    public static int getValueSpaceSix() {
        return valueSpaceSix;
    }
    public static int valueSpaceSix =0;
    private static final int COEFFICIENT = 3;
    public void bruteForse (char[] array) {
        array = MyFileRider.charsArrayAfterRead;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == SPACE_THREE) {
                valueSpaceThree++;
            } else if (array[i] == SPACE_SIX) {
                valueSpaceSix++;
            }
        }
        System.out.println(valueSpaceThree);
    }
    public void selectDecryptMetod( int valueSpaceThree, int valueSpaceSix){
        if (valueSpaceThree>COEFFICIENT){
            DecryptThree.decryptedToThree(MyFileRider.charsArrayAfterRead);
            System.out.println(BRUTE_FORCE_COMPLITE);
        }else if(valueSpaceSix>COEFFICIENT) {
            DecryptSix.decryptedToSix(MyFileRider.charsArrayAfterRead);
            System.out.println(BRUTE_FORCE_COMPLITE);
        }else{
            System.out.println(MASSAGE);
        }
    }
}