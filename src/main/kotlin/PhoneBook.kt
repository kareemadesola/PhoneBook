class PhoneBook() {

    private val _contactList = mutableListOf<Contact>()
    val contactList: List<Contact>
        get() = _contactList

    fun getContact(phoneNumber: String):Contact?{
        return contactList.find { it.phoneNumber == phoneNumber }
    }

    fun storeContact(contacts: List<Contact>) {
        _contactList.addAll(contacts)
    }
}