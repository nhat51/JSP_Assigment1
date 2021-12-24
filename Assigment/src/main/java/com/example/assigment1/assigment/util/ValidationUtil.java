package com.example.assigment1.assigment.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

    //khuôn cho link
    private static Pattern patternUrl = Pattern.compile("^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", Pattern.CASE_INSENSITIVE);

    //khuôn cho email
    private static Pattern patternEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);


    public static boolean checkUrl(String url){
        Matcher matcher = patternUrl.matcher(url);
        return matcher.find();
    }

    public static boolean checkEmail(String email){
        Matcher matcher = patternEmail.matcher(email);
        return matcher.find();
    }
}
