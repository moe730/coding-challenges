package com.dsa.chapter2.TestTimes;

public class Driver {

	public static void main(String[] args) {
		TestTimes tt = new TestTimes();
		Search search = new Search();
		int []array = {1,2,3,4,5,6};

		search.linearSearch(array,5);
		search.binarySearch(array,3);
		search.recursiveBS(array,4,0,4);

		
		long startTime, endTime, testTime;
		long[] times = new long[10];
		int num = 0;
		
		for ( int count = 0 ; count < 5 ; count++ ) {
			startTime = System.nanoTime();
			
			for ( int i = 0 ; i < 1_000_000_000 ; i++) {
				int j = 5 + i;
			}
			
			endTime = System.nanoTime();
			testTime = endTime - startTime;
			
			tt.addTestTime(testTime);
			times[num++] = testTime;
		}
		
		long[] tttimes = tt.getTestTimes();
		
		for ( int i = 0 ; i < 5 ; i++ ) {
			System.out.println(times[i] +"\t\t" + tttimes[i]);
		}
		
		
	}

}
