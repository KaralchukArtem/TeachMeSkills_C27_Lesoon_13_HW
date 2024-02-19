package com.teachmeskills.lesson13;

import java.util.Scanner;
import static com.teachmeskills.lesson13.service.AuthorizationCheckService.authorizationCheck;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите :  Логин, Пароль, Подтверждения пороля");
        System.out.print("Логин - ");
        String login = scanner.nextLine();
        System.out.print("Пароль - ");
        String password = scanner.nextLine();
        System.out.print("Подтверждение пароля - ");
        String confirmPassword = scanner.nextLine();
        scanner.close();
        authorizationCheck(login,password,confirmPassword);
    }
}
