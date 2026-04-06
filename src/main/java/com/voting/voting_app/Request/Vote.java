package com.voting.voting_app.Request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Vote {

    private Long pollId;
    private int optionIndex;
}
