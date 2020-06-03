public int twoCitySchedCost(int[][] costs) {
	int cost = 0;
	Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]) );   
	int i = 0;
	int j = costs.length - 1;
	while(i < j) {
		cost += costs[i][0];
		cost += costs[j][1];
		i++;									                
		j--;
	}
	return cost;
}

/* Question link: https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/
 * Time Complexity: O(n log n), where n is size of costs array.
 *
 * Sort the array on the basis of difference.
 * Take half of the array for city A and half of the value for city B.
 */
