package two;

import java.util.Random;

public class Dog {

	String name;
	private String size;
	private int age;

	private Dog(String name, String size, int age) {
		setName(name);
		setSize(size);
		setAge(age);
	}

	Dog(String name, String size) {
		this(name,size,0);
	}

	Dog(String name) {
		this(name, null, 0);
	}

	Dog(){
		this(null, null, 0);
	}

	String getName() {
        return name;
    }
	String getSize() {
        return size;
    }
	int getAge() {
        return age;
    }

	private void setName(String name) {
        if (name != null){
        	this.name = name;
        }
        else {
        	String[] Names = {"Flash","Captain","Leo","Fluffy","Chewie"};
			Random r = new Random();
			int nameNumber = r.nextInt (Names.length);
			this.name = Names[nameNumber];
			}
    }

	private void setSize(String size) {
    	if (size!=null){
        	this.size = size;}
        else {
    	String [] sizes = {"Small", "Medium", "HulkSize"};
        Random pes = new Random();
        int select = pes.nextInt(sizes.length); 
        this.size = sizes[select];}
    }

	private void setAge(int age) {
    		if (age != 0){
            	this.age = age;}
            else {
            	Random r = new Random();
            	int ageHere = r.nextInt (20);
            	if (ageHere == 0){
            		ageHere = ageHere+1;}
            	this.age = ageHere;
            }
        }

	@Override
	public String toString() {
    	        return "Dog {Name: '" + name + "', Size: '" + size + "', Age: '" + age + "'}";
    	    }	
}
