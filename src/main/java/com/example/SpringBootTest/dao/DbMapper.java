package com.example.SpringBootTest.dao;

import java.util.List;
import com.example.SpringBootTest.dto.TestDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface DbMapper {
    public List<TestDTO> getList() throws Exception;
}
