/*
	Program to simulate the calculation of the average, 
        the lowest and highest temperatures of the year.
	Author: Amirkhan Mukashev. Sudent, ID: 6605412.
	E-mail Address: am25524@email.vccs.edu.
	Programming Assignment #3.
	Date Modified: 15/02/2015.
*/
package temperature;
import java.util.Scanner;
public class Temperature 
{
/*
    Problem Statement:
    
A method named inputTempForMonth whose purpose is to input a high and a low 
    temperature for a specific month. The month and the array of temperatures will 
    both be passed as input arguments to the method. The method will not have a 
    return value.
A method named inputTempForYear whose purpose is to input a high and a low 
    temperature for every month of the year. There are no input arguments for 
    this method, but the method does return a completed multidimensional array 
    of temperatures for the year.
A method named calculateAverageHigh whose purpose is to calculate the average 
    high temperature for the year. This method will take the array of temperatures 
    as input and will return the average high temperature for the year.
A method named calculateAverageLow whose purpose is to calculate the average low 
    temperature for the year. This method will take the array of temperatures as 
    input and will return the average low temperature for the year.
A method named findHighestTemp whose purpose is to return the index value of the 
    highest temperature for the year. If the highest temperature of the year 
    occurs more than once in the year, then the method should return the index 
    of the first month that had the temperature. The method will take the 
    array of temperatures as an input argument and return the index of the 
    highest temperature.
A method named findLowestTemp whose purpose is to return the index value of the 
    lowest temperature for the year. If the lowest temperature of the year 
    occurs more than once in the year, then the method should return the index 
    of the first month that had the temperature. The method will take the array 
    of temperatures as an input argument and return the index of the lowest 
    temperature.
A main method that uses the previous methods to determine the average high 
    temperature, average low temperature, and highest and lowest temperatures 
    for the year. The main method must print out these average temperatures as 
    well as the month and temperature for the highest and lowest temperatures 
    for the year.
    
    Use the following input values for the final test of this program:
January has a High of 40 and Low of -10
February has a High of 55 and Low of 25
March has a High of 60 and Low of 40
April has a High of 88 and Low of 20
May has a High of 72 and Low of 55
June has a High of 95 and Low of 80
July has a High of 97 and Low of 87
August has a High of 110 and Low of 98
September has a High of 79 and Low of 68
October has a High of 31 and Low of 30
November has a High of 58 and Low of -25
December has a High of 32and Low of -20
    */

    // Intiatization
    public static int temperature[][] = new int [12][2];
    public static final String[]MONTHS = {"January","February","March","April","May","June", "\nJuly","August","September","October","November","December"};
    static Scanner keyboard = new Scanner(System.in);
    
    
    public static void inputTempForMonth(int month)
    {
        //user input
        System.out.println("Input the highest temperature of the " + MONTHS[month]);
        temperature[month][0] = keyboard.nextInt();
        
        System.out.println("Input the lowest temperature of the " + MONTHS[month]);
        temperature[month][1] = keyboard.nextInt();
    }
    
    
    public static void  inputTempForYear()
    {
        for (int i = 0; 12>i; i++)
            inputTempForMonth(i);
    }
    
    
    
    public static int calculateAverageHigh()
    {
        int sumOfMaxTemperatures = 0;
       
        for(int i = 0; i < temperature.length; i++)
            sumOfMaxTemperatures = (sumOfMaxTemperatures + temperature[i][0]);
        
       return (sumOfMaxTemperatures/temperature.length);    
    }
    
    
    public static int calculateAverageLow()
    {
        int sumOfMinTemperatures = 0;
        
        for(int i = 0; i < temperature.length; i++)
                  sumOfMinTemperatures = (sumOfMinTemperatures - temperature[i][1]) ;
            return (-(sumOfMinTemperatures/temperature.length));    
    }
    
    
    public static int findHighestTemp()
    {
        int maxOfTheYear = 0;
	int maxOfTheMonth = 0;
	for (int i=0; i<temperature.length; i++)
			while (temperature[i][0] > maxOfTheYear) 
                        {
				maxOfTheYear = temperature[i][0];
				maxOfTheMonth = i;
			}
        return maxOfTheMonth;
    }
    
    
    public static int findLowestTemp()
    {
        int minOfTheYear = 0;
	int minOfTheMonth = 0;
	for (int num=0; num < temperature.length; num++)
			if (temperature[num][1] < minOfTheYear) 
                        {
				minOfTheYear = temperature[num][1];
				minOfTheMonth = num;
			}
         return minOfTheMonth;               
         
    }
    
    
    
         public static void main(String[] args) 
    {
         //Output Console
        inputTempForYear();
       System.out.println("The average maximum temperature is " + calculateAverageHigh());
       System.out.println("The average minimum temperature is " + calculateAverageLow());
       System.out.println("The highest temperature was in  " + MONTHS[findHighestTemp()]);
       System.out.println("The lowest temperature was in " + MONTHS[findLowestTemp()]);
		
    }
     
		
}
 


        
            
        
        
        
    
    

