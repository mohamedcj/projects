package githubHello;

public class GitHubHello {

	public static void main(String[] args) {
		String[] names = {"Abdessalam","Maryem", "Selsabil", "Sirine", "Beya", "Yacine", "Sara", "Mohammed Aziz", "Sophia" };

		// a greeting msg pour les bons amis !!!
		for(String name : names){
			System.out.println( greetingMsg()+ name);
			System.out.println("How ate you today?");
			System.out.println(aplus());
		}
		
		Television tv = new Television(1, "tva", "La chaine la plus ...");
		System.out.println(tv.toString());
		//Ajouter ce commentaire pour tester git

	}
	
	private static String aplus(){
		return "Au revoir et à la prochaine.";
	}
	

	private static String greetingMsg(){
		return "Hi my name is: ";
	}
	
}
