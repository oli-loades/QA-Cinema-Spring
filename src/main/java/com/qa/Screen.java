package com.qa;
import javax.persistence.*;

@Entity
@Table
public class Screen {

 
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int screenNumber;
	private int numberOfSeats;


    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    //@OneToMany(mappedBy="screenMaped", targetEntity = Seet.class)
    private int NumberOfSeet;

    public int getNumberOfSeet() {
        return NumberOfSeet;
    }


    public void setNumberOfSeet(int numberOfSeet) {


        oneToOne
        this.NumberOfSeet = numberOfSeet;
    }


    public int getScreenNumber() {
        return screenNumber;
    }

    public void setScreenNumber(int screenNumber) {

        this.screenNumber = screenNumber;
    }
  

    

}
