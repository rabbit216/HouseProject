package demo;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {

    private final static String url = "http://61.142.120.214:9000/web/realestate_presale.jsp?licenceCode=惠湾房预许字【2018】第168号&ProjectCode=DYW00071057";

    public static void main(String[] args) {

        String str1 = "tutorials point";
        String str2 = "http://61.142.120.214:9000/web/realestate_presale.jsp?licenceCode=惠湾房预许字【2018】第168号&ProjectCode=DYW00071057";
        CharSequence cs1 = "int";
        CharSequence cs11 = "licenceCode";

        // string contains the specified sequence of char values
        boolean retval = str2.contains(cs11);
        System.out.println("Method returns : " + retval);
    }
    }


