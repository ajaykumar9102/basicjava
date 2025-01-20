import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	String name;
	int age;
	public A(String name,int age) {
		this.name=name;
		this.age=age;
	}public String toString() {
		return name+" "+age;
	}
}
public class Serialization {
	public static void main(String args []) throws IOException, ClassNotFoundException {A a=new A("ajay",67);
		File file=new File("PW");
		file.mkdir();
		File filee=new File("PW","pw.txt");
		filee.createNewFile();
		/*FileOutputStream  fos=new FileOutputStream("pw.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream obs=new ObjectOutputStream(bos);
		obs.writeObject(a);
		obs.close();
		obs.flush();*/
		FileInputStream fis=new FileInputStream("pw.txt");
		BufferedInputStream bos=new BufferedInputStream(fis);
		ObjectInputStream obs=new ObjectInputStream(bos);
		A aa=(A)obs.readObject();
		System.out.println(aa.toString());
		
		
		//System.out.println(a.toString());
	}

}
