package MobilePhoneContacts;

public class TestMain {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact1 = new Contact("John Doe", "987654321");
        Contact contact2 = new Contact("Jane Smith", "123456789");

        // Adding contacts
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);

        // Querying contacts
        System.out.println(mobilePhone.queryContact("John Doe").getPhoneNumber()); // Output: 987654321

        // Updating a contact
        Contact updatedContact = new Contact("John Doe", "111222333");
        mobilePhone.updateContact(contact1, updatedContact);

        // Removing a contact
        mobilePhone.removeContact(updatedContact);

        // Printing contacts

        mobilePhone.printContacts(); // Should show no contacts left

        // Adding a new contact

        Contact contact3 = new Contact("Alice Brown", "555666777");
        mobilePhone.addNewContact(contact3);
        // Printing contacts again
        mobilePhone.printContacts(); // Should show Alice Brown
        // Querying a non-existing contact
        Contact queriedContact = mobilePhone.queryContact("Non Existing");
        if (queriedContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(queriedContact.getPhoneNumber());
        }
        // Adding a contact with the same name
        Contact duplicateContact = new Contact("Alice Brown", "888999000");
    }
}
