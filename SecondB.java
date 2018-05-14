/**
 * Указание пакета, в котором находится код программы
 */
package CharCalc;
/**
 * Импортирование библиотек необходимых для работы программы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
/**
 * объявление класса SecondB
 */
public class SecondB implements ActionListener {
public void actionPerformed(ActionEvent event){
/**
 * Объявление новой переменной jj
 */
String jj;
/**
 * Создание диалогового окна для проверки пароля
 */
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE);
/**
 * Если пароль введен неверно, то
 */
if (jj.equals("1")==false){
/**
 * Создание диалогового окна для повторной проверки пароля
 */
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE);
/**
 * Если пароль введен неверно, то
 */
if (jj.equals("1")==false){
/**Создание диалогового окна для выхода из программы*/	
JOptionPane.showMessageDialog(null,"Пароль неверный, попробуйте вести его позже", null, JOptionPane.WARNING_MESSAGE);
}
}
/**
 * Если пароль введен верно, то
 */
if (jj.equals("1")==true){
/**
 * Создаем нового окна "Заказчик"
 */
JFrame frame = new JFrame("Заказчик");
/**
 * Создаем новую панель
 */
JPanel panel = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel1 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel2 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel3 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel4 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel5 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel6 = new JPanel();
/**
 * Создаем кнопку для подсчета символов
 */
JButton countButton = new JButton("Рассчитать количество символов");
/**
 * Создаем кнопку для очистки текстового поля
 */
JButton ochistButton = new JButton("Очистить");
/**
 *  Создаем кнопку для выхода из программы
 */
JButton exitButton = new JButton("Выход");
/**
 *  Создаем кнопку для расчета стоимости текста
 */
JButton resButton = new JButton("Расчитать стоимость");
/**
 * надпись № 1
 */
JLabel label=new JLabel("Введите текст:");
/**
 * надпись № 2
 */
JLabel label1=new JLabel("Количество символов в тексте: ");
/**
 * надпись № 3
 */
JLabel label2=new JLabel("Заказанное количество символов: ");
/**
 * надпись № 4
 *
 */
JLabel label3=new JLabel("Цена за 100 знаков:");
/**
 * надпись № 5
 */
JLabel label4=new JLabel("(руб.) ");
/**
 * надпись № 6
 */
JLabel label5=new JLabel("Стоимость текста: ");
/**
 * надпись № 7
 */
JLabel label6=new JLabel("(руб.) ");
/**
 * Создаем поле для ввода текста:
 */
final JTextArea area = new JTextArea("Введите сюда свой текст...",15, 40);
/**
 * Создаем полосу прокрутки
 */
JScrollPane scrollBar = new JScrollPane(area);
/**
 * Добавляем полосу прокрутки на текстовое поле
 */
frame.getContentPane().add(scrollBar);
/**
 *  Создаем поле для вывода результата
 */
final JTextField result = new JTextField(30);
 /**
  *  Создаем поле для ввода количества знаков
  */
final JTextField obyem = new JTextField(7);
 /**
  *  Создание ограничения на ввод количества символов в текстовое поле "summa"
  */
final JTextField summa = new JTextField(5);
/**
 * Создаем поле для вывода результата расчета стоимости текста
 */
final JTextField resultS = new JTextField(7);
/**
 *  Завершение программы при закрытии окна
 */
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
/**
 * Устанавливаем способ расположения элементов на форме
 */
frame.setLayout(new FlowLayout());
/**
 * Запрещаем изменение размеров главного окна
 */
frame.setResizable(false);
/**
 *  Установка размеров окна
 */
frame.setSize(600, 500);
/**
 * Запуск окна
 */
frame.setVisible(true);
/**
 * Установка цвета кнопки "Выход"
 */
exitButton.setBackground(new Color(255,190,210));
/**
 * Установка цвета кнопки "Расчитать количество символов"
 */
countButton.setBackground(new Color(165,226,179));
/**
 * Установка цвета кнопки "Расчитать стоимость"
 */
resButton.setBackground(new Color(253,253,202));
/**
 * Установка цвета панели
 */
panel1.setBackground(new Color(205,205,205));
/**
 * Установка цвета панели
 */
panel3.setBackground(new Color(232,242,254));
/**
 * Добавление панели на окно
 */
frame.add(panel);
/**
 * Добавление панели на окно
 */
frame.add(panel1);
/**
 * Добавление панели на окно
 */
frame.add(panel2);
/**
 * Добавление панели на окно
 */
frame.add(panel3);
/**
 * Добавление панели на окно
 */
frame.add(panel4);
/**
 * Добавление панели на окно
 */
frame.add(panel5);
/**
 * Добавление панели на окно
 */
frame.add(panel6);
 /**
  * Добавление надписи № 1 на панель
  */  
panel.add(label);
/**
 * Добавление полосы прокрутки на панель
 */
panel1.add(scrollBar);
/**
 * Добавление кнопки "Очистить" на панель
 */
panel1.add(ochistButton);
/**
 * Добавление кнопки "Расчитать количество символов" на панель
 */
panel3.add(countButton);
/**
 * Добавление кнопки "Расчитать стоимость" на панель
 */
panel3.add(resButton);
/**
 * Добавление надписи № 2 на панель
 */
panel2.add(label2);
/**
 * Добавление текствого поля на панель
 */
panel2.add(obyem);
/**
 * Добавление надписи № 3 на панель
 */
panel2.add(label3);
/**
 * Добавление текствого поля на панель
 */
panel2.add(summa);
/**
 * Добавление надписи № 4 на панель
 */
panel2.add(label4);
 /**
  * Добавление надписи № 5 на панель
  */
panel4.add(label1);
/**
 * Добавление текствого поля на панель
 */
panel4.add(result);
/**
 * Добавление надписи № 6 на панель
 */
panel5.add(label5);
/**
 * Добавление текствого поля на панель
 */
panel5.add(resultS);
/**
 * Добавление надписи № 7 на панель
 */
panel5.add(label6);
/**
 * Добавление кнопки "Выход" на панель
 */
panel6.add(exitButton);
/**
 * Запрет на ввод в поле результата:
 */
result.setEditable(false);
/**
 * Запрет на изменение размеров окна
 */
resultS.setEditable(false);
/**
 * Разделение текста на несколько строк:
 */
area.setLineWrap(true);
/**
 *  Перенос слов целиком на следующую строку:
 */
area.setWrapStyleWord(true);
/**
 *  Создаем "слушателя" для кнопки расчета символов. Если
 *  поле area не пустое, то подсчитывается количество символов
 *   и слов, иначе выводит ошибку:"Сперва введите текст!"
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
/**
 * Создаем "слушателя" для кнопки расчета стоимости текста
 */
resButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0);
/**
 * читаем с текстового поля текст, преобразуем в Double
*/
Double summ1a = Double.valueOf(obyem.getText());
/**
 * читаем с текстового поля текст, преобразуем в Double
 */
Double a = Double.valueOf(summa.getText());
a = a*(summ1a/100);
/**
 *  вывод обратно результата в текстовое поле
 */
resultS.setText(a.toString());
}
});
/**
 * Указание пакета, в котором находится код программы
 */
package CharCalc;
/**
 * Импортирование библиотек необходимых для работы программы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
/**
 * объявление класса SecondB
 */
public class SecondB implements ActionListener {
public void actionPerformed(ActionEvent event){
/**
 * Объявление новой переменной jj
 */
String jj;
/**
 * Создание диалогового окна для проверки пароля
 */
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE);
/**
 * Если пароль введен неверно, то
 */
if (jj.equals("1")==false){
/**
 * Создание диалогового окна для повторной проверки пароля
 */
jj=JOptionPane.showInputDialog(null, "Введите ПАРОЛЬ", null, JOptionPane.INFORMATION_MESSAGE);
/**
 * Если пароль введен неверно, то
 */
if (jj.equals("1")==false){
/**Создание диалогового окна для выхода из программы*/	
JOptionPane.showMessageDialog(null,"Пароль неверный, попробуйте вести его позже", null, JOptionPane.WARNING_MESSAGE);
}
}
/**
 * Если пароль введен верно, то
 */
if (jj.equals("1")==true){
/**
 * Создаем нового окна "Заказчик"
 */
JFrame frame = new JFrame("Заказчик");
/**
 * Создаем новую панель
 */
JPanel panel = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel1 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel2 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel3 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel4 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel5 = new JPanel();
/**
 * Создаем новую панель
 */
JPanel panel6 = new JPanel();
/**
 * Создаем кнопку для подсчета символов
 */
JButton countButton = new JButton("Рассчитать количество символов");
/**
 * Создаем кнопку для очистки текстового поля
 */
JButton ochistButton = new JButton("Очистить");
/**
 *  Создаем кнопку для выхода из программы
 */
JButton exitButton = new JButton("Выход");
/**
 *  Создаем кнопку для расчета стоимости текста
 */
JButton resButton = new JButton("Расчитать стоимость");
/**
 * надпись № 1
 */
JLabel label=new JLabel("Введите текст:");
/**
 * надпись № 2
 */
JLabel label1=new JLabel("Количество символов в тексте: ");
/**
 * надпись № 3
 */
JLabel label2=new JLabel("Заказанное количество символов: ");
/**
 * надпись № 4
 *
 */
JLabel label3=new JLabel("Цена за 100 знаков:");
/**
 * надпись № 5
 */
JLabel label4=new JLabel("(руб.) ");
/**
 * надпись № 6
 */
JLabel label5=new JLabel("Стоимость текста: ");
/**
 * надпись № 7
 */
JLabel label6=new JLabel("(руб.) ");
/**
 * Создаем поле для ввода текста:
 */
final JTextArea area = new JTextArea("Введите сюда свой текст...",15, 40);
/**
 * Создаем полосу прокрутки
 */
JScrollPane scrollBar = new JScrollPane(area);
/**
 * Добавляем полосу прокрутки на текстовое поле
 */
frame.getContentPane().add(scrollBar);
/**
 *  Создаем поле для вывода результата
 */
final JTextField result = new JTextField(30);
 /** 
* Создание ограничения на ввод количества символов в текстовое поле "obyem" 
*/ 
obyem.addKeyListener(new KeyAdapter() { 
public void keyTyped(KeyEvent e) { 
char c = e.getKeyChar(); 
if ( ((c < '0') || (c > '9'))) { 
e.consume(); 
} 
} 
}); 
/*
* Создание ограничения на ввод количества символов в текстовое поле "summa"
*/ 
final JTextField summa = new JTextField(5); 
summa.addKeyListener(new KeyAdapter() { 
@Override 
public void keyTyped(KeyEvent e) { 
char c1 = e.getKeyChar(); 
if ( ((c1 < '0') || (c1 > '9'))) { 
e.consume(); 
} 
} 
});
/**
 * Создаем поле для вывода результата расчета стоимости текста
 */
final JTextField resultS = new JTextField(7);
/**
 *  Завершение программы при закрытии окна
 */
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
/**
 * Устанавливаем способ расположения элементов на форме
 */
frame.setLayout(new FlowLayout());
/**
 * Запрещаем изменение размеров главного окна
 */
frame.setResizable(false);
/**
 *  Установка размеров окна
 */
frame.setSize(600, 500);
/**
 * Запуск окна
 */
frame.setVisible(true);
/**
 * Установка цвета кнопки "Выход"
 */
exitButton.setBackground(new Color(255,190,210));
/**
 * Установка цвета кнопки "Расчитать количество символов"
 */
countButton.setBackground(new Color(165,226,179));
/**
 * Установка цвета кнопки "Расчитать стоимость"
 */
resButton.setBackground(new Color(253,253,202));
/**
 * Установка цвета панели
 */
panel1.setBackground(new Color(205,205,205));
/**
 * Установка цвета панели
 */
panel3.setBackground(new Color(232,242,254));
/**
 * Добавление панели на окно
 */
frame.add(panel);
/**
 * Добавление панели на окно
 */
frame.add(panel1);
/**
 * Добавление панели на окно
 */
frame.add(panel2);
/**
 * Добавление панели на окно
 */
frame.add(panel3);
/**
 * Добавление панели на окно
 */
frame.add(panel4);
/**
 * Добавление панели на окно
 */
frame.add(panel5);
/**
 * Добавление панели на окно
 */
frame.add(panel6);
 /**
  * Добавление надписи № 1 на панель
  */  
panel.add(label);
/**
 * Добавление полосы прокрутки на панель
 */
panel1.add(scrollBar);
/**
 * Добавление кнопки "Очистить" на панель
 */
panel1.add(ochistButton);
/**
 * Добавление кнопки "Расчитать количество символов" на панель
 */
panel3.add(countButton);
/**
 * Добавление кнопки "Расчитать стоимость" на панель
 */
panel3.add(resButton);
/**
 * Добавление надписи № 2 на панель
 */
panel2.add(label2);
/**
 * Добавление текствого поля на панель
 */
panel2.add(obyem);
/**
 * Добавление надписи № 3 на панель
 */
panel2.add(label3);
/**
 * Добавление текствого поля на панель
 */
panel2.add(summa);
/**
 * Добавление надписи № 4 на панель
 */
panel2.add(label4);
 /**
  * Добавление надписи № 5 на панель
  */
panel4.add(label1);
/**
 * Добавление текствого поля на панель
 */
panel4.add(result);
/**
 * Добавление надписи № 6 на панель
 */
panel5.add(label5);
/**
 * Добавление текствого поля на панель
 */
panel5.add(resultS);
/**
 * Добавление надписи № 7 на панель
 */
panel5.add(label6);
/**
 * Добавление кнопки "Выход" на панель
 */
panel6.add(exitButton);
/**
 * Запрет на ввод в поле результата:
 */
result.setEditable(false);
/**
 * Запрет на изменение размеров окна
 */
resultS.setEditable(false);
/**
 * Разделение текста на несколько строк:
 */
area.setLineWrap(true);
/**
 *  Перенос слов целиком на следующую строку:
 */
area.setWrapStyleWord(true);
/**
 *  Создаем "слушателя" для кнопки расчета символов. Если
 *  поле area не пустое, то подсчитывается количество символов
 *   и слов, иначе выводит ошибку:"Сперва введите текст!"
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
/**
 * Создаем "слушателя" для кнопки расчета стоимости текста
 */
resButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0);
/**
 * читаем с текстового поля текст, преобразуем в Double
*/
Double summ1a = Double.valueOf(obyem.getText());
/**
 * читаем с текстового поля текст, преобразуем в Double
 */
Double a = Double.valueOf(summa.getText());
a = a*(summ1a/100);
/**
 *  вывод обратно результата в текстовое поле
 */
resultS.setText(a.toString());
}
});
