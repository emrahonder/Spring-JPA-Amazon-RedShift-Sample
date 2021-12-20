package com.nioya.redshiftdemo.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "cities")
@Entity
public class City {

    @Id
    public int id;
    public String name;

}
