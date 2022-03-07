
import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList();
    public PhoneBook(){

    }
    public boolean addContact(Contact contact) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getPhoneNumber().getNumber().equals(contact.getPhoneNumber().getNumber())) {
                return false;
            }
        }
        contacts.add(contact);
        return true;
    }

    public boolean deleteContact(String firstName, String lastName) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            String[] name = it.next().name().split(" ");
            if (name[0].equals(firstName) && name[1].equals(lastName)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public Contact[] findContact(String group) {
        ArrayList<Contact> contact_array = new ArrayList();
        for (Contact contact : contacts) {
            if (contact.getGroup().equals(group)) {
                contact_array.add(contact);
            }
        }
        return contact_array.toArray(new Contact[0]);
    }

    public void printContacts() {
        for (Contact contact : contacts) {
            contact.toString();
        }
    }
}
