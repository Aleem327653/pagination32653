package com.blk.controller;

import com.blk.model.BlackRock;
import com.blk.service.BlackRockServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blackrock")
public class BlackRockController {
    @Autowired
    private BlackRockServiceImp service;

    @GetMapping("page/{page}")
    public ResponseEntity<Page<BlackRock>> getAll(@PathVariable int page){
        try{
            Page<BlackRock> list=this.service.getAllBlackRockData(page);
            return new ResponseEntity<>(list,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("add")
    public ResponseEntity<BlackRock> addData(@RequestBody BlackRock blackRock){
        try{
            BlackRock data=this.service.addBlackRockData(blackRock);
            return new ResponseEntity<>(data,HttpStatus.CREATED);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<BlackRock> getSingleData(@PathVariable Integer id){
        try{
            BlackRock data=this.service.getSingleBlackRockData(id);
            return new ResponseEntity<>(data,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
