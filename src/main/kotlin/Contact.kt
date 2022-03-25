import java.time.LocalDateTime

data class Contact(
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val dateCreated: LocalDateTime = LocalDateTime.now()
)
