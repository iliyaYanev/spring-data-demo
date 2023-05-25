package com.example.springdata.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tables")
@NoArgsConstructor
@Getter
@Setter
public class Tables extends BaseEntity {

    @Column(nullable = false)
    private Integer floor;

    private Boolean reserved;

    @Column(nullable = false)
    private Integer capacity;
}
