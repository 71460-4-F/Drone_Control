
public class Drone {
	int speed = 0;
	int speedMax = 15;
	int speedMin  = 0;
	boolean on = false;
	boolean turnLeft = false;
	boolean turnRight = false;
	boolean up = false;
	boolean down = false;
	
	public void turnOnDrone() {
		if(on == false) {
			on = true;
		}
	}
	
	public void turnOffDrone() {
		if(on == true) {
			on = false;
			speed = 0;
			up = false;
			down = false;
			turnRight = false;
			turnLeft = false;
		}
	}
	
	public int speedUpDrone() {
		if(on == true && speed < 15) {
			speed ++;
		}
		return speed;
	}
	
	public int speedDownDrone() {
		if(on == true && speed > 0) {
			speed --;
		}
		if(speed == 0){
			up = false;
			turnLeft = false;
			turnRight = false;
			down = false;
		}
		return speed;
	}
	
	public boolean turnLeftDrone() {
		if(speed > 0 && on == true) {
			turnLeft = true;
			turnRight = false;
		}
		return turnLeft;
	}
	
	public boolean turnRightDrone() {
		if(speed > 0 && on == true) {
			turnRight = true;
			turnLeft = false;
		}
		return turnRight;
	}
	
	public boolean upDrone() {
		if(on == true && speed > 0) {
			up = true;
			down = false;
		}
		return up;
	}
	
	public boolean downDrone() {
		if(on == true && speed > 0) {
			down = true;
			up = false;
		}
		return down;
	}
	
	public void statusDrone() {
		System.out.println(" On: "+on);
		System.out.println(" Speed: "+speed);
		System.out.println(" Going up: "+up);
		System.out.println(" Going down: "+down);
		System.out.println(" Turned left: "+turnLeft);
		System.out.println(" Turned right: "+turnRight+"\n");
	}
}
