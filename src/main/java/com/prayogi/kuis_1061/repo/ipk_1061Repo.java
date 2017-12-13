/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.prayogi.kuis_1061.entity.ipk_1061;

/**
 *
 * @author Mahasiswa 20
 */
public interface ipk_1061Repo extends CrudRepository<ipk_1061, Long>{
    
    @Query("select k from ipk_1061 k")
    public List<ipk_1061> findAllipk_1061();
    
    @Query("select k from ipk_1061 k where k.identitas_1061.id= :id")
    public List<ipk_1061> findByidentitas_1061(@Param("id") Long id);
    
    @Query("select k from ipk_1061 k where LOWER(k.nama) LIKE LOWER(:nama)")
    public List<ipk_1061> findByNama(@Param("nama") String nama);
    
    @Query("select k from ipk_1061 k where LOWER(k.prodi) LIKE LOWER(:prodi)")
    public List<ipk_1061> findByProdi(@Param("prodi") String prodi);
    
}
