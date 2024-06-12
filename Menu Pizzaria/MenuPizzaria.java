package menupizzaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MenuPizzaria implements ActionListener {

	private static final String CADASTRO = "Cadastro";
	private static final String SUB_MENU = "Sub Menu";
	private static final String ITEM_1 = "Item 1";
	private static final String ITEM_2 = "Item 2";
	private static final String ITEM_3 = "Item 3";
	private static final String ITEM_4 = "Item 4";
	private static final String ITEM_5 = "Item 5";

	private JMenu menu, submenu;
	private JMenuItem i1, i2, i3, i4, i5;

	public MenuPizzaria() {

		JFrame frame = new JFrame("Menu Principal");

		JMenuBar menuBar = new JMenuBar();
		menu = new JMenu(CADASTRO);
		submenu = new JMenu(SUB_MENU);

		i1 = new JMenuItem(ITEM_1);
		i2 = new JMenuItem(ITEM_2);
		i3 = new JMenuItem(ITEM_3);
		i4 = new JMenuItem(ITEM_4);
		i5 = new JMenuItem(ITEM_5);

		addMenuItemListeners();

		menu.add(i1);
		menu.add(i2);
		menu.add(i3);

		submenu.add(i4);
		submenu.add(i5);

		menu.add(submenu);
		menuBar.add(menu);

		frame.setJMenuBar(menuBar);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		addComponentsToFrame(frame);

		frame.setVisible(true);
	}

	private void addMenuItemListeners() {
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		i5.addActionListener(this);
	}

	private void addComponentsToFrame(JFrame frame) {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Bem-vindo à Pizzaria!");
		JButton button = new JButton("Clique aqui");

		button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Botão clicado"));

		panel.add(label);
		panel.add(button);

		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem source = (JMenuItem) e.getSource();
		String item = source.getText();

		switch (item) {
		case ITEM_1:
			System.out.println(ITEM_1 + " selecionado");
			break;
		case ITEM_2:
			System.out.println(ITEM_2 + " selecionado");
			break;
		case ITEM_3:
			System.out.println(ITEM_3 + " selecionado");
			break;
		case ITEM_4:
			System.out.println(ITEM_4 + " selecionado");
			break;
		case ITEM_5:
			System.out.println(ITEM_5 + " selecionado");
			break;
		default:
			System.out.println("Item desconhecido selecionado");
			break;
		}
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(MenuPizzaria::new);
	}
}