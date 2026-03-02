public class methods {

    public static int calculator(int a, int b) {
        int totalBill = a*b;
        return totalBill;
    }

    public static boolean toVote(int age) {
        if (age >= 18) {
            //System.out.println("Eligible to vote");
            return true;
        } else {//System.out.println("Not Eligible");
        return false;}
    }

    public static int findSmallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static int countConsonants(String a) {
    int count = 0;

    for (int i = 0; i < a.length(); i++) {
        char ch = a.charAt(i);

        if (
            ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' &&
            ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {

            count++;
        }
    }

    return count;
}

    public static void main(String[] args) {
        int bill = calculator(2,10);
        System.out.println("Your bill is " + bill);

        int age = 17;
        boolean voting = toVote(age);
        if (voting = true) {
            System.out.println("You can vote and you age is " + age);
        } else {System.out.println("You cannot vote and you age is " + age);}

        int number = findSmallestNumber(7,5,6);
        System.out.println("Smallest number is " + number);
        
        int word = countConsonants("Raghul");
        System.out.println(word);
        

}
}