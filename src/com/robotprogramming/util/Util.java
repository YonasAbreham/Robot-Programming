package com.robotprogramming.util;

import java.awt.*;

public class Util {
    public  static boolean isAlphabet(String str){
        return str != null && str.matches("^[ a-zA-Z]*$");
    }
}
