import java.io.Serializable;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 3294343584479196226L;
	private static final String ClientVersion = "0.0.1";
	private String ID;
	private String Sex;
	private String Age;
	private String Interest;

	public UserInfo() {

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getInterest() {
		return Interest;
	}

	public void setInterest(String interest) {
		Interest = interest;
	}

	public String getClientVersion() {
		return ClientVersion;
	}

	@Override
	public String toString() {
		return "[ID=" + ID + ", Sex=" + Sex + ", Age=" + Age + ", Interest=" + Interest + "]";
	}
}