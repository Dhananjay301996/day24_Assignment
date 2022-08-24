public class Contacts {
    /*
    creating contacts for Address Book
     */
    private String firstName, lastName, addressName, city, state,  phone, email;

    public Contacts() {
    }

    /*
    creating toString method
     */

    @Override
    public String toString() {
        return "contacts [firstName=" + firstName + ", lastName=" + lastName + ", addressName=" + addressName
                + ", city=" + city + ", state=" + state + ", phone=" + phone + ", email=" + email + "]";
    }

    /*
    creating constructor
     */

    public Contacts(String firstName, String lastName, String addressName, String city, String state, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressName = addressName;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.email = email;
    }

    /*
    use getter and setter
     */
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

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
