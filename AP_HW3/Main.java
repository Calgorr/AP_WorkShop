
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("contacts -a <firstName> <lastName>");
            System.out.println("contacts -r <firstName> <lastName>");
            System.out.println("show -g <groupName>");
            System.out.println("show -c <contact's firstName> <contact's lastName>");
            System.out.println("show");
            System.out.println("exit");
            Scanner input = new Scanner(System.in);
            String[] Command = input.nextLine().split(" ");
            Contact contact = new Contact();
            if (Command.length == 1) {
                if (Command[0].equals("exit")) {
                    System.exit(0);
                }
                phoneBook.printContacts();
                //   Thread.sleep(2000);
            } else if (Command.length == 3) {
                String groupName;
                Contact[] Contact;
                groupName = Command[2].substring(1, Command[2].length() - 1);
                Contact = phoneBook.findContact(groupName);
                for (Contact contact1 : Contact) {
                    contact1.toString();
                }
                //  Thread.sleep(2000);
            } else {
                if (Command[0].equals("contacts")) {
                    if (Command[1].equals("-a")) {
                        contact.setFirstName(Command[2].substring(1, Command[2].length() - 1));
                        contact.setLastName(Command[3].substring(1, Command[3].length() - 1));
                        System.out.println("please enter contact's group: ");
                        contact.setGroup(input.nextLine());
                        if (contact.getGroup().equals("")) {
                            contact.setGroup("-");
                        }
                        System.out.println("please enter contact's email: ");
                        contact.setEmail(input.nextLine());
                        if (contact.getEmail().equals("")) {
                            contact.setEmail("-");
                        }
                        System.out.println("please enter contact's country code");
                        contact.getPhoneNumber().setCountryCode(input.next());
                        System.out.println("please enter contact's phone number");
                        contact.getPhoneNumber().setNumber(input.next());
                        System.out.println("please enter contact's zipcode");
                        contact.getAddress().setZipCode(input.next());
                        System.out.println("please enter contact's country");
                        contact.getAddress().setCountry(input.next());
                        System.out.println("please enter contact's city");
                        contact.getAddress().setCity(input.next());
                        phoneBook.addContact(contact);
                    } else {
                        String firstName = Command[2].substring(1, Command[2].length() - 1);
                        String lastName = Command[3].substring(1, Command[3].length() - 1);
                        if (phoneBook.deleteContact(firstName, lastName)) {
                            System.out.println("ok");
                        } else {
                            System.out.println("not found");
                        }
                        //      Thread.sleep(2000);
                    }
                } else {
                    String firsName = Command[2].substring(1, Command[2].length() - 1);
                    String lastName = Command[3].substring(1, Command[3].length() - 1);
                    Contact contact_show = phoneBook.findContact(firsName, lastName);
                    System.out.println(contact_show.toString());
                    // Thread.sleep(2000);
                }
            }
        }
    }
}