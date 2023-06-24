package com.teus.projectrpg.characteristic.repository

import com.teus.projectrpg.base.repository.BaseRepository
import com.teus.projectrpg.characteristic.entity.Characteristic
import com.teus.projectrpg.characteristic.type.CharacteristicType

interface CharacteristicRepository : BaseRepository<CharacteristicType, Characteristic>