package Ders2;

public class Main {

	public static void main(String[] args) {
		
		Product1 product1_1=new Product1();
		product1_1.courseId=1;
		product1_1.courseName="Yazýlým Geliþtirme Kampý C# Anular";
		product1_1.coursePhotoWayInServer="Sunucuda bir yer";
		product1_1.courseCompletionCounterPercent=15;
		product1_1.teacherName="Engin Demiroð";
		
		Product1 product1_2=new Product1();
		product1_2.courseId=2;
		product1_2.courseName="Yazýlým Geliþtirme Kampý Java React";
		product1_2.coursePhotoWayInServer="Sunucuda ikinci bir yer";
		product1_2.courseCompletionCounterPercent=40;
		product1_2.teacherName="Engin Demiroð";
		
		
		
		
		Product2 birinciGun=new Product2();
		birinciGun.syllabus="Ders Programý";
		birinciGun.record="1. Gün Sonu Kayýt";
		birinciGun.homework1="Ödev 1";
		birinciGun.homework2="Ödev 2";
		birinciGun.homework3="Ödev 3";
		birinciGun.degerlendirme="Üzerimizdeki emekleri için Engin Demiroð'a ve isimlerini bilmediðim ekibine çok teþþekkür ederim..";
		
		Product2 ikinciGun=new Product2();
		ikinciGun.syllabus="Ders Programý";
		ikinciGun.record="2. Gün Sonu Kayýt";
		ikinciGun.homework1="Ödev 1";
		ikinciGun.homework2="Ödev 2";
		ikinciGun.homework3="Ödev 3";
		ikinciGun.degerlendirme="Üzerimizdeki emekleri için Engin Demiroð'a ve isimlerini bilmediðim ekibine çok teþþekkür ederim..";
		
		
		Product1[] product1s= {product1_1,product1_2};
		Product2[] product2s= {birinciGun,ikinciGun};
		
		for (Product1 product1:product1s) {
			sirala(product1);
		}
		System.out.println();
		System.out.println();
		
		for (Product2 product2 : product2s) {
			listele(product2);
		}
		
		
	}
	
	public static void sirala(Product1 product1) {
		System.out.println(product1.courseName+" Course Informations");
		System.out.println("--------");
		System.out.println("Course id : "+product1.courseId);
		System.out.println("Course photo way in server : "+product1.coursePhotoWayInServer);
		System.out.println("Course name : "+product1.courseName);
		System.out.println("Course's teacher's name : "+product1.teacherName);
		System.out.println("Course Completion Counter Percent : %"+product1.courseCompletionCounterPercent);
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
	}
	public static void listele(Product2 product2) {
		System.out.println("This Course's Syllabus Informations");
		System.out.println("--------");
		System.out.println("Course syllabus : "+product2.syllabus);
		System.out.println("Course's record : "+product2.record);
		System.out.println("Homework 1 : "+product2.homework1);
		System.out.println("Homework 2 : "+product2.homework2);
		System.out.println("Homework 3 : "+product2.homework3);
		System.out.println("Course evaluation : "+product2.degerlendirme);
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
	}
	

}
