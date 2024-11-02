class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int lenStr1=str1.length();
        int lenStr2=str2.length();
        
        int gcdLen=gcd(lenStr1,lenStr2);
        
        return str1.substring(0, gcdLen);
    }
private int gcd(int a, int b){
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;      
    }
    return a;
}
}