Approach:  

1. **Initialize Variables**: Start with a pointer (`writeIndex`) to keep track of where to write in the `chars` array and a variable (`count`) to count consecutive repeating characters.
2. **Loop Through `chars`**: Use another pointer (`readIndex`) to read each character in the `chars` array.
3. **Check Consecutive Characters**: If a character repeats, increase `count`. When a character change is detected, write the previous character and its count (if greater than 1) to the `chars` array.
4. **Write Character and Count**:
   - Write the character at `writeIndex`.
   - If `count` is greater than 1, convert it to characters and write each digit individually to `chars`.
5. **Return Length**: At the end, `writeIndex` will represent the new length of the compressed array.

### Example 
For `chars = ['a', 'a', 'b', 'b', 'c', 'c', 'c']`:
1. `writeIndex` updates with 'a' and '2' (for two 'a's).
2. It then writes 'b' and '2', and finally 'c' and '3'.
3. The final compressed array will be `['a', '2', 'b', '2', 'c', '3']`, and `writeIndex` will be `6`.

This algorithm meets the requirements of using only constant extra space and modifying `chars` in place.
