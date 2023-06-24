package com.teus.projectrpg.armor.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.teus.projectrpg.availability.entity.Availability
import jakarta.persistence.*

@Entity
@Table(name = "armor")
data class Armor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long,

    @Column
    var name: String,

    @Column(name = "name_translation")
    var nameTranslation: String,

    @ManyToOne
    @JoinColumn(name = "armor_category_id", nullable = false)
    var armorCategory: ArmorCategory,

    @JsonIgnore
    @OneToMany(
        mappedBy = "armor",
        cascade = [CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE],
        orphanRemoval = true
    )
    var armorBodyLocalizations: List<ArmorBodyLocalization>,

    @ManyToMany
    @JoinTable(
        name = "armor_armor_penalty",
        joinColumns = [JoinColumn(name = "armor_id")],
        inverseJoinColumns = [JoinColumn(name = "penalty_id")]
    )
    var armorPenalties: List<ArmorPenalty>,

    @ManyToMany
    @JoinTable(
        name = "armor_armor_quality",
        joinColumns = [JoinColumn(name = "armor_id")],
        inverseJoinColumns = [JoinColumn(name = "quality_id")]
    )
    var armorQualities: List<ArmorQuality>,

    @Column(name = "price")
    var price: String,

    @Column(name = "encumbrance")
    var encumbrance: String,

    @Enumerated(EnumType.STRING)
    @ManyToOne
    @JoinColumn(name = "availability_id", nullable = false)
    var availability: Availability,

    @Column(name = "is_base_armor", nullable = false)
    var isBaseArmor: Boolean

)
