class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i=a.length()-1,j=b.length()-1,c=0;
        while(i>=0||j>=0||c>0){
            int x=c;
            if(i>=0)x+=a.charAt(i--)-'0';
            if(j>=0)x+=b.charAt(j--)-'0';
            s.append(x%2); 
            c=x/2;
        }
        return s.reverse().toString();
    }
}