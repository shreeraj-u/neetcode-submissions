class Solution {

    public String encode(List<String> strs) {
       String str = "";
       for(int i = 0; i < strs.size(); i++){
            str = str + Integer.toString(strs.get(i).length()) + "#" + strs.get(i);
       }
       return str; 
    }

    public List<String> decode(String str) {
        String str3 = str;
        int howlong = 0;
        int start = 0;
        int index = 0;
        int end = 0;
        String sub = "";
        List<String> list = new ArrayList<>();
        while(index < str.length()){
            int delimiter = str3.indexOf("#", index);
            howlong = Integer.parseInt(str3.substring(index, delimiter));
            start = delimiter + 1;
            end = start + howlong;
            sub = str3.substring(start, end);
            list.add(sub);
            index = end;
        }
        return list;
    }
}