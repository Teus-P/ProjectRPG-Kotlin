package com.teus.projectrpg.bodylocalization.service

import com.teus.projectrpg.base.service.BaseServiceImpl
import com.teus.projectrpg.bodylocalization.entity.BodyLocalization
import com.teus.projectrpg.bodylocalization.repository.BodyLocalizationRepository
import com.teus.projectrpg.bodylocalization.type.BodyLocalizationType
import org.springframework.stereotype.Service

@Service
class BodyLocalizationServiceImpl (bodyLocalizationRepository: BodyLocalizationRepository)
    : BodyLocalizationService, BaseServiceImpl<BodyLocalizationType, BodyLocalization>(bodyLocalizationRepository)