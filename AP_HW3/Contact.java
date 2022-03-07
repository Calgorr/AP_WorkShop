
public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String group;
    private PhoneNumber phoneNumber = new PhoneNumber();
    private Address address = new Address();
    public Contact(){

    }
    public String name() {
        return getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        System.out.println("Contact {");
        System.out.println("\tgroup : " + this.getGroup());
        System.out.println("\temail : " + this.getEmail());
        System.out.println("\tfirstName : " + this.getFirstName());
        System.out.println("\tlastName : " + this.getLastName());
        System.out.println("\tphoneNumber : (" + this.getPhoneNumber().getCountryCode() + ")" + this.getPhoneNumber().getNumber());
        System.out.println("\taddress : " + this.getAddress().getZipCode() + " " + this.getAddress().getCountry() + " " + this.getAddress().getCity());
        System.out.println("}");
        return "";
    }
}
