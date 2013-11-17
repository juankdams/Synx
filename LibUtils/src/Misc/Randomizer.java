package Misc;

import java.util.Random;


public class Randomizer {

	private final static Random rand = new Random();

	public static int nextInt() {
		return rand.nextInt();
	}

	/** @return - Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence */
	public static int nextInt(final int arg0) {
		return rand.nextInt(arg0);
	}

	public static void nextBytes(final byte[] bytes) {
		rand.nextBytes(bytes);
	}

	public static boolean nextBoolean() {
		return rand.nextBoolean();
	}

	public static double nextDouble() {
		return rand.nextDouble();
	}

	public static float nextFloat() {
		return rand.nextFloat();
	}

	public static long nextLong() {
		return rand.nextLong();
	}

	public static int rand(final int lbound, final int ubound) {
		return (int) ((rand.nextDouble() * (ubound - lbound + 1)) + lbound);
	}
}