package N179;

public class N179 {
    public String largestNumber(int[] nums) {

        int amount0 = 0;

        for (int n : nums) {
            if (n < 0)
                return "0";
            if(n == 0) amount0++;
        }

        if(amount0 == nums.length) return "0";

        String[] converted = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(converted, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder newString = new StringBuilder();
        for (String n : converted) {
            newString.append(n);
        }

        return newString.toString();
    }
}
