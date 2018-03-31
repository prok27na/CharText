package CharCalc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame {
	//Создаем новую панель
	static JPanel panel = new JPanel();
	// Создаем кнопку для формы "Копирайтер"
	JButton kopirButton = new JButton("Копирайтер");
	// Создаем кнопку для формы "Заказчик"
	JButton zakazchButton = new JButton("Заказчик");
	// Создаем кнопку для выхода из программы
	JButton exitButton = new JButton("Выход");
	//надпись № 1
	JLabel label=new JLabel("Выберите пользователя:"); 
	
	Counter() {
		super("Калькулятор расчета количества символов");
		// Завершение программы при закрытии окна:
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//разместить по середине экрана форму frame 
      setLocationRelativeTo(null);  
        //запрещаем изменение размеров главного окна 
      setResizable(false);
		// Установка размеров окна и расположение элементов:
		  setSize(500, 100); 
		   //Установка панели
		  panel.setLayout(new FlowLayout());
		  //Установка цвета панели
		  panel.setBackground(new Color(255,255,255)); 
		  //Установка цвета кнопки "Выход"
		  exitButton.setBackground(new Color(255,190,210)); 
		//Добавление надписи № 1 на панель
          panel.add(label);
        //Добавление кнопки "Копирайтер" на панель
          panel.add(kopirButton); 
          //Добавление кнопки "Заказчик" на панель
          panel.add(zakazchButton);
        //Добавление кнопки "Выход" на панель
          panel.add(exitButton);
          //Добавление панели
          add(panel);
        