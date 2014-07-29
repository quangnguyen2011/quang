
public class Time2Improve
{
	private int hour;   // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// Time2 no-argument constructor: initializes each instance variable 
	// to zero; ensures that Time2 objects start in a consistent state
	public Time2Improve()
	{
		this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 no-argument constructor

	// Time2 constructor: hour supplied, minute and second defaulted to 0
	/*public Time2Improve( int h ) 
	{ 
		this( h, 0, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 one-argument constructor

	// Time2 constructor: hour and minute supplied, second defaulted to 0
	public Time2Improve( int h, int m ) 
	{ 
		this( h, m, 0 ); // invoke Time2 constructor with three arguments
	} // end Time2 two-argument constructor 

   // Time2 constructor: hour, minute and second supplied
	public Time2Improve( int h, int m, int s ) 
	{ 
		setTime( h, m, s ); // invoke setTime to validate time
	} // end Time2 three-argument constructor 

	// Time2 constructor: another Time2 object supplied
	public Time2Improve( Time2 time )
	{
		// invoke Time2 three-argument constructor
		this( time.getHour(), time.getMinute(), time.getSecond() );
	} // end Time2 constructor with a Time2 object argument*/

	// Set Methods
	// set a new time value using universal time; ensure that 
	// the data remains consistent by setting invalid values to zero
	public Time2Improve ( int theHour, int theMinute, int theSecond )
	{
		this.setHour( theHour );   // set the hour
		this.setMinute( theMinute ); // set the minute
		this.setSecond( theSecond ); // set the second
	} // end method setTime

	// validate and set hour 
	private int setHour( int h ) 
	{ 
		if ( h >= 0 && h < 24 )  return h ;
		else 
		{
			System.out.printf( "Invalid day (%d) set to 1.", h );
			return 1;
		}
	} // end method setHour

   // validate and set minute 
   private int setMinute( int m ) 
   { 
		if ( m >= 0 && m < 60 ) return m;
		else
		{
			System.out.printf( "Invalid day (%d) set to 1.", m );
			return 1;  // maintain object in consistent state
		}	  
   } // end method setMinute

   // validate and set second 
   private int setSecond( int s ) 
   { 
		if ( s >= 0 && s < 60 ) return s;
		else 
		{
			System.out.printf( "Invalid day (%d) set to 1.", s );
			return 1;  // maintain object in consistent state
		}
   } // end method setSecond

   // Get Methods
   // get hour value
   public int getHour() 
   { 
		return hour; 
   } // end method getHour

   // get minute value
   public int getMinute() 
   { 
		return minute; 
   } // end method getMinute

   // get second value
   public int getSecond() 
   { 
		return second; 
   } // end method getSecond

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString()
   {
		return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString()
   {
		//return String.format( "%d:%02d:%02d %s", 
        // ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
        // getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
		return String.format("%d:%02d:%02d",hour,minute,second);
   } // end method toString
} // end class Time2


