package com.teus.projectrpg.armor.entity

import com.teus.projectrpg.bodylocalization.entity.BodyLocalization
import jakarta.persistence.*

@Entity
@Table(name = "armor_body_localization")
data class ArmorBodyLocalization(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "armor_id", nullable = false)
    var armor: Armor,

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "body_localization_id", nullable = false)
    var bodyLocalization: BodyLocalization,

    @Column(name = "armor_points")
    var armoPoints: Int
)
