package com.masharipov2105.systems;

import com.masharipov2105.systems.util.TreeGenerator;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter folder path: ");

        String result = scanner.nextLine();

        System.out.println(TreeGenerator.generate(result, false, 0));
    }
}
