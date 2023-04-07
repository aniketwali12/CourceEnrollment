
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Pattern;


public class courceEn extends javax.swing.JFrame {

    
    public courceEn() {
        initComponents();
        pe.setSelectedItem(null);
    }
    Scanner sc = new Scanner(System.in);
    
    static String d,g,o,p,a,b;
    static String us,nam,opene,profe,de,pel,oel,ph,ge;
    static String sql,sql1;
    static PreparedStatement w;
    static ResultSet rs,rs1;
    static  Connection conn;
    static Statement stmt;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pe = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        gen = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        oe = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        dep = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        pe.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
       // pe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Advance_Java", "Advance_Web", "Advance_Algorithm" }));

        jLabel1.setBackground(new java.awt.Color(102, 255, 153));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("           STUDENT COURCE ENROLLMENT FORM");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("USN");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Phone No");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Department");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Gender");

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        gen.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Professional elective");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Open elective");

        oe.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));

        dep.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "IS ","EC", "EE","AE","CE","ME" }));
        dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
        
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                                    .addComponent(jTextField2)
                                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oe, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dep, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pe, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oe, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>  
                                                                               

    private void depActionPerformed(java.awt.event.ActionEvent evt) {                                    
      try{
          
          
        if(dep.getSelectedItem().equals("CS") || dep.getSelectedItem().equals("IS")){
           pe.removeAllItems();
           pe.addItem("Advance_Java");
           pe.addItem("Advance_Web");
           pe.addItem("Advance_Algorithm");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Renewable_energy_resources");
           oe.addItem("Consumer_engineering");
           oe.addItem("Road_Safety");
           oe.addItem("PLC");
           oe.setSelectedItem(null);
        }
       else if(dep.getSelectedItem().equals("EC")){
           pe.removeAllItems();         
           pe.addItem("Power_ELectronics");
           pe.addItem("System_Modelling");
           pe.addItem("Speech_Processing");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Renewable_energy_resources");
           oe.addItem("Data_structures");
           oe.addItem("Road_Safety");
           oe.addItem("NoSQL");
           oe.setSelectedItem(null);//pe.addItem("");
       }
         else if(dep.getSelectedItem().equals("EE")){
           pe.removeAllItems();         
           pe.addItem("Fuzzy_Logic");
           pe.addItem("Design_of_electric_machine");
           pe.addItem("Special_electric_machine");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Consumer_Engineering");
           oe.addItem("Data_structures");
           oe.addItem("Road_Safety");
           oe.addItem("NoSQL");
           oe.setSelectedItem(null);
           
       }
        else if(dep.getSelectedItem().equals("AE")){
           pe.removeAllItems();         
           pe.addItem("Control_engineering");
           pe.addItem("Fracture_mechanics");
           pe.addItem("Turbo_machines");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Consumer_Engineering");
           oe.addItem("NoSQL");
           oe.addItem("Data_structures");
           oe.addItem("Renewable_energy_resources");
           oe.setSelectedItem(null);
           
       }
        else if(dep.getSelectedItem().equals("CE")){
           pe.removeAllItems();
           pe.addItem("Theory_of_elasticity");
           pe.addItem("Wastewater_Engineering");
           pe.addItem("Alternative_building_materials");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Renewable_energy_resources");
           oe.addItem("Consumer");
           oe.addItem("NoSQL");
           oe.addItem("Data_Structures");
           oe.setSelectedItem(null);
       }
        else if(dep.getSelectedItem().equals("ME")){
           pe.removeAllItems();
           pe.addItem("Energy_Engineering");
           pe.addItem("IC_Engines");
           pe.addItem("Machine_Drawing");
           pe.setSelectedItem(null);
           
           oe.removeAllItems();
           oe.addItem("Renewable_energy_resources");
           oe.addItem("Consumer_Engineering");
           oe.addItem("NoSQL");
           oe.addItem("Road_Safety");
           oe.setSelectedItem(null);
       }
       
      }
      catch(Exception e){
          System.out.println(e);
      }
    }                                   
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    
       
            try{
            String name=jTextField1.getText();
                    if(jTextField1.getText().trim().isEmpty()){
                            jLabel9.setText("Name is Empty");
                        }
                        else if(Pattern.matches("[a-zA-Z]+", name)==false){
                            jLabel9.setText("Invalid name");
                        }
                        else{
                            jLabel9.setText("");
                        }
                        
                        String usn=jTextField2.getText();
                       if(jTextField2.getText().trim().isEmpty()){
                            jLabel10.setText("Usn is Empty");
                        }
                        else if(usn.length()!=10){
                            jLabel10.setText("Invalid Usn");
                        }
                        else{
                            jLabel10.setText("");
                        }

                        if(jTextField3.getText().trim().isEmpty()){
                           jLabel11.setText("Phone number is Empty");
                       }
                
                         String mno=jTextField3.getText();
                        if(mno.matches("[0-9]*$") && mno.length()!=10){
                            jLabel11.setText("Invalid Phone number");
                        }
                        else{
                            jLabel11.setText("");
                        }
                        d=(String)dep.getSelectedItem();
                        g=(String)gen.getSelectedItem();
                        o=(String)oe.getSelectedItem();
                        p=(String)pe.getSelectedItem();


                        PreparedStatement st = conn.prepareStatement("INSERT INTO co VALUES (?, ?, ?, ?, ?, ?, ?)");
                            st.setString(1, usn);
                            st.setString(2, name);
                           st.setString(3, mno);
                            st.setString(4, d);
                           st.setString(5,g);
                           st.setString(6, p);
                           st.setString(7, o);
                            st.executeUpdate();
                            st.close();
                          
             }  catch (Exception e) {
            e.printStackTrace();
        }
      
    }
    
    public static void main(String args[]) {
         String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
   String DB_URL = "jdbc:mysql://localhost:3306/cource_en";
     String USER = "root";
     String PASS = "aniket@123";
        try{
        conn=null;
       stmt=null;     

        try {
            Class.forName(JDBC_DRIVER);
               conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
               }  catch (Exception e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
          int ch=0;
             while(ch!=9){
                System.out.println("Enter 1.Insert\n2.Retrive using USN\n3.Retrieve using department"
                        + "\n4.Retrive using professional elective\n5.Retrieve using open elective"
                        + "\n6.Update Phone number\n7.Delete\n8.Display all information\n9.Exit");
                ch=sc.nextInt();
                switch(ch){
                        
                    case 1:
                         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courceEn().setVisible(true);
            }
        });                         
                          System.out.println("Inserted");
                        break;
                            
            case 2:      
                        System.out.println("enter usn");
                        a=sc.next();
                        sql = "select * from co where usn = '"+a+"'";
                         rs = stmt.executeQuery(sql);
                          while (rs.next()) {
                               us = rs.getString("usn");
                              nam = rs.getString("name");
                              ph = rs.getString("phone");
                              ge = rs.getString("gender");
                              de=rs.getString("dept");
                               pel=rs.getString("pelective");
                               oel=rs.getString("oelective");
                               System.out.println("usn "+us+" Name " + nam+" Dep "+de +" phone "+ ph +
                                       " Gender "+ge+" department"+ de+" Pelective "+pel+" Oelective"+oel);
                          }
                          if(us==null){
                              System.out.println("Given usn is not present");
                          }
                           break;
                           
            case 3:
                            System.out.println("Enter deptartment");
                            a=sc.next();
                            sql = "select * from co where dept = '"+a+"'";
                            rs = stmt.executeQuery(sql);
                          while (rs.next()) {
                               us = rs.getString("usn");
                              nam = rs.getString("name");
                              de=rs.getString("dept");
                               System.out.println(" Department "+de+" Usn "+us+" Name " + nam);
                          }
                          if(de==null){
                              System.out.println("Given department is not present");
                          }
                          break;
                      
            case 4:
                           System.out.println("Enter professional elective");
                            a=sc.next();
                              sql = "select * from co where pelective = '"+a+"'";
                              rs = stmt.executeQuery(sql);
                            while (rs.next()) {

                              us = rs.getString("usn");
                                nam = rs.getString("name");
                                de=rs.getString("dept");
                                pel=rs.getString("pelective");
                                 System.out.println("Professional elective "+pel+" Usn "+us+" Name " + nam+" Department "+de);
                            }
                            if(pel==null){
                              System.out.println("Given Professional elective is not present");
                          }
                            break;

            case 5:
                            System.out.println("Enter open elective");
                                a=sc.next();
                                 sql = "select * from co where oelective = '"+a+"'";
                                 rs = stmt.executeQuery(sql);
                               while (rs.next()) {

                                 us = rs.getString("usn");
                                   nam = rs.getString("name");
                                   de=rs.getString("dept");
                                   oel=rs.getString("oelective");
                                    System.out.println("Open elective "+oel+" Usn "+us+" Name " + nam+" Department "+de);
                               }
                               if(oel==null){
                              System.out.println("Given open elective is not present");
                          }
                               break;
                               
            case 6:
                            w = conn.prepareStatement("UPDATE co SET phone = ? WHERE usn= ?");
                            System.out.println("enter usn");
                            a=sc.next();
                            sql = "select * from co where usn = '"+a+"'";
                         rs = stmt.executeQuery(sql);
                          while (rs.next()) {
                               us = rs.getString("usn");
                          }
                          if(us==null){
                              System.out.println("Given usn is not present");
                          }
                          else{
                            System.out.println("enter phone no");
                            b=sc.next();
                            w.setString(1, b);
                            w.setString(2, a);
                            w.executeUpdate();
                            w.close();
                              System.out.println("updated");
                          }                          
                               break;
                               
            case 7:                  
                          System.out.println("enter usn to delete");
                        a=sc.next();
                         sql="delete from co where usn=?";
                         w=conn.prepareStatement(sql);
                         w.setString(1,a);
                          w.executeUpdate();
                           System.out.println("Deleted");                  
                        break;
                        
            case 8:
                        sql = "select * from co ";
                            rs = stmt.executeQuery(sql);
                          while (rs.next()) {
                               us = rs.getString("usn");
                              nam = rs.getString("name");
                              ph = rs.getString("phone");
                              ge = rs.getString("gender");
                              de=rs.getString("dept");
                               pel=rs.getString("pelective");
                                   oel=rs.getString("oelective");
                               System.out.println(us+" Name: " + nam+" Department "+de +" phone "+ ph +
                                      " Gender "+ge+" Professional elective "+pel+" Open elective"+oel);
                          }
                          break;                                              
            case 9:
                     // rs.close();
                     stmt.close();
                     conn.close();
                    System.exit(0);
               
            default:
                System.out.println("wrong option");
             }
            }
        }
        catch(SQLException e){
            System.out.println("SQLException");
        }         
    }
                  
    private javax.swing.JComboBox<String> dep;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> oe;
    private javax.swing.JComboBox<String> pe;
}