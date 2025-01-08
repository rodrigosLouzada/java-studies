package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.security.auth.x500.X500Principal;

public class Testes_list {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("rodrigo");
		lista.add("binho");
		lista.add("bandido");
		lista.add("gojo");
		
		lista.add(2,"BANDIDAO");
		System.out.println(lista.size());
		
		
		for(String l : lista) {
			System.out.println(l);
		}
		
		//lista.remove(3);
		//lista.remove("gojo");
		lista.removeIf(x -> x.charAt(0) == 'B');
		System.out.println("-----------");
		
		for(String l : lista) {
			System.out.println(l);
		}
		
		System.out.println("index de gojo é: " + lista.indexOf("gojo"));
		System.out.println("index de bandidao : " + lista.indexOf("BANDIDAO"));
		
		System.out.println("------------");
		
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'b').collect(Collectors.toList());
		
		for(String r: result) {
			System.out.println(r);
		}
		
		String name = lista.stream().filter(x -> x.charAt(0) == 'b').findFirst().orElse(null);
	}
	
}
