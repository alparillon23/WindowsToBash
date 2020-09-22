import java.util.Scanner;

public class WindowsToBash {

/*
C:\Users\Al-Parillon\Desktop\YEAR FOUR\TERM 1\COMM 395 113 (This is the generic format of Windows Dir) to
"/mnt/c/Users/Al-Parillon/Desktop/YEAR FOUR/TERM 1/COMM 395 113"
REQUIREMENTS: Convert Windows File Directory To Bash (Ubuntu for Windows Supported Link)
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert Windows Directory Link: ");
        String windows = sc.nextLine();

        String [] tokens = windows.split("\\\\");
        String bash = "\"/mnt/";

        for (String s: tokens){
            if(s.length() > 1 && s.charAt(1) == ':')
                bash += (s.toLowerCase().charAt(0) + "/");
            else
                bash += (s + "/");
        }
        bash += "\"";
        System.out.println("Copy this line");
        System.out.println(bash);
    }

}
