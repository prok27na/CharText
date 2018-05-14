/**
* Создаем поле для ввода текста:
* */
final JTextArea area = new JTextArea("Введите сюда свой текст...",20, 50);
/**
* Создаем полосу прокрутки
*/
JScrollPane scrollBar = new JScrollPane(area);
/**
* Добавляем полосу прокрутки на текстовое поле
*/
frame.getContentPane().add(scrollBar);

/**
* Создаем "слушателя" для кнопки расчета символов. Если поле
* для ввода текста не пустое, то подсчитывается количество символов
* и слов, иначе выводит ошибку:"Сперва введите текст!"
*/
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("Количество символов: " + area.getText().length() + ". Количество
слов: " + area.getText().trim().split("\\s+").length);
else
result.setText("Сперва введите текст!");
}
});