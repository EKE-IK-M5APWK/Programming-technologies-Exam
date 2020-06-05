package common;

import details.Grades;
import exceptions.NotValidValue;

public class PowerSupply {
	
	// Variables 
	private Grades grade;
    private double wat;
    private boolean modular;
    private double size;
    
	
	//Methods
	public PowerSupply(Grades grade,double wat, double size,boolean modular) {
		setGrade(grade);
		setSize(size);
		setWat(wat);
		setModular(modular);
	}
	public String getPowerSupply() {
		return "Power Supply Details: " +String.valueOf(wat)+"wat powersupply with "+String.valueOf(grade)+ "grade," + (getModular() ? "Modular " : "Not Modular ")+",Size:"+String.valueOf(size);
	}
	public void setWat(double wat) {
        if(wat<=65 || wat>=1600) {throw new NotValidValue("Powersupply Wat capacity is incorrect!");}
        else this.wat = wat;
    }

    public double getWat() {
        return wat;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    public Grades getGrade() {
        return grade;
    }

    public void setSize(double size) {
        if(85>= size) {throw new NotValidValue("Powersupply size is incorrect!");}
        else this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }

    public boolean getModular() {
        return modular;
    }

    public PowerSupply DeepCopy(){
        PowerSupply clone=new PowerSupply(this.getGrade(),this.getWat(),this.getSize(),this.getModular());
        clone.setGrade(this.getGrade());
        clone.setWat(this.getWat());
        clone.setSize(this.getSize());
        clone.setModular(this.getModular());
        return clone;
}

}
