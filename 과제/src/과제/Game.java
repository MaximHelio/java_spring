package ����;

public class Game {
    public static void main(String[] args) {
    	
        for(int num=1; num<101; num++){
        	
            String str_num = Integer.toString(num);
            boolean notsamyookgu = true;
            
            // length �� �迭�� ������ �ִ� �ʵ�
            
            for(int i=0; i<str_num.length(); i++){
            	
                if(str_num.charAt(i) == '3' || str_num.charAt(i) == '6' || str_num.charAt(i) == '9'){
                    System.out.print('*');
                    notsamyookgu = false;
                }
            }
            
            if(notsamyookgu){
                System.out.println(str_num);
            } else {
                System.out.println();
            }
        }
    }
}