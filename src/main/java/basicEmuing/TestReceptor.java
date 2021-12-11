package basicEmuing;

import java.util.Scanner;

public class TestReceptor {

	public TestReceptor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BasicControlador bc=new BasicControlador();
		
		boolean activo=true;
		
		Scanner scn=new Scanner(System.in);
		
		do {
			String comando=scn.nextLine();
			if(!bc.ejecutarCMD(comando))activo=false;
		} while (activo);
	}

}
