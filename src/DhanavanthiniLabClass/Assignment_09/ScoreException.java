package DhanavanthiniLabClass.Assignment_09;

public class ScoreException extends Exception{
    @Override
    public String toString() {
        return "In valid Input!";
    }

    public int inputMarks(int n) throws ScoreException{
        if(n<0 || n>100){
            throw new ScoreException();
        }
        return n;
    }
}
