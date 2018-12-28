public class Client {

    private final String firstName;
    private final String secondName;
    private final String address;
    private final String passportId;

    private Client(String firstName, String secondName, String address, String passportId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public String getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", passportId='" + passportId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String firstName;
        private String secondName;
        private String address;
        private String passportId;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withSecondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPassportId(String passportId) {
            this.passportId = passportId;
            return this;
        }

        public Client build() {
            return new Client(firstName, secondName, address, passportId);
        }
    }
}