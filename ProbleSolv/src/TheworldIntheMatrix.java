
public class TheworldIntheMatrix {
	

    static boolean leftside(char[][]m,char[]c,int i,int j,int k) {
     while(i<c.length&&j<c.length) {
    	if(c[k]==m[i][j]) {
    		k++; j++; 
    		if(c[c.length-1]==m[i][j]) return true; else ;
    		}
    	else {k=0; i++;}
    		}
    	return false;
    }
    
    static boolean rightside(char[][]m,char[]c,int i,int j,int k) {
    	 while(j<c.length&&i<c.length) {
    	if(c[k]==m[i][j]) {
    		k++; i++; 
    	   if(c[c.length-1]==m[i][j]) return true; else ;
    	}
   	else 	{k=0; j++; }
    		}
    return false;
    	
       }
    
    static boolean Bothside(char[][]m,char[]c) {
    	int i=0,j=0,k=0;
    	return leftside(m,c,i,j,k)||rightside(m,c,i,j,k);    }
    
	public static void main(String[] args) {
	char[][] m=new char[4][4];
	char[] c=new char[4];
	String s="FACIOBQPANOBMASS"; 
	for(int i=0;i<4;i++) {  {m[i][0]=s.charAt(i); c[i]= s.charAt(i);} }
	for(int i=0;i<4;i++) {  {m[i][1]=s.charAt(i+4); } }
	for(int i=0;i<4;i++) {  {m[i][2]=s.charAt(i+8); } }
	for(int i=0;i<4;i++) {  {m[i][3]=s.charAt(i+8+4); } }
	m[0][3]='F';	m[0][3]='F'; 	m[0][1]='F'; 	m[2][0]='F';
	for(int i=0;i<4;i++) {System.out.println(); for(int j=0;j<4;j++) System.out.print(m[i][j]+" ");}
	System.out.println();
	System.out.println("Le c correspondent ");
	for(char t:c) {System.out.print(t);}
	System.out.println();
	System.out.println(Bothside(m,c));
	
 

	}

}
