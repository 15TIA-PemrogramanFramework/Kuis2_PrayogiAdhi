/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.service;

import com.prayogi.kuis_1061.entity.identitas_1061;
import com.prayogi.kuis_1061.repo.identitas_1061Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa 20
 */
@Service("identitas_1061Service")
@Transactional
public class identitas_1061Service {
    
    @Autowired
    private identitas_1061Repo repo;

    public identitas_1061 insert(identitas_1061 identitas_1061) {
        return repo.save(identitas_1061);
    }
    
    public identitas_1061 update(identitas_1061 identitas_1061) {
        return repo.save(identitas_1061);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public identitas_1061 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<identitas_1061> getAll(){
        return repo.findAllidentitas_1061();
    }
    
}
