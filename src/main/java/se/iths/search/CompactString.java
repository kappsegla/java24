package se.iths.search;

public class CompactString {
    public static void main(String[] args) {
        String s1 = "abc123";
        String s2 = "😒";

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.getBytes().length);
        System.out.println(s2.getBytes().length);

        s1.substring(1,3);

    }
}
