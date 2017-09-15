package com.itransition.profunding.model.db;

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
    @Column(name = "tag_name")
    private String tagName;

    @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    private Set<Project> projects;

}
