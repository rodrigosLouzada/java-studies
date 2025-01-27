package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class ProgramSocialMedia {

	public static void main(String[] args) throws ParseException {
			
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("faça um comentário");
		String comentario = scanner.nextLine();
		
		Comment c2 = new Comment("nice holiday");
		Comment c1 = new Comment(comentario);
		
		Post p1 = new Post(sdf.parse("13/02/1998 12:00:01"), "titulo: boa viagem"," comentario: que  cidade linda", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		
	}

}
