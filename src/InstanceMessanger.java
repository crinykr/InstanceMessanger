import java.util.Random;
import java.util.Scanner;

public class InstanceMessanger {
	Scanner scan;
	UserInfo MyInfo;
	UserInfo TargetInfo;
	TcpUtil tcp;

	public InstanceMessanger() {
		scan = new Scanner(System.in);
		MyInfo = new UserInfo();
		TargetInfo = new UserInfo();
		tcp = new TcpUtil();

		do {
			InputMyInfo();
		} while (tcp.SendRegisterMyInfo(MyInfo) < 0);

		do {
			InputTargetInfo();
		} while (tcp.SendRequestStartMatchingTarget(TargetInfo) < 0);
	}

	public void InputMyInfo() {
		System.out.println("\n// Input my info //");

		System.out.print("> MyID : ");
		MyInfo.setID(scan.nextLine());

		if (MyInfo.getID().equals("r"))
			MyInfo.setID("" + (new Random().nextInt(2147483647)));

		System.out.print("> MySex : ");
		MyInfo.setSex(scan.nextLine());

		System.out.print("> MyAge : ");
		MyInfo.setAge(scan.nextLine());

		System.out.print("> MyInterest : ");
		MyInfo.setInterest(scan.nextLine());

		System.out.println("Result my info : " + MyInfo);
	}

	public void InputTargetInfo() {
		System.out.println("\n// Input target info //");

		System.out.print("> TargetID : ");
		MyInfo.setID(scan.nextLine());

		System.out.print("> TargetSex : ");
		MyInfo.setSex(scan.nextLine());

		System.out.print("> TargetAge : ");
		MyInfo.setAge(scan.nextLine());

		System.out.print("> TargetInterest : ");
		MyInfo.setInterest(scan.nextLine());

		System.out.println("Result target Info : " + MyInfo);
	}

}