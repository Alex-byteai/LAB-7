package sebas.lab07_refactoring;

public class Customer {
    private String name;
    private PhoneNumber phone;

    // Constructor original con PhoneNumber
    public Customer(String name, PhoneNumber phone) {
        this.name = name;
        this.phone = phone;
    }

    // Constructor adicional para compatibilidad con los tests
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = new PhoneNumber(phone);
    }

    public String getName() {
        return name;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public boolean hasValidPhone() {
        return phone != null && phone.isValid();
    }

    public String getFormattedPhone() {
        return phone != null ? phone.getFormatted() : null;
    }
}
