/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.controller;

import com.prayogi.kuis_1061.entity.identitas_1061;
import com.prayogi.kuis_1061.service.identitas_1061Service;
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
@RequestMapping("/identitas_1061")
public class identitas_1061Controller {
    @Autowired
    private identitas_1061Service identitas_1061Service;

    @RequestMapping(method = RequestMethod.POST)
    public identitas_1061 insert(@RequestBody identitas_1061 identitas_1061) {
        return identitas_1061Service.insert(identitas_1061);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public identitas_1061 update(@RequestBody identitas_1061 identitas_1061) {
        return identitas_1061Service.update(identitas_1061);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1061Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public identitas_1061 getById(@PathVariable("id") Long id){
        return identitas_1061Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<identitas_1061> getAll(){
        return identitas_1061Service.getAll();
    }
    
}
