package practice;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Gui {
	public class GuiFrame extends JFrame{
			}
	public static void main(String[] args)
	{
	java.lang.String fn=JOptionPane.showInputDialog("show first num:");
	java.lang.String sn=JOptionPane.showInputDialog("show second num:");
	int number1=Integer.parseInt(fn);
	int number2=Integer.parseInt(sn);
	int sum=number1+number2;
	JOptionPane.showMessageDialog(null, "the answer is:"+sum+"fdf");
	}
	
}
