package com.teus.projectrpg.weapon.entity

import jakarta.persistence.*

@Entity
@Table(name = "weapon_quality_value")
data class WeaponQualityValue(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long,

    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = false)
    var weapon: Weapon,

    @ManyToOne
    @JoinColumn(name = "weapon_quality_id", nullable = false)
    var weaponQuality: WeaponQuality,

    @Column(name = "value")
    var value: String
)
