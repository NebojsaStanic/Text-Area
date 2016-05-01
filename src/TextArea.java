import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextArea implements ActionListener{
	
	JTextArea text;

	public static void main(String[] args) {
		TextArea gui = new TextArea();
		gui.go();
	}

	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		button.addActionListener(this);
		
		text = new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		panel.add(scroller);
		
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		
		frame.setSize(350, 300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev){
		text.append("button clicked \n");
	}
	
}
