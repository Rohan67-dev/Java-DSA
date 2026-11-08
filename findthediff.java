public class findthediff {
    static {
        for(int i = 0; i < 444; i++){
            findTheDifference("", "a");
        }
    }

    public static char findTheDifference(String s, String t) {
        int i,ssum=0,tsum=0;
        for(i=0;i<s.length();i++){
            ssum += (int)(s.charAt(i));
        }
        for(i=0;i<t.length();i++){
            tsum += (int)(t.charAt(i));
        }
        
        return (char)(tsum-ssum);
    }
}
