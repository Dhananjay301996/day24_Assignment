import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


/**
 * This is address book program
 * here calling the methods and class for output
 */
public class AddressBookMain {
    public void choose() {
        MultipleAddressBook obj1 = new MultipleAddressBook();
        AddressBook obj2 = new AddressBook();
    /*
    choose sutaible option
     */
        while (true) {
            System.out.println(
                    "Enter \n 1. To add The new AddressBook\n 2. To do AddressBook functions\n 3. To delete the AddressBook\n "
                            + "4. To Print the AddressBook\n 5. To Print the contacts in AddressBook\n 6. To show search options\n 0. to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj1.addAddressBook();
                    break;
                case 2:
                    obj1.addressBookFunctions();
                    break;
                case 3:
                    obj1.deleteBook();
                    break;
                case 4:
                    obj1.printBook();
                    break;
                case 5:
                    obj1.printContactsInBook();
                    break;
                case 6:
                    obj2.viewByOptions();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome To Address Book Program");
        Scanner Scan = new Scanner(System.in);

            Path file = Path.of("C:\\Users\\HP\\Desktop\\day27.txt");
        String readData =  Files.readString(file);
        System.out.println(readData);


        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.choose();
    }
}