package com.bananaapps.bananamusic.domain.user;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity

@Table(name = "user",
             uniqueConstraints= {
                @UniqueConstraint(columnNames = "email")
             })

public class User {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String password;

    private ERole role;

    public User(Integer id) {
        this.id = id;
    }


}