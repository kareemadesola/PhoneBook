
fun main() {
    val borojaPhoneBook = PhoneBook()

    borojaPhoneBook.storeContact(
        Contact(
            "Donnarumma",
            "Gianluigi",
            "donnagian@gmail.com",
            "08123445869"
        )
    )

    borojaPhoneBook.storeContact(
        Contact(
            "Boroja",
            "Chinex",
            "borojachinex@gmail.com",
            "08034753241"
        )
    )


    //  To test duplicates, uncomment
    //borojaPhoneBook.storeContact(
    //    Contact(
    //        "Alex",
    //        "Telles",
    //        "donnagian@gmail.com",
    //        "08034753241"
    //    )
    //)
    println(borojaPhoneBook.getContact("08123445869"))
    println()
    println(borojaPhoneBook.contactList)


}