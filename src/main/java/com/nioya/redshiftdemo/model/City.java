package com.nioya.redshiftdemo.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "cities")
@Entity
public class City {
    @Id
    public int id;
    public String name;
}
