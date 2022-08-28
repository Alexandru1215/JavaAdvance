package testeHomeWork.test11;

public class Challenge {
	public static boolean profitableGamble(double prob, double prize, double pay) {
		return prob * prize > pay;
	}
}

//A profitable gamble is a game that yields a positive net profit,
// where net profit is calculated in the following manner:
// net_outcome = probability_of_winning * prize - cost_of_playing.