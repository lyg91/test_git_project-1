package work.util;

import java.util.Date;
import java.util.Locale;

public class UnitTest {

	public static void main(String[] args) {
		//���糯¥ �����ؼ� ���
		Date date = new Date();
		System.out.println(date);
		
		//��ƿ��Ƽ �޼��� ȣ��
		String date1 = Utility.getCurrentDate();
		System.out.println(date1);
		
		System.out.println(Utility.getCurrentDate("yyyy.MM.dd"));
		System.out.println(Utility.getCurrentDate("HH:mm"));
		System.out.println(Utility.getCurrentDate("a hh:mm"));
		System.out.println(Utility.getCurrentDate("a hh:mm", Locale.US));
		
		//���� ������ õ �������� �ĸ� ǥ��: ������
		int data1 = 123456789; //123,456,789=>���ڿ� 
		String convertData1 = Utility.convertNumber(data1);
		System.out.println(data1 + ":" + convertData1);
		
		//��ȭ ���� ������  �� �տ� ȭ����� ǥ���ϰ�, õ �������� �ĸ� ǥ��
		//�޼��� ��: convertCurrency()  �⺻ȭ�Ǵ��� - ��
		String convertData11 = Utility.convertCurrency(data1, Locale.US);
		System.out.println(data1 + ":" + convertData11);
		
		//��ȣ �������
		//pass01->pa****
		//�޼���� convertSecureCode()
		
		String pass = "ddlll";
		System.out.println(Utility.convertSecureCode(pass));
	}
}
