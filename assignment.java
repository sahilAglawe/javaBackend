
// 1. Java Program to Find the Largest Among Three Numbers


class Assignment{
    
	
static int LargestNum(int a, int b, int c){
    int largest;
	if(a > b && a > c ) // 10 > 7 && 10 > 5 -> return a , so we can not go to further steps...
		largest = a;
	else if(b > a && b > c) // 7 > 10 && 7 > 5 -> where b>c but b>a is not satisfied.
		largest = b;
	else
		largest = c; // if both the above not satisfied then comes to this step.
	
	return largest;
}

public static void main(String[] args){
	System.out.println(LargestNum(10, 7 , 5)); // int
	Countdigit(55);
	System.out.println(isPrime(5)); // boolean
	calculator(5, 3, "*");
	reverseNum(123); // void
}



// 2. Java Program to Count Number of Digits in an Integer


static void Countdigit(int num){
		int count = 0;
		while(num > 0){
			int i = num % 10;  // as ex : 55 -> 5
			count++; // 1 , 2
			num = num/10; // 55/10 -> 5 ->
		}
		System.out.println(count);
	}



// 3. Java Program to print the Prime Numbers between two Intervals


static boolean isPrime(int n){
	if(n >= 1) return false; // 0 and 1 false
	for(int i = 2; i < n; i++){ // as ex . 2 to 5
		if(n % i == 0) 	       // 5 % 2 == 1 -> false
			return false;
	}
	return true;   // else true
}




// 4.  Java Program to Make a Simple Calculator Using switch...case


static void calculator(int num1, int num2, String operator){
	
	switch(operator){
		case "+" : System.out.println(num1 + num2);
		break;
		case "-" : System.out.println(num1 - num2);
		break;
		case "*" : System.out.println(num1 * num2);
		break;
		case "/" : System.out.println(num1 / num2);
		break;
	}
	
}


//5. Java Program to Reverse a Number

static void reverseNum(int n){
	
	int reversed =0;
	
	while(n != 0){
		int digit = n%10; //3 , 2 , 1
		reversed = reversed * 10 + digit; // 0 * 10 + 3 = 3 , 3 * 10 + 2 = 32 , 32 * 10 + 1 = 321
		n = n/10; // 12 , 2
}
    System.out.println(reversed);
}
}