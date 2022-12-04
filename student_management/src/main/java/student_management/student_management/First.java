package student_management.student_management;

import java.io.*;
 

public class First {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("PRESS 1 espace admin");
		System.out.println("PRESS 2 espace etudiant");
		
		
		int choix = Integer.parseInt(br.readLine());
	
		if(choix == 1) {
			System.out.println("Bonjour entrer votre nom: \n");
			String user = br.readLine();
			System.out.println("Bienvenue dans la zone admin " + user);
		
		
		while(true) {
			System.out.println("PRESS 1 pour ajouter un etudiant");
			System.out.println("PRESS 2 pour supprimer un etudiantt");
			System.out.println("PRESS 3 pour afficher les etudiants");
			System.out.println("PRESS 4 pour modifier un etudiant");
			System.out.println("PRESS 5 quitter");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student
				
				System.out.println("Nom: ");
				String name = br.readLine();
				System.out.println("Prenom: ");
				String lastname = br.readLine();
				System.out.println("Classe: ");
				String classe = br.readLine();
				
				//create student object
				Student st = new Student(name,lastname,classe);
				boolean ans = StudentDao.insertStudentRecordToDB(st);
				if(ans) {
					System.out.println("L'etudiant a etait ajouté avec succés");
				}else {
					System.out.println("Erreur, recommencer!");
				}
				
			}
			else if(c == 2) {
				//Delete student
				System.out.println("ID de l'etudiant a supprimer: ");
				int userID = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudentRecordFromDB(userID);
				if(f) {
					System.out.println("L'etudiant avec l'id" + userID + " a etait supprimé ");
				}else {
					System.out.println("Erreur, recommencer!");
				}
			}
			else if(c == 3) {
				//Display student
				StudentDao.showAllStudentRecords();
			}
			else if(c == 4) {
				//Update student
				System.out.println("PRESS 1 pour modifier le nom");
				System.out.println("PRESS 2 pour modifier le prenom");
				System.out.println("PRESS 3 pour modifier la classe");
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter le nom a modifier");
					String name = br.readLine();
					System.out.println("Enter l'ID de l'etudiant");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentName(name);
					boolean f = StudentDao.updateStudentRecord(val,name,id,st);
					if(f) {
						System.out.println("Le nom de l'etudiant a été modifié");
					}else {
						System.out.println("Erreur, recommencer!");
					}
				}
				else if(val == 2) {
					//Update lastname
					System.out.println("Enter le prenom a modifier");
					String lastname = br.readLine();
					System.out.println("Enter l'ID de l'etudiant");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentlastname(lastname);
					boolean f = StudentDao.updateStudentRecord(val,lastname,id,st);
					if(f) {
						System.out.println("Le prenom de l'etudiant a été modifié");
					}else {
						System.out.println("Erreur, recommencer!");
					}
				}
				else if(val == 3) {
					//Update classe
					System.out.println("Enter la classe a modifier");
					String classe = br.readLine();
					System.out.println("Enter l'ID de l'etudiant");
					int id = Integer.parseInt(br.readLine());
					Student st = new Student();
					st.setStudentclasse(classe);
					boolean f = StudentDao.updateStudentRecord(val,classe,id,st);
					if(f) {
						System.out.println("La classe de l'etudiant a été modifié");
					}else {
						System.out.println("Erreur, recommencer!");
					}
				}
				else {
					System.out.println("Erreur, recommencer!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Merci et a bientot " + user);
				break;
			}
			else {
				
			}
			
		}
		}
		else if(choix== 2) {
			System.out.println("Bonjour entrer votre nom: \n");
			String user = br.readLine();
			System.out.println("Bienvenue dans la zone étudiant " + user);
			
			while(true) {
			
				System.out.println("PRESS 1 pour afficher les informations de l'etudiant");
				System.out.println("PRESS 2 pour quitter");
				
				int c = Integer.parseInt(br.readLine());
				
				if(c == 1) {
					//Delete student
					System.out.println("Entrer votre ID:");
					int userID = Integer.parseInt(br.readLine());
					StudentDao.showStudent(userID);
					
				}
				else if(c == 2) {
					//Exit
					
					System.out.println("Merci et a bientot "+ user);
					break;
					
				}
		}}
		else {
			
		}
	}
	


}

