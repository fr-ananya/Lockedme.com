import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileManagementSystem {

    private static final String currentLocation = System.getProperty("user.dir");
    private static final String FILES_DIRECTORY = currentLocation + "/files/";

    public static void main(String[] args) {
        System.out.println("\nWelcome to LockedMe File Management System!");
        System.out.println("Application Name: LockedMe.com");
        System.out.println("Developed by: Ananya Sharma");

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\nMAIN MENU\nPlease select an option: ");
                System.out.println("1. Show All Files");
                System.out.println("2. Business Operations");
                System.out.println("3. Exit Application");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (option) {
                    case 1:
                        listFiles();
                        break;
                    case 2:
                        businessOperations(scanner);
                        break;
                    case 3:
                        closeApplication(scanner);
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    private static void businessOperations(Scanner scanner) {
        try {
            while (true) {
                System.out.println("\nFile Operations:");
                System.out.println("1. Add a file");
                System.out.println("2. Delete a file");
                System.out.println("3. Search for a file");
                System.out.println("4. Return to main menu");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (option) {
                    case 1:
                        System.out.print("Enter file name to add: ");
                        String fileName = scanner.nextLine();
                        addFile(fileName);
                        break;
                    case 2:
                        System.out.print("Enter file name to delete: ");
                        String fileNameToDelete = scanner.nextLine();
                        deleteFile(fileNameToDelete);
                        break;
                    case 3:
                        System.out.print("Enter file name to search: ");
                        String fileNameToSearch = scanner.nextLine();
                        searchFile(fileNameToSearch);
                        break;
                    case 4:
                        System.out.println("Returning to main menu...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }

    private static void closeApplication(Scanner scanner) {
         System.out.println("Closing the application...");
        System.out.println("Thank you for using LockedMe File Management System!");
        System.exit(0);
    }

     public static void sortFilesCaseInsensitive(String[] files) {
        // implementing selection sort
        int n = files.length;
        for (int i = 0; i < n - 1; i++) {
            // find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (files[j].compareToIgnoreCase(files[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            String temp = files[minIndex];
            files[minIndex] = files[i];
            files[i] = temp;
        }
    }

    private static void listFiles() {
        System.out.println("Listing the files in ascending order: ");

        File directory = new File(FILES_DIRECTORY);
        
        String[] files = directory.list();

        if (files != null && files.length > 0) {
            // Arrays.sort(files, String.CASE_INSENSITIVE_ORDER); 
            // above in built function can be used to sort the files in case insensitve order.
            
            sortFilesCaseInsensitive(files);
            
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("No files found.");
        }
    }

    private static void addFile(String fileName) {
        File file = new File(FILES_DIRECTORY + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
                System.out.println("Saved to location: " + file.getPath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    private static void deleteFile(String fileName) {
        File file = new File(FILES_DIRECTORY + fileName);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File not found.");
        }
    }

    private static void searchFile(String fileName) {
        
        File directory = new File(FILES_DIRECTORY);
        File[] files = directory.listFiles();

        // we can use the following inbuilt file.exists() function to check if file exists.
        //     if (file.exists()) {
        //         System.out.println("File found.");
        //     } else {
        //         System.out.println("File not found.");
        //     }

    
        boolean fileFound = false;
    
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    fileFound = true;
                    break;
                }
            }
        }
    
        if (fileFound) {
            System.out.println("File found.");
        } else {
            System.out.println("File not found.");
        }
    }
}
