package com.teachmeskills.lesson13.service;

import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;
import com.teachmeskills.lesson13.validator.AuthValidator;

public class AuthorizationCheckService {
    public static void authorizationCheck(String login, String password, String confirmPassword) {
        try {
            AuthValidator.checkUserInputParameters(login, password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.out.println("Пароль должен содержать минимум:\n1-на цифра,0 пробелов, длинна от 3 до 20");
        } catch (WrongLoginException e) {
            System.out.println("Логин не должен содержать пробелов, длинна от 3 до 20 ");
        }
    }
}
