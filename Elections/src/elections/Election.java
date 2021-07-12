package elections;

import java.util.Scanner;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		Votes tonald=new Votes();
		Votes boe=new Votes();
		Votes loki=new Votes();
		tonald.setCandidateName("Tonald Drump");
		boe.setCandidateName("Boe Jiden");
		loki.setCandidateName("Loki Laufeyson");
		
		
		System.out.println("There are three candidates that are running for presidency:");
		System.out.println(tonald.getCandidateName() +" (1)");
		System.out.println(boe.getCandidateName()+" (2)");
		System.out.println(loki.getCandidateName()+" (3)");
		System.out.println("Press the numbers near the candidates' names to vote for them");
		int choice=scanner.nextInt();
		
		
		while(tonald.getNumOfVotes()<10 && boe.getNumOfVotes()<10 && loki.getNumOfVotes()<10) {
			if(choice==1) {
				tonald.voting(1);
				System.out.println("Tonald Drump:"+tonald.getNumOfVotes());
				System.out.println("Boe Jiden:"+boe.getNumOfVotes());
				System.out.println("Loki Laufeyson:"+loki.getNumOfVotes());
				choice=scanner.nextInt();
			}
			else if(choice==2) {
				boe.voting(1);
				System.out.println("Tonald Drump:"+tonald.getNumOfVotes());
				System.out.println("Boe Jiden:"+boe.getNumOfVotes());
				System.out.println("Loki Laufeyson:"+loki.getNumOfVotes());
				choice=scanner.nextInt();
			}
			else if(choice==3) {
				loki.voting(1);
				System.out.println("Tonald Drump:"+tonald.getNumOfVotes());
				System.out.println("Boe Jiden:"+boe.getNumOfVotes());
				System.out.println("Loki Laufeyson:"+loki.getNumOfVotes());
				choice=scanner.nextInt();
			}
			else {
				System.out.println("Please enter a valid number");
				choice=scanner.nextInt();
			}
			 
			
			
		}
		
		
		
		if(tonald.getNumOfVotes()>boe.getNumOfVotes() && tonald.getNumOfVotes()>loki.getNumOfVotes()) {
			System.out.println(tonald.getCandidateName()+" is elected as the next president");
		}
		else if(boe.getNumOfVotes()>tonald.getNumOfVotes() && boe.getNumOfVotes()>loki.getNumOfVotes()) {
			System.out.println(boe.getCandidateName()+" is elected as the next president");
		}
		else if(loki.getNumOfVotes()>tonald.getNumOfVotes() && loki.getNumOfVotes()>boe.getNumOfVotes()) {
			System.out.println(loki.getCandidateName()+" is elected as the next president");
		}
			
			
		
	}

}
