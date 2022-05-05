//Rank The Permutations

public class rankPermutations {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(findRank(s));
    }

     static long fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }

    static long findRank(String s)
    {
        if(s.length()==0){
            return 0;
        }

        long  res=1;

        for(int i=0; i<s.length()-1; i++){
            long cou=0;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) > s.charAt(j)){
                    cou++;
                }
            }
            res += cou * fact(s.length()-1-i);
        }
        return res;
    }
}

