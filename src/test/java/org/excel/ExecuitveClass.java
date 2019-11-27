package org.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import org.testng.xml.LaunchSuite;

public class ExecuitveClass extends Baseclass {
public static void main(String[] args) throws IOException, InterruptedException {
	
	launch("https://www.snapdeal.com/");
	
	Pojo1 p = new Pojo1();
	send(p.getTxt(),data(1,0));
	click(p.getClick());
	Thread.sleep(5000);
	Pojo2 p1 = new Pojo2();
	Thread.sleep(5000);
	send(p1.getTxt(),"600078");
	click(p1.getBtn());
	
	Thread.sleep(10000);
	click(p1.getClick());
	

		windowHandle();
	
	Pojo3 p2 = new Pojo3();
	click(p2.getBuy());
	
	Pojo4 p3 = new Pojo4();
	Thread.sleep(5000);
	send(p3.getUser(),"8667460547");
	click(p3.getBt());
	Thread.sleep(5000);
	send(p3.getPass(),"gokulmsd007");
	click(p3.getCont());
	Thread.sleep(5000);
	click(p3.getPay());
	
}
}

