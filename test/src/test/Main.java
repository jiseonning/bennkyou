package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("�տ���","1444");
		Student st2=new Student("���Ȱ�","1222");
		Student st3=new Student("�����","112121");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		while(true) {
			System.out.println("��� �˻�=y , ����=n");
			Scanner sc = new Scanner(System.in);
			String input=sc.next();
			
			if(input.equals("y")) {
				System.out.println("�й��� �˰���� �л��� �Է����ּ���");
				Scanner sc2 = new Scanner(System.in);
				String na = sc2.next();
				boolean bool=false;
				
				for(Student stu:list) {
					if(stu.getName().equals(na)) {						
						System.out.println("�ش��л��й��� : "+stu.getNo());
						bool=true;						
					}
					}
				
				if(!bool) {
						System.out.println("�ش��ϴ� �л��� �����ϴ�.");
				}			
			}
		
			else if(input.equals("n")) {
				break;
			}
			else {
				
				break;
			}
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
	}

}
