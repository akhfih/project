package com.akhfih.project.service;

import com.akhfih.project.dto.request.VoterRequest;
import com.akhfih.project.dto.response.VoterResponse;

import java.util.List;

public interface VoterService {
    VoterResponse create(VoterRequest voterRequest);
    VoterResponse getById(String id);

    List<VoterResponse> getAl();

    VoterResponse update(VoterResponse voterResponse);

    void delete (String id);
}
