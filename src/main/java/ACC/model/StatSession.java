package ACC.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class StatSession {
	public int session_TYPE = AC_SESSION_TYPE.AC_UNKNOWN; 
	public Map<Integer,StatLap> laps = new HashMap<>();

	public CircularFifoQueue<StatLap> last3Laps = new CircularFifoQueue<>(3);
	public CircularFifoQueue<StatLap> last5Laps = new CircularFifoQueue<>(5);
	
	public StatLap bestLap = new StatLap();
	public StatLap lastLap = new StatLap();
	public StatLap currentLap = new StatLap();
	
	public StatCar car = new StatCar();
	
	public int bestTime = 0;
	
	public float sessionTimeLeft = 0;
	
	public float fuelNTFOnEnd = 0;
	public float fuelEFNMinutesOnEnd = 0;
	public float fuelEFNLapsOnEnd = 0;
	public float fuelAVGPerLap = 0;
	
}