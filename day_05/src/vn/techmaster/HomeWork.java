package vn.techmaster;

import java.util.Locale;

public class HomeWork {
    // Test ở đây
    public static void main(String[] args) {
        System.out.println(sysmeticString("  HOang   nguyen  minh   "));
    }

    // Viết phương thức ở đây
    public static String sysmeticString (String str){
        str = str.trim().replaceAll("\\s+", " ").toLowerCase();
        String str2 = "";
        String[] indexes = str.split(" ");
        for (int i = 0; i < indexes.length; i++){
            if (i != 0) {
            String newIndex = String.valueOf(indexes[i].charAt(0));
            str2 += " ";
            str2 += newIndex.toUpperCase() + indexes[i].substring(1);
        }
            else{
                String newIndex = String.valueOf(indexes[i].charAt(0));
                str2 += newIndex.toUpperCase() + indexes[i].substring(1);
            }
        }
        return str2;
    }
}
