/**
 * Created by Igor on 03/14/2017.
 *
 * Dog class with ability to create a Dog.
 * It also has methods that generate Name, Age or Size of a Dog.
 */
package two;

import java.util.Random;

public class Dog {

	String name;
	private String size;
	private int age;

	/**
	 * Constructor where all parameters have to be specified
	 * @param name is a name of a Dog
	 * @param size is a size of a Dog
	 * @param age is a age of a Dog
	 */
	private Dog(String name, String size, int age) {
		setName(name);
		setSize(size);
		setAge(age);
	}

	/**
	 * Constructor where name and size parameters have to be specified
	 * @param name is a name of a Dog
	 * @param size is a size of a Dog
	 */
	Dog(String name, String size) {
		this(name,size,0);
	}

	/**
	 * Constructor where name parameter has to be specified
	 * @param name is a name of a Dog
	 */
	Dog(String name) {
		this(name, null, 0);
	}

	/**
	 * Default constructor
	 */
	Dog(){
		this(null, null, 0);
	}

	/**
	 * Method to return name for a Dog
	 * @return name
	 */
	String getName() {
        return name;
    }

	/**
	 * Method to return size for a Dog
	 * @return size
	 */
	String getSize() {
        return size;
    }

	/**
	 * Method to return age for a Dog
	 * @return age
	 */
	int getAge() {
        return age;
    }

	/**
	 * Method to generate name for a Dog if it's not specified as a parameter
	 * @param name is name for a Dog
	 */
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

	/**
	 * Method to generate size for a Dog if it's not specified as a parameter
	 * @param size is size for a Dog
	 */
	private void setSize(String size) {
    	if (size!=null){
        	this.size = size;}
        else {
    	String [] sizes = {"Small", "Medium", "HulkSize"};
        Random pes = new Random();
        int select = pes.nextInt(sizes.length); 
        this.size = sizes[select];}
    }

	/**
	 * Method to generate age for a Dog if it's not specified as a parameter
	 * @param age is age for a Dog
	 */
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

	/**
	 * Overriding toString method for our Dog class
	 * @return Dog object with name, age and size data
	 */
	@Override
	public String toString() {
    	        return "Dog {Name: '" + name + "', Size: '" + size + "', Age: '" + age + "'}";
    	    }	
}
