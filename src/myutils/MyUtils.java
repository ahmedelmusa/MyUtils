package myutils;

import static java.lang.Math.sqrt;
import java.util.Scanner;

//MyUtils.java sınıfındaki bütün metotlar statik olmalıdır.
public class MyUtils {

    public static void main(String[] args) {
        ucgenCevre();
        ucgenAlan();
        cokgenCevre();
        cokgenAlan();
        fx1();
        fx2();
    }
    //Bir üçgenin çevresini bulan
     public static float ucgenCevre() {
         //üçgen Çevresi Hesaplama için
         //üçgen Çevresi = kenarların toplamı dir
        float a , b , c;
        float cevre;
        System.out.println("Üçgen Cevresi Hesaplama ");
        
        System.out.print("Birnci keneri giriniz :");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        
        System.out.print("ikinci keneri giriniz :");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        
        System.out.print("ücünü keneri giriniz :");
         Scanner scc = new Scanner(System.in);
        c = scc.nextInt();
        
        cevre = a+b+c;
        System.out.println("Girilen üçgeninin çevresi : "+cevre);

        return 0;
     }
    //Bir üçgenin alanını bulan
     public static float ucgenAlan() {
        //Eşkenar üçgen Alani Hesaplama için
         //Eşkenar üçgen = 1/2 * yüksiklik * tabanı .dir
        float a , b ;
        float alan;
        System.out.println("-------------------------------");
        System.out.println("Eşkenar üçgen Alani Hesaplama ");
        
        System.out.print("yüksikliği giriniz :");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        
        System.out.print("tabanı giriniz :");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        
        
        alan = a*b/2;
        System.out.println("Girilen üçgeninin Alanı : "+alan);

        return 0;
     }
    //Bir çokgenin çevresini bulan
     public static float cokgenCevre() {
         //Düzgün Çokgen Çevresi Hesaplama için
         //Çokgen çevresi = Kenar sayısını * kenar ölçüsü .dir
        float a , b ;
        float cevre;
        System.out.println("-------------------------------");
        System.out.println("Düzgün Çokgen Cevresi Hesaplama ");
        
        System.out.print("Kenar sayısını giriniz :");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        
        System.out.print("hangi bir keneri ölçüsü giriniz :");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        

        
        cevre = a*b;
        System.out.println("Girilen üçgeninin çevresi : "+cevre);

        return 0;
     }
    //Bir çokgenin alanını bulan
     public static float cokgenAlan() {
         //Düzgün Çokgen Alanı Hesaplama için
         //Çokgen Alanı = 1/2 * çevre * yarıçaplı .dir
     
         float a ,b,c ;
        float Alan;
        
        System.out.println("-------------------------------");
        System.out.println("Düzgün Çokgen Alanı Hesaplama ");
        
        System.out.print("Kenar sayısını giriniz :");
        Scanner sca = new Scanner(System.in);
        a = sca.nextInt();
        
        System.out.print("hangi bir keneri ölçüsü giriniz :");
        Scanner scb = new Scanner(System.in);
        b = scb.nextInt();
        
        System.out.print("iç Yariçaplı giriniz : ");
        Scanner scc = new Scanner(System.in);
        c = scb.nextInt();

        Alan = (a*b*c)/(2);
        System.out.println("Girilen üçgeninin Alanı : "+Alan);

        return 0;
     }
    //-100 ile 100 arasındaki tamsayılar , Birinci Fonkisyonu
     public static double fx1() {
         
         System.out.println("-----------------------");
         System.out.println("Birinci Fonksiyonu Hesaplama");
         
         // e sayi sabittir 
         double e=2.718;
         int [] diz1=new int[201];
         double []diz2=new double[201];
        
        
           for (int i=0;i<=200;i++){
            
            diz1[i]=i-100;
            System.out.println("Dizinin Elemanlari= " + diz1[i]);
            diz2[i]=1/1+(Math.pow(e,diz1[i]));
            System.out.println("f(x)= " + diz2[i]);
        
     }
           return 0;
     }   
    //-100 ile 100 arasındaki tamsayılar , ikinci Fonkisyonu
     public static double fx2() {
          
         System.out.println("-----------------------");
         System.out.println("Ikinci Fonksiyonu Hesaplama");
         
         // e sayi sabittir
         double e=2.718;
         int [] diz1=new int[201];
         double []diz2=new double[201];
        
        
           for (int i=0;i<=200;i++){
            
            diz1[i]=i-100;
            System.out.println("Dizinin Elemanlari= " + diz1[i]);
            
            diz2[i]=3*(diz1[i]*diz1[i])-2*(Math.pow(e,diz1[i]))+sqrt(diz1[i]);
           
            System.out.println("f(x)= " + diz2[i]);      
         } 
        
        return 0;
     }
    }
    

