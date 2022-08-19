package com.znjsk.znjsk_project.pojo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Contract implements Serializable {

    private String contractId;

    private String contractName;

    private String proId;

    private Double contractNum;

    private LocalDate contractDate;

    private String contractType;

    private LocalDate startTime;

    private LocalDate endTime;

    private Integer workdays;


}
