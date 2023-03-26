package com.hibernate.Mapping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
	public class Product {
	@Id
    @SequenceGenerator(name="seq",sequenceName="postgresql_seq")        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq") 
		private Integer id;
	    private String name;
	    private float price;
	    @OneToOne(mappedBy = "prod")
		 private Student student;
	    public Product() {
	    }
	    
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
	}

