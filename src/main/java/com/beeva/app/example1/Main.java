package com.beeva.app.example1;

//import com.beeva.app.calculadora.Calculadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**	System.out.println("*****************************");
		//System.out.println("hi, my name is: " + args[0]);
		
		Calculadora calc = Calculadora.getInstance();
		String numStr1 = args[1];
		int a = Integer.parseInt(numStr1);
		String numStr2 = args[2];
		int b = Integer.parseInt(numStr2);
		if(args[0].compareTo("suma") == 0){
			int sumando = calc.suma(a, b);
			System.out.println("la suma de " + a + " mas " + b + " es igual a: " + sumando);
		}else if(args[0].compareTo("resta") == 0){
			int restando = calc.resta(a, b);
			System.out.println("la resta de " + a + " menos " + b + " es igual a: " + restando);
		}else {
			System.out.println("no se reconoce la opción");
		}
		/**
		 * hacer proyecto de utilerias
		 * 
		 * EN HIJOS
		 * 	<parent>
		 * <groupId>com.beeva.app</groupId>
		 * 	<artifactId>padre</artifactId>
		 * 	<version>0.0.1</version>
		 * 	<relativePath>../padre/pom.xml</relativePath>
		 * 	</parent>
		 * 
		 * 
		 * EN PADRE
		 * <packaging>pom</packaging>
		 * 
		 * debajo de version
		 * <modules>
		 * 	<module>../calculadora</module>
		 * 	<module>../hola-mundo</module>
		 * 	</modules>
		 * 
		*/
	}

}
/**
 * proceso maven
 * mvn archetype:generate -DgroupId=com.beeva.app -DartifactId=hola-mundo -DarchetypeArtifactId=maven-archetype-quickstart
 * mvn clean install -Damven.test.skip=true -X
 * mvn exec:java -Dexec.mainClass="com.beeva.app.example1.Main" -X
 * mvn exec:java -Dexec.mainClass="com.beeva.app.example1.Main"  -Dexec.args="suma 10 10"
 * 
 * 
 * */