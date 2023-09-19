package methodoutput;

import testingaAuto.Carmethod;

public class BMWcarTest {

	public static void main(String[] args) {
		
		Carmethod.start();
		
        Carmethod sport = new Carmethod();
        
        sport.invokeSportDrive();
        
        Carmethod.stop();
	}

}
