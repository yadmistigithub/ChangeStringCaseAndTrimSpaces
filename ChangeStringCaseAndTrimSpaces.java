package Tasks7.day7;
public class ChangeStringCaseAndTrimSpaces {
    public static void main(String[] args) {
        // Original string
        String str = "   Hello, World!   ";

        // Changing string case
        String upperCaseString = str.toUpperCase();
        String lowerCaseString = str.toLowerCase();

        // Trimming spaces
        String trimmedString = str.trim();

        // Displaying the results
        System.out.println("Original String: " + str);
        System.out.println("Upper Case String: " + upperCaseString);
        System.out.println("Lower Case String: " + lowerCaseString);
        System.out.println("Trimmed String: " + trimmedString);
    }
}

