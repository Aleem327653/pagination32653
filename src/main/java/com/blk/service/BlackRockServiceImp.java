package com.blk.service;

import com.blk.model.BlackRock;
import com.blk.repository.BlackRockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class BlackRockServiceImp implements BlackRockService {
    @Autowired
    private BlackRockRepository repository;

    @Override
    public BlackRock addBlackRockData(BlackRock blackRock) {
        return repository.save(blackRock);
    }

    @Override
    public Page<BlackRock> getAllBlackRockData(int pageNumber) {
       Sort sort= Sort.by("groupName");
        Pageable pageable =PageRequest.of(pageNumber,3,sort);
        Page<BlackRock> page= repository.findAll(pageable);
        return page;
    }

    @Override
    public BlackRock getSingleBlackRockData(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
