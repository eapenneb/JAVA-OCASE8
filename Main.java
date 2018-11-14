public class Main {

    public static void main(String[] args) {

        System.out.println("Goodbye, World!");
char a= '\u0122';
System.out.println("char!" +a);
int baseDecimal = 267;
int octVal = 0413;
int hexVal = 0x10B;
int binVal = 0b100001011;
long var7 = 100__12_12;
System.out.println (baseDecimal + octVal);
System.out.println (hexVal + binVal);
System.out.println("long!" +var7);
char c3 = (char)-116;
System.out.println("cast!" +c3);
int myInt = 7;
boolean result = true;
if (result == true)
do
System.out.println(myInt);
while (myInt > 10);

String name = "hello";
if (name != null && name.length() > 0)
System.out.println(name.toUpperCase());

int myChar = 97;
int yourChar = 98;
System.out.println((char)myChar + (char)yourChar);
System.out.println((char)myChar);
int age = 20;
System.out.print(" ");
System.out.print((float)age);

int x = 10;
long b = 20;
short c = 30;
System.out.println(++x + b++ + c);
System.out.println(b);
Boolean buy = new Boolean(true);
Boolean sell = new Boolean(true);
System.out.print(buy == sell);
boolean buyPrim = buy.booleanValue();
System.out.print(!buyPrim);
System.out.println(buy && sell);
float num2 = 17.8f;
int num1 = 12; // line 3
boolean eJavaResult = true; // line 5
boolean returnVal = num1 >= 12 && num2 < 4.567 || eJavaResult == true;;
System.out.println(returnVal);

    }

}