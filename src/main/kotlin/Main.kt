
fun main() {
    val borojaPhoneBook = PhoneBook()

    borojaPhoneBook.storeContact(listOf(
        Contact(
            "Adesola",
            "Kareem",
            "kareemadesola1999@gmail.com",
            "09070708811"
        ),
        Contact(
            "Adebisi",
            "Kunle",
            "adebisikunle123@gmail.com",
            "08123445869"
        ),
        Contact(
            "caleb",
            "Kunle",
            "adebisikunle123@gmail.com",
            "08123445869"
        )
    ))

    println(borojaPhoneBook.getContact("08123445869"))
    println()
    println(borojaPhoneBook.contactList)

}