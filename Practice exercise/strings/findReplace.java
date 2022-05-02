//Find an Replace in String

import java.util.Arrays;

public class findReplace {
            public static void main(String[] args){
                String S = "gforks";
                int Q = 2;
                int[] index = {0, 4};
                String[] sources = {"g", "ks"};
                String[] targets = {"geeks", "geeks"};
                System.out.println(findAndReplace(S,Q,index,sources,targets));
            }
        static String findAndReplace(String S, int Q, int[] index, String[] sources, String[] targets) {
            int n = S.length();
            int[] arr = new int[n];
            StringBuilder sb = new StringBuilder();
            Arrays.fill(arr,-1);
            for(int i = 0;i<index.length;i++){
                if(S.startsWith(sources[i], index[i])){
                    arr[index[i]] = i;
                }
            }
            int idx = 0;
            while(idx<n){
                if(arr[idx]>=0){
                    sb.append(targets[arr[idx]]);
                    idx+=sources[arr[idx]].length();
                }
                else{
                    sb.append(S.charAt(idx++));
                }
            }
            return sb.toString();
        }
}
