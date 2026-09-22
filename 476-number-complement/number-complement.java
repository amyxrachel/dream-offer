class Solution {
    public int findComplement(int num) {
      String b= Integer.toBinaryString(num);  
StringBuilder complement = new StringBuilder();
        for (char s : b.toCharArray()) {
            complement.append(s == '0' ? '1' : '0');
        }
        String bb = complement.toString();
        return Integer.parseInt(bb, 2);
    

    }
}