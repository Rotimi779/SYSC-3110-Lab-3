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

    public BuddyInfo removeBuddy(int index) {
        if ( index >= 0 && index < buddies.size()){
           return buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Rotimi","Revalie",101253689);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addBuddy(buddy);
        addressBook1.removeBuddy(0);
        System.out.println("New change");
        System.out.println("This some new extra text");
        
    }
}
