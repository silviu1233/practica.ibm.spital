package com.ibm.practica.spital.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="analysis")
public class Analysis {
    @Id
    @NotNull
    @Column(name="pacient_id")
    private String id;
    @NotNull
    @Column(name="pacient_id")
    private String pacientID;
    @NotNull
    @Column(name="harvesttimedate")
    private String harvesttimedate;
    @NotNull
    @Column(name="value")
    private int value;
    @NotNull
    @Column(name="minvalue")
    private int minvalue;
    @NotNull
    @Column(name="maxvalue")
    private int maxvalue;




}
