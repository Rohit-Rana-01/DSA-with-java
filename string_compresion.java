public class string_compresion {
    public static int compress(char[] chars) {
        int index = 0;
        for(int i = 0 ; i<chars.length ; i++){
        Integer count = 1 ;
        while(i <chars.length-1 && chars[i] == chars[i+1]){
            count++;
            i++;
        }

        chars[index ++] = chars[i];

        if(count >1){
        String c = Integer.toString(count);
        for(char s :c.toCharArray()){
            chars[index++] = s ;
        }
        }
        }
        return index ;
    }
    public static void main(String[] args){
        char chars[] = {'a','a','b','b','c','c','c'} ;
        System.out.println(compress(chars));
    }
}
