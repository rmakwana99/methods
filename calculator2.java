
class calculator2{
	
	public static boolean andbooleans(boolean a, boolean b, boolean c){
		boolean ans=a;
		if(b==false){
			ans=!ans;
		}
		else{
			ans=ans;
		}
		if(c==false){
			ans=!ans;
		}
		else{
			ans=ans;
		}
		return ans;
	}
	
	public static String repeatTwice(int num){
		String ans;
		ans=num+""+num;
		return ans;
		
	}
	
	public static boolean largerthanone(int num1,int num2,int num3){
		boolean ans=true;
		while(num1<num2 && num1<num3){
			ans=false;
			break;
		}
		return ans;
	}
	
	public static boolean isAssending(int a, int b, int c){
		boolean assending = false;
		while(a<b && b<c && a<c){
			assending = true;
			break;
		}
		return assending;
	}
	public static int sumOf4Digit(int num){
		int m,sum=0;
		for(int i=0;i<4;i++){
			m=num%10;
			num=num/10;
			sum=sum+m;
		}
		return sum;
	}
	public static double areaOfSquare(int x1,int y1,int x2,int y2){
		int side1=x2-x1;
		int side2=y2-y1;
		
		double area=side1*side2;
		
		return area;
		
	}
	
	public static int addDigitnum(int a,int b,int c){
		int sum=a+b+c;
		return (sum*1000)+(sum*100)+(sum*10)+sum;
	}
	
	public static boolean isMultiple37(int num){
		boolean check=true;
		if((num%3==0) && (num%7==0)){
			check=true;
		}
		else{
			check=false;
		}
		return check;
	}
	
	public static int largestOfThree(int num1,int num2, int num3){
		int largest;
		if((num1>num2)&&(num1>num3)){
			return num1;
		}
		else if((num2>num1)&&(num2>num3)){
			return num2;
		}
		else
			return num3;
	}
	public static int daysInMonth(int month){
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
			return 31;
		}
		else if(month==2){
			return 28;
		}
		else{
			return 30;
		}
	}
	
	public static char changeCharCase(char ch){
		char change;
		if(Character.isUpperCase(ch)){
			change=Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch)){
			change=Character.toUpperCase(ch);
		}
		else{
			change=ch;
		}
		return change;
	}
	
	public static boolean isDigit(char c){
		boolean flag=true;
		if(Character.isUpperCase(c)){
			flag=false;
		}
		else if(Character.isLowerCase(c)){
			flag=false;
		}
		else{
			flag=true;
		}
		return flag;
	}
	
	public static char middleChar(char a,char b,char c){
		char ans;
		if(((a<b) && (a>c))||((a<c) && (a>b))){
			ans=a;
		}
		else if(((b<a) && (b>c))||((b<c) && (b>a))){
			ans=b;
		}
		else{
			ans=c;
		}
		return ans;
	}
	
	public static boolean sameLastDigit(int a, int b){
		
		int num1=a%10;
		int num2=b%10;
		if(num1==num2){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean addForThird(int num1, int num2,int num3){
		if(((num1+num2)==num3) || ((num1+num3)==num2) || ((num2+num3)==num1)){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public static int lotteryPrize(int num){
		int prize;
		if (((num%4)==0) && ((num%7)==0)){
			prize=20;
		}
		else if((num%4)==0){
			prize=6;
		}
		else if((num%7)==0){
			prize=10;
		}
		else{
			prize=0;
		}
		return prize;
	}
	
	public static int lotteryPrize3(int a,int b,int c){
		int prize=0;
		int num;
		for(int i=0;i<3;i++){
			if(i==0){
				num=a;
			}
			else if(i==1){
				num=b;
			}
			else{
				num=c;
			}
			if (((num%4)==0) && ((num%7)==0)){
				prize=prize+20;
			}
			else if((num%4)==0){
				prize=prize+6;
			}
			else if((num%7)==0){
				prize=prize+10;
			}
			else{
				prize=prize+0;
			}
			
		}
		return prize;
	}
	
	public static int sumLast3(int num){
		int m,sum=0;
		for(int i=0;i<3;i++){
			m=num%10;
			num=num/10;
			sum=sum+m;
		}
		return sum;
	}
	
	public static int Reverse3(int n){
		int a,c=0;
		while(n>0){
			a=n%10;
			n=n/10;
			c=(c*10)+a;
		}
		return c;
			
	}
	
	public static int blackJack(int num1,int num2){
		int ans;
		if(num1==21 || num2==21){
			ans=21; 
		}
		else if((num1==num2) || (num1<21 || num2<21)){
			ans=-2;
		}
		else{
			
			if(num1<num2){
				ans=21-num1;
			}
			else{
				ans=21-num2;
			}
		}
		return ans;
	}
	
	public static boolean perfectNumber(int num){
		int sum=1,temp=num;
		for(int i=2;i<=num/2;i++){
			if(calculatr.isPrime(i)){
				sum = sum + i;
			}
		}
		if(sum==temp){
			return true;
		}
		else{
			return false;
		}	
	}
}