public class BuddyInfo {
    private final String name;
    private final String address;
    private final int phoneNumber;


    public BuddyInfo(String name, String address, int phoneNumber) {
        if (name == null) {
            this.name = "Default";
        }
        else {
            this.name = name;
        }

        if (address == null) {
            this.address = "Carleton";
        }
        else {
            this.address = address;
        }

        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo random = new BuddyInfo("Rotimi","Revalie",101253689);
        System.out.println("Hello World! " + random.getName());
    }
}
