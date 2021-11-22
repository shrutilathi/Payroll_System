import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class project extends JFrame implements ActionListener {

    project()
    {
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/payroll.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        add(l1);
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu m1=new JMenu("Master");
        m1.setForeground(Color.blue);
        
        JMenuItem t1=new JMenuItem("New Employee");
        
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/New.png")));
        
        JMenuItem t2=new JMenuItem("Salary");
        
        t2.setForeground(Color.blue);
        t2.setFont(new Font("monospaced",Font.PLAIN,12));
        t2.setMnemonic('S');
        t2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
        t2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/schedreport.PNG")));
   
        JMenuItem t3=new JMenuItem("List Employee");
        
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('L');
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/newinvoice.png")));
        
        m1.add(t1);
        m1.add(t2);
        m1.add(t3);
        mb.add(m1);
        
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        
        JMenu edit=new JMenu("Update");
        edit.setForeground(Color.red);
        
    
        JMenuItem s1=new JMenuItem("Update Salary");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/EditOpen.png")));
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
        
        JMenuItem s2=new JMenuItem("Update Employee");
        s2.setForeground(Color.blue);
        s2.setFont(new Font("monospaced",Font.PLAIN,12));
        s2.setMnemonic('P');
        s2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        
        JMenuItem s3=new JMenuItem("Take Attendance");
        s3.setForeground(Color.blue);
        s3.setFont(new Font("monospaced",Font.PLAIN,12));
        s3.setMnemonic('T');
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.PNG")));
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
         
        edit.add(s1);
        edit.add(s2);
        edit.add(s3);
        mb.add(edit);
        
        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        JMenu rep=new JMenu("Reports");
        rep.setForeground(Color.blue);
        
        JMenuItem p1=new JMenuItem("Generate PaySlip");
        
        p1.setForeground(Color.blue);
        p1.setFont(new Font("monospaced",Font.PLAIN,12));
        p1.setMnemonic('P');
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        
        JMenuItem p2=new JMenuItem("List Attendance");
        
        p2.setForeground(Color.blue);
        p2.setFont(new Font("monospaced",Font.PLAIN,12));
        p2.setMnemonic('L');
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
   
        
        rep.add(p1);
        rep.add(p2);
        mb.add(rep);
        
        JMenu util=new JMenu("Utilities");
        util.setForeground(Color.red);
        
        JMenuItem u1=new JMenuItem("Notepad");
        
        u1.setForeground(Color.blue);
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        u1.setMnemonic('O');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        u1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/New.png")));
        
        JMenuItem u2=new JMenuItem("Calculator");
        
        u2.setForeground(Color.blue);
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        u2.setMnemonic('C');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        u2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/calc.png")));
        
        JMenuItem u3=new JMenuItem("Web Browser");
      
        u3.setForeground(Color.blue);
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        u3.setMnemonic('E');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        u3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/explorer.jpg")));
   
        
        util.add(u1);
        util.add(u2);
         util.add(u3);
        mb.add(util);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);

        JMenu exit=new JMenu("Exit");
        exit.setForeground(Color.red);
        
        JMenuItem e1=new JMenuItem("Exit");
        
        e1.setForeground(Color.blue);
        e1.setFont(new Font("monospaced",Font.PLAIN,12));
        e1.setMnemonic('X');
        e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        e1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/exit.png")));
        
   e1.addActionListener(this);
        
        exit.add(e1);
        mb.add(exit);
        
        
        setVisible(true);
    }
    
   

    public void actionPerformed(ActionEvent ae) {

        String msg=ae.getActionCommand();
        
        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_Employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_Salary().setVisible(true);
        else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Web Browser"))
        {
            try
            {
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }
            catch(Exception e)
            {
                
            }
        }
        else if(msg.equals("Take Attendance"))
            new TakeAttendance().setVisible(true);
        else if(msg.equals("Exit"))
            dispose();
        else if(msg.equals("Generate PaySlip"))
            new PaySlip().setVisible(true);
        else if(msg.equals("List Attendance"))
            new List_Attendance().setVisible(true);
            
            
            
    }
     public static void main(String[] args)
    {
        new project().setVisible(true);
    }
}
