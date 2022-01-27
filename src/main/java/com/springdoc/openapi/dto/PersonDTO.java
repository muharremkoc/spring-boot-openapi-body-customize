package com.springdoc.openapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonDTO {

    @Schema(description = "Enter Firstname",type = "string",example = "John")
    String firstName;

    @Size(min = 11,max = 11)
    @Schema(description = "Enter tckNO",type = "long",example = "12345678901")
    long tckNO;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    @Schema(description = "Enter birthDate",type = "string",defaultValue = "26-01-2022")
    LocalDate birthDate;

}
