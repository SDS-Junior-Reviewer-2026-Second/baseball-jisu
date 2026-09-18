package baseball;

public class Game {

    public void guess(String guessNumber) {
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
    }
}
