public class permutations {
	public static void main(String[] args) {
		permute("MARTY");
	}

	public static void permute(String s) {
		permute(s, "");
	}

	private static void permute(String s, String chosen) {
		if (s.length() == 0) {
			// base case: no choices left to be made
			System.out.println(chosen);
		} else {
			// recursive case: choose each possible next letter
			for (int i = 0; i < s.length(); i++) {
				String ch = s.substring(i, i + 1); // choose
				String rest = s.substring(0, i) + s.substring(i + 1); // remove
				permute(rest, chosen + ch); // explore
			}
		} // (don't need to "un-choose" because we used temp variables)
	}

}