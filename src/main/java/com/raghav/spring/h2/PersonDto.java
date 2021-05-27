package com.raghav.spring.h2;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class PersonDto {

    String name;
    String location;
    ZonedDateTime birthDay;

}
