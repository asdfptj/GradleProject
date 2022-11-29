package com.example.SpringBootTest.service;

import java.util.List;

import com.example.SpringBootTest.dao.DbMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootTest.dto.TestDTO;

import java.util.List;

@Service
public class DbService {
    @Autowired
    DbMapper dbMapper;

    public List<TestDTO> getList() throws Exception{

        List<TestDTO> test = dbMapper.getList();
        return test;

    }
}