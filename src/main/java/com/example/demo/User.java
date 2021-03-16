/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

/**
 *
 * @author samue
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
	private Long id;
	private String name;
	private String data;
        private String foto;
    
	

	protected User() {
	}

	protected User(Long id, String name, String data, String foto) {
		super();
		this.id = id;
		this.name = name;
		this.data = data;
		this.foto = foto;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        public void setData(String data) {
          this.data = data;
        }

        public void setFoto(String foto) {
            this.foto = foto;
        }

        public String getData() {
            return data;
        }

        public String getFoto() {
            return foto;
        }
	
	
}

