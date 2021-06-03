package banchmark;

import java.util.function.Supplier;

public class Benchmark {
	
	static private String test1() {
		
		return null; /* your code here */ }
	static private String test2() {
		
		return null; /* your code here */ }
	static private String test3() {
		
		return null; /* your code here */ }	

		static void benchmark(Supplier<String> method) {
		long start = System.nanoTime();
		for(int i = 0; i < 1_000_000; ++i) {
			method.get();
		}
		System.out.println("elapsed time (ns): " + (System.nanoTime() - start));
	}
	public static void main (String[] args) {
		Benchmark.benchmark(()->test1());
		Benchmark.benchmark(()->test2());
		Benchmark.benchmark(()->test3());
	}
}
