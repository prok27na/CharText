/**
* ������� ���� ��� ����� ������:
* */
final JTextArea area = new JTextArea("������� ���� ���� �����...",20, 50);
/**
* ������� ������ ���������
*/
JScrollPane scrollBar = new JScrollPane(area);
/**
* ��������� ������ ��������� �� ��������� ����
*/
frame.getContentPane().add(scrollBar);

/**
* ������� "���������" ��� ������ ������� ��������. ���� ����
* ��� ����� ������ �� ������, �� �������������� ���������� ��������
* � ����, ����� ������� ������:"������ ������� �����!"
*/
countButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
if (area.getText().trim().length() != 0)
result.setText("���������� ��������: " + area.getText().length() + ". ����������
����: " + area.getText().trim().split("\\s+").length);
else
result.setText("������ ������� �����!");
}
});