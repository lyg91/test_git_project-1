package work.util;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Utility {
	// ���� 4�� ����
	public static String getSecureCode() {

		return getSecureCode(4);
	}

	// ���� ���̸�ŭ ����
	public static String getSecureCode(int length) {
		Random random = new Random();
		StringBuilder nos = new StringBuilder();
		for (int i = 0; i < length; i++) {
			nos.append(random.nextInt(10));

		}
		return nos.toString();
	}

	// ����2�� ����2��
	public static String getSecureCodeNumberAndAlphbet() {
		Random random = new Random();
		StringBuilder nos = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			nos.append(random.nextInt(10));
		}
		for (int j = 0; j < 2; j++) {
			nos.append((char) (random.nextInt(26) + 65));
		}
		return nos.toString();
	}

	// ����2�� ����2��
	public static String getSecureCodeNumberAndAlphbet(int length) {
		Random random = new Random();
		StringBuilder nos = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			nos.append(random.nextInt(10));
		}
		for (int j = 0; j < length; j++) {
			nos.append((char) (random.nextInt(26) + 65));
		}
		return nos.toString();
	}

	// ���ĺ�4�ڸ�
	public static String getSecureCodeAlphabet() {

		return getSecureCodeAlphabet(4);
	}

	// ���ĺ� �ڸ��� �޾Ƽ� ����
	public static String getSecureCodeAlphabet(int length) {
		Random random = new Random();
		StringBuilder nos = new StringBuilder();

		for (int i = 0; i < length; i++) {
			nos.append((char) (random.nextInt(26) + 65));
		}
		return nos.toString();
	}

	public static String[] ascSort(String[] names) {
		for (int j = 0; j < names.length; j++) {
			String temp = null;
			for (int i = 0; i < names.length - 1; i++) {
				if (names[i].compareTo(names[i + 1]) > 0) {
					temp = names[i];
					names[i] = names[i + 1];
					names[i + 1] = temp;
				}
			}
		}
		return names;

	}

	public static String[] descSort(String[] names) {
		for (int j = 0; j < names.length; j++) {
			String temp = null;
			for (int i = 0; i < names.length - 1; i++) {
				if (names[i].compareTo(names[i + 1]) < 0) {
					temp = names[i];
					names[i] = names[i + 1];
					names[i + 1] = temp;
				}
			}
		}
		return names;
	}

	public static int[] ascSort(int[] nums) {
		for (int j = 0; j < nums.length; j++) {
			int temp = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] > (nums[i + 1])) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
		return nums;
	}

	public static int[] descSort(int[] nums) {
		for (int j = 0; j < nums.length; j++) {
			int temp = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] <= (nums[i + 1])) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
		}
		return nums;
	}

	public static String getCurrentDate() {
		/*
		 * //��¥ ����(�⺻) : ��4 /��2/ ��2 String pattern = "yyyy-MM-dd";
		 * SimpleDateFormat sdf = new SimpleDateFormat(pattern); return
		 * sdf.format(new Date());
		 */

		return getCurrentDate("yyyy-MM-dd");
	}

	public static String getCurrentDate(String pattern) {
		// ��¥ ����(�⺻) : ��4 /��2/ ��2
		// String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(new Date());

	}

	public static String getCurrentDate(String pattern, Locale locale) {
		/*
		 * //��¥ ����(�⺻) : ��4 /��2/ ��2 // String pattern = "yyyy-MM-dd";
		 * SimpleDateFormat sdf = new SimpleDateFormat(pattern, locale); return
		 * sdf.format(new Date());
		 */
		return new SimpleDateFormat(pattern, locale).format(new Date());

	}

	/**
	 * ���� �����͸� õ �������� �ĸ�ǥ�� ��ȯ
	 * 
	 * @see java.text.NumberFormat
	 * 
	 * @param data
	 * @return
	 */

	public static String convertNumber(long data) {
		/*
		 * NumberFormat numberFormat = NumberFormat.getInstance(); return
		 * numberFormat.format(data);
		 */

		return NumberFormat.getInstance().format(data);
	}

	public static String convertCurrency(long data, Locale locale) {
		NumberFormat.getInstance();
		return NumberFormat.getCurrencyInstance(locale).format(data);

	}

	// ��ȣ�� *�� ����
	public static String convertSecureCode(String pass) {
		StringBuilder nos = new StringBuilder(pass.substring(0, 2));
		for (int i = 2; i < pass.length(); i++) {
			nos.append("*");

		}
		return nos.toString();
	}

	public static String convertSecureCode(String pass, int length) {
		StringBuilder nos = new StringBuilder(pass.substring(0, length));
		for (int i = length; i < pass.length(); i++) {
			nos.append("*");

		}
		return nos.toString();
	}

	/**
	 * �� ���ø����̼��� get��� �ѱ� ���ڵ� ��ȯ �޼���
	 */
	public static String toKor(String data) {
		try {
			return new String(data.getBytes("8859_1"), "euc-kr");

		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		}
		return data;

	}
}
