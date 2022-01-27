package com.springdoc.openapi.mapper;

import com.springdoc.openapi.dto.PersonDTO;
import com.springdoc.openapi.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PersonMapper {

    @Mappings({
            @Mapping(target = "firstName",source = "firstName"),
            @Mapping(target = "tckNO",source = "tckNO"),
            @Mapping(target = "birthDate",source = "birthDate")
    })

    Person personDTOtoPerson(PersonDTO personDTO);
}
