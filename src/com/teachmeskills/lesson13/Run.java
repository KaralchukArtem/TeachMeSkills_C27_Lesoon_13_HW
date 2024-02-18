package com.teachmeskills.lesson13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run {
    public static void main(String[] args) {

        String regex = "^\\S{3,21}$";
        String text = "looA_#!%!fk";

        Pattern pattern = Pattern.compile("(^\\S{5,20},?\\d)$");
        Matcher matcher = pattern.matcher(text);

        if (text.matches(regex) & text.matches(".*\\d+.*")){
            System.out.println("Нашли");
            System.out.println(text);
        }else {
            System.out.println("Не получилось");
        }

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: \nЛогин\nПароль\nПодтверждения пороля");
        Auth.login = scanner.nextLine();
        Auth.password = scanner.nextLine();
        Auth.confirmPassword = scanner.nextLine();
        scanner.close();
        System.out.println(Auth.login+"\n"+Auth.password+"\n"+Auth.confirmPassword);


    }
}
