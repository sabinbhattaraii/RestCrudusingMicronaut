package com.restcrud.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@ToString
@Table(name = "intern")
public class InternEntity {
    @Id
    private UUID id;
    @Column
    private String fullname;
    @Column
    private String address;
}
