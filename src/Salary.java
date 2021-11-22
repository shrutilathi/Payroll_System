import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Salary extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    Choice c1;
    JButton b1,b2;
    
    Salary()
    {
        super("Set Salary");
        
        setLayout(new GridLayout(8,2,10,30));
        c1=new Choice();
        
        try{
            conn c=new conn();
            ResultSet rs=c.s.executeQuery("select * from employee");
            while(rs.next()){
                c1.add(rs.getString("id"));
            }
                
        }
        catch(Exception e)
        {
       
        }
        add(new JLabel("Select EmpNo"));
        add(c1);
        
        l1=new JLabel("HRA");
        t1=new JTextField(15);
        add(l1);
        add(t1);
        
        l3=new JLabel("DA");
        t3=new JTextField(15);
        add(l3);
        add(t3);
        
        l4=new JLabel("MED");
        t4=new JTextField(15);
        add(l4);
        add(t4);
        
        l5=new JLabel("PF");
        t5=new JTextField(15);
        add(l5);
        add(t5);
        
        l6=new JLabel("Basic Salary");
        t6=new JTextField(15);
        add(l6);
        add(t6);
        
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.addActionListener(this);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        setSize(600, 650);
        setLocation(600, 200);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);

    }
    public static void main(String[] args) {
        new Salary().setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
        String id=c1.getSelectedItem();
        String hra=t1.getText();
       
        String da=t3.getText();
        String med=t4.getText();
        String pf=t5.getText();
        String basic=t6.getText();
        String qry="insert into salary values('"+id+"','"+hra+"','"+da+"','"+med+"','"+pf+"','"+basic+"')";
        try{
            conn c2=new conn();
            c2.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Salary Updated");
            this.setVisible(false);
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        }
        if(ae.getSource()==b2)
            if(ae.getSource()==b1);
    }
    
    
}
