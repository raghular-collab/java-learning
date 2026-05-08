package InterviewProgram;

public class VowelCount {
    public static void main(String[] args) {
        String str = "Automation";
        int count = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
