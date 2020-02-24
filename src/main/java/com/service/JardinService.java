package com.service;

import com.entities.Jardin;


import java.util.List;


public interface JardinService {
    Jardin save(Jardin society);
    List<Jardin> findAll();
    Jardin findBySocietyId(long jardinId);
}
