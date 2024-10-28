class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer until we find a vowel
            while (left < right && !isVowel(chars[left])) {
                left++;
            }     
            // Move right pointer until we find a vowel
            while (left < right && !isVowel(chars[right])) {
                right--;
            }       
            // Swap the vowels if we found them
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }
    
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
            
}