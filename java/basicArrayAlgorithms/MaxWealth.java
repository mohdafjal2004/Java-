package basicArrayAlgorithms;

public class MaxWealth {

	public static void main(String[] args) {

	}

	public int maximumWealth(int[][] accounts) {
		// person = row
		// account = col
		
		int ans = Integer.MIN_VALUE; //Overall ans
		for (int person = 0; person < accounts.length; person++) {

			// when you start a new col, take a new sum for that row
			int SumOfRow = 0;

			for (int EachAccount = 0; EachAccount < accounts[person].length; EachAccount++) {

				int element = accounts[person][EachAccount];// Value of each index
				SumOfRow += element;// sum of every col in a row

			}
			
			//now we have sum of accounts of person 
			//check with overall ans
			if(SumOfRow > ans) {
				ans = SumOfRow;
			}

		}
		return ans;

	}

}
