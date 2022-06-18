package basic_1;

import java.util.Date;

public class DataType_03 {
	public static void main(String[] args) {
		
		//기본형
		/*
		 boolean
		char
		byte
		short
		int
		long
		float
		double
		 */
		//그외에는 참조형임 
		Date today = new Date(); //today가 참조 변수가 되는 것임
		System.out.println(today.after(today));
	}

}
