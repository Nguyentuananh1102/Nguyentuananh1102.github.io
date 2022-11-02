import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static List<List<String>> findDuplicate(String[] paths) {
         Map<String,List<String>> map = new HashMap();
         for(String path: paths){
             String[] arr = path.split(" ");
             for(int i=1;i<arr.length;i++){
                 String fileContent = arr[i].substring(arr[i].indexOf('('),arr[i].indexOf(')'));
                 String directory = arr[0]+"/"+arr[i].substring(0,arr[i].indexOf('('));
                 List<String> list = map.getOrDefault(fileContent,new ArrayList<>());
                 list.add(directory);
                 map.put(fileContent,list);
             }
         }
         List<List<String>> answer = new ArrayList<>();
         for(String fileContent: map.keySet()){
             if(map.get(fileContent).size()>1) answer.add(map.get(fileContent));
         }
         return answer;
    }

    public static void main(String[] args) {
        String [] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }

 }