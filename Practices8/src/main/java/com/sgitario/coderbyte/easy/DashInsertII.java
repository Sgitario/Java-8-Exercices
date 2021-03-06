package com.sgitario.coderbyte.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class DashInsertII {
	boolean isOdd(int num) {
		return num % 2 == 1;
	}
	
	boolean isOdd(String num) {
		return isOdd(Integer.valueOf(num));
	}
	
	boolean isOdd(char num) {
		return isOdd("" + num);
	}
	
	String DashInsertII(String num) {
		return Arrays.asList(num.split("")).stream()
			.collect(new Collector<String, StringBuilder, StringBuilder>() {

				@Override
				public Supplier<StringBuilder> supplier() {
					return () -> new StringBuilder();
				}

				@Override
				public BiConsumer<StringBuilder, String> accumulator() {
					return (output, character) -> {
						if (output.length() > 0) {
							boolean lastChOdd = isOdd(output.charAt(output.length() - 1));
							boolean currChOdd = isOdd(character);
							
							if (currChOdd && lastChOdd) {
								output.append("-");
							} else if (!currChOdd && !lastChOdd) {
								output.append("*");
							}
						}
						
						output.append(character);
					};
				}

				@Override
				public BinaryOperator<StringBuilder> combiner() {
					return (s1, s2) -> s1.append(s2);
				}

				@Override
				public Function<StringBuilder, StringBuilder> finisher() {
					return Function.identity();
				}

				@Override
				public Set<java.util.stream.Collector.Characteristics> characteristics() {
					return Collections.unmodifiableSet(EnumSet.of(Characteristics.IDENTITY_FINISH));
				}
				
			}).toString();
	}

	public static void main(String[] args) {
		DashInsertII c = new DashInsertII();
		
		System.out.print(c.DashInsertII("99946"));
	}
}
