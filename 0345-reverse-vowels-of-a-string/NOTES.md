Aprroach: use two-pointer to efficiently reverse the vowels. 

1. Convert the input string to a character array for easier manipulation
2. Use two pointers: left (starting from beginning) and right (starting from end)
3. Move the left pointer until we find a vowel
4. Move the right pointer until we find a vowel
5. Swap the vowels when both pointers point to vowels
6. Continue until the pointers meet

Time Complexity: O(n) where n is the length of the string
Space Complexity: O(n) for creating the character array
