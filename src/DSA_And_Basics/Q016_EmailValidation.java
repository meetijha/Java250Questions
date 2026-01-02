package DSA_And_Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q016_EmailValidation {
    public static void main(String[] args) {

        String email = "john@example.com";

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        Matcher mat = pat.matcher(email);

        if (mat.matches())
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

    }

}

/* INVALID SCENARIOS
"plainaddress" - Missing @ and domain
"@invalid.com" - Missing username
"joe@[123.123.123.123]" - Square brackets around IP address
" näme@example.com" - Contains illegal character
"john..doe@example.com" - Double dot
"john@doe@example.com" - Double @
"john@example@com" - Missing top level domain (.com)
"john@example.c" - Top level domain too short
"john@example.com1" - Top level domain cannot have numbers
"<john@example..com>" - Double dot in domain name
"john@example.com." - Trailing dot in domain name
"<john@example..com>." - Double dots and trailing dot
"john@example.com.." - Double dot before top level domain

* */