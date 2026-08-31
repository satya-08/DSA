class Solution {
    public int romanToInt(String s) {
        int sum=0;
        switch (s.charAt(0)) {
            case 'I':
                sum+=1;
                break;

             case 'X':
                sum+=10;
                break;
                    
            case 'V':
                sum+=5;
                break;
            case 'L':
                sum+=50;
                break;
            case 'C':
                sum+=100;
                break;
            case 'D':
                sum+=500;
                break;
            case 'M':
                sum+=1000;
                break;
        }
        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i)=='I'){
                sum+=1;
            }
            else if(s.charAt(i)=='V' ){
                if(s.charAt(i-1)=='I'){
                    sum+=3;
                }else{
                    sum+=5;
                }
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i-1)=='I'){
                    sum+=8;
                }else{
                    sum+=10;
                }
            }
            else if(s.charAt(i)=='L'){
                if(s.charAt(i-1)=='X'){
                    sum+=30;
                }else{
                    sum+=50;
                }
            }
            else if(s.charAt(i)=='C'){
                if(s.charAt(i-1)=='X'){
                    sum+=80;
                }else{
                    sum+=100;
                }
            }
            else if(s.charAt(i)=='D'){
                if(s.charAt(i-1)=='C'){
                    sum+=300;
                }else{
                    sum+=500;
                }
            }
            else if(s.charAt(i)=='M'){
                if(s.charAt(i-1)=='C'){
                    sum+=800;
                }else{
                    sum+=1000;
                }
            }
        }
        return sum;
    }
}