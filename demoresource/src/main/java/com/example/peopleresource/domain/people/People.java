package com.example.peopleresource.domain.people;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PEOPLE")
@Builder
public class People {

	
	public People(){
		
	}
	
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
