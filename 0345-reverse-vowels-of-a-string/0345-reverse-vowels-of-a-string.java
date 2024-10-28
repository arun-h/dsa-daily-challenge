class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 
                                                             'A', 'E', 'I', 'O', 'U'));

        List<Character> vowelList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                vowelList.add(c);
            }
        }

        Collections.reverse(vowelList);

        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;
        
        for (char c : s.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(vowelList.get(vowelIndex++)); 
            } else {
                result.append(c); 
            }
        }
        
        return result.toString();
            
        
    }
}