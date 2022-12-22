import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class Menu extends JFrame {
    final private JComboBox menu;
    private JLabel labelStart, labelChoose;

    Menu(){
        setSize(1000, 100);
        setLayout(new FlowLayout());
        String [] stringMenu = {"Australia", "China", "England", "Russia"};
        menu = new JComboBox<>(stringMenu);
        menu.setBounds(80, 50, 140, 20);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menu.getSelectedItem() == "Australia")
                    labelChoose.setText("В Австралии 60 винодельческих регионов.");
                else if (menu.getSelectedItem() == "China")
                    labelChoose.setText("Китай – густонаселенная страна в Восточной Азии ");
                else if (menu.getSelectedItem() == "England")
                    labelChoose.setText("England is a country that is part of the United Kingdom.");
                else labelChoose.setText("РО-ССИ-Я РО-ССИ-Я РО-ССИ-Я !!!");
            }
        });
        labelStart = new JLabel("Выберите страну: ");
        labelStart.setBounds(90, 100, 400, 100);
        labelChoose = new JLabel("Страна не выбрана");
        labelChoose.setBounds(90, 100, 400, 100);
        add(labelStart);
        add(menu);
        add(labelChoose);
        setVisible(true);
    }

    public static void main(String [] args){
        new Menu();
    }
}
