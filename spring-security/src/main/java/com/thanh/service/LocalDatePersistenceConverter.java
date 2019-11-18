package com.thanh.service;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;
import java.sql.Date;

@Converter(autoApply = true)
public class LocalDatePersistenceConverter implements AttributeConverter<LocalDate, Date> {
    @Override
    public Date convertToDatabaseColumn(LocalDate entityValue) {
        return Date.valueOf(entityValue);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date dbData) {
        return null;
    }
}