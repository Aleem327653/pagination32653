package com.blk.repository;

import com.blk.model.BlackRock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlackRockRepository extends JpaRepository<BlackRock,Integer> {
}
