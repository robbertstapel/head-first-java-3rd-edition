class ContactTestDrive {
    public static void main(String[] args) {
        Contact contactOne = new Contact();

        contactOne.name = "Robbert Stapel";
        contactOne.phoneNumber = "0619444805";
        contactOne.email = "robbert.stapel@live.nl";

        contactOne.displayName();

    }
}