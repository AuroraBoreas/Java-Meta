package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String txt = "hello world!";
        System.out.println(convertVowels(txt));
    }

    static String convertVowels(String s) {
        final String vowels = "aiueo";
        char x;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            x = s.charAt(i);
            if (vowels.indexOf(x) != -1)
                sb.append(Character.toUpperCase(x));
            else
                sb.append(x);
        }
        return sb.toString();
    }
}
