// Bai 1
package people;

import java.util.*; // program uses class Scanner
 
public class Date
 {
 private int month; // 1-12
 private int day; // 1-31 based on month
 private int year; // any year

 // constructor: call checkMonth to confirm proper value for month;
 // call checkDay to confirm proper value for day
 public int getDay()
 {
	return day;
 }
 public int getMonth()
 {
	return month;
 }
 public int getYear()
 {
	return year;
 }
 public Date( int theDay, int theMonth, int theYear )
 {
	month = checkMonth(theMonth ); // validate month
	year = theYear; // could validate year
	day = checkDay(theDay ); // validate day
	//System.out.printf( "Date object constructor for date %s\n", this );
 } // end Date constructor
public Date(String mon,int theDay,int theYear)
 {
     int theMonth;
     if (mon == "January") theMonth = 1;
     else if (mon == "February") theMonth = 2;
     else if (mon == "March") theMonth = 3;
     else if (mon == "April") theMonth = 4;
     else if (mon == "May") theMonth = 5;
     else if (mon == "June") theMonth = 6;
     else if (mon == "July") theMonth = 7;
     else if (mon == "August") theMonth = 8;
     else if (mon == "September") theMonth = 9;
     else if (mon == "November") theMonth = 10;
     else if (mon == "October") theMonth = 11;
     else if( mon == "December") theMonth = 12;
     else theMonth = 0;
     month = theMonth ; // validate month
     year = checkYear(theYear); // could validate year
     day = theDay ; // validate day    
 }
public Date(int dayth , int theYear)
{
    int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int tg = 0,theMonth = 0,theDay = 0;
    if((theYear%400 == 0||( theYear%4 == 0 && theYear%100 != 0)) && dayth > 60 ) 
    {
        dayth = dayth - 1;
        for( int i = 0 ; i <= 12 ; i++)
    {
        tg = tg + days[i];
        if (tg >= dayth) 
        {
            theMonth = i ;
            theDay = dayth - tg + days[i];
            break;
        }
    }
    }
    else if(( theYear%400 == 0||(theYear%4 == 0 && theYear%100 != 0))&& dayth == 60) 
    {
        theMonth = 2;
        theDay = 29;
    }
    else
  {
    for(int i=0 ; i<=12 ; i++)
    {
        tg = tg + days[i];
        if ( tg >= dayth) 
        {
            theMonth = i-1;
            theDay = dayth-tg +days[i];
            break;
        }
    }
  }
     month = theMonth ; // validate month
     year = checkYear(theYear); // could validate year
     day = theDay ; // validate day 
}
        
 public Date()
 {
     month = 0;
     day = 0;
     year = 0;
 
 }
 
public boolean equals( Date B)
{
    if ( month == B.month && day == B.day && year == B.year) return true;
    return false;
}
// utility method to confirm proper month value



 private int checkYear (int testYear)
 {
     if ( testYear > 0)
         return testYear;
     else 
         {
             // System.out.printf(
              //"Invalid year (%d) set to 1.", testYear );
               return 1; // maintain object in consistent state
         } // //end else
 }
 
 
 
 
 private int checkMonth( int testMonth )
 {
 if ( testMonth > 0 && testMonth <= 12 ) // validate month
 return testMonth;
 else // month is invalid
 {
 //System.out.printf("Invalid month (%d) set to 1.", testMonth );
 return 1; // maintain object in consistent state
 } // end else
 } // end method checkMonth

 // utility method to confirm proper day value based on month and year
 
 
 
 private int checkDay( int testDay )
 {
 int daysPerMonth[] =
 { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

 // check if day in range for month
 if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
 return testDay;

 // check for leap year
 if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
 ( year % 4 == 0 && year % 100 != 0 ) ) )
 return testDay;

//System.out.printf( "Invalid day (%d) set to 1.", testDay );
 return 1; // maintain object in consistent state
} // end method checkDay




 // return a String of the form month/day/year
 public String toString()
 {
 return String.format( "%d/%d/%d", month, day, year );
} // end method toString




 public void out1()
 {
     System.out.printf("%d/%d/%d \n",month,day,year);
 }
 
 
 
 public void out2()
 {
     if (month == 1)
     {
         System.out.printf("January %d,%d\n",day,year);
     }
            
     else  if (month == 2)
     {
         System.out.printf("February %d,%d\n",day,year);
     } 
     else if (month == 3)
     {
         System.out.printf("March %d,%d\n",day,year);
     }  
     else if (month == 4)
     {
         System.out.printf("April %d,%d\n",day,year);
     }
     else if (month == 5)
     {
         System.out.printf("May %d,%d\n",day,year);
     }
     else if (month == 6)
     {
         System.out.printf("June %d,%d\n",day,year);
     }
     
     else  if (month == 7)
     {
         System.out.printf("July %d,%d\n",day,year);
     }
     else  if (month == 8)
     {
         System.out.printf("August %d,%d\n",day,year);
     }
     else if (month == 9)
     {
         System.out.printf("September %d,%d\n",day,year);
     } 
     else if (month == 10)
     {
         System.out.printf("October %d,%d\n",day,year);
     }
     else if (month == 11)
     {
         System.out.printf("November %d,%d\n",day,year);
     }
     else if (month == 12)
     {
         System.out.printf("December %d,%d\n",day,year);
     }
 }
 
 
 
 void out3()
 {
     int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int tg = 0;
    for (int i=0;i<month;i++)
        tg  = tg+days[i];
    tg = tg + day;
    if ( month > 2  && ( year % 400 == 0 ||
 ( year % 4 == 0 && year % 100 != 0 ) ) ) tg = tg + 1;
    System.out.printf("%d %d\n",tg,year);
 }
 
 
 
 public Date nextDay()
 {
     //Date C ;
    if (month == 2 && day == 29 && (year % 400 == 0 ||
         ( year % 4 == 0 && year % 100 != 0 )
            ) ) 
    {
        day = 1;
        month = 3;
       
    }
    else
            if( day == 28  &&  month == 2)
                {
                    day = 1;
                    month = 3;
                   
                }
    else 
            if ((day == 31) && (month == 1 ||month == 3||month == 5||month == 7||month == 8||month == 10))
                {
                    day = 1;
                    month =month+1;
                  
                }
    else 
            if ((day == 31) && month == 12)
                {
                   day = 1;
                   month = 1;
                    year = year + 1; 
                }
    else
            if ((day == 30) && (month == 4||month == 6||month == 9||month == 11))
                {
                    day = 1;
                    month = month + 1;
                   
                }
     
                
    else
                {
                    day = day + 1;
                   
                    
                }
    return this;
 }
 }
 