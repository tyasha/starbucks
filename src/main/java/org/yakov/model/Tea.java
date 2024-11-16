package org.yakov.model;

import jakarta.persistence.*;
import lombok.*;
import org.yakov.model.enums.TeaType;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table
public class Tea extends Beverage{

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TeaType type;

    @Column(nullable = false)
    @NonNull
    private Integer age;
}
