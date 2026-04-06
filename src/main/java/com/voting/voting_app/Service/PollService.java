package com.voting.voting_app.Service;

import com.voting.voting_app.Entity.OptionVote;
import com.voting.voting_app.Entity.Poll;
import com.voting.voting_app.Repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public Poll createPoll(Poll poll) {
        for (OptionVote option : poll.getOptions()) {
            if (option.getVoteCount() == null) {
                option.setVoteCount(0L);
            }
        }
        return pollRepository.save(poll);
    }


    public List<Poll> getAllPolls() {
        return pollRepository.findAll();
    }

    public Optional<Poll> getPollById(Long id) {
        return pollRepository.findById(id);
    }

    public void vote(Long pollId, int optionIndex) {
        // get poll from db
        Poll poll = pollRepository.findById(pollId)
                .orElseThrow(() -> new RuntimeException("Poll not found"));

        // get all options
        List<OptionVote> options = poll.getOptions();

        // if index for vote is not valid, throw error
        if(optionIndex<0 || optionIndex>=options.size())
            throw new IllegalArgumentException("Invalid option index");

        // get selected option
        OptionVote selectedOption = options.get(optionIndex);

        // increment vote for selected option
        selectedOption.setVoteCount(selectedOption.getVoteCount()+1);

        // save incremented option in db
        pollRepository.save(poll);
    }
}
