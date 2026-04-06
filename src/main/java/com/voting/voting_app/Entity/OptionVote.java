package com.voting.voting_app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class OptionVote {

    @Column(name = "option_text")
    private String optionText;

    @Column(name = "vote_count")
    private Long voteCount = 0L;
}