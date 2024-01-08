package com.akhfih.project.service.impl;

import com.akhfih.project.dto.request.VoterRequest;
import com.akhfih.project.dto.response.VoterResponse;
import com.akhfih.project.service.VoterService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;

@RequiredArgsConstructor
public class VoterServiceImpl implements VoterService {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public VoterResponse create(VoterRequest voterRequest) {
        return null;
    }

    @Override
    public VoterResponse getById(String id) {
        return null;
    }

    @Override
    public List<VoterResponse> getAl() {
        return null;
    }

    @Override
    public VoterResponse update(VoterResponse voterResponse) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
