package com.teus.projectrpg.weapon.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.teus.projectrpg.availability.entity.Availability
import jakarta.persistence.*

@Entity
@Table(name = "weapon")
data class Weapon(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long,

    @Column
    var name: String,

    @Column(name = "name_translation")
    var nameTranslation: String,


    //TODO change name of weapon_type_id to weapon_category_id and weaponType to weaponCategory
    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "weapon_type_id", nullable = false)
    var weaponType: WeaponCategory,

    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "weapon_group_id", nullable = false)
    var weaponGroup: WeaponGroup,

    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "weapon_reach_id", nullable = false)
    var weaponReach: WeaponReach,

    @Column(name = "weapon_range")
    var weaponRange: Float,

    @Column(name = "is_using_strength")
    var isUsingStrength: Boolean,

    @Column(name = "is_using_strength_in_range")
    var isUsingStrengthInRange: Boolean,

    @Column(name = "damage")
    var damage: Int,

    @JsonIgnore
    @OneToMany(
        mappedBy = "weapon",
        cascade = [CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE],
        orphanRemoval = true
    )
    var weaponQualities: List<WeaponQualityValue>,

    @Column(name = "price")
    var price: String,

    @Column(name = "encumbrance")
    var encumbrance: String,

    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "availability_id", nullable = false)
    var availability: Availability,

    @Column(name = "is_base_weapon", nullable = false)
    var isBaseWeapon: Boolean,
)