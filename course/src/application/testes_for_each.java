package application;

public class testes_for_each {

	public static void main(String[] args) {

		String[] letraStrings = new String[] {"a" , "b", "c"};
		
		for(int i = 0; i< letraStrings.length ; i++) {
			System.out.println(letraStrings[0]);
		}
		// ou, maneira que gera uma copia e nao lida com o elemento em si:
		
		
		for (String letra : letraStrings) {
			System.out.println(letra);
		}
		
	}

}
