package com.backendapp.backendApp.entity.Aula;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AulaEntity {

    private Date time;
    private Date duration;
    private Integer quantityAvailable;

}
