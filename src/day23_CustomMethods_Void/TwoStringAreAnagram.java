package day23_CustomMethods_Void;

import java.util.Arrays;

public class TwoStringAreAnagram {
    public static void main(String[] args) {
twoStringAreAnagram("listen","silent");


    }

    public static void twoStringAreAnagram(String word1,String word2){

char[] ch1 = word1.toCharArray();
char[] ch2 = word2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println(word1+" and "+word2+ " are Anagram");
        }else{
            System.out.println(word1+" and "+word2+ " are not Anagram");
        }

    }
}
/*
. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */