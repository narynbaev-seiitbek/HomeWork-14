package HomeWorks;

import java.util.Arrays;

public class Class {

    private int number;
    private String word;
    private int[] array;

    public Class(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String words) {
        this.word = word;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void showInfo() {
        System.out.print("Elements of array: ");
        for (int arr:array) {
            System.out.print(arr+" ");
        }
        System.out.println();
        System.out.println("Word: "+getWord()+"\nNumber: "+getNumber());
    }
}
