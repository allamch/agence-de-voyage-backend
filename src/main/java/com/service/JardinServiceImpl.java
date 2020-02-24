package com.service;

import com.entities.Jardin;
import com.repository.JardinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


@Service
@Transactional
public class JardinServiceImpl implements JardinService {
    @Autowired
    JardinRepository jardinRepository;
    @Override
    public Jardin save(Jardin jardin){
        jardin.setCreatedDate(new Date());
        return jardinRepository.save(jardin);
    }

    @Override
    public List<Jardin> findAll() {
        return (List<Jardin>) jardinRepository.findAll();
    }

    @Override
    public Jardin findBySocietyId(long jardinId) {
        return jardinRepository.findByJardinId(jardinId);
    }
}
