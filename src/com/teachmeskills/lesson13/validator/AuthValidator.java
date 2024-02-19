package com.teachmeskills.lesson13.validator;

import com.teachmeskills.lesson13.consts.ConstAuth;
import com.teachmeskills.lesson13.consts.ConstAuthRegex;
import com.teachmeskills.lesson13.custom_exception.WrongLoginException;
import com.teachmeskills.lesson13.custom_exception.WrongPasswordException;

/**
 *  This class throws an exception by checking the login and password in two ways
 * */

public class AuthValidator implements ConstAuthRegex, ConstAuth {
    public static boolean checkUserInputParameters(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!checkLogin(login)) {
            throw new WrongLoginException("Wrong login, spaces");
        } else if (!checkLoginСhar(login)) {
            throw new WrongLoginException("Wrong login, char spaces");
        } else if (!checkPassword(password)) {
            throw new WrongPasswordException("Wrong password, spaces or no number");
        }else if (!checkPasswordСhar(password)) {
            throw new WrongPasswordException("Wrong password char, spaces or no number");
        }else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong confirmPassword,not equal password");
        }
        System.out.println("Введенные данные корректны");
        return true;
    }

    private static boolean checkLogin(String login) {
        return login.matches(SPACES_REG);
    }

    private static boolean checkPassword(String password) {
        return password.matches(SPACES_REG) & password.matches(CONTAINS_NUMBER_REG);
    }

    private static boolean checkLoginСhar(String login) {
        char[] strCharArray = login.toCharArray();
        if (strCharArray.length <= LOGIN_LENGTH_MAX & strCharArray.length >= LOGIN_LENGTH_MIN) {
            for (char c : strCharArray) {
                if (c == ' ') {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    private static boolean checkPasswordСhar(String password) {
        char[] strCharArray = password.toCharArray();
        if (strCharArray.length <= PASSWORD_LENGTH_MAX & strCharArray.length >= PASSWORD_LENGTH_MIN) {
            for (char c : strCharArray) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
            return false;
        }else {
            return false;
        }
    }

}
