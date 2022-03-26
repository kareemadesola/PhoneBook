class PhoneBook() {

    private val _contactList = mutableListOf<Contact>()
    val contactList: List<Contact>
        get() = _contactList

    fun getContact(phoneNumber: String):Contact?{
        return contactList.find { it.phoneNumber == phoneNumber }
    }

    fun storeContact(contact: Contact){

        if (isDuplicate(contact)) {
            throw Exception("Phone number ${contact.phoneNumber} already exists")
        }
        _contactList.add(contact)
    }

    private fun isDuplicate(contact: Contact):Boolean{
        return contactList.map {
            it.phoneNumber
        }.contains(contact.phoneNumber)
    }
}