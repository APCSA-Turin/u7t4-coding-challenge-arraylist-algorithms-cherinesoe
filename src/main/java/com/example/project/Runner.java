package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        int[] intList23 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 1, 2, 3, 4, 5, 6};
        ArrayList<Integer> modes6 = Main.modes(intList23);
        System.out.println(modes6);
    }
}