import java.util.Calendar

data class Contact(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,

    ) {
    val dateCreated = Calendar.getInstance()
}
