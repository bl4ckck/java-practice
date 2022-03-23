package week1;

public class StringPlayground {
    public static void main(String[] args) {
        String name = "   Alvin Naufal   ";
        String nameTrimmed = name.trim();

        System.out.println("Join: " + String.join(" ", "str1", nameTrimmed, "str2"));
        System.out.println("Remove Whitespace: " + nameTrimmed);
        System.out.println("Concat: " + nameTrimmed.concat(" str1"));
        System.out.println("Replace: " + nameTrimmed.replace("Alvin", "str2"));
        System.out.println("LowerCase: " + nameTrimmed.toLowerCase());
        System.out.println("UpperCase: " + nameTrimmed.toUpperCase());
    }
}
