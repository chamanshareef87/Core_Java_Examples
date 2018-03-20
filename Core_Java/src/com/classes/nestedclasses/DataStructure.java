package com.classes.nestedclasses;

public class DataStructure {

	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];
	
	public DataStructure(){
		for(int i=0;i<SIZE;i++){
			arrayOfInts[i]=i;
		}
	}
	
	//Custom iterator defined
	interface DataStructureIterator extends java.util.Iterator<Integer>{}
	
	private class EvenIterator implements DataStructureIterator{

		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			return (nextIndex<=SIZE-1);
		}

		@Override
		public Integer next() {
			Integer returnValue = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex+=2;
			return returnValue;
		}
		
	}
	
	public void printEven(){
		DataStructureIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		DataStructure ds = new DataStructure();
		ds.printEven();
	}

}
