package de.thm.mni.backend.user
import jakarta.persistence.* // For Jakarta-based projects

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "first_name")
    var firstName: String? = null
    var lastName: String? = null

    @OneToOne(
        cascade = [CascadeType.ALL], mappedBy = "user"
    )
    var address: Address? = null
}