package com.infosys.xmldiexample.beans;

public class Batch {
	int batchId;
	String batchName;
	int batchSize;
	public Batch(int batchId, String batchName, int batchSize) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.batchSize = batchSize;
	}
	
	public void showBatchDetails() {
		System.out.println("Batch Id :"+batchId);
		System.out.println("Batch Name :"+batchName);
		System.out.println("Batch Size :"+batchSize*2);
	}
	
}
