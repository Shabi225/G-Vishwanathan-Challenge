/*valid parentheses*/
class Solution {
    public boolean isValid(String s) {
       Stack<Character> braces=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                braces.push(c);
            }
            else{
                char pop;
                switch (c){
                    case ')':
                        pop=(braces.size()>0)?braces.pop():' ';
                        if(pop!='(') return false;
                        break;
                    case '}':
                        pop=(braces.size()>0)?braces.pop():' ';
                        if(pop!='{') return false;
                        break;
                    case ']':
                        pop=(braces.size()>0)?braces.pop():' ';
                        if(pop!='[') return false;
                        break;
                }
            }
        }
       
        return braces.isEmpty();
    }
}
