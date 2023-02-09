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
	//xây dựng giao diện chương trình main
	//[1]ptb2
	//[2]...
	//Chon chuong trinh
}
