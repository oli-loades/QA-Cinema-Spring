package com.qa;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Screen {

 
	@GeneratedValue("")
    private int screenNumber;
    
    
    @OneToMany(mappedBy="screenMaped", case)
    private int NumberOfSeet;

    public int getNumberOfSeet() {
        return NumberOfSeet;
    }

    public void setNumberOfSeet(int numberOfSeet) {
        NumberOfSeet = numberOfSeet;
    }

    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {
        this.screenNumber = screenNumber;
    }
  
    
  
    

}
