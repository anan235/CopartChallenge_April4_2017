/**
 * Created by Ankita Patil on 4/4/2017
 * Problem : Licsense Keys
 */
package copart.challenge;


import java.util.Scanner;

class LicenseKey {
	public static String FormatLicenseKey(String S, int K){
		S = S.replaceAll("-", "").toUpperCase();
		StringBuilder sb = new StringBuilder(S);
		
		//Start from end and go backward
		int i = sb.length() - K;
		
		while(i > 0){
			sb.insert(i, '-');
			i -= K;
		}
		
		return sb.toString();
	}
}
public class LicenseKeySolution{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a license key");
		String licenseKey = src.nextLine();
		System.out.println("Enter k");
		int k = src.nextInt();
		System.out.println("Output = " + LicenseKey.FormatLicenseKey(licenseKey, k));
	}
	
	
}
	
	


