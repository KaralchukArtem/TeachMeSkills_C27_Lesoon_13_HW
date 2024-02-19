package com.teachmeskills.lesson13.validator;

import com.teachmeskills.lesson13.consts.ConstAuthRegex;
import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;

public class AuthValidator implements ConstAuthRegex {
    public static boolean checkUserInputParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!checkLogin(login)) {
            throw new WrongLoginException("Wrong login, spaces");
        } else if (!checkLoginСhar(login)) {
            throw new WrongLoginException("Wrong login, char spaces");
        } else if (!checkPassword(password)) {
            throw new WrongPasswordException("Wrong password, spaces or no number");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong confirmPassword,not equal password");
        }
        System.out.println("Введенные данные корректны");
        return true;
    }

    private static boolean checkLogin(String login) {
        return login.matches(spaces);
    }

    private static boolean checkPassword(String password) {
        return password.matches(spaces) & password.matches(containsNumber);
    }

    private static boolean checkLoginСhar(String login) {
        char[] strCharArray = login.toCharArray();
        for (char c : strCharArray) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }

}
