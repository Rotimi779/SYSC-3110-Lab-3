import java.util.LinkedList;

public class AddressBook  {
    private LinkedList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new LinkedList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null)
        {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        System.out.println("Address Book");
    }
}
