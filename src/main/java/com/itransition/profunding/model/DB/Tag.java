package com.itransition.profunding.model.DB;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author v.tarasevich
 * @version 1.0
 * @since 07.09.2017 1:47
 */
@Entity
@Table(name = "tags")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private Long id;

    @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    private Set<Project> projects;
}
