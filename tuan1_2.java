package javap1;

public class tuan1_2 {
	public static void PTB2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "+"x = "+(-c/b));
            }
            return;
        }
        float dt = b*b - 4*a*c;
        float x1,x2;
        if (dt > 0) {
            x1 = (float) ((-b + Math.sqrt(dt)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(dt)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "+"x1 = "+x1+"và x2 = "+x2);
        } else if (dt == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "+"x1=x2= "+x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
	static long GT(long n) {
		long r=1;
		for(long i=1;i<=n;i++) {
			r*=i;
		}
		return r;
	}
	static long GT2(long n) {
		if(n==0)
			return 1;
		return n*GT2(n-1);
	}
	static long Fibo(long n) {
		long F0=0,F1=1,F2=1;
		if(n==0)
			return 0;
		for(long i=2;i<=n;i++) {
			F2=F1+F0;
			F0=F1;
			F1=F2;
		}
		return F2;
	}
	static long UCLN(long a,long b) {
		if(a==b)
			return a;
		else if(a>b)
			return UCLN(a, b-a);
		return 0;
	}
	static long BCNN(long a,long b) {
		return a*b/UCLN(a,b);
	}
	static boolean checkSNT(long n) {
		if(n<2)
			return false;
		for(long i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
	static void lkSNT(long n) {
		for(long i=2;i<n;i++) 
			if(checkSNT(i))
				System.out.print(i+" ");
	}
	static void lk_N_SNT(long n) {
	    String s="";
	    int dem=0;
	    long i=2;
	    while(dem!=n) {
	    	if(checkSNT(i)) {
	    		s=s+i+" ";
	    		dem++;
	    	}
	    	i++;
	    }
	    System.out.println(s);
	}
	static long TongCChuSo(long n) {
		long s=0;
		while(n!=0) {
			s=s+n%10;
			n=n/10;
		}
		return s;
	}
	static long daoSo(long n) {
		long s=0;
		while(n!=0) {
			s=s*10+n%10;
			n=n/10;
		}
		return s;
	}
	static boolean LaSoThuanNghich(long n) {
		return n==daoSo(n);
	}
    //liet ke cac so fibo nho hon n la so nt
	//float a=5,b=10,c=7;
		int n=5;
		basic.giaiPTBac2(a, b, c);
		long rs = basic.GT(n);
		System.out.printf("%d=%d\n", n,rs);
		rs = basic.Fibo(n);
		System.out.printf("fibo(%d)=%d\n",n,rs);
		
		basic.LietKeSNT(n);
		basic.Cau6(n);
		
		n=1234;
		long s=basic.TongCacChuSo(n);
	 System.out.print("Nhập số tự nhiên n = ");
        int n = input.nextInt();
        System.out.printf("Các số fibonacci nhỏ hơn %d và là số nguyên tố: ", n);
        int i = 0;
        while (fibonacci(i) < 100) {
            int fi = fibonacci(i);
            if (isPrimeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
	int chon = input.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Thực hiện chức năng 1");
				break;
			case 2:
				System.out.println("Thực hiện chức năng 2");
				break;
			case 3:
				System.out.println("Thực hiện chức năng 3");
				break;
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
	//xây dựng giao diện chương trình main
	//[1]ptb2
	//[2]...
	//Chon chuong trinh
public static float[] NhapMang(){
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap so luong pt: ");
		int n=sc.nextInt();
		float[] M=new float[n];
		for (int i = 0; i < M.length; i++) {
			System.out.print("A["+i+"] = ");
			M[i] = sc.nextInt();
		}
		sc.close();
		return M;
	}
	public static void XuatMang(float mang[]) {
		System.out.print("Danh sách mảng: ");
		for(int i=0;i<mang.length;i++)
		{
			System.out.print("\t"+mang[i]);
		}
	}
	public static float[] TongMang(float mang[]) {
		System.out.println("tong cac pt trong mang: ");
		float sum;
		for (int i = 0; i < mang.length; i++) {
			sum=sum+mang[i];
		}
		return sum;
	}
	public static float[] MinMaxAverage(float mang[]) {
		return null;
	}
	public static int[] [] CongMT(int[][] mt1,int[][] mt2) {
		return null;
	}
}
package OOP;

public class Point {
//	private double radius;
//	private string color;
//	public Circle() {
//		radius=1;
//		color="red";
//	}
//	public Circle(double r) {
//		radius=r;
//		color="red";
//	}
//	public double getRadius() {
//		return radius;
//	}
//	public double getArea() {
//		return Math.PI*Math.pow(radius,2);
//	}
/*
 * int id,salary;
 * String firstName,lastName;
 *_setget4cai;
 *_khoitaocott;
 *public int getAnnualSalary(){
 *return salary*12;
 *} 
 *public int raiseSalary(int percent){
 *return salary + salary*percent/100;
 *}
 *public String toString(){
 *return String.format("Employee[id=%d,nam=%s,salary=%d]",id,firstNam,lastName,salary);
 *}
 **/
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Point() {
		x=0;y=0;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}
	public double Distance() {
		double d=Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		return d;
	}
	public double Distance(Point q) {
		double d=Math.sqrt(Math.pow(x-q.x, 2)+Math.pow(y-q.y, 2));
		return d;
	}
	@Override
	public String toString() {
		return String.format("(%d,%d)", x,y);
	}
}
//import OOP.Point;
//public class Main{
//	public static void main(String[] args) {
//		OOP();
//	}
//	static void OOP() {
//		Point p=new Point();
//		System.out.println("P"+p.toString());
//		Point p2=new Point(5,10);
//		System.out.println("P2"+p2.toString());
//		double p2p=p2.Distance(p);
//		double pp2=OOP.point.Distance(p,p2);
//		System.out.println("\n %f=%f",p2p,pp2);
//	}
//}
package hinh;

public class Shape {
	private String color;
	private boolean filled;
	public Shape() {
		color="red";
		filled=true;
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Shape[color=%s,filled=%s]", color,filled?"true":"false");
	}
}
package hinh;

public class Rectangle extends Shape {
	private double length, width;
	public Rectangle() {
		super();
		length  = 1;
		width = 1;
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(double width,double length,String color, boolean filled) {
		super(color, filled);
		this.width=width;
		this.length=length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return (length + width) * 2;
	}
	@Override
	public String toString() {
		return String.format("Rectangle[length = %f , width = %f,color=%s,filled=%s]", length,width,getColor(),isFilled()?"true":"false");
	}
	
}
package hinh;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		super();
		radius = 1;
	}
	
	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPerimeter() {
		return Math.PI*2*radius;
	}
	@Override
	public String toString() {
		return String.format("Circle[radius=%f,color=%s,filled=%s]", radius,getColor(),isFilled()?"true":"false");
	}
}
package hinh;

public class Square extends Rectangle{
        public Square() {
        super();
}
public Square(double side) {
        super(side,side);
}
public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
}
public double getSide() {
        return getLength();
}
public void setSide(double side) {
        setWidth(side);
        setLength(side);
}
@Override
public String toString() {
        return String.format("Square[Rectangle[Shape[color=%s,filled=%s],w=%f,l=%f]]", getColor(),isFilled()?"true":"false",getWidth(),getLength());
}

}


