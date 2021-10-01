package by.patsei.sfpetclinic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;

}
