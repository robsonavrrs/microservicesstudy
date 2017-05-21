package com.example.peopleresource.domain.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PEOPLE")
public class People {

	
	public People(){
		
	}

	@Builder
	public People(Long id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	@Id
	@SequenceGenerator(name = "idGen", sequenceName = "SQ_PEOPLE")
	@GeneratedValue(generator = "idGen")
	@Column(name="ID")
	@Getter
	@Setter
	private Long id;
	
	@Column(name="NAME")
	@Getter
	@Setter
	private String nome;

}
