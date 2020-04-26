package com.pluralsight.mathorder;

public class Main {
//program shows us how pharenthesises change the order of math operations
    public static void main(String[] args) {
	    int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC; //result 19
        int result2 = (valA - valB) / valC; //result 5

        System.out.println(result1);
        System.out.println(result2);

        int result3 = valA / valC * valD + valB; //result 13
        int result4 = valA / (valC * (valD + valB)); //result 1

        System.out.println(result3);
        System.out.println(result4);
    }
}
