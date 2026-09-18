package baseball;

public class Game {

    public String question;

    public GuessResult guess(String guessNumber) {
        verifyInput(guessNumber);
        if (guessNumber.equals(question)){
            return new GuessResult(true, 3, 0);
        }
        else {
            return new GuessResult(false, 0, 0);
        }
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
