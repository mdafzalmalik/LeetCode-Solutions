package leetcode;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int FindFirstBadVersion(int n) {
		int start = 1;
		int end = n;
		int ans = 0;
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(isBadVersion(mid) == true) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return ans;
	}
	
	public static boolean isBadVersion(int mid) {
		return false;
	}

}
