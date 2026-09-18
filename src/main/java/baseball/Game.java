package baseball;

public class Game {

    public void guess(String guessNumber) {
        verifyInput(guessNumber);
    }

    private static void verifyInput(String guessNumber) {
        if (guessNumber == null){
            throw new IllegalArgumentException();
        }
        if (guessNumber.length() != 3){
            throw new IllegalArgumentException();
        }
        for (char num: guessNumber.toCharArray()){
            if (num < '0' || num > '9'){
                throw new IllegalArgumentException();
            }
        }
        if (hasDuplicateNumber(guessNumber)){
            throw new IllegalArgumentException();
        }
    }

    private static boolean hasDuplicateNumber(String guessNumber) {
        return guessNumber.charAt(0) == guessNumber.charAt(1)
                || guessNumber.charAt(0) == guessNumber.charAt(2)
                || guessNumber.charAt(1) == guessNumber.charAt(2);
    }
}
