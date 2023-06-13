// The below is the original code:
// Perform the following changes, change the InstanCounter to print "I am instance No 1-4" 
/* Public class InstCounterTest {
	Public static void main (String [] args) {
		New InstanceCounter();
		New InstanceCounter();
	}

} 
*/

public class InstanceCounterTest {
	public static void main (String [] args) {
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		new InstanceCounter();
		
	}
}