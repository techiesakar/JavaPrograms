// Program to find e
public class findE {
    public static void main(String[] args) {
        String myString = "Welcome to the education sector";
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("There are " + count + " e");
    }
}
