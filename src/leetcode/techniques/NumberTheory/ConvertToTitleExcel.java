package leetcode.techniques.NumberTheory;

public class ConvertToTitleExcel {
    // Need to understand this pattern better
    // Come back to understand this.
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int curr = columnNumber%26;
            columnNumber /= 26;
            sb.append((char)(curr+'A'));
        }
        return sb.reverse().toString();
    }
}
