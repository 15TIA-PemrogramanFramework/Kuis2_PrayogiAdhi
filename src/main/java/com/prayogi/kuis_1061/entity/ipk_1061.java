/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prayogi.kuis_1061.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa 20
 */
@Entity
@Table(name = "ipk_1061")
public class ipk_1061 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nama;
    @Column(length = 100, nullable = true)
    private String nilai;
    @Column(length = 100, nullable = true)
    private String prodi;
    @ManyToOne
    private identitas_1061 identitas_1061;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
    
    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    public identitas_1061 getIdentitas_1061(){
        return identitas_1061;
    }
    
     public void setIdentitas_1061(identitas_1061 identitas_1061) {
        this.identitas_1061 = identitas_1061;
    }
}
