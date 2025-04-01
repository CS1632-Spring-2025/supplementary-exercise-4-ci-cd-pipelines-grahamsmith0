package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id;
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void rentCat() {
		isRented = true;
	}

	public void returnCat() {
		isRented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return isRented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}

}