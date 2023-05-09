package task9;
/* @author Ivan Heaslip */
import static java.lang.System.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txtfile = "data/data.txt";
		try {
			GameApp app = new GameApp(txtfile);
			app.game();
		}catch(IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n",
					new Main().getClass().getPackage().getName(), txtfile);
		}

	}
}
