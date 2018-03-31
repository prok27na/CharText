package CharCalc; 

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent; 

import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.JPanel; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea; 
import javax.swing.JTextField; 

import java.awt.Color; 
import java.awt.FlowLayout; 

public class SecondB implements ActionListener { 

public void actionPerformed(ActionEvent event){ 
String jj; 
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE); 
if (jj.equals("1")==false){ 
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE); 
if (jj.equals("1")==false){ 
JOptionPane.showMessageDialog(null,"Превышен размер текста на N знаков.", null, JOptionPane.WARNING_MESSAGE); 
} 
} 
if (jj.equals("1")==true){ 
JFrame frame = new JFrame("Заказчик"); 
JPanel panel = new JPanel(); 
JPanel panel1 = new JPanel(); 
JPanel panel2 = new JPanel(); 
JPanel panel3 = new JPanel(); 
JPanel panel4 = new JPanel(); 
JPanel panel5 = new JPanel(); 
JPanel panel6 = new JPanel(); 
// Создаем кнопку для подсчета символов: 
JButton countButton = new JButton("Рассчитать количество символов"); 
JButton ochistButton = new JButton("Очистить"); 
JButton exitButton = new JButton("Выход"); 
JButton resButton = new JButton("Рассчитать стоимость"); 
JLabel label=new JLabel("Введите текст:"); //надпись № 1 
JLabel label1=new JLabel("Количество символов в тексте: "); //надпись № 2 
JLabel label2=new JLabel("Заказанное количество символов: "); //надпись № 3 
JLabel label3=new JLabel("Цена за 100 знаков:"); //надпись № 4 
JLabel label4=new JLabel("(руб.) "); //надпись № 5 
JLabel label5=new JLabel("Стоимость текста: "); //надпись № 6 
JLabel label6=new JLabel("(руб.) "); //надпись № 7 
// Создаем поле для ввода текста: 
final JTextArea area = new JTextArea("Введите сюда свой текст...",15, 40); 
JScrollPane scrollBar = new JScrollPane(area); 
frame.getContentPane().add(scrollBar, FlowLayout()); 

// Создаем поле для вывода результата: 
final JTextField result = new JTextField(30); 

final JTextField obyem = new JTextField(7); 
obyem.addKeyListener(new KeyAdapter() { 
@Override 
public void keyTyped(KeyEvent e) { 
if (obyem.getText().length() >= 7 && obyem.getText().length() != 0 ) // limit to 7 characters 
e.consume(); 
} 
}); 

final JTextField summa = new JTextField(5); 
summa.addKeyListener(new KeyAdapter() { 
@Override 
public void keyTyped(KeyEvent e) { 
if (summa.getText().length() >= 5 && summa.getText().length() != 0 ) // limit to 5 characters 
e.consume(); 
} 
}); 
final JTextField resultS = new JTextField(7); 
// Завершение программы при закрытии окна: 
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
frame.setLayout(new FlowLayout()); 
frame.setResizable(false); //запрещаем изменение размеров главного окна 
// Установка размеров окна и расположение элементов: 
exitButton.setBackground(new Color(255,190,210)); 
countButton.setBackground(new Color(165,226,179)); 
resButton.setBackground(new Color(253,253,202)); 
panel1.setBackground(new Color(205,205,205)); 
panel3.setBackground(new Color(232,242,254)); 
frame.setSize(600, 500); 
frame.setVisible(true); 
frame.add(panel); 
frame.add(panel1); 
frame.add(panel2); 
frame.add(panel3); 
frame.add(panel4); 
frame.add(panel5); 
frame.add(panel6); 

panel.add(label); 
panel1.add(scrollBar); 
panel1.add(ochistButton); 
panel3.add(countButton); 
panel3.add(resButton); 
panel2.add(label2); 
panel2.add(obyem); 
panel2.add(label3); 
panel2.add(summa); 
panel2.add(label4); 

panel4.add(label1); 
panel4.add(result); 
panel5.add(label5); 
panel5.add(resultS); 
panel5.add(label6); 
panel6.add(exitButton); 


// Запрет на ввод в поле результата: 
result.setEditable(false); 
resultS.setEditable(false); 
// Разделение текста на несколько строк: 
area.setLineWrap(true); 
// Перенос слов целиком на следующую строку: 
area.setWrapStyleWord(true); 
/* 
* Создаем "слушателя" для кнопки расчета символов. Если поле area не пустое, то 
* подсчитывается количество символов и слов, иначе выводит ошибку: 
*/ 

countButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
if (area.getText().trim().length() != 0) 
result.setText("Количество символов: " + area.getText().length() + ". Количество слов: " 
+ area.getText().trim().split("\\s+").length); 
else 
result.setText("Сперва введите текст!"); 
} 
}); 
resButton.addActionListener(new ActionListener() { 
@Override 
public void actionPerformed(ActionEvent e) { 
//if (area.getText().trim().length() != 0) 
// 
//else 
// 
} 
}); 

ochistButton.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
area.setText(null); 
} 
}); 
exitButton.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
System.exit(0); 
} 
}); 
}} 

private Object FlowLayout() { 
// TODO Auto-generated method stub 
return null; 
} 
} 