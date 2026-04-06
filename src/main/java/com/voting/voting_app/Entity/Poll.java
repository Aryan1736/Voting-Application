package com.voting.voting_app.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ElementCollection
    @CollectionTable(
            name = "poll_options",
            joinColumns = @JoinColumn(name = "poll_id")
    )
    private List<OptionVote> options = new ArrayList<>();

}
