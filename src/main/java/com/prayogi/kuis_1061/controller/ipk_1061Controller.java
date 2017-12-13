/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.controller;

import com.prayogi.kuis_1061.entity.identitas_1061;
import com.prayogi.kuis_1061.entity.ipk_1061;
import com.prayogi.kuis_1061.repo.ipk_1061Repo;
import com.prayogi.kuis_1061.service.ipk_1061Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa 20
 */
@RestController
@RequestMapping("/ipk_1061")
public class ipk_1061Controller {
    @Autowired
    private ipk_1061Service ipk_1061Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public ipk_1061 insert(@RequestBody ipk_1061 ipk_1061) {
        return ipk_1061Service.insert(ipk_1061);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ipk_1061 update(@RequestBody ipk_1061 ipk_1061) {
        return ipk_1061Service.update(ipk_1061);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1061Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ipk_1061 getById(@PathVariable("id") Long id){
        return ipk_1061Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ipk_1061> getAll(){
        return ipk_1061Service.getAll();
    }
}
