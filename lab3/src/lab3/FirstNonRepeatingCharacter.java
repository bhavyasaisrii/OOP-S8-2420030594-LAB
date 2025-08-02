package lab3;


		// TODO Auto-generated method stub
		import java.util.LinkedHashMap;
		import java.util.Map;
		public class FirstNonRepeatingCharacter {

			public static void main(String[] args) {
		
		        String input = "swiss";
		        Map<Character, Integer> countMap = new LinkedHashMap<>();

		        for (char c : input.toCharArray()) {
		            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		        }

		        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
		            if (entry.getValue() == 1) {
		                System.out.println(entry.getKey());
		                break;
		            }
		        }
			}}