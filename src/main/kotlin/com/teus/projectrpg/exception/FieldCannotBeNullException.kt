package com.teus.projectrpg.exception

import org.hibernate.PropertyValueException

class FieldCannotBeNullException(cause: PropertyValueException)
    : RuntimeException("Field: '${cause.propertyName}' cannot be null")