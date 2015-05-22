import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class JPanelDemo extends JFrame
	{
	private static final long serialVersionUID = 1L;
 
	public static void main(String[] args)
		{
		final JFrame frame = new JFrame("JFrame Name");
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		
		String[] preMadeArray = new String[] {"Blaziken", "Moltres", "Blastoise"}; 
		JButton button = new JButton("Enter");
		final JComboBox<String> dropdown = new JComboBox<String>(preMadeArray);
		final JLabel words = new JLabel("Choose your pokemon.");
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		frame.add(panel);
		panel.add(words);
		panel.add(dropdown);
		panel.add(button);
		button.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0) 
				{
				System.out.println(dropdown.getSelectedItem());
				System.out.println(dropdown.getSelectedIndex());
				}
			});
		
		frame.setVisible(true);
		}
	}