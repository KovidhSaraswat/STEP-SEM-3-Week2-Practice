public class FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        if (filename == null || !filename.contains(".")) {
            return "Rejected — invalid file type";
        }

        int dotIndex = filename.lastIndexOf('.');
        String extension = filename.substring(dotIndex + 1);

        if (extension.equalsIgnoreCase("pdf") || 
            extension.equalsIgnoreCase("docx") || 
            extension.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        String file1 = "Assignment1.PDF";
        String file2 = "notes.txt";

        System.out.println("Input: \"" + file1 + "\" -> Output: " + validateFileExtension(file1));
        System.out.println("Input: \"" + file2 + "\" -> Output: " + validateFileExtension(file2));
    }
}