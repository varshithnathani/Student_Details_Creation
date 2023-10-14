class Campus{
	public static void main(String[] args){

		// creating Instance for StudentDetails 
		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails();


		// accessing the new StudentDetails()   s1
		// In this stage Instance will be converted to Object
		s1.StudentId		= 7001;
		s1.StudentName		= "Varshith Nathani";
		s1.Stream			= "CSE CORE";
		s1.Fee				= 195000.0;
		s1.phone			= new long[]{9014561315L,9989510813L};
		s1.FatherMobile		= 9989510813L;
		s1.Address			= "Martur, AP, 523301";
		s1.Activities		= new String[]{"Java","DSA","Chess"};


		// accessing the new StudentDetails()   s2
		// In this stage Instance will be converted to Object
		s2.StudentId		= 7002;
		s2.StudentName		= "Ashok Nathani";
		s2.Stream			= "CSE Marketing";
		s2.Fee				= 195000.0;
		s2.phone			= new long[]{9014561315L,9989510813L};
		s2.FatherMobile		= 9989510813L;
		s2.Address			= "Martur, AP, 523301";
		s2.Activities		= new String[]{"Marketing","Accounting"};

		// Accessing the Student 1 details to display in the console

		System.out.println("\nStudent 1 Details:");
		System.out.println();

		System.out.println("s1.CampusName\t\t\t:"+s1.CampusName);
		System.out.println("s1.Location\t\t\t:"+s1.Location);
		System.out.println("s1.StudentId\t\t\t:"+s1.StudentId);
		System.out.println("s1.StudentName\t\t\t:"+s1.StudentName);
		System.out.println("s1.Stream\t\t\t:"+s1.Stream);
		System.out.println("s1.Fee)\t\t\t\t:"+s1.Fee);
		System.out.println();
		System.out.println("Method 1 to access the array s1.phone[0]\n");

		System.out.println("s1.phone[0]\t\t\t:"+s1.phone[0]);
		System.out.println("s1.phone[1]\t\t\t:"+s1.phone[1]);

		System.out.println("\nAnother Method to access the Array is java.util.Arrays.toString\n");
		System.out.println("s1.phone\t\t\t:"+java.util.Arrays.toString(s1.phone));
		System.out.println(); // To get space

		System.out.println("s1.FatherMobile\t\t\t:"+s1.FatherMobile);
		System.out.println("s1.Address\t\t\t:"+s1.Address);
		/*System.out.println(s1.Activities[0]);
		System.out.println(s1.Activities[1]);
		System.out.println(s1.Activities[2]);
		*/
		System.out.println("s1.Activities\t\t\t:"+java.util.Arrays.toString(s1.Activities));


		System.out.println();
		System.out.println();

		// Accessing the Student 1 details to display in the console
		
		System.out.println("\nStudent 2 Details:");
		System.out.println();


		System.out.println("s2.CampusName\t\t\t:"+	s2.CampusName);
		System.out.println("s2.Location\t\t\t:"+	s2.Location);
		System.out.println("s2.StudentId\t\t\t:"+	s2.StudentId);
		System.out.println("s2.StudentName\t\t\t:"+	s2.StudentName);
		System.out.println("s2.Stream\t\t\t:"+		s2.Stream);
		System.out.println("s2.Fee)\t\t\t\t:"+		s2.Fee);
		System.out.println();
		System.out.println("Method 1 to access the array s2.phone[0]\n");

		System.out.println("s2.phone[0]\t\t\t:"+	s2.phone[0]);
		System.out.println("s2.phone[1]\t\t\t:"+	s2.phone[1]);

		System.out.println("\nAnother Method to access the Array is java.util.Arrays.toString\n");
		System.out.println("s2.phone\t\t\t:"+java.util.Arrays.toString(s2.phone));
		System.out.println(); // To get space

		System.out.println("s2.FatherMobile\t\t\t:"+s2.FatherMobile);
		System.out.println("s2.Address\t\t\t:"+		s2.Address);
		/*System.out.println(s2.Activities[0]);
		System.out.println(s2.Activities[1]);
		
		*/
		System.out.println("s1.Activities\t\t\t:"+java.util.Arrays.toString(s2.Activities));


		
	}
}
