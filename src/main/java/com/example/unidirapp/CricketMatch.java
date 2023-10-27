package com.example.unidirapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class CricketMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int matchId;

    String matchName;

    String team1;

    String team2;
}
