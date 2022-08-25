import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This is address book program
 * here caaling the methods and class for output
 */
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Main Program");

        Scanner sc = new Scanner(System.in);

        AddServices add = new AddServices();

        MultipleAddressBook multi = new MultipleAddressBook();
    /*
    choice for sutaible options
     */
        while (true) {
            System.out.println("Enter to avail services: ");
            System.out.println("1: To add contact \n2: To edit existing contact \n3: To delete contact "
                    + "\n4: To display contact list \n5: find contacts "
                    + " \n6: Add Multiple Address Book \n7: Add Contact to multi Address Book \n8: display Multiple Address book \n0: To Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    add.numberOfTimes();
                    break;
                case 2:
                    add.edit();
                    break;
                case 3:
                    add.delete();
                    break;
                case 4:
                    add.display();
                    break;
                case 5:
                    add.findContact();
                    break;
                case 6:
                    multi.AddMultipleAddressBook();
                    break;
                case 7:
                    multi.addingContacts();
                    break;
                case 8:
                    multi.printaddressBook();
                    break;
                case 0:
                    sc.close();
                    return;

            }
        }
    }
}