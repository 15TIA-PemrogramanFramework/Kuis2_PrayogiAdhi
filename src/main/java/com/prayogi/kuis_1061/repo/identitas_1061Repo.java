/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.prayogi.kuis_1061.entity.identitas_1061;

/**
 *
 * @author Mahasiswa 20
 */
public interface identitas_1061Repo extends CrudRepository<identitas_1061, Long> {

    @Query("select i from identitas_1061 i")
    public List<identitas_1061> findAllidentitas_1061();
    
}
