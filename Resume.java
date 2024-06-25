
public class Resume {//创建类名为student的类
	private String name;
	private int age;
	private String major;
	private String home;
	private String phone;
	private String address;

	public Resume(String name, int age, String major, String home,String phone, String address) {
		this.name = name;
		this.age = age;
		this.major = major;
		this.home = home;
		this.phone = phone;
		this.address = address;
	}
	public String getname() {
		return name;
	}

	public void setname() {
		this.name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int id) {
		this.age = age;
	}

	public String getmajor() {
		return major;
	}

	public void setmajor() {
		this.major = major;
	}

	public String gethome() {
		return home;
	}

	public void sethome() {
		this.home = home;
	}

	public String getphone() {
		return phone;
	}

	public void setphone() {
		this.phone = phone;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress() {
		this.address = address;
	}

	public void printDetails() {
		System.out.println("姓名： "+name);
		System.out.println("年龄： "+age);
		System.out.println("专业： "+major);
		System.out.println("籍贯： "+home);
		System.out.println("电话： "+phone);
		System.out.println("地址： "+address);
	}

	public static void main(String[] args) {//测试student类的主方法
		System.out.println("==================");
		System.out.println("=====个人简历======");
		System.out.println("==================");
		Resume student1 = new Resume( "郭君昊", 28, "物联网", "重庆","13398786789","重庆互联网学院");
		student1.printDetails();
		
	}
}
