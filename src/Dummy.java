import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Dummy {
	UserInfo MyInfo;

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
}
