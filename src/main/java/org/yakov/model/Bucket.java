package org.yakov.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ToString.Exclude
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bucket")
    @Cascade(value = org.hibernate.annotations.CascadeType.DELETE)
    private  List<Beverage> beverages;
}
