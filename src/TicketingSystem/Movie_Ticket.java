package TicketingSystem;

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



 class Movie_Ticket extends javax.swing.JFrame {


    public Movie_Ticket() {
        initComponents();
    }

    DefaultTableModel model = new DefaultTableModel();

    Connection con=null;
    PreparedStatement ps1;
    PreparedStatement ps2;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkbox1 = new javax.swing.JCheckBox();
        checkbox2 = new javax.swing.JCheckBox();
        checkbox3 = new javax.swing.JCheckBox();
        checkbox4 = new javax.swing.JCheckBox();
        spinner1 = new javax.swing.JSpinner();
        spinner2 = new javax.swing.JSpinner();
        spinner3 = new javax.swing.JSpinner();
        spinner4 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        subtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        pay = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();
        balance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ticket Booking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        checkbox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkbox1.setForeground(new java.awt.Color(255, 51, 0));
        checkbox1.setText("Regular");
        checkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox1ActionPerformed(evt);
            }
        });

        checkbox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkbox2.setForeground(new java.awt.Color(255, 0, 0));
        checkbox2.setText("Recliner");

        checkbox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkbox3.setForeground(new java.awt.Color(255, 0, 0));
        checkbox3.setText("Box");
        checkbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox3ActionPerformed(evt);
            }
        });

        checkbox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkbox4.setForeground(new java.awt.Color(255, 0, 0));
        checkbox4.setText("Balcony");
        checkbox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(checkbox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                                        .addComponent(checkbox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(checkbox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(checkbox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Type", "Price", "Quantity", "Total"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        subtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtotal.setText("Subtotal");

        pay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pay.setText("Pay");

        txtPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayActionPerformed(evt);
            }
        });

        balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balance.setText("Balance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(164, 164, 164)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                        .addComponent(txtSubtotal))
                                                .addGap(48, 48, 48)
                                                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pay)
                                        .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(balance)
                                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void checkbox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void checkbox4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void checkbox3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtPayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
    {

        int sum = 0;
        int price;
        int quantity;
        int total;

        if(checkbox1.isSelected())
        {
            String regular = checkbox1.getText();
            price = 150;

            quantity = Integer.parseInt(spinner1.getValue().toString());
            total = price*quantity;

            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]
                    {
                            regular,
                            price,
                            quantity,
                            total
                    });
        }


        if(checkbox2.isSelected())
        {
            String recliner = checkbox2.getText();
            price = 250;

            quantity = Integer.parseInt(spinner2.getValue().toString());
            total = price*quantity;

            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]
                    {
                            recliner,
                            price,
                            quantity,
                            total
                    });
        }


        if(checkbox3.isSelected())
        {
            String box = checkbox3.getText();
            price = 300;

            quantity = Integer.parseInt(spinner3.getValue().toString());
            total = price*quantity;

            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]
                    {
                            box,
                            price,
                            quantity,
                            total
                    });
        }

        if(checkbox4.isSelected())
        {
            String balcony = checkbox4.getText();
            price = 90;

            quantity = Integer.parseInt(spinner4.getValue().toString());
            total = price*quantity;

            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]
                    {
                            balcony,
                            price,
                            quantity,
                            total
                    });
        }


        for(int i=0; i<jTable1.getRowCount(); i++)
        {
            sum += Integer.parseInt(jTable1.getValueAt(i, 3).toString());
        }

        txtSubtotal.setText(String.valueOf(sum));


    }
//    public Connection openConnection()
//    {
//        if(con == null)
//        {
//            String url = "jdbc:mysql://localhost:3306/";
//            String dbname = "ticketsystem";
//            String driver = "com.mysql.jdbc.Driver";
//            String username = "root";
//            String password = "";
//            try{
//                Class.forName(driver);
//                this.con = (Connection) DriverManager.getConnection(url+dbname, username, password);
//                System.out.println("Connection successful");
//            }
//            catch(ClassNotFoundException | SQLException sqle)
//            {
//                System.out.println("Connection failed");
//            }
//        }
//        return con;
//    }
    public void sales()
    {

        String subtotal = txtSubtotal.getText();
        String pay = txtPay.getText();
        String total = txtBalance.getText();
        int last_ID = 0;

        if(this.con == null) {
            String url = "jdbc:mysql://localhost:3306/ticketsystem";
            String driver = "com.mysql.jdbc.Driver";
            String username = "root";
            String password = "";
            try {
                Class.forName(driver);
                this.con = (Connection) DriverManager.getConnection(url, username, password);
                String query = "insert into sales(subtotal,pay,balance)values(?,?,?)";
                ps1 = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
                ps1.setString(1,subtotal);
                ps1.setString(2,pay);
                ps1.setString(3,total);
                ps1.executeUpdate();

                ResultSet resultSet = ps1.getGeneratedKeys();
                if(resultSet.next())
                {
                    last_ID = resultSet.getInt(1);
                }

//                int rows = jTable1.getRowCount();
                String query1 = "insert into sales_product(sales_ID,tickettype,quantity,price,total)values(?,?,?,?,?)";

                ps2 = con.prepareStatement(query1);

                String ticket_type = "";
                int price,totalnumber=0,quantity;

                for(int i=0;i<jTable1.getRowCount();i++)
                {
                    ticket_type = (String) jTable1.getValueAt(i,0);
                    price = (int) jTable1.getValueAt(i,1);
                    quantity = (int) jTable1.getValueAt(i,2);
                    totalnumber = (int) jTable1.getValueAt(i,3);

                    ps2.setInt(1,last_ID);
                    ps2.setString(2,ticket_type);
                    ps2.setInt(3,quantity);
                    ps2.setInt(4,price);
                    ps2.setInt(5,totalnumber);
                    ps2.executeUpdate();
                }


                JOptionPane.showMessageDialog(this,"Record Added.");

            } catch (ClassNotFoundException | SQLException sqle) {
                Logger.getAnonymousLogger(Movie_Ticket.class.getName()).log(Level.SEVERE,null,sqle);
            }
        }


//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketsystem","root","");

//            String query = "insert into sales(subtotal,pay,balance)values(?,?,?)";
//            ps1 = con.prepareStatement();




//        }
//        ca/tch(ClassNotFoundException ex){
//          /  Logger.getLogger(Movie_Ticket.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }





    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int subtotal = Integer.parseInt(txtSubtotal.getText());
        int pay = Integer.parseInt(txtPay.getText());
        int balance = (pay-subtotal);
        txtBalance.setText(String.valueOf(balance));
        sales();
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold default state="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movie_Ticket().setVisible(true);
            }
        });

    }


    private javax.swing.JLabel balance;
    private javax.swing.JCheckBox checkbox1;
    private javax.swing.JCheckBox checkbox2;
    private javax.swing.JCheckBox checkbox3;
    private javax.swing.JCheckBox checkbox4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pay;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner2;
    private javax.swing.JSpinner spinner3;
    private javax.swing.JSpinner spinner4;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtPay;
    private javax.swing.JTextField txtSubtotal;
}

