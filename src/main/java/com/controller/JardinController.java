package com.controller;

import com.entities.Jardin;
import com.repository.JardinRepository;
import com.service.JardinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class JardinController {






    @Autowired
    private JardinRepository jardinDao;

    @Autowired private JardinService jardinService;

    @RequestMapping(value = "/addjardin", method = RequestMethod.POST)
    public ResponseEntity<Jardin> CreateJardin(@RequestBody Jardin jardin){

        jardinDao.save(jardin);
        return new ResponseEntity<>(jardin, HttpStatus.CREATED);

    }


    @GetMapping(value="/jardins")
    public ResponseEntity<List<Jardin>> getAllsocieties(){
        List<Jardin> jardins = jardinService.findAll();
        return  new ResponseEntity<List<Jardin>>(jardins, HttpStatus.OK);
    }

    @GetMapping(value="/jardinsUsers")
    public ResponseEntity<List<Jardin>> getAlljardins(){
        List<Jardin> jardins = jardinService.findAll();
        return  new ResponseEntity<List<Jardin>>(jardins, HttpStatus.OK);
    }


    @RequestMapping(value = "/editjardin", method = RequestMethod.POST)
    public ResponseEntity<Jardin> EditSociety(@RequestBody Jardin jardin){


        jardinDao.save(jardin);
        return new ResponseEntity<>(jardin, HttpStatus.CREATED);

    }

    @RequestMapping(value = "/deletejardin", method = RequestMethod.POST)
    public ResponseEntity<Iterable<Jardin>> DeleteSociety(@RequestParam(name = "id") Long societyId){
        jardinDao.deleteById(societyId);
        return new ResponseEntity<>(jardinDao.findAll(), HttpStatus.OK);
    }

}
