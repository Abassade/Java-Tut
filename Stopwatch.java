package A;

/**
 A class to measure time elapsed.
*/

public class Stopwatch
{
    
    private static long startTime;
    private static long stopTime;

    public static final double NANOS_PER_SEC = 1000000000.0;

	/**
	 start the stop watch.
	*/
	public static void start(){
		startTime = System.nanoTime();
	}

	/**
	 stop the stop watch.
	*/
	public static void stop()
	{	stopTime = System.nanoTime();	}

	/**
	elapsed time in seconds.
	@return the time recorded on the stopwatch in seconds
	*/
	public static int time()
	{	return (int)((stopTime - startTime) / NANOS_PER_SEC);	}

	/**
	elapsed time in nanoseconds.
	@return the time recorded on the stopwatch in nanoseconds
	*/
	public static long timeInNanoseconds()
	{	return (stopTime - startTime);	}
}

