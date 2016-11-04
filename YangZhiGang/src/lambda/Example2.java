package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Example2 {

    public static void main(String[] args) {

        String[] array = {"aaa", "bbb", "ccc"};
 
        Arrays.asList(array).forEach((player) -> System.out.println(player));

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(array, sortByName);
        // or this
        Arrays.sort(array, (String s1, String s2) -> (s1.compareTo(s2)));

        Arrays.asList(array).forEach((player) -> System.out.println(player));

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
            }
        });

        Comparator<String> sortBySurname = (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
        Arrays.sort(array, sortBySurname);
        // or this
        Arrays.sort(array, (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")))));

        Arrays.asList(array).forEach((player) -> System.out.println(player));

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });

        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());
        Arrays.sort(array, sortByNameLenght);
        // or this
        Arrays.sort(array, (String s1, String s2) -> (s1.length() - s2.length()));

        Arrays.asList(array).forEach((player) -> System.out.println(player));

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });

        Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(array, sortByLastLetter);
        // or this
        Arrays.sort(array, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));

        Arrays.asList(array).forEach((player) -> System.out.println(player));
    }

}
