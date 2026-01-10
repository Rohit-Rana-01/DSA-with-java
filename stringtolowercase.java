public class stringtolowercase{
    public static String toLowerCase(String s) {
        StringBuilder sb= new StringBuilder("");
        for(int i =0 ; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append(s.charAt(i));
            }
            else{
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            
        }
        
        return sb.toString();
    }
    // can be done if one word is there :: return s.toLowerCase();
    public static void main(String[]args){
        String str = "Rohit Rana" ;
        System.out.println(toLowerCase(str));
        
    }
}