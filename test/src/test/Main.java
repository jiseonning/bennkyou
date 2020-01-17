package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("손오공","1444");
		Student st2=new Student("저팔계","1222");
		Student st3=new Student("사오정","112121");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		while(true) {
			System.out.println("계속 검색=y , 종료=n");
			Scanner sc = new Scanner(System.in);
			String input=sc.next();
			
			if(input.equals("y")) {
				System.out.println("학번을 알고싶은 학생을 입력해주세요");
				Scanner sc2 = new Scanner(System.in);
				String na = sc2.next();
				boolean bool=false;
				
				for(Student stu:list) {
					if(stu.getName().equals(na)) {						
						System.out.println("해당학생학번은 : "+stu.getNo());
						bool=true;						
					}
					}
				
				if(!bool) {
						System.out.println("해당하는 학생이 없습니다.");
				}			
			}
		
			else if(input.equals("n")) {
				break;
			}
			else {
				
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
		
	}

}
