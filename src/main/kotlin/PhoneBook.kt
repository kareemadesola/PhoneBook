class PhoneBook() {

    private val _contactList = mutableListOf<Contact>()
    val contactList: List<Contact>
        get() = _contactList

    fun getContact(phoneNumber: String):Contact?{
        return contactList.find { it.phoneNumber == phoneNumber }
    }

    fun storeContact(contacts: List<Contact>) {
        // Compares length of contacts with distinct phone-number
        // to length of contacts and throw Exception if not equal
        if(contacts.distinctBy {
            it.phoneNumber
        }.size != contacts.size){
            throw Exception("Contacts contains duplicates")
        }
        _contactList.addAll(contacts)
    }
}