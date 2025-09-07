class Solution {
    public String reverseWords(String s) {
        String [] str = s.split("\\s+");

        List<String> list = Arrays.asList(str);

        Collections.reverse(list);

        return (String.join(" ",list).trim());
        }

}