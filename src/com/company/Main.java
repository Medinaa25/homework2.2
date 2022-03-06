package com.company;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        Countries[] countries = {createObject("Netherlands"), createObject("USA"),createObject("Japan")};
        for (int i = 0; i < countries.length ; i++) {
            
        }
    }

    public static Countries createObject(String className) {

        switch (className) {
            case ("Netherlands"): {
                Netherlands netherlands = new Netherlands("Amsterdam", 17.44);
                netherlands.print();
                return netherlands;
            }
            case ("USA"): {
                USA usa = new USA("Washington", 50);
                usa.print();
                return usa;
            }
            case ("Japan"): {
                Japan japan = new Japan("Tokyo", "East Asia");
                japan.print();
                return japan;
            }
        }
        return null;
    }
}








