package com.itransition.profunding.model.DB;

import lombok.*;

import javax.persistence.*;

/**
 * @author v.tarasevich
 * @version 1.0
 * @since 07.09.2017 3:31
 */
@Entity
@Table(name = "project_news")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProjectNews {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_news_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project rootProject;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;
}
