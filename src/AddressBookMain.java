/**
 * This is address book program
 * here caaling the methods and class for output
 */
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Main Program");

        AddressBook a1 = new AddressBook();
        a1.contactList();
        a1.contactList();
        System.out.println(a1.list);
    /*
    delete the contact
     */
        System.out.println("if you want to change any data of a person, reply y/n : ");
        String check = AddressBook.sc.nextLine();

        if (check.equals("y")) {
            System.out.println("enter name whose details you want to remove : ");
            String name = AddressBook.sc.nextLine();

            int i =0;
            for (Contacts cThrough : a1.list) {

                if (cThrough.getFirstName().equals(name)) {
                    a1.list.remove(i);
                    break;
                }
                i++;
            }
        }
        System.out.println(a1.list);



    }

    }
