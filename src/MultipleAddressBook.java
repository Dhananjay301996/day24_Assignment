
import java.util.*;
/*
Adding multiple address book
 */
public class MultipleAddressBook {
    Map<String, AddressBook> addressBookMap = new HashMap<>();

    /*
    add address book
     */
    public void addAddressBook() {
        System.out.println("Enter Name of new Address Book: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            System.out.println("Address book with this name exists, Enter new name.");
            addAddressBook();
        } else {
            AddressBook addressBook = new AddressBook();
            addressBookMap.put(bookName, addressBook);
            System.out.println("press 1 if you want to add another book or press any key to exit.");
            int newBook = scanner.nextInt();
            if (newBook == 1) {
                addAddressBook();
            }
        }
    }
    /*
    create function for contact
     */
    public void addressBookFunctions() {
        System.out.println("Enter the name of Address book to add, edit or delete the contact.");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.get(bookName);
            System.out.println("Enter book is present choose the options below to do certain function");
            while (true) {
                System.out.println("Enter\n 1. add Contact\n 2. edit contact\n 3. delete contact\n 4. previous menu");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addressBookMap.get(bookName).addContact();
                        break;
                    case 2:
                        addressBookMap.get(bookName).editContact();
                        break;
                    case 3:
                        addressBookMap.get(bookName).deleteContact();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Entered choice is incorrect!.. please enter correct choice");
                }
            }
        }
    }


    /*
     delete address book
      */
    public void deleteBook() {
        System.out.println("Enter the name of Address book to delete.");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.remove(bookName);
        } else {
            System.out.println("No book found");
        }
    }

    /*
    print address book
     */
    public void printBook() {
        System.out.println("These are AddressBooks in present program.");
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            System.out.println(entry.getKey() + "[]");
        }
    }

    /*
    print contact book
     */
    public void printContactsInBook() {
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            System.out.println("The contacts in the Book of < " + entry.getKey() + " > are!...");
            System.out.println(entry.getValue().contactDetailsList);
        }
    }
}
