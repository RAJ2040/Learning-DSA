package org.Practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
StringArgs("muthuraj","gopal","nadar");
    }
    public static void StringArgs(String ...s){
        System.out.println(Arrays.toString(s));
    }
}
