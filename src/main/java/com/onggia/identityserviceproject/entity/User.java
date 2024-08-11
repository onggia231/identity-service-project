package com.onggia.identityserviceproject.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    @Column(name = "username", unique = true, columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_ci")
    String username;

    String password;
    String firstName;
    String lastName;
    LocalDate dob;

    //    // @Column(name = "email", unique = true, columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_ci")
    //    @Column(name = "email", unique = false, columnDefinition = "VARCHAR(255) COLLATE utf8mb4_unicode_ci") // thay
    // unique = false de test ko bi loi Duplicate
    //    String email;
    //
    //    @Column(name = "email_verified", nullable = false, columnDefinition = "boolean default false")
    //    boolean emailVerified;

    @ManyToMany
    Set<Role> roles;
}
