import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class FirstWindows extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MenuBar menubar;
	Menu menu1, menu2, menu3, menu4, menu5;
	MenuItem item1, item2,item3;

	FirstWindows(String s) {
		setTitle(s);
		setDefaultCloseOperation(FirstWindows.EXIT_ON_CLOSE);
		Toolkit tool = getToolkit();
		Dimension dim = tool.getScreenSize();
		setBounds(0, 0, dim.width / 2, dim.height / 2);
		menubar = new MenuBar();
		menu1 = new Menu("文件(F)");
		menu2 = new Menu("编辑(E)");
		menu3 = new Menu("格式(O)");
		menu4 = new Menu("查看(V)");
		menu5 = new Menu("帮助(H)");
		item1 = new MenuItem("新建(N)	Ctrl+N");
		item2 = new MenuItem("打开(O)	Ctrl+O");
		item3 = new MenuItem("保存(S)	Ctrl+S");  
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		item1 = new MenuItem("新建	Ctrl+N");
		item2 = new MenuItem("打开	Ctrl+O");
		item3 = new MenuItem("保存	Ctrl+S");  
		menu2.add(item1);
		menu2.add(item2);
		menu2.add(item3);
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		menubar.add(menu4);
		menubar.add(menu5);
		JPanel topPanel = new JPanel();
		getContentPane().add(topPanel, BorderLayout.NORTH);
		// 创建搜索输入框,可编辑,左侧输入,25列
		JTextField input = new JTextField();
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT);
		input.setColumns(25);
		topPanel.add(input);

		setMenuBar(menubar);
		setVisible(true);
	}
}

public class Example9 {
	public static void main(String[] args) {
		new FirstWindows("记事本");
	}
}
