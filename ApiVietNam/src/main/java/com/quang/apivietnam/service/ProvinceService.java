package com.quang.apivietnam.service;

import com.quang.apivietnam.model.Province;
import com.quang.apivietnam.repository.ProvinceRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProvinceService {

    @Autowired
    ProvinceRepository repository;

    public List<Province> getAll() {
        return repository.findAll();
    }

    public Province findByID(Integer id) {
        return repository.findById(id).orElse(null);
    }
}