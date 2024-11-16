package org.yakov.model;

import jakarta.persistence.*;
import lombok.*;
import org.yakov.model.enums.CoffeeType;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table
public class Coffee extends Beverage{
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private CoffeeType type;

    @Column(nullable = false)
    @NonNull
    private Boolean cold;
}
