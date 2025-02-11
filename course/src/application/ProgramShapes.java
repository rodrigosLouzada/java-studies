package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

public class ProgramShapes {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Shape> list = new ArrayList<Shape>();
		
		System.out.println("quantas formas?");
		Integer num = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= num; i++) {
			System.out.println("qual o formato? circle, rectangle");
			String resposta = scanner.nextLine().toUpperCase();
			
			System.out.println("qual é a cor dele? black/blue/red");
			String cor = scanner.nextLine().toUpperCase();
			Colors color = Colors.valueOf(cor);
			
			if(resposta.equals("CIRCLE")) {
				System.out.println("qual é o raio do circulo?");
				Double radius = scanner.nextDouble();
				scanner.nextLine();
				Circle circle = new Circle(color, radius);
				
				list.add(circle);
				
			}else if(resposta.equals("RECTANGLE")) {
				System.out.println("qual é a altura?");
				Double height = scanner.nextDouble();
				
				System.out.println("qual é a largura");
				Double width = scanner.nextDouble();
				scanner.nextLine();
				Rectangle rectangle = new Rectangle(color, width, height);
				
				list.add(rectangle);
			}
			
			}
		System.out.println("areas: ");
		for(Shape s : list) {
			System.out.println(s.area());
		}
	}

}
