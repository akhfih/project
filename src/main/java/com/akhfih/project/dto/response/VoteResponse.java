package com.akhfih.project.dto.response;

import com.akhfih.project.entity.Candidate;
import com.akhfih.project.entity.Election;
import com.akhfih.project.entity.Voter;

public class VoteResponse {
    private Voter vote;
    private Candidate candidate;
    private Election election;
}
