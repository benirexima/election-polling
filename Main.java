package polling;

import java.util.Scanner;

public class Main {
Scanner sc=new Scanner(System.in);
	
	
	public void run() {
		Main ob=new Main();
		
		System.out.println("1.voter");
	System.out.println("2.candidate");
			 switch (sc.nextInt()) {
		 		case 1:
		 			
		 		ob.login();
		 	
		 			break;
		 		case 2:
		 			
		 			ob.clogin();
		 			
		 			break;
		 }}
	public void login() {
		Connection con=new Connection();
		System.out.println("Enter the id");
		String user=sc.next();
		System.out.println("enter the name");
         String password=sc.next();
   
        
		}
	public void clogin() {
		Connection con=new Connection();
		System.out.println("Enter the id");
		String user=sc.next();
		System.out.println("enter password");
         String password=sc.next();



	}

	public static void main(String[] args) {
		
		Connection con=new Connection();
		
	//////////////** voter values to be set---------------***********\\\\\\\
		
		Voter vote=new Voter();
    	vote.setVoterId(1001);
		vote.setUsername("benito");
		vote.setPassword("benito123");
		con.connectVoter(vote);
		
		
		Voter vote1=new Voter();
    	vote1.setVoterId(1002);
		vote1.setUsername("anish");
		vote1.setPassword("anish123");
		con.connectVoter(vote1);
		
		
		Voter vote2=new Voter();
    	vote2.setVoterId(1003);
		vote2.setUsername("anu");
		vote2.setPassword("anu123");
		con.connectVoter(vote2);
		
		
		Voter vote3=new Voter();
    	vote3.setVoterId(1004);
		vote3.setUsername("remi");
		vote3.setPassword("remi123");
		con.connectVoter(vote3);
		
		
		Voter vote4=new Voter();
    	vote4.setVoterId(1005);
		vote4.setUsername("deepika");
		vote4.setPassword("deepika123");
		con.connectVoter(vote4);
		
//////////////*****candidate values to be insert************\\\\\\\\\\\\\\
		
		candidate can=new candidate();
		can.setId(1111);
		can.setPassword("dmk1111");
		con.connectCan(can);
		
		
		candidate can1=new candidate();
		can1.setId(2222);
		can1.setPassword("admk2222");
		con.connectCan(can1);
}
}