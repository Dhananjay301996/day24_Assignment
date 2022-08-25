
import java.util.*;
/*
Adding multiple address book
 */
public class MultipleAddressBook {
    Map<String, AddressBookServices> addressBookMap = new HashMap<>();
    List<AddContact> contacts = new ArrayList<AddContact>();
    Scanner scanner = new Scanner(System.in);
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
            AddressBookServices addressBook = new AddressBookServices();
            addressBookMap.put(bookName, addressBook);
            System.out.println("Address Book " + bookName + " successfully added!!");
        }
    }
    /*
    add contact in address book
     */
    public void addContact() {
        System.out.println("Enter the name of Address book to add the contact.");
        Scanner scanner = new Scanner(System.in);
        String newContact = scanner.nextLine();
        AddressBookServices addressBook = addressBookMap.get(newContact);
        if (addressBook == null) {
            System.out.println("No book found");

        } else {
            addressBookMap.get(newContact).addContact();
        }
    }
    /*
    edit contact from address book
     */
    public void editContactInBook() {
        System.out.println("Enter Name of Address Book you want to edit: ");
        Scanner scanner = new Scanner(System.in);
        String editBookName = scanner.next();
        if (addressBookMap.containsKey(editBookName)) {
            addressBookMap.get(editBookName).editContact();
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            editContactInBook();
        }
    }
    /*
    delete address book
     */
    public void deleteAddressBook() {
        System.out.println("Enter Name of Address Book you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.remove(bookName);
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            deleteAddressBook();
        }
    }
    /*
    delete contact from book
     */
    public void deleteContactInBook() {
        System.out.println("Enter Name of Address Book you want to delete the contacts in it: ");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        if (addressBookMap.containsKey(bookName)) {
            addressBookMap.get(bookName).deleteContact();
        } else {
            System.out.println("AddressBook doesn't exist, Please enter correct name.");
            deleteContactInBook();
        }
    }
    /*
    print address book
     */
    public void printBook() {
        System.out.println("These are AddressBooks in program.");
        for (String i : addressBookMap.keySet()) {
            System.out.println(i);
        }
    }
    /*
    print contact book
     */
    public void printContactsInBook() {
        for (String i : addressBookMap.keySet()) {
            System.out.println(i);
            System.out.println(addressBookMap.get(i).contacts);
        }
        System.out.println(" ");
    }
    /*
    search contact by city
     */
    public void searchByCity() {

        System.out.println("Enter the name of the City to get the persons : ");
        String cityName = scanner.next();
        for (String i : addressBookMap.keySet()) {
            List<AddContact> arr = addressBookMap.get(i).contacts;
            arr.stream().filter(person -> person.getCity().equals(cityName))
                    .forEach(person -> System.out.println(person.getFirstName()));
        }
    }
    /*
    search contact by state
     */
    public void searchByState() {

        System.out.println("Enter the name of the State to the get persons : ");
        String stateName = scanner.next();
        for (String i : addressBookMap.keySet()) {
            List<AddContact> arr = addressBookMap.get(i).contacts;
            arr.stream().filter(person -> person.getState().equals(stateName))
                    .forEach(person -> System.out.println(person.getFirstName()));
        }
    }
    public void displayPeopleByRegion(HashMap<String, ArrayList<AddContact>> addressBookMap) {
        System.out.println("Enter the name of the region :");
        String regionName = scanner.next();

        addressBookMap.values().stream()
                .map(region -> region.stream()
                        .filter(person -> person.getState().equals(regionName) || person.getCity().equals(regionName)))
                .forEach(person -> person.forEach(personDetails -> System.out.println(personDetails)));
    }

    public void countPeopleByRegion(HashMap<String, ArrayList<AddContact>> listToDisplay) {

        System.out.println("Enter the name of the region :");
        String regionName = scanner.next();
        long countPeople = listToDisplay.values().stream()
                .map(region -> region.stream().filter(person -> person.getState().equals(regionName) || person.getCity().equals(regionName)))
                .count();

        System.out.println("Number of People residing in " + regionName + " are: " + countPeople + "\n");

    }
}

