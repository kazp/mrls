package two;

import java.util.Random;
// класс для собак
public class Dog {
	public String name;
	public String size;
	public int age;
	
	public Dog(String name, String size, int age) {
		setName(name);
		setSize(size);
		setAge(age);
	}

	public Dog(String name, String size) {
		this(name,size,0);
	}

	public Dog(String name) {
		this(name, null, 0);
	}
	public Dog(){
		this(null, null, 0);
	}
	public String getName() {
        return name;
    }
	public String getSize() {
        return size;
    }
	public int getAge() {
        return age;
    }
    public void setName(String name) {
        if (name != null){
        	this.name = name;
        }
        else {
        	String [] Names = {"Flash","Captain","Leo","Fluffy","Chewie"};
			Random r = new Random();
			int nameNumber = r.nextInt (Names.length);
			String Name = Names [nameNumber];
			this.name = Name;
			}
    }

    public void setSize(String size) {
    	if (size!=null){
        	this.size = size;}
        else {
    	String [] sizes = {"Small", "Medium", "HulkSize"};
        Random pes = new Random();
        int select = pes.nextInt(sizes.length); 
        String sizeRandomized = sizes[select];
        this.size = sizeRandomized;}
    }
    	public void setAge(int age) {
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
