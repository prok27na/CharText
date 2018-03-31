package CharCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame {
	//������� ����� ������
	static JPanel panel = new JPanel();
	// ������� ������ ��� ����� "����������"
	JButton kopirButton = new JButton("����������");
	// ������� ������ ��� ����� "��������"
	JButton zakazchButton = new JButton("��������");
	// ������� ������ ��� ������ �� ���������
	JButton exitButton = new JButton("�����");
	//������� � 1
	JLabel label=new JLabel("�������� ������������:"); 
	
	Counter() {
		super("����������� ������� ���������� ��������");
		// ���������� ��������� ��� �������� ����:
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//���������� �� �������� ������ ����� frame 
      setLocationRelativeTo(null);  
        //��������� ��������� �������� �������� ���� 
      setResizable(false);
		// ��������� �������� ���� � ������������ ���������:
		  setSize(500, 100); 
		   //��������� ������
		  panel.setLayout(new FlowLayout());
		  //��������� ����� ������
		  panel.setBackground(new Color(255,255,255)); 
		  //��������� ����� ������ "�����"
		  exitButton.setBackground(new Color(255,190,210)); 
		//���������� ������� � 1 �� ������
          panel.add(label);
        //���������� ������ "����������" �� ������
          panel.add(kopirButton); 
          //���������� ������ "��������" �� ������
          panel.add(zakazchButton);
        //���������� ������ "�����" �� ������
          panel.add(exitButton);
          //���������� ������
          add(panel);
//��������� ��������� �� ������� ������� 
kopirButton.addActionListener(new FirstB()); 
//��������� ��������� �� ������� ������� 
zakazchButton.addActionListener(new SecondB()); 
//��������� ��������� �� ������� ������� 
exitButton.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
System.exit(0); 
} 
}); 
} 

public static void main(String[] args) { 
// ������� ������ ������ Counter (������������): 
Counter rgr = new Counter(); 
// ��������� ���� ������������: 
rgr.setVisible(true); 
} 
} 
        