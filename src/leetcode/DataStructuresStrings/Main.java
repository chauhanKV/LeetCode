package leetcode.DataStructuresStrings;

public class Main {
    public static void main(String[] args) {
        StringCompression compression = new StringCompression();
        System.out.println(compression.compression1("wwwwaaadexxxxxx"));
        System.out.println(compression.compression2("wwwwaaadexxxxxx"));

        ToggleCase toggle = new ToggleCase();
        System.out.println("String after toggling to lowercase : " + toggle.toLowerCaseOptimized("HeLLo"));
        System.out.println("String after toggling : " + toggle.toggleCase("pepCODinG"));
    }
}
