/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.service;

import com.prayogi.kuis_1061.entity.identitas_1061;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prayogi.kuis_1061.entity.ipk_1061;
import com.prayogi.kuis_1061.repo.ipk_1061Repo;

/**
 *
 * @author Mahasiswa 20
 */
@Service("ipk_1061Service")

@Transactional
public class ipk_1061Service {
    @Autowired
    private ipk_1061Repo repo;

    public ipk_1061 insert(ipk_1061 ipk_1061) {
        return repo.save(ipk_1061);
    }
    
    public ipk_1061 update(ipk_1061 ipk_1061) {
        return repo.save(ipk_1061);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }
    
     public ipk_1061 getById(Long id){
        return repo.findOne(id);
    }
     
    public List<ipk_1061> getAll(){
        return repo.findAllipk_1061();
    }
    
    public List<ipk_1061> findAll() {
        return repo.findAllipk_1061();
    }

    public List<ipk_1061> findByidentitas_1061(Long identitas_1061Id) {
        return repo.findByidentitas_1061(identitas_1061Id);
    }

    public List<ipk_1061> findByNama(String nama) {
        return repo.findByNama("%" + nama + "%");
    }
    
    public List<ipk_1061> findByProdi(String prodi) {
        return repo.findByProdi("%" + prodi + "%");
    }
    
}
