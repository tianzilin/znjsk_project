package com.znjsk.znjsk_project.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Country implements Serializable {

    private String countryId;

    private String countryName;

    private String continent;

    private String language;

    private String englishName;
}
