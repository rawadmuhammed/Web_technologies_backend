package de.thm.mni.backend.user
import jakarta.persistence.* // For Jakarta-based projects

@Entity
@Table(name = "addresses")
class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
    var street: String? = null
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    var user: User? = null
}