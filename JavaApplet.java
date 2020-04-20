import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="javaApplet" width=200 height=200>
</applet>
*/
public class javaApplet extends Applet implements ActionListener{
    TextArea area = new TextArea();
    Button b;
    Label Label1 = new Label();
    public void init(){

        Label1.setText("Click on the button to clear the text :- ");
        b = new Button("Click me!");
        CheckboxGroup cbg = new CheckboxGroup();
        //area.setSize(5,20);
        area.setBounds(20,50,60,100);
        area.setSize(20,20);
        Label1.setAlignment(Label.LEFT);
        Checkbox checkbox1 = new Checkbox("C++",cbg,false);
        checkbox1.setBounds(100,100, 50,50);
        Checkbox checkbox2 = new Checkbox("Java",cbg,true);
        checkbox2.setBounds(100,150, 50,50);
        //checkbox1.setAlignment(Checkbox.CENTER);
        //checkbox2.setAlignment(Checkbox.CENTER);
        add(checkbox1);
        add(checkbox2);
        add(area);
        add(Label1);
        setSize(500,300);
        //b.setBounds(100,400,100,30);
        add(b);
        b.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        area.setText(" ");
    }
}
