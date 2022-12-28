import javax.swing.*;
public class ContohOptionPane {

	public static void main(String[] args) {
		JFrame kotak;
		kotak=new JFrame();
		String name = JOptionPane.showInputDialog(kotak,"Masukan nama Anda");
		JOptionPane.showMessageDialog(kotak,"selamat Datang," + name);

	}

}
