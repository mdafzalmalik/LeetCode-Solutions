package leetcode;

public class DefangingIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(defangIPaddr("1.1.1.1"));

	}
	
	public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
