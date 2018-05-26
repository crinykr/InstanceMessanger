import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class ConsoleAppFirst {
	UserInfo MyInfo;
	UserInfo TargetInfo;

	private static final String FilePath = "myinfo.dat";

	public void SaveUserInfo() throws IOException {
		FileOutputStream fos = new FileOutputStream(FilePath);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(MyInfo);
		oos.close();
	}

	public boolean LoadUserInfo() throws ClassNotFoundException {
		FileInputStream fis;
		try {
			fis = new FileInputStream(FilePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			MyInfo = (UserInfo) ois.readObject();
			ois.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public ConsoleAppFirst() throws IOException, ClassNotFoundException {
		if (LoadUserInfo() == false) {
			RegistNewMyInfo();
			SaveUserInfo();
		}

		System.out.println("Try to regist user information...");

		if (TcpUtil.RegisterNewMyInfoOnServer(MyInfo) == 0) {

		}
	}

	public void RegistNewMyInfo() {
		System.out.println("****************");
		System.out.println("* First Page *");
		System.out.println("****************");

		MyInfo = new UserInfo();

		Scanner scan = new Scanner(System.in);

		MyInfo.setID("" + (new Random().nextInt(2147483647)));
		System.out.println("MyID : " + MyInfo.getID());

		System.out.print("MySex : ");
		MyInfo.setSex(scan.nextLine());

		System.out.print("MyAge : ");
		MyInfo.setAge(scan.nextLine());

		System.out.print("MyInterest : ");
		MyInfo.setInterest(scan.nextLine());
	}

}