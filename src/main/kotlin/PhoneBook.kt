class PhoneBook() {

    private val _contactList = mutableListOf<Contact>()
    val contactList: List<Contact>
        get() = _contactList

    fun getContact(phoneNumber: String):Contact?{
        return contactList.find { it.phoneNumber == phoneNumber }
    }

    fun storeContacts(contacts: List<Contact>) {

        val duplicatePhoneNumbers = contacts.groupingBy {
            it.phoneNumber
        }.eachCount().filter { it.value > 1 }
        println(duplicatePhoneNumbers)

        if(duplicatePhoneNumbers.isNotEmpty()){
            throw Exception("Duplicates ${duplicatePhoneNumbers.keys} exist")
        }

        _contactList.addAll(contacts)
    }

    fun storeContact(contact: Contact){
        val duplicateCheck = contactList.map {
            it.phoneNumber
        }.contains(contact.phoneNumber)
        if (duplicateCheck) {
            throw Exception("Phone number ${contact.phoneNumber} already exists")
        }
        _contactList.add(contact)
    }
}