package com.dsa.chapter2.TestTimes;


public class TestTimes implements TestTimesInterface {

	private static final int MAX_TEST_TIMES = 10;
	
	private long[] testTimes = new long[MAX_TEST_TIMES];
	private int numTestTimes = 0;
	
	
	@Override
	public long getLastTestTime() {
		if (this.numTestTimes == 0) {
			return 0;
		}
		return this.testTimes[this.numTestTimes - 1];
	}

	@Override
	public long[] getTestTimes() {
		long[] copyArray = new long[MAX_TEST_TIMES];
		for ( int i = 0 ; i < MAX_TEST_TIMES ; i++ ) {
			copyArray[i] = this.testTimes[i];
		}
		return copyArray;
	}

	@Override
	public void resetTestTimes() {
 		for ( int i = 0 ; i < MAX_TEST_TIMES ; i++ ) {
 			this.testTimes[i] = 0;
 		}
 		this.numTestTimes = 0;
	}

	@Override
	public void addTestTime(long testTime) {
		if (this.numTestTimes < MAX_TEST_TIMES) {
			this.testTimes[numTestTimes++] = testTime;
		} else {
			for ( int i = 0 ; i < this.testTimes.length - 1 ; i++ ) {
				this.testTimes[i] = this.testTimes[i+1];
			}
			this.testTimes[MAX_TEST_TIMES - 1] = testTime;
		}
	}

	@Override
	public double getAverageTestTime() {
		if (this.numTestTimes == 0) {
			return 0.0;
		} else {
			double total = 0;
			for ( int i = 0 ; i < this.numTestTimes ; i++ ) {
				total += this.testTimes[i];
			}
			return total/this.numTestTimes;
		}
	}

}
