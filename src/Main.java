import java.util.Scanner;

public class Main {

	private static Scanner imput;

	public static void main(String[] args) {
		int opt = 0;
		Drone remoteControl = new Drone();
		
		do{
			System.out.println("Select Option:");
			System.out.println("1(On) 2(Off) 3(Up) 4(Down) 5(Left) 6(Right) 7(Speed+) 8(Speed-) 0(Exit)");
			
			imput = new Scanner(System.in);
			opt = imput.nextInt();
			
			switch (opt){
			case 1:
				remoteControl.turnOnDrone();
				remoteControl.statusDrone();
				break;
			case 2:
				remoteControl.turnOffDrone();
				remoteControl.statusDrone();
				break;
			case 3:
				remoteControl.upDrone();
				remoteControl.statusDrone();
				break;
			case 4:
				remoteControl.downDrone();
				remoteControl.statusDrone();
				break;
			case 5:
				remoteControl.turnLeftDrone();
				remoteControl.statusDrone();
				break;
			case 6:
				remoteControl.turnRightDrone();
				remoteControl.statusDrone();
				break;
			case 7:
				remoteControl.speedUpDrone();
				remoteControl.statusDrone();
				break;
			case 8:
				remoteControl.speedDownDrone();
				remoteControl.statusDrone();
				break;
			default:
				remoteControl.statusDrone();
			}
		}while(opt != 0);
	}

}
