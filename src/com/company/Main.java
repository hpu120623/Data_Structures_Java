package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++){
            System.out.println(i);
        }

        int[] scores = new int[] {100, 90, 60};
        for (int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }

        scores[0]=120;
        for (int score:scores){
            System.out.println(score);
        }
    }
}
