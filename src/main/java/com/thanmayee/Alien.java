package com.thanmayee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "aliens")
public class Alien {
	private Integer id;
	private String name;
	private String colour;

	@Id
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", colour=" + colour + "]";
	}
}
