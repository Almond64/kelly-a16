/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        //Is user old enough to drive?
        //(age >= 16) ? System.out.println("You are old enough to legally drive."): System.out.println("You are not old enough to legally drive.");
        System.out.println((age >= 16) ? "You are old enough to legally drive.": "You are not old enough to legally drive.");
    }
}
