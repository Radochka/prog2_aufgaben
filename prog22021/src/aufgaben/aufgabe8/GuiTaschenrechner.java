package aufgaben.aufgabe8;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GuiTaschenrechner extends JFrame{

	
	
	public GuiTaschenrechner() {
		super();
		setTitle("Taschenrechner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = unitMainpanel();
		
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	public JPanel unitMainpanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		//верхнее полу для показа результата
		JPanel oben = new JPanel();
		oben.setLayout(new BorderLayout(30, 30));
		JButton display = new JButton("0");
        display.setEnabled(false);
        display.setFont(display.getFont().deriveFont(30f));
        oben.add(display);
        
        JPanel mitte = new JPanel();
        mitte.setLayout(new GridLayout(6, 3,20, 20));
        mitte.add(addButton("1", null));
        mitte.add(addButton("2", null));
        mitte.add(addButton("3", null));
        mitte.add(addButton("4", null));
        mitte.add(addButton("5", null));
        mitte.add(addButton("6", null));
        mitte.add(addButton("7", null));
        mitte.add(addButton("8", null));
        mitte.add(addButton("9", null));
        mitte.add(addButton("(", null));
        mitte.add(addButton("0", null));
        mitte.add(addButton(")", null));
        mitte.add(addButton("*", null));
        mitte.add(addButton("/", null));
        mitte.add(addButton("+", null));
        mitte.add(addButton("-", null));
        mitte.add(addButton(",", null));
        mitte.add(addButton("=", null));
        
        panel.add(oben, BorderLayout.NORTH);
		panel.add(mitte, BorderLayout.CENTER);
		
        
//		
		
		
		
		return panel;
		
	}
	private JButton addButton(String label, ActionListener listener) {
		JButton button = new JButton(label);
		button.setFont(button.getFont().deriveFont(20f));
		button.addActionListener(listener);
		return button;
		
	}

	public static void main(String[] args) {
		new GuiTaschenrechner();
	}
}
