package com.attractorschool.imurab.dto.queue;

import com.attractorschool.imurab.dto.field.FieldDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class VacantDto {
    private FieldDto field;
    private Vacant vacant;
}
