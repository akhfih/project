package com.akhfih.project.repository;

import com.akhfih.project.entity.Voter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VoterRepository extends JpaRepository<Voter, String> {

}
