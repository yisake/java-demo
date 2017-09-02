package interview.algorithm;

import java.util.Stack;

public class MatchBrackets {
	public static void main(String[] args){  
	       String s="[()]{}{[()[]()]()}";  
	        System.out.println(isComplete(s));  
	    }  
	  
	    public static boolean isComplete(String s){  
	        Stack<String> left=new Stack<String>();  
	        while (!s.isEmpty()){  
	            //鍙栧瓧绗︿覆棣栧瓧姣�  
	            String character=s.substring(0,1);  
	            //鍓╀綑鐨勫瓧绗︿覆  
	            s=s.substring(1);  
	            if(character.equals("{")||character.equals("[")||character.equals("(")){  
	                //濡傛灉鏄乏鎷彿锛屽垯鍘嬪叆鏍�  
	                left.push(character);  
	            }else if(character.equals(")")||character.equals("]")||character.equals("}")){  
	                //棣栧厛妫�鏌ユ爤鏄惁涓虹┖  
	                if(left.isEmpty())  
	                    return false;  
	                //寮瑰嚭鏈�鍚庣殑宸︽嫭鍙�  
	                String leftChar=left.pop();  
	                //妫�鏌ュ乏鍙虫嫭鍙锋槸鍚﹀尮閰�  
	                if(character.equals(")")){  
	                    if(!leftChar.equals("("))  
	                        return false;  
	                }else if(character.equals("]")){  
	                    if(!leftChar.equals("["))  
	                        return false;  
	                }else if(character.equals("}")){  
	                    if(!leftChar.equals("{"))  
	                        return false;  
	                }  
	            }  
	        }  
	        //姝ゆ椂鏍堜腑涓嶅簲璇ュ啀鏈夊乏鎷彿  
	        return left.isEmpty();  
	    }
}
