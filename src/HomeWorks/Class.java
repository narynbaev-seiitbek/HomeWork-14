package HomeWorks;

import java.util.Arrays;

public class Class {

    private int[] number;
    private String[] words;
    private int[] array;

    public Class(int[] number, String[] words, int[] array) {
        this.number = number;
        this.words = words;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Class information: " +'\n'+
                "Number=" + Arrays.toString(number) +'\n'+
                "Words=" + Arrays.toString(words) +'\n'+
                "Array=" + Arrays.toString(array) +'\n';
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
