package com.example.board.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

    // Getters and Setters
}