
import java.util.Scanner;

public class PhoneNumber {
    private String countryCode;
    private String number;
    Scanner input = new Scanner(System.in);

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        while (number.length() != 10) {
            System.out.println("phone number has 10 digits");
            number = String.valueOf(input.next());
        }
        this.number = number;
    }
}
