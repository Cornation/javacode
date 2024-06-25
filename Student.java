
public class Student {//创建类名为student的类
	private int id;
	private String name;
	private int age;
	private String major;
	private int score;

	public Student(int id, String name, int age, String major, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
		this.score = score;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
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

	public int getscore() {
		return score;
	}

	public void setscore(int id) {
		this.score = score;
	}

	public void printDetails() {
		System.out.println(id + " " + name + " " + age + " "+major + " " + score);
	}

	public static void main(String[] args) {//测试student类的主方法
		System.out.println("id 姓名 年龄 专业 成绩");
		Student student1 = new Student(101, "李华", 20, "计算机", 70);
		student1.printDetails();
		Student student2 = new Student(102, "张三", 21, "大数据", 90);
		student2.printDetails();
		Student student3 = new Student(103, "王五", 21, "物联网", 60);
		student3.printDetails();
	}
}
