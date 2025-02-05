package com.blk.service;

import com.blk.model.BlackRock;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BlackRockService {
    public BlackRock addBlackRockData(BlackRock blackRock);
    public Page<BlackRock> getAllBlackRockData(int pageNumber);
    public BlackRock getSingleBlackRockData(Integer id);
}
