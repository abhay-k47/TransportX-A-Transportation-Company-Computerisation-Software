package TCCS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.Objects;

public class Application extends javax.swing.JFrame {

        public Application() {
            initComponents();
            Home.setVisible(true);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         */
        @SuppressWarnings("unchecked")
        private void initComponents() {

            setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png")).getImage());
            setTitle("TransportX");
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(4, 41, 58));
            setMinimumSize(new java.awt.Dimension(800, 600));
            setForeground(new java.awt.Color(4, 41, 58));
            setResizable(false);
            setSize(new java.awt.Dimension(800, 600));

            try {
                database = new DAO();
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(this, "Connection Failure", "Fatal Error!", JOptionPane.ERROR_MESSAGE, null);
                System.exit(-1);
            }

            jPanel19 = new javax.swing.JPanel();
            mainPane = new javax.swing.JLayeredPane();

            /**
             * This is Home JPanel
             */
            Home = new javax.swing.JPanel();
            pnlSidebarH = new javax.swing.JPanel();
            lbl1_SidebarH = new javax.swing.JLabel();
            lbl2_SidebarH = new javax.swing.JLabel();
            lbl3_SidebarH = new javax.swing.JLabel();
            pnlTopbarH = new javax.swing.JPanel();
            pnlTitleH = new javax.swing.JPanel();
            lbl1_TitleH = new javax.swing.JLabel();
            lbl2_TitleH = new javax.swing.JLabel();
            lbl3_TitleH = new javax.swing.JLabel();
            pnlContentH = new javax.swing.JPanel();
            pnlManagerContentH = new javax.swing.JPanel();
            lbl1_ManagerContentH = new javax.swing.JLabel();
            lbl2_ManagerContentH = new javax.swing.JLabel();
            pnlEmployeeContentH = new javax.swing.JPanel();
            lbl1_EmployeeContentH = new javax.swing.JLabel();
            lbl2_EmployeeContentH = new javax.swing.JLabel();


            /**
             * This is RegisterManager JPanel
             */
            RegisterManager = new javax.swing.JPanel();
            pnl1_RegisterManager = new javax.swing.JPanel();
            lbl1_RegisterManager = new javax.swing.JLabel();
            pnl2_RegisterManager = new javax.swing.JPanel();
            pnl3_RegisterManager = new javax.swing.JPanel();
            lbl2_RegisterManager = new javax.swing.JLabel();
            lbl3_RegisterManager = new javax.swing.JLabel();
            lbl4_RegisterManager = new javax.swing.JLabel();
            lbl5_RegisterManager = new javax.swing.JLabel();
            lbl6_RegisterManager = new javax.swing.JLabel();
            lbl7_RegisterManager = new javax.swing.JLabel();
            lbl8_RegisterManager = new javax.swing.JLabel();
            lbl9_RegisterManager = new javax.swing.JLabel();
            txt1_RegisterManager = new javax.swing.JTextField();
            txt2_RegisterManager = new javax.swing.JTextField();
            txt3_RegisterManager = new javax.swing.JTextField();
            txt4_RegisterManager = new javax.swing.JTextField();
            pwd1_RegisterManager = new javax.swing.JPasswordField();
            pwd2_RegisterManager = new javax.swing.JPasswordField();
            btn_RegisterManager = new javax.swing.JButton();

            /**
             * This is SignInManager JPanel
             */
            SignInManager = new javax.swing.JPanel();
            pnl1_SignInManager = new javax.swing.JPanel();
            lbl1_SignInManager = new javax.swing.JLabel();
            lbl2_SignInManager = new javax.swing.JLabel();
            lbl3_SignInManager = new javax.swing.JLabel();
            pnl2_SignInManager = new javax.swing.JPanel();
            lbl10_SignInManager = new javax.swing.JLabel();
            pnl3_SignInManager = new javax.swing.JPanel();
            lbl4_SignInManager = new javax.swing.JLabel();
            lbl5_SignInManager = new javax.swing.JLabel();
            lbl7_SignInManager = new javax.swing.JLabel();
            lbl6_SignInManager = new javax.swing.JLabel();
            lbl8_SignInManager = new javax.swing.JLabel();
            lbl9_SignInManager = new javax.swing.JLabel();
            txt_SignInManager = new javax.swing.JTextField();
            pwd_SignInManager = new javax.swing.JPasswordField();
            btn_SignInManager = new javax.swing.JButton();

            /**
             * This is SignInEmployee JPanel
             */
            SignInEmployee = new javax.swing.JPanel();
            pnl1_SignInEmployee = new javax.swing.JPanel();
            lbl1_SignInEmployee = new javax.swing.JLabel();
            lbl2_SignInEmployee = new javax.swing.JLabel();
            lbl3_SignInEmployee = new javax.swing.JLabel();
            pnl2_SignInEmployee = new javax.swing.JPanel();
            lbl9_SignInEmployee = new javax.swing.JLabel();
            pnl3_SignInEmployee = new javax.swing.JPanel();
            lbl4_SignInEmployee = new javax.swing.JLabel();
            lbl5_SignInEmployee = new javax.swing.JLabel();
            lbl7_SignInEmployee = new javax.swing.JLabel();
            lbl6_SignInEmployee = new javax.swing.JLabel();
            lbl8_SignInEmployee = new javax.swing.JLabel();
            txt_SignInEmployee = new javax.swing.JTextField();
            pwd_SignInEmployee = new javax.swing.JPasswordField();
            btn_SignInEmployee = new javax.swing.JButton();

            /**
             * This is EmployeeDashboard JPanel
             */
            EmployeeDashboard = new javax.swing.JPanel();

            pnlSidebarED = new javax.swing.JPanel();
            lblMenuED = new javax.swing.JLabel();
            lblAddCustED = new javax.swing.JLabel();
            lblTrackConsignED = new javax.swing.JLabel();
            lblAddConsignED = new javax.swing.JLabel();
            lblHomeED = new javax.swing.JLabel();
            lblHelpED = new javax.swing.JLabel();
            lblSignOutED = new javax.swing.JLabel();

            pnlTopbarED = new javax.swing.JPanel();
            lbl1_TopbarED = new javax.swing.JLabel();
            lbl2_TopbarED = new javax.swing.JLabel();

            pnlTitleED = new javax.swing.JPanel();
            lbl_TitleED = new javax.swing.JLabel();

            pnlHomeED = new javax.swing.JPanel();


            pnlAddCustomer = new javax.swing.JPanel();
            pnlEnterCust = new javax.swing.JPanel();
            lbl1_EnterCust = new javax.swing.JLabel();
            lbl2_EnterCust = new javax.swing.JLabel();
            lbl3_EnterCust = new javax.swing.JLabel();
            lbl4_EnterCust = new javax.swing.JLabel();
            lbl5_EnterCust = new javax.swing.JLabel();
            txt1_EnterCust = new javax.swing.JTextField();
            txt2_EnterCust = new javax.swing.JTextField();
            txt3_EnterCust = new javax.swing.JTextField();
            txt4_EnterCust = new javax.swing.JTextField();
            btn_EnterCust = new javax.swing.JButton();

            pnlAddConsignment = new javax.swing.JPanel();
            pnlEnterConsign = new javax.swing.JPanel();
            lbl1_EnterConsign = new javax.swing.JLabel();
            lbl2_EnterConsign = new javax.swing.JLabel();
            lbl3_EnterConsign = new javax.swing.JLabel();
            lbl4_EnterConsign = new javax.swing.JLabel();
            lbl5_EnterConsign = new javax.swing.JLabel();
            lbl6_EnterConsign = new javax.swing.JLabel();
            txt1_EnterConsign = new javax.swing.JTextField();
            txt2_EnterConsign = new javax.swing.JTextField();
            txt3_EnterConsign = new javax.swing.JTextField();
            txt4_EnterConsign = new javax.swing.JTextField();
            txt5_EnterConsign = new javax.swing.JTextField();
            btn_EnterConsign = new javax.swing.JButton();

            pnlTrackConsignment = new javax.swing.JPanel();
            pnlTrackID = new javax.swing.JPanel();
            lbl1_TrackID = new javax.swing.JLabel();
            lbl2_TrackID = new javax.swing.JLabel();
            txt_TrackID = new javax.swing.JTextField();
            btn_TrackID = new javax.swing.JButton();

            pnlConsignmentDetails = new javax.swing.JPanel();
            pnlConsignmentDeliveryDetails = new javax.swing.JPanel();
            lbl1_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl2_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl3_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl4_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl5_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl6_ConsignmentDeliveryDetails = new javax.swing.JLabel();
            lbl7_ConsignmentDeliveryDetails = new javax.swing.JLabel();

            pnlConsignmentBookingDetails = new javax.swing.JPanel();
            lbl1_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl2_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl3_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl4_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl5_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl6_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl7_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl8_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl9_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl10_ConsignmentBookingDetails = new javax.swing.JLabel();
            lbl11_ConsignmentBookingDetails = new javax.swing.JLabel();



            /**
             * This is ManagerDashboard JPanel
             */
            ManagerDashboard = new javax.swing.JPanel();

            pnlSideBarMD = new javax.swing.JPanel();
            lbl_SideBarMD = new javax.swing.JLabel();
            lbl1_SideBarMD = new javax.swing.JLabel();
            lbl2_SideBarMD = new javax.swing.JLabel();
            lbl3_SideBarMD = new javax.swing.JLabel();
            lbl4_SideBarMD = new javax.swing.JLabel();
            lbl5_SideBarMD = new javax.swing.JLabel();
            lbl6_SideBarMD = new javax.swing.JLabel();
            lbl7_SideBarMD = new javax.swing.JLabel();
            lbl8_SideBarMD = new javax.swing.JLabel();
            lbl9_SideBarMD = new javax.swing.JLabel();
            lbl10_SideBarMD = new javax.swing.JLabel();
            lbl11_SideBarMD = new javax.swing.JLabel();

            pnlTopBarMD = new javax.swing.JPanel();
            lbl1_TopBarMD = new javax.swing.JLabel();
            lbl2_TopBarMD = new javax.swing.JLabel();

            homeMD = new javax.swing.JPanel();

            addTruck = new javax.swing.JPanel();
            pnl_addTruck = new javax.swing.JPanel();
            lbl1_addTruck = new javax.swing.JLabel();
            lbl2_addTruck = new javax.swing.JLabel();
            lbl3_addTruck = new javax.swing.JLabel();
            cbox_addTruck = new javax.swing.JComboBox<>();
            btn_addTruck = new javax.swing.JButton();

            QueryConsign = new javax.swing.JPanel();
            pnl_QueryConsign = new javax.swing.JPanel();
            lbl_QueryConsign = new javax.swing.JLabel();
            lbl1_QueryConsign = new javax.swing.JLabel();
            lbl2_QueryConsign = new javax.swing.JLabel();
            lbl3_QueryConsign = new javax.swing.JLabel();
            lbl4_QueryConsign = new javax.swing.JLabel();
            lbl5_QueryConsign = new javax.swing.JLabel();
            lbl6_QueryConsign = new javax.swing.JLabel();
            lbl7_QueryConsign = new javax.swing.JLabel();
            lbl8_QueryConsign = new javax.swing.JLabel();
            lbl9_QueryConsign = new javax.swing.JLabel();
            lbl10_QueryConsign = new javax.swing.JLabel();
            lbl11_QueryConsign = new javax.swing.JLabel();
            lbl12_QueryConsign = new javax.swing.JLabel();
            lbl13_QueryConsign = new javax.swing.JLabel();
            lbl14_QueryConsign = new javax.swing.JLabel();
            lbl15_QueryConsign = new javax.swing.JLabel();
            lbl16_QueryConsign = new javax.swing.JLabel();
            lbl17_QueryConsign = new javax.swing.JLabel();
            lbl18_QueryConsign = new javax.swing.JLabel();
            lbl19_QueryConsign = new javax.swing.JLabel();
            cbox_QueryConsign = new javax.swing.JComboBox<>();
            btn_QueryConsign = new javax.swing.JButton();

            idleTime = new javax.swing.JPanel();
            pnl_idleTime = new javax.swing.JPanel();
            lbl1_idleTime = new javax.swing.JLabel();
            lbl2_idleTime = new javax.swing.JLabel();
            lbl3_idleTime = new javax.swing.JLabel();
            cbox_idleTime = new javax.swing.JComboBox<>();
            btn_idleTime = new javax.swing.JButton();

            truckStatus = new javax.swing.JPanel();
            pnl_truckStatus = new javax.swing.JPanel();
            lbl1_truckStatus = new javax.swing.JLabel();
            lbl2_truckStatus = new javax.swing.JLabel();
            lbl3_truckStatus = new javax.swing.JLabel();
            cbox_truckStatus = new javax.swing.JComboBox<>();
            btn_truckStatus = new javax.swing.JButton();

            changeRate = new javax.swing.JPanel();
            pnl_changeRate = new javax.swing.JPanel();
            lbl1_changeRate = new javax.swing.JLabel();
            lbl2_changeRate = new javax.swing.JLabel();
            lbl3_changeRate = new javax.swing.JLabel();
            lbl4_changeRate = new javax.swing.JLabel();
            lbl5_changeRate = new javax.swing.JLabel();
            txt_changeRate = new javax.swing.JTextField();
            cbox_changeRate = new javax.swing.JComboBox<>();
            btn1_changeRate = new javax.swing.JButton();
            btn2_changeRate = new javax.swing.JButton();

            officeDetails = new javax.swing.JPanel();
            pnl_officeDetails = new javax.swing.JPanel();
            lbl1_officeDetails = new javax.swing.JLabel();
            lbl2_officeDetails = new javax.swing.JLabel();
            lbl3_officeDetails = new javax.swing.JLabel();
            cbox_officeDetails = new javax.swing.JComboBox<>();
            btn_officeDetails = new javax.swing.JButton();

            addEmployee = new javax.swing.JPanel();
            pnl_addEmployee = new javax.swing.JPanel();
            pnlEnterEmployee = new javax.swing.JPanel();
            lbl1_EnterEmployee = new javax.swing.JLabel();
            lbl2_EnterEmployee = new javax.swing.JLabel();
            lbl3_EnterEmployee = new javax.swing.JLabel();
            lbl4_EnterEmployee = new javax.swing.JLabel();
            lbl5_EnterEmployee = new javax.swing.JLabel();
            lbl6_EnterEmployee = new javax.swing.JLabel();
            lbl7_EnterEmployee = new javax.swing.JLabel();
            lbl8_EnterEmployee = new javax.swing.JLabel();
            txt1_EnterEmployee = new javax.swing.JTextField();
            txt2_EnterEmployee = new javax.swing.JTextField();
            txt3_EnterEmployee = new javax.swing.JTextField();
            txt4_EnterEmployee = new javax.swing.JTextField();
            txt5_EnterEmployee = new javax.swing.JTextField();
            txt6_EnterEmployee = new javax.swing.JTextField();
            txt7_EnterEmployee = new javax.swing.JTextField();
            btn_EnterEmployee = new javax.swing.JButton();

            ConsignWaitTime = new javax.swing.JPanel();
            pnl_ConsignWaitTime = new javax.swing.JPanel();
            lbl1_ConsignWaitTime = new javax.swing.JLabel();
            lbl2_ConsignWaitTime = new javax.swing.JLabel();
            lbl3_ConsignWaitTime = new javax.swing.JLabel();
            cbox_ConsignWaitTime = new javax.swing.JComboBox<>();
            btn_ConsignWaitTime = new javax.swing.JButton();

            /**
             * ***************************************************************************
             * ***************************************************************************
             * ***************************************************************************
             * ***************************************************************************
             */

            addOffice = new javax.swing.JPanel();
            pnl1_addOffice = new javax.swing.JPanel();
            pnl2_addOffice = new javax.swing.JPanel();
            txt1_addOffice = new javax.swing.JTextField();
            lbl4_addOffice = new javax.swing.JLabel();
            lbl7_addOffice = new javax.swing.JLabel();
            btn_addOffice = new javax.swing.JButton();
            lbl3_addOffice = new javax.swing.JLabel();
            lbl6_addOffice = new javax.swing.JLabel();
            lbl2_addOffice = new javax.swing.JLabel();
            lbl5_addOffice = new javax.swing.JLabel();
            txt3_addOffice = new javax.swing.JTextField();
            txt5_addOffice = new javax.swing.JTextField();
            txt2_addOffice = new javax.swing.JTextField();
            txt4_addOffice = new javax.swing.JTextField();
            lbl1_addOffice = new javax.swing.JLabel();
            txt6_addOffice = new javax.swing.JTextField();

            /**
             * This is EmployeeForgetPass JPanel
             */

            EmployeeForgetPass = new javax.swing.JPanel();
            pnl1_EmployeeForgetPass = new javax.swing.JPanel();
            lbl1_EmployeeForgetPass = new javax.swing.JLabel();
            lbl2_EmployeeForgetPass = new javax.swing.JLabel();
            lbl3_EmployeeForgetPass = new javax.swing.JLabel();
            pnl2_EmployeeForgetPass = new javax.swing.JPanel();
            pnlCredentials_EmployeeForgetPass = new javax.swing.JPanel();
            lbl4_EmployeeForgetPass = new javax.swing.JLabel();
            lbl5_EmployeeForgetPass = new javax.swing.JLabel();
            lbl6_EmployeeForgetPass = new javax.swing.JLabel();
            lbl7_EmployeeForgetPass = new javax.swing.JLabel();
            lbl8_EmployeeForgetPass = new javax.swing.JLabel();
            txt1_EmployeeForgetPass = new javax.swing.JTextField();
            txt2_EmployeeForgetPass = new javax.swing.JTextField();
            btn1_EmployeeForgetPass = new javax.swing.JButton();
            pnlReset_EmployeeForgetPass = new javax.swing.JPanel();
            lbl9_EmployeeForgetPass = new javax.swing.JLabel();
            lbl10_EmployeeForgetPass = new javax.swing.JLabel();
            lbl11_EmployeeForgetPass = new javax.swing.JLabel();
            pwd1_EmployeeForgetPass = new javax.swing.JPasswordField();
            pwd2_EmployeeForgetPass = new javax.swing.JPasswordField();
            btn2_EmployeeForgetPass = new javax.swing.JButton();

            /**
             * This is ManagerForgetPass JPanel
             */

            ManagerForgetPass = new javax.swing.JPanel();
            pnl1_ManagerForgetPass = new javax.swing.JPanel();
            lbl1_ManagerForgetPass = new javax.swing.JLabel();
            lbl2_ManagerForgetPass = new javax.swing.JLabel();
            lbl3_ManagerForgetPass = new javax.swing.JLabel();
            pnl2_ManagerForgetPass = new javax.swing.JPanel();
            pnlCredentials_ManagerForgetPass = new javax.swing.JPanel();
            txt1_ManagerForgetPass = new javax.swing.JTextField();
            lbl4_ManagerForgetPass = new javax.swing.JLabel();
            lbl5_ManagerForgetPass = new javax.swing.JLabel();
            btn1_ManagerForgetPass = new javax.swing.JButton();
            lbl7_ManagerForgetPass = new javax.swing.JLabel();
            lbl6_ManagerForgetPass = new javax.swing.JLabel();
            lbl8_ManagerForgetPass = new javax.swing.JLabel();
            txt2_ManagerForgetPass = new javax.swing.JTextField();
            pnlReset_ManagerForgetPass = new javax.swing.JPanel();
            lbl9_ManagerForgetPass = new javax.swing.JLabel();
            lbl10_ManagerForgetPass = new javax.swing.JLabel();
            btn2_ManagerForgetPass = new javax.swing.JButton();
            pwd1_ManagerForgetPass = new javax.swing.JPasswordField();
            pwd2_ManagerForgetPass = new javax.swing.JPasswordField();
            lbl11_ManagerForgetPass = new javax.swing.JLabel();


            jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jPanel19.setVisible(false);

            mainPane.setAlignmentX(0.0F);
            mainPane.setAlignmentY(0.0F);
            mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            /**
             * This is Home JPanel
             */

            {
                Home.setBackground(new java.awt.Color(255, 255, 255));
                Home.setForeground(new java.awt.Color(4, 41, 58));
                Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                Home.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentHidden(java.awt.event.ComponentEvent evt) {
                        HomeComponentHidden(evt);
                    }
                });
                Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnlSidebarH.setBackground(new java.awt.Color(4, 28, 50));
                    pnlSidebarH.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            pnlSidebarHMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            pnlSidebarHMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            pnlSidebarHMouseExited(evt);
                        }
                    });
                    pnlSidebarH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    lbl1_SidebarH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl1_SidebarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/white menu.png"))); // NOI18N
                    lbl1_SidebarH.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl1_SidebarHMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl1_SidebarHMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl1_SidebarHMouseExited(evt);
                        }
                    });

                    lbl2_SidebarH.setBackground(new java.awt.Color(4, 28, 50));
                    lbl2_SidebarH.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl2_SidebarH.setForeground(new java.awt.Color(255, 255, 255));
                    lbl2_SidebarH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lbl2_SidebarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (1) (1).png"))); // NOI18N
                    lbl2_SidebarH.setText("    EMPLOYEE");
                    lbl2_SidebarH.setOpaque(true);
                    lbl2_SidebarH.setVisible(false);
                    lbl2_SidebarH.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl2_SidebarHMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl2_SidebarHMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl2_SidebarHMouseExited(evt);
                        }
                    });
                    lbl2_SidebarH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl2_SidebarHPropertyChange(evt);
                        }
                    });

                    lbl3_SidebarH.setBackground(new java.awt.Color(4, 28, 50));
                    lbl3_SidebarH.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl3_SidebarH.setForeground(new java.awt.Color(255, 255, 255));
                    lbl3_SidebarH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lbl3_SidebarH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (1) (1).png"))); // NOI18N
                    lbl3_SidebarH.setText("    MANAGER");
                    lbl3_SidebarH.setOpaque(true);
                    lbl3_SidebarH.setVisible(false);
                    lbl3_SidebarH.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl3_SidebarHMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl3_SidebarHMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl3_SidebarHMouseExited(evt);
                        }
                    });
                    lbl3_SidebarH.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl3_SidebarHPropertyChange(evt);
                        }
                    });
                }

                {
                    pnlSidebarH.add(lbl1_SidebarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
                    pnlSidebarH.add(lbl2_SidebarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 40));
                    pnlSidebarH.add(lbl3_SidebarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 40));
                }

                {
                    pnlTopbarH.setBackground(new java.awt.Color(115, 133, 152));
                    pnlTopbarH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                }

                {
                    pnlTitleH.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_TitleH.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_TitleH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    lbl2_TitleH.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
                    lbl2_TitleH.setText("A Transportation Company Computerisation Software");

                    lbl3_TitleH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

                    javax.swing.GroupLayout pnlTitleHLayout = new javax.swing.GroupLayout(pnlTitleH);
                    pnlTitleH.setLayout(pnlTitleHLayout);
                    pnlTitleHLayout.setHorizontalGroup(
                            pnlTitleHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTitleHLayout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addGroup(pnlTitleHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl2_TitleH, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl1_TitleH, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(65, 65, 65)
                                            .addComponent(lbl3_TitleH, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    pnlTitleHLayout.setVerticalGroup(
                            pnlTitleHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTitleHLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(pnlTitleHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl3_TitleH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnlTitleHLayout.createSequentialGroup()
                                                            .addComponent(lbl1_TitleH, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbl2_TitleH)))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                {
                    pnlContentH.setBackground(new java.awt.Color(4, 41, 58));
                    pnlContentH.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlManagerContentH.setBackground(new java.awt.Color(6, 70, 99));
                        pnlManagerContentH.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                pnlManagerContentHMouseClicked(evt);
                            }
                        });

                        lbl2_ManagerContentH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl2_ManagerContentH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project.png"))); // NOI18N
                        lbl2_ManagerContentH.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl2_ManagerContentHMouseClicked(evt);
                            }
                        });

                        lbl1_ManagerContentH.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl1_ManagerContentH.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_ManagerContentH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_ManagerContentH.setText("Manager");
                        lbl1_ManagerContentH.setToolTipText("");

                        javax.swing.GroupLayout pnlManagerContentHLayout = new javax.swing.GroupLayout(pnlManagerContentH);
                        pnlManagerContentH.setLayout(pnlManagerContentHLayout);
                        pnlManagerContentHLayout.setHorizontalGroup(
                                pnlManagerContentHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlManagerContentHLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(lbl2_ManagerContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlManagerContentHLayout.createSequentialGroup()
                                                .addComponent(lbl1_ManagerContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                        );
                        pnlManagerContentHLayout.setVerticalGroup(
                                pnlManagerContentHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlManagerContentHLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbl1_ManagerContentH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl2_ManagerContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                        );
                    }

                    {
                        pnlEmployeeContentH.setBackground(new java.awt.Color(6, 70, 99));
                        pnlEmployeeContentH.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                pnlEmployeeContentHMouseClicked(evt);
                            }
                        });

                        lbl1_EmployeeContentH.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl1_EmployeeContentH.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_EmployeeContentH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_EmployeeContentH.setText("Employees");
                        lbl1_EmployeeContentH.setToolTipText("");

                        lbl2_EmployeeContentH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl2_EmployeeContentH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (3).png"))); // NOI18N
                        lbl2_EmployeeContentH.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl2_EmployeeContentHMouseClicked(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlEmployeeContentHLayout = new javax.swing.GroupLayout(pnlEmployeeContentH);
                        pnlEmployeeContentH.setLayout(pnlEmployeeContentHLayout);
                        pnlEmployeeContentHLayout.setHorizontalGroup(
                                pnlEmployeeContentHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlEmployeeContentHLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(lbl2_EmployeeContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(pnlEmployeeContentHLayout.createSequentialGroup()
                                                .addComponent(lbl1_EmployeeContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                        );
                        pnlEmployeeContentHLayout.setVerticalGroup(
                                pnlEmployeeContentHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeeContentHLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbl1_EmployeeContentH)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl2_EmployeeContentH, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22))
                        );
                    }

                    pnlContentH.add(pnlManagerContentH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 320, 310));
                    pnlContentH.add(pnlEmployeeContentH, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 320, 310));
                }

                Home.add(pnlTopbarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 740, 50));
                Home.add(pnlSidebarH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 600));
                Home.add(pnlTitleH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 740, 160));
                Home.add(pnlContentH, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 740, 390));

            }

            /**
             * This is RegisterManager JPanel
             */
            {
                RegisterManager.setBackground(new java.awt.Color(255, 255, 255));
                RegisterManager.setForeground(new java.awt.Color(4, 41, 58));
                RegisterManager.setMaximumSize(new java.awt.Dimension(800, 600));
                RegisterManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnl1_RegisterManager.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_RegisterManager.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_RegisterManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    javax.swing.GroupLayout pnl1_RegisterManagerLayout = new javax.swing.GroupLayout(pnl1_RegisterManager);
                    pnl1_RegisterManager.setLayout(pnl1_RegisterManagerLayout);
                    pnl1_RegisterManagerLayout.setHorizontalGroup(
                            pnl1_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_RegisterManagerLayout.createSequentialGroup()
                                            .addComponent(lbl1_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 410, Short.MAX_VALUE))
                    );
                    pnl1_RegisterManagerLayout.setVerticalGroup(
                            pnl1_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_RegisterManagerLayout.createSequentialGroup()
                                            .addComponent(lbl1_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 18, Short.MAX_VALUE))
                    );
                }

                {
                    pnl2_RegisterManager.setBackground(new java.awt.Color(4, 41, 58));
                    pnl2_RegisterManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnl3_RegisterManager.setBackground(new java.awt.Color(6, 70, 99));

                        lbl2_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
                        lbl2_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl2_RegisterManager.setText("Register Now");

                        lbl3_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_RegisterManager.setText("Name");

                        lbl4_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl4_RegisterManager.setText("Date of Birth");

                        lbl5_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_RegisterManager.setText("Address");

                        lbl6_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl6_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl6_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl6_RegisterManager.setText("Email");

                        lbl7_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl7_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl7_RegisterManager.setText("Password");

                        lbl8_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_RegisterManager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl8_RegisterManager.setText("Confirm Password");

                        lbl9_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl9_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_RegisterManager.setText("Back");
                        lbl9_RegisterManager.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl9_RegisterManagerMouseClicked(evt);
                            }
                        });

                        txt1_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        txt1_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt1_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        txt1_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt1_RegisterManager.setBorder(null);
                        txt1_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1_RegisterManagerActionPerformed(evt);
                            }
                        });

                        txt2_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        txt2_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt2_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        txt2_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt2_RegisterManager.setText("YYYY-MM-DD");
                        txt2_RegisterManager.setBorder(null);
                        txt2_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt2_RegisterManagerActionPerformed(evt);
                            }
                        });

                        txt3_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        txt3_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt3_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        txt3_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt3_RegisterManager.setBorder(null);
                        txt3_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt3_RegisterManagerActionPerformed(evt);
                            }
                        });

                        txt4_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        txt4_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt4_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        txt4_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt4_RegisterManager.setBorder(null);
                        txt4_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt4_RegisterManagerActionPerformed(evt);
                            }
                        });

                        pwd1_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        pwd1_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd1_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        pwd1_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd1_RegisterManager.setBorder(null);
                        pwd1_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pwd1_RegisterManagerActionPerformed(evt);
                            }
                        });

                        pwd2_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        pwd2_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd2_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        pwd2_RegisterManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd2_RegisterManager.setBorder(null);

                        btn_RegisterManager.setBackground(new java.awt.Color(115, 133, 152));
                        btn_RegisterManager.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_RegisterManager.setForeground(new java.awt.Color(255, 255, 255));
                        btn_RegisterManager.setText("Sign Up");
                        btn_RegisterManager.setBorder(null);
                        btn_RegisterManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_RegisterManagerActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnl3_RegisterManagerLayout = new javax.swing.GroupLayout(pnl3_RegisterManager);
                        pnl3_RegisterManager.setLayout(pnl3_RegisterManagerLayout);
                        pnl3_RegisterManagerLayout.setHorizontalGroup(
                                pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lbl2_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                                        .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(lbl8_RegisterManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                                                                .addComponent(lbl7_RegisterManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(pwd1_RegisterManager)
                                                                                                .addComponent(pwd2_RegisterManager)))
                                                                                .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                                        .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(lbl6_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(lbl5_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(lbl3_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(lbl4_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(txt4_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt1_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt3_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt2_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                .addGap(85, 85, 85)
                                                                .addComponent(btn_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(lbl9_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(30, Short.MAX_VALUE))
                        );
                        pnl3_RegisterManagerLayout.setVerticalGroup(
                                pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(lbl2_RegisterManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                .addComponent(lbl3_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(13, 13, 13)
                                                                .addComponent(lbl4_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(lbl5_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnl3_RegisterManagerLayout.createSequentialGroup()
                                                                .addComponent(txt1_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(txt2_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txt3_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl6_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt4_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl7_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pwd1_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(pnl3_RegisterManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl8_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pwd2_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(48, 48, 48)
                                                .addComponent(btn_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(lbl9_RegisterManager, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                        );
                    }

                    pnl2_RegisterManager.add(pnl3_RegisterManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));
                }

                RegisterManager.add(pnl1_RegisterManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));
                RegisterManager.add(pnl2_RegisterManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 800, 520));

            }

            /**
             * This is SignInManager JPanel
             */

            {
                SignInManager.setBackground(new java.awt.Color(255, 255, 255));
                SignInManager.setForeground(new java.awt.Color(4, 41, 58));
                SignInManager.setMaximumSize(new java.awt.Dimension(800, 600));
                SignInManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnl1_SignInManager.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_SignInManager.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_SignInManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    lbl2_SignInManager.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
                    lbl2_SignInManager.setText("A Transportation Company Computerisation Software");

                    lbl3_SignInManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

                    javax.swing.GroupLayout pnl1_SignInManagerLayout = new javax.swing.GroupLayout(pnl1_SignInManager);
                    pnl1_SignInManager.setLayout(pnl1_SignInManagerLayout);
                    pnl1_SignInManagerLayout.setHorizontalGroup(
                            pnl1_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_SignInManagerLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addGroup(pnl1_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl2_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl1_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addComponent(lbl3_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(65, Short.MAX_VALUE))
                    );
                    pnl1_SignInManagerLayout.setVerticalGroup(
                            pnl1_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_SignInManagerLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(pnl1_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl3_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnl1_SignInManagerLayout.createSequentialGroup()
                                                            .addGap(20, 20, 20)
                                                            .addComponent(lbl1_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbl2_SignInManager)))
                                            .addContainerGap(13, Short.MAX_VALUE))
                    );
                }

                {
                    pnl2_SignInManager.setBackground(new java.awt.Color(4, 41, 58));
                    pnl2_SignInManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnl3_SignInManager.setBackground(new java.awt.Color(6, 70, 99));

                        txt_SignInManager.setBackground(new java.awt.Color(115, 133, 152));
                        txt_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        txt_SignInManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt_SignInManager.setBorder(null);
                        txt_SignInManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt_SignInManagerActionPerformed(evt);
                            }
                        });

                        pwd_SignInManager.setBackground(new java.awt.Color(115, 133, 152));
                        pwd_SignInManager.setColumns(100);
                        pwd_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        pwd_SignInManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd_SignInManager.setBorder(null);
                        pwd_SignInManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pwd_SignInManagerActionPerformed(evt);
                            }
                        });

                        lbl4_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_SignInManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl4_SignInManager.setText("Username");

                        lbl5_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_SignInManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl5_SignInManager.setText("Password");

                        lbl6_SignInManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2) (1).png"))); // NOI18N

                        lbl7_SignInManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock (1).png"))); // NOI18N


                        lbl8_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_SignInManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl8_SignInManager.setText("Forgot Password ?");
                        lbl8_SignInManager.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl8_SignInManagerMouseClicked(evt);
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                lbl8_SignInManagerMouseEntered(evt);
                            }

                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                lbl8_SignInManagerMouseExited(evt);
                            }
                        });

                        lbl9_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl9_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_SignInManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl9_SignInManager.setText("Register");
                        lbl9_SignInManager.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl9_SignInManagerMouseClicked(evt);
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                lbl9_SignInManagerMouseEntered(evt);
                            }

                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                lbl9_SignInManagerMouseExited(evt);
                            }
                        });

                        btn_SignInManager.setBackground(new java.awt.Color(115, 133, 152));
                        btn_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                        btn_SignInManager.setText("Sign in");
                        btn_SignInManager.setBorder(null);
                        btn_SignInManager.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_SignInManagerActionPerformed(evt);

                            }
                        });

                        javax.swing.GroupLayout pnl3_SignInManagerLayout = new javax.swing.GroupLayout(pnl3_SignInManager);
                        pnl3_SignInManager.setLayout(pnl3_SignInManagerLayout);
                        pnl3_SignInManagerLayout.setHorizontalGroup(
                                pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_SignInManagerLayout.createSequentialGroup()
                                                .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_SignInManagerLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(lbl4_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnl3_SignInManagerLayout.createSequentialGroup()
                                                                        .addGap(64, 64, 64)
                                                                        .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbl7_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbl6_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbl9_SignInManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(lbl8_SignInManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(pwd_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                        .addComponent(txt_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(lbl5_SignInManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(83, Short.MAX_VALUE))
                        );
                        pnl3_SignInManagerLayout.setVerticalGroup(
                                pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_SignInManagerLayout.createSequentialGroup()
                                                .addContainerGap(85, Short.MAX_VALUE)
                                                .addComponent(lbl4_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl6_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl5_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl3_SignInManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl7_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pwd_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32)
                                                .addComponent(btn_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(lbl8_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbl9_SignInManager, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23))
                        );
                    }

                    lbl10_SignInManager.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                    lbl10_SignInManager.setForeground(new java.awt.Color(255, 255, 255));
                    lbl10_SignInManager.setText("Back");
                    lbl10_SignInManager.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl10_SignInManagerMouseClicked(evt);
                        }
                    });

                    pnl2_SignInManager.add(pnl3_SignInManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                    pnl2_SignInManager.add(lbl10_SignInManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 40));
                }

                SignInManager.add(pnl1_SignInManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 160));
                SignInManager.add(pnl2_SignInManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 460));

            }

            /**
             * This is SignInEmployee JPanel
             */

            {
                SignInEmployee.setBackground(new java.awt.Color(255, 255, 255));
                SignInEmployee.setForeground(new java.awt.Color(4, 41, 58));
                SignInEmployee.setMaximumSize(new java.awt.Dimension(800, 600));
                SignInEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnl1_SignInEmployee.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_SignInEmployee.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_SignInEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    lbl2_SignInEmployee.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
                    lbl2_SignInEmployee.setText("A Transportation Company Computerisation Software");

                    lbl3_SignInEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

                    javax.swing.GroupLayout pnl1_SignInEmployeeLayout = new javax.swing.GroupLayout(pnl1_SignInEmployee);
                    pnl1_SignInEmployee.setLayout(pnl1_SignInEmployeeLayout);
                    pnl1_SignInEmployeeLayout.setHorizontalGroup(
                            pnl1_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_SignInEmployeeLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addGroup(pnl1_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl2_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl1_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addComponent(lbl3_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(65, Short.MAX_VALUE))
                    );
                    pnl1_SignInEmployeeLayout.setVerticalGroup(
                            pnl1_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_SignInEmployeeLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(pnl1_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl3_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnl1_SignInEmployeeLayout.createSequentialGroup()
                                                            .addGap(20, 20, 20)
                                                            .addComponent(lbl1_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbl2_SignInEmployee)))
                                            .addContainerGap(13, Short.MAX_VALUE))
                    );
                }

                {
                    pnl2_SignInEmployee.setBackground(new java.awt.Color(4, 41, 58));
                    pnl2_SignInEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnl3_SignInEmployee.setBackground(new java.awt.Color(6, 70, 99));

                        txt_SignInEmployee.setBackground(new java.awt.Color(115, 133, 152));
                        txt_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        txt_SignInEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt_SignInEmployee.setBorder(null);
                        txt_SignInEmployee.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt_SignInEmployeeActionPerformed(evt);
                            }
                        });

                        pwd_SignInEmployee.setBackground(new java.awt.Color(115, 133, 152));
                        pwd_SignInEmployee.setColumns(100);
                        pwd_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        pwd_SignInEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd_SignInEmployee.setBorder(null);
                        pwd_SignInEmployee.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pwd_SignInEmployeeActionPerformed(evt);
                            }
                        });

                        lbl4_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_SignInEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl4_SignInEmployee.setText("Username");

                        lbl5_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_SignInEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl5_SignInEmployee.setText("Password");

                        lbl6_SignInEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2) (1).png"))); // NOI18N

                        lbl7_SignInEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/padlock (1).png"))); // NOI18N

                        lbl8_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_SignInEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl8_SignInEmployee.setText("Forgot Password ?");
                        lbl8_SignInEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl8_SignInEmployeeMouseClicked(evt);
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                lbl8_SignInEmployeeMouseEntered(evt);
                            }

                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                lbl8_SignInEmployeeMouseExited(evt);
                            }
                        });

                        btn_SignInEmployee.setBackground(new java.awt.Color(115, 133, 152));
                        btn_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                        btn_SignInEmployee.setText("Sign in");
                        btn_SignInEmployee.setBorder(null);
                        btn_SignInEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_SignInEmployeeMouseClicked(evt);
                            }
                        });

                        javax.swing.GroupLayout pnl3_SignInEmployeeLayout = new javax.swing.GroupLayout(pnl3_SignInEmployee);
                        pnl3_SignInEmployee.setLayout(pnl3_SignInEmployeeLayout);
                        pnl3_SignInEmployeeLayout.setHorizontalGroup(
                                pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_SignInEmployeeLayout.createSequentialGroup()
                                                .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_SignInEmployeeLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(lbl4_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnl3_SignInEmployeeLayout.createSequentialGroup()
                                                                        .addGap(64, 64, 64)
                                                                        .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbl7_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbl6_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(lbl8_SignInEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(pwd_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                                        .addComponent(txt_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(lbl5_SignInEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(83, Short.MAX_VALUE))
                        );
                        pnl3_SignInEmployeeLayout.setVerticalGroup(
                                pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnl3_SignInEmployeeLayout.createSequentialGroup()
                                                .addContainerGap(85, Short.MAX_VALUE)
                                                .addComponent(lbl4_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl6_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl5_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnl3_SignInEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl7_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pwd_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(32, 32, 32)
                                                .addComponent(btn_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(lbl8_SignInEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73))
                        );
                    }

                    lbl9_SignInEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                    lbl9_SignInEmployee.setForeground(new java.awt.Color(255, 255, 255));
                    lbl9_SignInEmployee.setText("Back");
                    lbl9_SignInEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl9_SignInEmployeeMouseClicked(evt);
                        }
                    });

                    pnl2_SignInEmployee.add(pnl3_SignInEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                    pnl2_SignInEmployee.add(lbl9_SignInEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, 30));
                }

                SignInEmployee.add(pnl1_SignInEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 160));
                SignInEmployee.add(pnl2_SignInEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 460));

            }

            /**
             * This is EmployeeDashboard JPanel
             */

            {
                EmployeeDashboard.setBackground(new java.awt.Color(255, 255, 255));
                EmployeeDashboard.setForeground(new java.awt.Color(4, 41, 58));
                EmployeeDashboard.setMaximumSize(new java.awt.Dimension(800, 600));
                EmployeeDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnlSidebarED.setBackground(new java.awt.Color(4, 28, 50));
                    pnlSidebarED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            pnlSidebarEDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            pnlSidebarEDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            pnlSidebarEDMouseExited(evt);
                        }
                    });
                    pnlSidebarED.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    lblMenuED.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lblMenuED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/white menu.png"))); // NOI18N
                    lblMenuED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblMenuEDMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblMenuEDMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblMenuEDMouseExited(evt);
                        }
                    });

                    lblHomeED.setBackground(new java.awt.Color(4, 28, 50));
                    lblHomeED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblHomeED.setForeground(new java.awt.Color(255, 255, 255));
                    lblHomeED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblHomeED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home (1).png"))); // NOI18N
                    lblHomeED.setText("    Home");
                    lblHomeED.setOpaque(true);
                    lblHomeED.setVisible(false);
                    lblHomeED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblHomeEDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblHomeEDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblHomeEDMouseExited(evt);
                        }
                    });
                    lblHomeED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblHomeEDPropertyChange(evt);
                        }
                    });

                    lblAddCustED.setBackground(new java.awt.Color(4, 28, 50));
                    lblAddCustED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblAddCustED.setForeground(new java.awt.Color(255, 255, 255));
                    lblAddCustED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblAddCustED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add-user (1).png"))); // NOI18N
                    lblAddCustED.setText("    Add Customer");
                    lblAddCustED.setOpaque(true);
                    lblAddCustED.setVisible(false);
                    lblAddCustED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblAddCustEDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblAddCustEDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblAddCustEDMouseExited(evt);
                        }
                    });
                    lblAddCustED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblAddCustEDPropertyChange(evt);
                        }
                    });

                    lblAddConsignED.setBackground(new java.awt.Color(4, 28, 50));
                    lblAddConsignED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblAddConsignED.setForeground(new java.awt.Color(255, 255, 255));
                    lblAddConsignED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblAddConsignED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopping-cart (1).png"))); // NOI18N
                    lblAddConsignED.setText("    Add Consignment");
                    lblAddConsignED.setOpaque(true);
                    lblAddConsignED.setVisible(false);
                    lblAddConsignED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblAddConsignMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblAddConsignMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblAddConsignMouseExited(evt);
                        }
                    });
                    lblAddConsignED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblAddConsignPropertyChange(evt);
                        }
                    });

                    lblTrackConsignED.setBackground(new java.awt.Color(4, 28, 50));
                    lblTrackConsignED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblTrackConsignED.setForeground(new java.awt.Color(255, 255, 255));
                    lblTrackConsignED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblTrackConsignED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/view-details (1).png"))); // NOI18N
                    lblTrackConsignED.setText("    Track Consignment");
                    lblTrackConsignED.setOpaque(true);
                    lblTrackConsignED.setVisible(false);
                    lblTrackConsignED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblTrackConsignEDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblTrackConsignEDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblTrackConsignEDMouseExited(evt);
                        }
                    });
                    lblTrackConsignED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblTrackConsignEDPropertyChange(evt);
                        }
                    });


                    lblSignOutED.setBackground(new java.awt.Color(4, 28, 50));
                    lblSignOutED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblSignOutED.setForeground(new java.awt.Color(255, 255, 255));
                    lblSignOutED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblSignOutED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout (1).png"))); // NOI18N
                    lblSignOutED.setText("    Sign out");
                    lblSignOutED.setOpaque(true);
                    lblSignOutED.setVisible(false);
                    lblSignOutED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblHelpED1MouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblHelpED1MouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblHelpED1MouseExited(evt);
                        }
                    });
                    lblSignOutED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblHelpED1PropertyChange(evt);
                        }
                    });

                    lblHelpED.setBackground(new java.awt.Color(4, 28, 50));
                    lblHelpED.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                    lblHelpED.setForeground(new java.awt.Color(255, 255, 255));
                    lblHelpED.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    lblHelpED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/question (1).png"))); // NOI18N
                    lblHelpED.setText("    Help");
                    lblHelpED.setOpaque(true);
                    lblHelpED.setVisible(false);
                    lblHelpED.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lblHelpEDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lblHelpEDMouseExited(evt);
                        }
                    });
                    lblHelpED.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lblHelpEDPropertyChange(evt);
                        }
                    });

                    pnlSidebarED.add(lblMenuED, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
                    pnlSidebarED.add(lblHomeED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 40));
                    pnlSidebarED.add(lblAddCustED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 40));
                    pnlSidebarED.add(lblAddConsignED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 40));
                    pnlSidebarED.add(lblTrackConsignED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 40));
                    pnlSidebarED.add(lblSignOutED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 40));
                    pnlSidebarED.add(lblHelpED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 240, 40));

                }

                {
                    pnlTopbarED.setBackground(new java.awt.Color(115, 133, 152));
                    pnlTopbarED.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    lbl1_TopbarED.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                    lbl1_TopbarED.setForeground(new java.awt.Color(255, 255, 255));
                    lbl1_TopbarED.setText("User");

                    lbl2_TopbarED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (2).png"))); // NOI18N
                    lbl2_TopbarED.setText("");

                    pnlTopbarED.add(lbl1_TopbarED, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 170, 30));
                    pnlTopbarED.add(lbl2_TopbarED, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, 40));

                }

                {
                    pnlTitleED.setBackground(new java.awt.Color(255, 255, 255));

                    lbl_TitleED.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl_TitleED.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    javax.swing.GroupLayout pnlTitleEDLayout = new javax.swing.GroupLayout(pnlTitleED);
                    pnlTitleED.setLayout(pnlTitleEDLayout);
                    pnlTitleEDLayout.setHorizontalGroup(
                            pnlTitleEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTitleEDLayout.createSequentialGroup()
                                            .addGap(39, 39, 39)
                                            .addComponent(lbl_TitleED, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(317, Short.MAX_VALUE))
                    );
                    pnlTitleEDLayout.setVerticalGroup(
                            pnlTitleEDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTitleEDLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(lbl_TitleED, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                }

                {
                    pnlHomeED.setBackground(new java.awt.Color(4, 41, 58));
                    pnlHomeED.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                }

                {
                    pnlAddCustomer.setBackground(new java.awt.Color(4, 41, 58));
                    pnlAddCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlEnterCust.setBackground(new java.awt.Color(6, 70, 99));

                        lbl1_EnterCust.setBackground(new java.awt.Color(6, 70, 99));
                        lbl1_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl1_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_EnterCust.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_EnterCust.setText("Customer Details");

                        lbl2_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl2_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_EnterCust.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl2_EnterCust.setText("Name");

                        lbl3_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_EnterCust.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_EnterCust.setText("Street");

                        lbl4_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_EnterCust.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl4_EnterCust.setText("City");

                        lbl5_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_EnterCust.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_EnterCust.setText("State");

                        txt1_EnterCust.setBackground(new java.awt.Color(115, 133, 152));
                        txt1_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt1_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        txt1_EnterCust.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt1_EnterCust.setBorder(null);
                        txt1_EnterCust.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1_EnterCustActionPerformed(evt);
                            }
                        });

                        txt2_EnterCust.setBackground(new java.awt.Color(115, 133, 152));
                        txt2_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt2_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        txt2_EnterCust.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt2_EnterCust.setBorder(null);
                        txt2_EnterCust.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt2_EnterCustActionPerformed(evt);
                            }
                        });

                        txt3_EnterCust.setBackground(new java.awt.Color(115, 133, 152));
                        txt3_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt3_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        txt3_EnterCust.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt3_EnterCust.setBorder(null);
                        txt3_EnterCust.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt3_EnterCustActionPerformed(evt);
                            }
                        });

                        txt4_EnterCust.setBackground(new java.awt.Color(115, 133, 152));
                        txt4_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt4_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        txt4_EnterCust.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt4_EnterCust.setBorder(null);
                        txt4_EnterCust.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt4_EnterCustActionPerformed(evt);
                            }
                        });

                        btn_EnterCust.setBackground(new java.awt.Color(4, 41, 58));
                        btn_EnterCust.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_EnterCust.setForeground(new java.awt.Color(255, 255, 255));
                        btn_EnterCust.setText("Add");
                        btn_EnterCust.setBorder(null);
                        btn_EnterCust.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(ActionEvent evt) {
                                btn_EnterCustActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlEnterCustLayout = new javax.swing.GroupLayout(pnlEnterCust);
                        pnlEnterCust.setLayout(pnlEnterCustLayout);
                        pnlEnterCustLayout.setHorizontalGroup(
                                pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1_EnterCust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnterCustLayout.createSequentialGroup()
                                                .addContainerGap(30, Short.MAX_VALUE)
                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnterCustLayout.createSequentialGroup()
                                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbl4_EnterCust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl3_EnterCust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl2_EnterCust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl5_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt4_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt1_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt2_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt3_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(45, 45, 45))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnterCustLayout.createSequentialGroup()
                                                                .addComponent(btn_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(74, 74, 74))))
                        );
                        pnlEnterCustLayout.setVerticalGroup(
                                pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlEnterCustLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(lbl1_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt1_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl2_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt2_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl3_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt3_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl4_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterCustLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt4_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl5_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(61, 61, 61)
                                                .addComponent(btn_EnterCust, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(62, Short.MAX_VALUE))
                        );
                    }

                    pnlAddCustomer.add(pnlEnterCust, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 450, 470));
                }

                {
                    pnlAddConsignment.setBackground(new java.awt.Color(4, 41, 58));
                    pnlAddConsignment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlEnterConsign.setBackground(new java.awt.Color(6, 70, 99));

                        lbl1_EnterConsign.setBackground(new java.awt.Color(6, 70, 99));
                        lbl1_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl1_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_EnterConsign.setText("Consignment Details");

                        lbl2_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl2_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl2_EnterConsign.setText("Sender ID");

                        lbl3_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_EnterConsign.setText("Reciever ID");

                        lbl4_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl4_EnterConsign.setText("Volume");

                        lbl5_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_EnterConsign.setText("Source ZIP code");

                        lbl6_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl6_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl6_EnterConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl6_EnterConsign.setText("Destination ZIP Code");

                        txt1_EnterConsign.setBackground(new java.awt.Color(115, 133, 152));
                        txt1_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt1_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        txt1_EnterConsign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt1_EnterConsign.setBorder(null);
                        txt1_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1_EnterConsignActionPerformed(evt);
                            }
                        });

                        txt2_EnterConsign.setBackground(new java.awt.Color(115, 133, 152));
                        txt2_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt2_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        txt2_EnterConsign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt2_EnterConsign.setBorder(null);
                        txt2_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt2_EnterConsignActionPerformed(evt);
                            }
                        });

                        txt3_EnterConsign.setBackground(new java.awt.Color(115, 133, 152));
                        txt3_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt3_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        txt3_EnterConsign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt3_EnterConsign.setBorder(null);
                        txt3_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt3_EnterConsignActionPerformed(evt);
                            }
                        });

                        txt4_EnterConsign.setBackground(new java.awt.Color(115, 133, 152));
                        txt4_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt4_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        txt4_EnterConsign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt4_EnterConsign.setBorder(null);
                        txt4_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt4_EnterConsignActionPerformed(evt);
                            }
                        });

                        txt5_EnterConsign.setBackground(new java.awt.Color(115, 133, 152));
                        txt5_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt5_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        txt5_EnterConsign.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt5_EnterConsign.setBorder(null);
                        txt5_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt5_EnterConsignActionPerformed(evt);
                            }
                        });

                        btn_EnterConsign.setBackground(new java.awt.Color(4, 41, 58));
                        btn_EnterConsign.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_EnterConsign.setForeground(new java.awt.Color(255, 255, 255));
                        btn_EnterConsign.setText("Add");
                        btn_EnterConsign.setBorder(null);
                        btn_EnterConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_EnterConsignActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlEnterConsignLayout = new javax.swing.GroupLayout(pnlEnterConsign);
                        pnlEnterConsign.setLayout(pnlEnterConsignLayout);
                        pnlEnterConsignLayout.setHorizontalGroup(
                                pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1_EnterConsign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(pnlEnterConsignLayout.createSequentialGroup()
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlEnterConsignLayout.createSequentialGroup()
                                                                .addGap(75, 75, 75)
                                                                .addComponent(btn_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlEnterConsignLayout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbl2_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(lbl3_EnterConsign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lbl4_EnterConsign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(lbl5_EnterConsign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lbl6_EnterConsign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt2_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt1_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt3_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt4_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt5_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(27, Short.MAX_VALUE))
                        );
                        pnlEnterConsignLayout.setVerticalGroup(
                                pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlEnterConsignLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(lbl1_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt1_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl2_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt2_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl3_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt3_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl4_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt4_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl5_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlEnterConsignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txt5_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl6_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                .addComponent(btn_EnterConsign, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))
                        );
                    }

                    pnlAddConsignment.add(pnlEnterConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 450, 470));
                }

                {
                    pnlTrackConsignment.setBackground(new java.awt.Color(4, 41, 58));
                    pnlTrackConsignment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlTrackID.setBackground(new java.awt.Color(6, 70, 99));


                        lbl1_TrackID.setBackground(new java.awt.Color(6, 70, 99));
                        lbl1_TrackID.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl1_TrackID.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_TrackID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_TrackID.setText("Consignment Detail");

                        lbl2_TrackID.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl2_TrackID.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_TrackID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl2_TrackID.setText("Consignmemt ID");

                        txt_TrackID.setBackground(new java.awt.Color(115, 133, 152));
                        txt_TrackID.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt_TrackID.setForeground(new java.awt.Color(255, 255, 255));
                        txt_TrackID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt_TrackID.setBorder(null);
                        txt_TrackID.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt_TrackIDActionPerformed(evt);
                            }
                        });

                        btn_TrackID.setBackground(new java.awt.Color(4, 41, 58));
                        btn_TrackID.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_TrackID.setForeground(new java.awt.Color(255, 255, 255));
                        btn_TrackID.setText("Track");
                        btn_TrackID.setBorder(null);
                        btn_TrackID.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_TrackIDctionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlTrackIDLayout = new javax.swing.GroupLayout(pnlTrackID);
                        pnlTrackID.setLayout(pnlTrackIDLayout);
                        pnlTrackIDLayout.setHorizontalGroup(
                                pnlTrackIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1_TrackID, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrackIDLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbl2_TrackID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTrackIDLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(pnlTrackIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_TrackID)
                                                        .addComponent(btn_TrackID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(90, 90, 90))
                        );
                        pnlTrackIDLayout.setVerticalGroup(
                                pnlTrackIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlTrackIDLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(lbl1_TrackID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(lbl2_TrackID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_TrackID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(btn_TrackID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(130, Short.MAX_VALUE))
                        );
                    }

                    pnlTrackConsignment.add(pnlTrackID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 450, 470));
                }

                {
                    pnlConsignmentDetails.setBackground(new java.awt.Color(4, 41, 58));
                    pnlConsignmentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlConsignmentDeliveryDetails.setBackground(new java.awt.Color(6, 70, 99));
                        pnlConsignmentDeliveryDetails.setPreferredSize(new java.awt.Dimension(370, 470));

                        lbl1_ConsignmentDeliveryDetails.setBackground(new java.awt.Color(6, 70, 99));
                        lbl1_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl1_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl1_ConsignmentDeliveryDetails.setText("    Delivery Details");

                        lbl2_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl2_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl2_ConsignmentDeliveryDetails.setText("Status");

                        lbl3_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_ConsignmentDeliveryDetails.setText(".......................................................................................");

                        lbl4_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl4_ConsignmentDeliveryDetails.setText("Delivered to");

                        lbl5_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_ConsignmentDeliveryDetails.setText(".......................................................................................");

                        lbl6_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl6_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl6_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl6_ConsignmentDeliveryDetails.setText("Delivered on");

                        lbl7_ConsignmentDeliveryDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl7_ConsignmentDeliveryDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_ConsignmentDeliveryDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl7_ConsignmentDeliveryDetails.setText(".......................................................................................");

                        javax.swing.GroupLayout pnlConsignmentDeliveryDetailsLayout = new javax.swing.GroupLayout(pnlConsignmentDeliveryDetails);
                        pnlConsignmentDeliveryDetails.setLayout(pnlConsignmentDeliveryDetailsLayout);
                        pnlConsignmentDeliveryDetailsLayout.setHorizontalGroup(
                                pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlConsignmentDeliveryDetailsLayout.createSequentialGroup()
                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlConsignmentDeliveryDetailsLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(lbl1_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlConsignmentDeliveryDetailsLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbl2_ConsignmentDeliveryDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl4_ConsignmentDeliveryDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl6_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(lbl5_ConsignmentDeliveryDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                        .addComponent(lbl3_ConsignmentDeliveryDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbl7_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        pnlConsignmentDeliveryDetailsLayout.setVerticalGroup(
                                pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlConsignmentDeliveryDetailsLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(lbl1_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl2_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl3_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl4_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl5_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentDeliveryDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl6_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl7_ConsignmentDeliveryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(246, Short.MAX_VALUE))
                        );
                    }

                    {
                        pnlConsignmentBookingDetails.setBackground(new java.awt.Color(6, 70, 99));
                        pnlConsignmentBookingDetails.setPreferredSize(new java.awt.Dimension(370, 470));

                        lbl1_ConsignmentBookingDetails.setBackground(new java.awt.Color(6, 70, 99));
                        lbl1_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl1_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl1_ConsignmentBookingDetails.setText("    Booking Details");

                        lbl2_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl2_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl2_ConsignmentBookingDetails.setText("Booked by");

                        lbl3_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_ConsignmentBookingDetails.setText(".......................................................................................");

                        lbl4_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl4_ConsignmentBookingDetails.setText("Booked at");

                        lbl5_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_ConsignmentBookingDetails.setText(".......................................................................................");

                        lbl6_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl6_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl6_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl6_ConsignmentBookingDetails.setText("Booked on");

                        lbl7_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl7_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl7_ConsignmentBookingDetails.setText(".......................................................................................");

                        lbl8_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl8_ConsignmentBookingDetails.setText("Destination");

                        lbl9_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl9_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl9_ConsignmentBookingDetails.setText(".......................................................................................");

                        lbl10_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl10_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl10_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl10_ConsignmentBookingDetails.setText("Delivery Charge");

                        lbl11_ConsignmentBookingDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl11_ConsignmentBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
                        lbl11_ConsignmentBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl11_ConsignmentBookingDetails.setText(".......................................................................................");

                        javax.swing.GroupLayout pnlConsignmentBookingDetailsLayout = new javax.swing.GroupLayout(pnlConsignmentBookingDetails);
                        pnlConsignmentBookingDetails.setLayout(pnlConsignmentBookingDetailsLayout);
                        pnlConsignmentBookingDetailsLayout.setHorizontalGroup(
                                pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlConsignmentBookingDetailsLayout.createSequentialGroup()
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlConsignmentBookingDetailsLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(lbl1_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlConsignmentBookingDetailsLayout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbl10_ConsignmentBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl8_ConsignmentBookingDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl2_ConsignmentBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl4_ConsignmentBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbl6_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(lbl5_ConsignmentBookingDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                                .addComponent(lbl3_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(lbl11_ConsignmentBookingDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                                .addComponent(lbl9_ConsignmentBookingDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                                                .addComponent(lbl7_ConsignmentBookingDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        );
                        pnlConsignmentBookingDetailsLayout.setVerticalGroup(
                                pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlConsignmentBookingDetailsLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(lbl1_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl2_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl3_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl4_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl5_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl6_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl7_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl8_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl9_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlConsignmentBookingDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbl10_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl11_ConsignmentBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(161, Short.MAX_VALUE))
                        );
                    }

                    pnlConsignmentDetails.add(pnlConsignmentBookingDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 470));
                    pnlConsignmentDetails.add(pnlConsignmentDeliveryDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 370, 470));
                }

                EmployeeDashboard.add(pnlSidebarED, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 600));
                EmployeeDashboard.add(pnlTopbarED, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 740, 40));
                EmployeeDashboard.add(pnlTitleED, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 740, 70));
                EmployeeDashboard.add(pnlHomeED, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 740, 470));
                EmployeeDashboard.add(pnlAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 740, 470));
                EmployeeDashboard.add(pnlAddConsignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 740, 470));
                EmployeeDashboard.add(pnlTrackConsignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 740, 470));
                EmployeeDashboard.add(pnlConsignmentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 740, 470));

                pnlHomeED.setVisible(true);
                pnlAddCustomer.setVisible(false);
                pnlAddConsignment.setVisible(false);
                pnlTrackConsignment.setVisible(false);
                pnlConsignmentDetails.setVisible(false);

            }

            /**
             * This is ManagerDashboard JPanel
             */

            {
                ManagerDashboard.setBackground(new java.awt.Color(255, 255, 255));
                ManagerDashboard.setForeground(new java.awt.Color(4, 41, 58));
                ManagerDashboard.setMaximumSize(new java.awt.Dimension(800, 600));
                ManagerDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnlSideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    pnlSideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            pnlSideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            pnlSideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            pnlSideBarMDMouseExited(evt);
                        }
                    });
                    pnlSideBarMD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    lbl_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl_SideBarMD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/white menu.png"))); // NOI18N
                    lbl_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl_SideBarMDMouseExited(evt);
                        }
                    });

                    lbl1_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl1_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl1_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl1_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl1_SideBarMD.setText("Home");
                    lbl1_SideBarMD.setOpaque(true);
                    lbl1_SideBarMD.setVisible(false);
                    lbl1_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl1_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl1_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl1_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl1_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl1_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl2_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl2_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl2_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl2_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl2_SideBarMD.setText("Truck Idle Time");
                    lbl2_SideBarMD.setOpaque(true);
                    lbl2_SideBarMD.setVisible(false);
                    lbl2_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl2_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl2_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl2_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl2_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl2_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl3_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl3_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl3_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl3_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl3_SideBarMD.setText("   Consignment Details");
                    lbl3_SideBarMD.setOpaque(true);
                    lbl3_SideBarMD.setVisible(false);
                    lbl3_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl3_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl3_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl3_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl3_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl3_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl4_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl4_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl4_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl4_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl4_SideBarMD.setText("Office Statistics");
                    lbl4_SideBarMD.setOpaque(true);
                    lbl4_SideBarMD.setVisible(false);
                    lbl4_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl4_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl4_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl4_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl4_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl4_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl5_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl5_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl5_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl5_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl5_SideBarMD.setText("Change Rate");
                    lbl5_SideBarMD.setOpaque(true);
                    lbl5_SideBarMD.setVisible(false);
                    lbl5_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl5_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl5_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl5_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl5_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl5_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl6_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl6_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl6_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl6_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl6_SideBarMD.setText("Truck Status");
                    lbl6_SideBarMD.setOpaque(true);
                    lbl6_SideBarMD.setVisible(false);
                    lbl6_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl6_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl6_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl6_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl6_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl6_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl7_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl7_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl7_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl7_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl7_SideBarMD.setText("Order New Truck");
                    lbl7_SideBarMD.setOpaque(true);
                    lbl7_SideBarMD.setVisible(false);
                    lbl7_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl7_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl7_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl7_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl7_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl7_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl8_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl8_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl8_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl8_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl8_SideBarMD.setText("Add Employee");
                    lbl8_SideBarMD.setOpaque(true);
                    lbl8_SideBarMD.setVisible(false);
                    lbl8_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl8_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl8_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl8_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl8_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl8_SideBarMDPropertyChange(evt);
                        }
                    });

                    lbl9_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl9_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl9_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl9_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl9_SideBarMD.setText("Consignment Waiting Time");
                    lbl9_SideBarMD.setOpaque(true);
                    lbl9_SideBarMD.setVisible(false);
                    lbl9_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl9_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl9_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl9_SideBarMDMouseExited(evt);
                        }
                    });

                    lbl10_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl10_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl10_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl10_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl10_SideBarMD.setText("Add Office");
                    lbl10_SideBarMD.setOpaque(true);
                    lbl10_SideBarMD.setVisible(false);
                    lbl10_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl10_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl10_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl10_SideBarMDMouseExited(evt);
                        }
                    });

                    lbl11_SideBarMD.setBackground(new java.awt.Color(4, 28, 50));
                    lbl11_SideBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    lbl11_SideBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl11_SideBarMD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    lbl11_SideBarMD.setText("Sign Out");
                    lbl11_SideBarMD.setOpaque(true);
                    lbl11_SideBarMD.setVisible(false);
                    lbl11_SideBarMD.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lbl11_SideBarMDMouseClicked(evt);
                        }

                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                            lbl11_SideBarMDMouseEntered(evt);
                        }

                        public void mouseExited(java.awt.event.MouseEvent evt) {
                            lbl11_SideBarMDMouseExited(evt);
                        }
                    });
                    lbl11_SideBarMD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                            lbl11_SideBarMDPropertyChange(evt);
                        }
                    });

                    pnlSideBarMD.add(lbl_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
                    pnlSideBarMD.add(lbl1_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 40));
                    pnlSideBarMD.add(lbl2_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));
                    pnlSideBarMD.add(lbl3_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 40));
                    pnlSideBarMD.add(lbl4_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));
                    pnlSideBarMD.add(lbl5_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 40));
                    pnlSideBarMD.add(lbl6_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 40));
                    pnlSideBarMD.add(lbl7_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 40));
                    pnlSideBarMD.add(lbl8_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 40));
                    pnlSideBarMD.add(lbl9_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, 40));
                    pnlSideBarMD.add(lbl10_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 40));
                    pnlSideBarMD.add(lbl11_SideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 240, 40));

                }

                {
                    pnlTopBarMD.setBackground(new java.awt.Color(115, 133, 152));
                    pnlTopBarMD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    lbl1_TopBarMD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (2).png"))); // NOI18N
                    lbl1_TopBarMD.setText("");

                    lbl2_TopBarMD.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                    lbl2_TopBarMD.setForeground(new java.awt.Color(255, 255, 255));
                    lbl2_TopBarMD.setText("User");

                    pnlTopBarMD.add(lbl1_TopBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 40));
                    pnlTopBarMD.add(lbl2_TopBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 160, 50));

                }

                {
                    homeMD.setBackground(new java.awt.Color(4, 41, 58));
                    homeMD.setToolTipText("");
                    homeMD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        addTruck.setBackground(new java.awt.Color(4, 41, 58));
                        addTruck.setForeground(new java.awt.Color(255, 255, 255));
                        addTruck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_addTruck.setBackground(new java.awt.Color(6, 70, 99));
                            pnl_addTruck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            lbl1_addTruck.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl1_addTruck.setForeground(new java.awt.Color(255, 255, 255));
                            lbl1_addTruck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl1_addTruck.setText("Add New Truck");

                            lbl2_addTruck.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl2_addTruck.setForeground(new java.awt.Color(255, 255, 255));
                            lbl2_addTruck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl2_addTruck.setText("Select Office to Add Truck");

                            lbl3_addTruck.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl3_addTruck.setForeground(new java.awt.Color(255, 255, 255));
                            lbl3_addTruck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl3_addTruck.setText("New Truck added to this Office");

                            cbox_addTruck.setBackground(new java.awt.Color(115, 133, 152));
                            cbox_addTruck.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            cbox_addTruck.setForeground(new java.awt.Color(255, 255, 255));
                            cbox_addTruck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
                            cbox_addTruck.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cbox_addTruckActionPerformed(evt);
                                }
                            });

                            btn_addTruck.setBackground(new java.awt.Color(115, 133, 152));
                            btn_addTruck.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn_addTruck.setForeground(new java.awt.Color(255, 255, 255));
                            btn_addTruck.setText("ADD");
                            btn_addTruck.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_addTruckActionPerformed(evt);
                                }
                            });

                            pnl_addTruck.add(lbl1_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, -1));
                            pnl_addTruck.add(lbl2_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, -1));
                            pnl_addTruck.add(lbl3_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 310, -1));
                            pnl_addTruck.add(cbox_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 190, 30));
                            pnl_addTruck.add(btn_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 134, -1));

                        }

                        addTruck.add(pnl_addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 580, 540));
                        addTruck.setVisible(false);
                    }

                    {
                        QueryConsign.setBackground(new java.awt.Color(4, 41, 58));
                        QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        QueryConsign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        pnl_QueryConsign.setBackground(new java.awt.Color(6, 70, 99));
                        pnl_QueryConsign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        lbl_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                        lbl_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl_QueryConsign.setText("Consignment Details");
                        pnl_QueryConsign.add(lbl_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 72));

                        lbl1_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl1_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_QueryConsign.setText("Select Consignment");
                        pnl_QueryConsign.add(lbl1_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 30));

                        cbox_QueryConsign.setBackground(new java.awt.Color(115, 133, 152));
                        cbox_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        cbox_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        cbox_QueryConsign.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{""}));
                        cbox_QueryConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbox_QueryConsignActionPerformed(evt);
                            }
                        });
                        pnl_QueryConsign.add(cbox_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 30));

                        btn_QueryConsign.setBackground(new java.awt.Color(115, 133, 152));
                        btn_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        btn_QueryConsign.setText("GO");
                        btn_QueryConsign.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_QueryConsignMouseClicked(evt);
                            }
                        });
                        btn_QueryConsign.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_QueryConsignActionPerformed(evt);
                            }
                        });
                        pnl_QueryConsign.add(btn_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 110, 30));

                        lbl2_QueryConsign.setBackground(new java.awt.Color(6, 70, 99));
                        lbl2_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                        lbl2_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl2_QueryConsign.setText("    Booking Details");
                        pnl_QueryConsign.add(lbl2_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

                        lbl9_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl9_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl9_QueryConsign.setText("Booked by");
                        pnl_QueryConsign.add(lbl9_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

                        lbl5_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl5_QueryConsign.setText("Booked at");
                        pnl_QueryConsign.add(lbl5_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

                        lbl3_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl3_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl3_QueryConsign.setText("Booked on");
                        pnl_QueryConsign.add(lbl3_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

                        lbl7_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl7_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl7_QueryConsign.setText("Destination");
                        pnl_QueryConsign.add(lbl7_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

                        lbl11_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl11_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl11_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl11_QueryConsign.setText("Delivery Charge");
                        pnl_QueryConsign.add(lbl11_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

                        lbl18_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl18_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl18_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl18_QueryConsign.setText("Delivered on");
                        pnl_QueryConsign.add(lbl18_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

                        lbl16_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl16_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl16_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl16_QueryConsign.setText("Delivered to");
                        pnl_QueryConsign.add(lbl16_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

                        lbl14_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl14_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl14_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl14_QueryConsign.setText("Status");
                        pnl_QueryConsign.add(lbl14_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

                        lbl13_QueryConsign.setBackground(new java.awt.Color(6, 70, 99));
                        lbl13_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                        lbl13_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl13_QueryConsign.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                        lbl13_QueryConsign.setText("    Delivery Details");
                        pnl_QueryConsign.add(lbl13_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

                        lbl19_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl19_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl19_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl19_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

                        lbl4_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl4_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl4_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

                        lbl6_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl6_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl6_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl6_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

                        lbl8_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl8_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl8_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

                        lbl10_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl10_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl10_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl10_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

                        lbl12_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl12_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl12_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl12_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

                        lbl15_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl15_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl15_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl15_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

                        lbl17_QueryConsign.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        lbl17_QueryConsign.setForeground(new java.awt.Color(255, 255, 255));
                        lbl17_QueryConsign.setText("................");
                        pnl_QueryConsign.add(lbl17_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

                        QueryConsign.add(pnl_QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 450, 540));

                        QueryConsign.setVisible(false);
                    }

                    {
                        idleTime.setBackground(new java.awt.Color(4, 41, 58));
                        idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        idleTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        pnl_idleTime.setBackground(new java.awt.Color(6, 70, 99));
                        pnl_idleTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        lbl3_idleTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl3_idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        lbl3_idleTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl3_idleTime.setText("<html><center>This trucks idle time is <br> ......... days</center></html>");
                        pnl_idleTime.add(lbl3_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 580, 60));

                        lbl2_idleTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl2_idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        lbl2_idleTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl2_idleTime.setText("Select Truck");
                        pnl_idleTime.add(lbl2_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 136, -1));

                        lbl1_idleTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        lbl1_idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        lbl1_idleTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl1_idleTime.setText("Average Truck Idle Time");
                        lbl1_idleTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 133, 152)));
                        pnl_idleTime.add(lbl1_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 580, -1));

                        cbox_idleTime.setBackground(new java.awt.Color(115, 133, 152));
                        cbox_idleTime.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                        cbox_idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        cbox_idleTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Truck 1", "Truck 2", " "}));
                        cbox_idleTime.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbox_idleTimeActionPerformed(evt);
                            }
                        });
                        pnl_idleTime.add(cbox_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 232, -1));

                        btn_idleTime.setBackground(new java.awt.Color(115, 133, 152));
                        btn_idleTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn_idleTime.setForeground(new java.awt.Color(255, 255, 255));
                        btn_idleTime.setText("GO");
                        btn_idleTime.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_idleTimeActionPerformed(evt);
                            }
                        });
                        pnl_idleTime.add(btn_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 134, -1));

                        idleTime.add(pnl_idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 580, 540));

                        idleTime.setVisible(false);
                    }

                    {
                        truckStatus.setBackground(new java.awt.Color(4, 41, 58));
                        truckStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_truckStatus.setBackground(new java.awt.Color(6, 70, 99));
                            pnl_truckStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            lbl1_truckStatus.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
                            lbl1_truckStatus.setForeground(new java.awt.Color(255, 255, 255));
                            lbl1_truckStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl1_truckStatus.setText("Truck Status");

                            lbl2_truckStatus.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl2_truckStatus.setForeground(new java.awt.Color(255, 255, 255));
                            lbl2_truckStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl2_truckStatus.setText("Select Truck");

                            lbl3_truckStatus.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            lbl3_truckStatus.setForeground(new java.awt.Color(255, 255, 255));
                            lbl3_truckStatus.setHorizontalAlignment(SwingConstants.CENTER);
                            lbl3_truckStatus.setText("Truck Details");

                            cbox_truckStatus.setBackground(new java.awt.Color(115, 133, 152));
                            cbox_truckStatus.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            cbox_truckStatus.setForeground(new java.awt.Color(255, 255, 255));
                            cbox_truckStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Truck 1", "Truck 2", "Truck 3", "Truck 4", " "}));
                            cbox_truckStatus.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cbox_truckStatusActionPerformed(evt);
                                }
                            });

                            btn_truckStatus.setBackground(new java.awt.Color(115, 133, 152));
                            btn_truckStatus.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn_truckStatus.setForeground(new java.awt.Color(255, 255, 255));
                            btn_truckStatus.setText("GO");
                            btn_truckStatus.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btn_truckStatusMouseClicked(evt);
                                }
                            });
                            btn_truckStatus.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_truckStatusActionPerformed(evt);
                                }
                            });

                            pnl_truckStatus.add(lbl1_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 72));
                            pnl_truckStatus.add(lbl2_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));
                            pnl_truckStatus.add(lbl3_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 290));
                            pnl_truckStatus.add(cbox_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 110, 190, -1));
                            pnl_truckStatus.add(btn_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 30));

                        }

                        truckStatus.add(pnl_truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 450, 540));

                        truckStatus.setVisible(false);
                    }

                    {
                        changeRate.setBackground(new java.awt.Color(4, 41, 58));
                        changeRate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_changeRate.setBackground(new java.awt.Color(6, 70, 99));
                            pnl_changeRate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            lbl1_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl1_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            lbl1_changeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl1_changeRate.setText("Change Transportation Rate ");

                            lbl2_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl2_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            lbl2_changeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl2_changeRate.setText("Select Office");

                            lbl3_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl3_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            lbl3_changeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl3_changeRate.setText("Enter New Transportation Rate");

                            lbl4_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl4_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            lbl4_changeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl4_changeRate.setText("Enter New Rate");

                            lbl5_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl5_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            lbl5_changeRate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl5_changeRate.setText("Rate is updated for this office");

                            cbox_changeRate.setBackground(new java.awt.Color(115, 133, 152));
                            cbox_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            cbox_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            cbox_changeRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"123456", "123457", "123458j"}));
                            cbox_changeRate.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cbox_changeRateActionPerformed(evt);
                                }
                            });

                            txt_changeRate.setBackground(new java.awt.Color(115, 133, 152));
                            txt_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            txt_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            txt_changeRate.setText("");
                            txt_changeRate.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    txt_changeRateActionPerformed(evt);
                                }
                            });

                            btn1_changeRate.setBackground(new java.awt.Color(115, 133, 152));
                            btn1_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn1_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            btn1_changeRate.setText("NEXT");
                            btn1_changeRate.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn1_changeRateActionPerformed(evt);
                                }
                            });

                            btn2_changeRate.setBackground(new java.awt.Color(115, 133, 152));
                            btn2_changeRate.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn2_changeRate.setForeground(new java.awt.Color(255, 255, 255));
                            btn2_changeRate.setText("GO");
                            btn2_changeRate.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn2_changeRateActionPerformed(evt);
                                }
                            });

                            pnl_changeRate.add(lbl1_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 580, -1));
                            pnl_changeRate.add(lbl2_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, -1));
                            pnl_changeRate.add(lbl3_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 580, -1));
                            pnl_changeRate.add(lbl4_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, -1));
                            pnl_changeRate.add(lbl5_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 580, 60));
                            pnl_changeRate.add(cbox_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 210, 30));
                            pnl_changeRate.add(txt_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 210, 30));
                            pnl_changeRate.add(btn1_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 134, -1));
                            pnl_changeRate.add(btn2_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 134, -1));
                        }

                        changeRate.add(pnl_changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 580, 540));

                        changeRate.setVisible(false);
                    }

                    {
                        officeDetails.setBackground(new java.awt.Color(4, 41, 58));
                        officeDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_officeDetails.setBackground(new java.awt.Color(6, 70, 99));
                            pnl_officeDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            lbl1_officeDetails.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl1_officeDetails.setForeground(new java.awt.Color(255, 255, 255));
                            lbl1_officeDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl1_officeDetails.setText("Office Statistics");
                            lbl1_officeDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 133, 152)));

                            lbl2_officeDetails.setBackground(new java.awt.Color(6, 70, 99));
                            lbl2_officeDetails.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl2_officeDetails.setForeground(new java.awt.Color(255, 255, 255));
                            lbl2_officeDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl2_officeDetails.setText("Select Office");


                            lbl3_officeDetails.setBackground(new java.awt.Color(6, 70, 99));
                            lbl3_officeDetails.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl3_officeDetails.setForeground(new java.awt.Color(255, 255, 255));
                            lbl3_officeDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl3_officeDetails.setText("");
                            lbl3_ConsignWaitTime.setVisible(false);

                            cbox_officeDetails.setBackground(new java.awt.Color(115, 133, 152));
                            cbox_officeDetails.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            cbox_officeDetails.setForeground(new java.awt.Color(255, 255, 255));
                            cbox_officeDetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch 1", "Branch 2", "Branch 3", "Branch 4"}));
                            cbox_officeDetails.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cbox_officeDetailsActionPerformed(evt);
                                }
                            });

                            btn_officeDetails.setBackground(new java.awt.Color(115, 133, 152));
                            btn_officeDetails.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn_officeDetails.setForeground(new java.awt.Color(255, 255, 255));
                            btn_officeDetails.setText("GO");
                            btn_officeDetails.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btn_officeDetailsMouseClicked(evt);
                                }
                            });
                            btn_officeDetails.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_officeDetailsActionPerformed(evt);
                                }
                            });

                            pnl_officeDetails.add(lbl1_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, -1));
                            pnl_officeDetails.add(lbl2_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));
                            pnl_officeDetails.add(lbl3_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 450, 270));
                            pnl_officeDetails.add(cbox_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 190, 30));
                            pnl_officeDetails.add(btn_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 30));

                        }

                        officeDetails.add(pnl_officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 450, 540));

                        officeDetails.setVisible(false);

                    }

                    {
                        addEmployee.setBackground(new java.awt.Color(255, 255, 255));
                        addEmployee.setForeground(new java.awt.Color(4, 41, 58));
                        addEmployee.setMaximumSize(new java.awt.Dimension(800, 600));
                        addEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_addEmployee.setBackground(new java.awt.Color(4, 41, 58));
                            pnl_addEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            {
                                pnlEnterEmployee.setBackground(new java.awt.Color(6, 70, 99));

                                lbl1_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
                                lbl1_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl1_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                                lbl1_EnterEmployee.setText("Register Now");

                                lbl2_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl2_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl2_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl2_EnterEmployee.setText("Name");

                                lbl3_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl3_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl3_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl3_EnterEmployee.setText("Date of Birth");

                                lbl4_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl4_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl4_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl4_EnterEmployee.setText("Address");

                                lbl5_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl5_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl5_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl5_EnterEmployee.setText("Email");

                                lbl6_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl6_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl6_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl6_EnterEmployee.setText("Office ZIP code");

                                lbl7_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl7_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl7_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl7_EnterEmployee.setText("Password");

                                lbl8_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl8_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                lbl8_EnterEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl8_EnterEmployee.setText("Confirm Password");

                                txt1_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt1_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt1_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt1_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt1_EnterEmployee.setBorder(null);
                                txt1_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt1_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt2_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt2_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt2_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt2_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt2_EnterEmployee.setText("YYYY-MM-DD");
                                txt2_EnterEmployee.setBorder(null);
                                txt2_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt2_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt3_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt3_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt3_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt3_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt3_EnterEmployee.setBorder(null);
                                txt3_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt3_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt4_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt4_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt4_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt4_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt4_EnterEmployee.setBorder(null);
                                txt4_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt4_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt5_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt5_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt5_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt5_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt5_EnterEmployee.setBorder(null);
                                txt5_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt5_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt6_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt6_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt6_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt6_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt6_EnterEmployee.setBorder(null);
                                txt6_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt6_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                txt7_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                txt7_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt7_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                txt7_EnterEmployee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt7_EnterEmployee.setBorder(null);
                                txt7_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        txt7_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                btn_EnterEmployee.setBackground(new java.awt.Color(115, 133, 152));
                                btn_EnterEmployee.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                                btn_EnterEmployee.setForeground(new java.awt.Color(255, 255, 255));
                                btn_EnterEmployee.setText("Sign Up");
                                btn_EnterEmployee.setBorder(null);
                                btn_EnterEmployee.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        btn_EnterEmployeeActionPerformed(evt);
                                    }
                                });

                                javax.swing.GroupLayout pnlEnterEmployeeLayout = new javax.swing.GroupLayout(pnlEnterEmployee);
                                pnlEnterEmployee.setLayout(pnlEnterEmployeeLayout);
                                pnlEnterEmployeeLayout.setHorizontalGroup(
                                        pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                        .addGap(25, 25, 25)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                                        .addGap(66, 66, 66)
                                                                        .addComponent(btn_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(lbl1_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                                                .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(lbl5_EnterEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(lbl8_EnterEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(lbl7_EnterEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(lbl6_EnterEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(lbl4_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl2_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbl3_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txt5_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt6_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt7_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt4_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt1_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt3_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt2_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addContainerGap(30, Short.MAX_VALUE))
                                );
                                pnlEnterEmployeeLayout.setVerticalGroup(
                                        pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(lbl1_EnterEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                                        .addComponent(lbl2_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(lbl3_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(lbl4_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnlEnterEmployeeLayout.createSequentialGroup()
                                                                        .addComponent(txt1_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(12, 12, 12)
                                                                        .addComponent(txt2_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(txt3_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbl5_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt4_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(13, 13, 13)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lbl6_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt5_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbl7_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt6_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pnlEnterEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txt7_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lbl8_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(48, 48, 48)
                                                        .addComponent(btn_EnterEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(38, 38, 38))
                                );
                            }

                            pnl_addEmployee.add(pnlEnterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 540));

                        }

                        addEmployee.add(pnl_addEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));

                        addEmployee.setVisible(false);
                    }

                    {
                        ConsignWaitTime.setBackground(new java.awt.Color(4, 41, 58));
                        ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                        ConsignWaitTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl_ConsignWaitTime.setBackground(new java.awt.Color(6, 70, 99));
                            pnl_ConsignWaitTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            lbl1_ConsignWaitTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl1_ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                            lbl1_ConsignWaitTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl1_ConsignWaitTime.setText("Average Consignment Waiting Time");
                            lbl1_ConsignWaitTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(115, 133, 152)));

                            lbl2_ConsignWaitTime.setBackground(new java.awt.Color(6, 70, 99));
                            lbl2_ConsignWaitTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl2_ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                            lbl2_ConsignWaitTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl2_ConsignWaitTime.setText("Select Office");

                            lbl3_ConsignWaitTime.setBackground(new java.awt.Color(6, 70, 99));
                            lbl3_ConsignWaitTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            lbl3_ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                            lbl3_ConsignWaitTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                            lbl3_ConsignWaitTime.setText("<html><center>The consignment waits for an average of <br> .......... days <br> at this Office</center></html>");
                            lbl3_ConsignWaitTime.setVisible(false);

                            cbox_ConsignWaitTime.setBackground(new java.awt.Color(115, 133, 152));
                            cbox_ConsignWaitTime.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                            cbox_ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                            cbox_ConsignWaitTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Branch 1", "Branch 2", "Branch 3", "Branch 4"}));
                            cbox_ConsignWaitTime.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cbox_ConsignWaitTimeActionPerformed(evt);
                                }
                            });

                            btn_ConsignWaitTime.setBackground(new java.awt.Color(115, 133, 152));
                            btn_ConsignWaitTime.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                            btn_ConsignWaitTime.setForeground(new java.awt.Color(255, 255, 255));
                            btn_ConsignWaitTime.setText("GO");
                            btn_ConsignWaitTime.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseClicked(java.awt.event.MouseEvent evt) {
                                    btn_ConsignWaitTimeMouseClicked(evt);
                                }
                            });
                            btn_ConsignWaitTime.addActionListener(new java.awt.event.ActionListener() {
                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_ConsignWaitTimeActionPerformed(evt);
                                }
                            });

                            pnl_ConsignWaitTime.add(lbl1_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 580, -1));
                            pnl_ConsignWaitTime.add(lbl2_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, -1));
                            pnl_ConsignWaitTime.add(lbl3_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 580, 90));
                            pnl_ConsignWaitTime.add(cbox_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 190, 30));
                            pnl_ConsignWaitTime.add(btn_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 100, 30));
                        }

                        ConsignWaitTime.add(pnl_ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 580, 540));

                        ConsignWaitTime.setVisible(false);
                    }

                    {
                        addOffice.setBackground(new java.awt.Color(255, 255, 255));
                        addOffice.setForeground(new java.awt.Color(241, 241, 241));
                        addOffice.setMaximumSize(new java.awt.Dimension(800, 600));
                        addOffice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                        {
                            pnl1_addOffice.setBackground(new java.awt.Color(4, 41, 58));
                            pnl1_addOffice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                            {
                                pnl2_addOffice.setBackground(new java.awt.Color(6, 70, 99));

                                txt1_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt1_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt1_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt1_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt1_addOffice.setBorder(null);
                                txt1_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt1_addOfficeActionPerformed(evt);
                                    }
                                });

                                lbl4_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl4_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl4_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl4_addOffice.setText("State");

                                lbl7_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl7_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl7_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl7_addOffice.setText("Rate/cubic metre");

                                btn_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                btn_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                                btn_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                btn_addOffice.setText("Add");
                                btn_addOffice.setBorder(null);
                                btn_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        btn_addOfficeActionPerformed(evt);
                                    }
                                });

                                lbl3_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl3_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl3_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl3_addOffice.setText("City");

                                lbl6_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl6_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl6_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl6_addOffice.setText("Phone No.");

                                lbl2_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl2_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl2_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl2_addOffice.setText("Street");

                                lbl5_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                lbl5_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl5_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                                lbl5_addOffice.setText("ZIP code");

                                txt3_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt3_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt3_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt3_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt3_addOffice.setBorder(null);
                                txt3_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt3_addOfficeActionPerformed(evt);
                                    }
                                });

                                txt5_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt5_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt5_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt5_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt5_addOffice.setBorder(null);
                                txt5_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt5_addOfficeActionPerformed(evt);
                                    }
                                });

                                txt2_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt2_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt2_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt2_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt2_addOffice.setBorder(null);
                                txt2_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt2_addOfficeActionPerformed(evt);
                                    }
                                });

                                txt4_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt4_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt4_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt4_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt4_addOffice.setBorder(null);
                                txt4_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt4_addOfficeActionPerformed(evt);
                                    }
                                });

                                lbl1_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 36)); // NOI18N
                                lbl1_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                lbl1_addOffice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                                lbl1_addOffice.setText("Enter Office Details");

                                txt6_addOffice.setBackground(new java.awt.Color(115, 133, 152));
                                txt6_addOffice.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                                txt6_addOffice.setForeground(new java.awt.Color(255, 255, 255));
                                txt6_addOffice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                txt6_addOffice.setBorder(null);
                                txt6_addOffice.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
//                                        txt6_addOfficeActionPerformed(evt);
                                    }
                                });

                                javax.swing.GroupLayout pnl2_addOfficeLayout = new javax.swing.GroupLayout(pnl2_addOffice);
                                pnl2_addOffice.setLayout(pnl2_addOfficeLayout);
                                pnl2_addOfficeLayout.setHorizontalGroup(
                                        pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                                        .addGap(25, 25, 25)
                                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lbl1_addOffice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl2_addOfficeLayout.createSequentialGroup()
                                                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(lbl5_addOffice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                        .addComponent(lbl7_addOffice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                        .addComponent(lbl6_addOffice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(lbl4_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(lbl2_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(lbl3_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(txt4_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt1_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt3_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt2_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt5_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(txt6_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                                        .addGap(89, 89, 89)
                                                                        .addComponent(btn_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addContainerGap(30, Short.MAX_VALUE))
                                );
                                pnl2_addOfficeLayout.setVerticalGroup(
                                        pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(lbl1_addOffice, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                                        .addGap(51, 51, 51)
                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                                        .addComponent(lbl2_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(13, 13, 13)
                                                                        .addComponent(lbl3_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(lbl4_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnl2_addOfficeLayout.createSequentialGroup()
                                                                        .addComponent(txt1_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(12, 12, 12)
                                                                        .addComponent(txt2_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(txt3_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lbl5_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt4_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(13, 13, 13)
                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lbl6_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt5_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(pnl2_addOfficeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lbl7_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt6_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(52, 52, 52)
                                                        .addComponent(btn_addOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(57, 57, 57))
                                );
                            }
                            pnl1_addOffice.add(pnl2_addOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 540));
                        }
                        addOffice.add(pnl1_addOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                        addOffice.setVisible(false);
                    }

                    homeMD.add(addTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(QueryConsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(idleTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(truckStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(changeRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(officeDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(addEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(ConsignWaitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
                    homeMD.add(addOffice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

//                    {
//                        rev_det_cons.setBackground(new java.awt.Color(4, 41, 58));
//
//                        jLabel10MD.setForeground(new java.awt.Color(255, 255, 255));
//                        jLabel10MD.setText("revenue details");
//
//                        javax.swing.GroupLayout rev_det_consLayout = new javax.swing.GroupLayout(rev_det_cons);
//                        rev_det_cons.setLayout(rev_det_consLayout);
//                        rev_det_consLayout.setHorizontalGroup(
//                                rev_det_consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(rev_det_consLayout.createSequentialGroup()
//                                                .addGap(140, 140, 140)
//                                                .addComponent(jLabel10MD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(342, Short.MAX_VALUE))
//                        );
//                        rev_det_consLayout.setVerticalGroup(
//                                rev_det_consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(rev_det_consLayout.createSequentialGroup()
//                                                .addGap(180, 180, 180)
//                                                .addComponent(jLabel10MD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(278, Short.MAX_VALUE))
//                        );
//
//                        homeMD.add(rev_det_cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
//                        rev_det_cons.setVisible(false);
//                    }
//
//                    {
//                        vol_det_cons.setBackground(new java.awt.Color(4, 41, 58));
//
//                        jLabel11MD.setForeground(new java.awt.Color(255, 255, 255));
//                        jLabel11MD.setText("Volume Details");
//
//                        javax.swing.GroupLayout vol_det_consLayout = new javax.swing.GroupLayout(vol_det_cons);
//                        vol_det_cons.setLayout(vol_det_consLayout);
//                        vol_det_consLayout.setHorizontalGroup(
//                                vol_det_consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(vol_det_consLayout.createSequentialGroup()
//                                                .addGap(126, 126, 126)
//                                                .addComponent(jLabel11MD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(356, Short.MAX_VALUE))
//                        );
//                        vol_det_consLayout.setVerticalGroup(
//                                vol_det_consLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(vol_det_consLayout.createSequentialGroup()
//                                                .addGap(139, 139, 139)
//                                                .addComponent(jLabel11MD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(319, Short.MAX_VALUE))
//                        );
//
//                        homeMD.add(vol_det_cons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
//                        vol_det_cons.setVisible(false);
//
//                    }
//
//                    {
//                        trucklocationdetails.setBackground(new java.awt.Color(4, 41, 58));
//
//                        jLabel35MD.setForeground(new java.awt.Color(255, 255, 255));
//                        jLabel35MD.setText("Truck Location details");
//
//                        javax.swing.GroupLayout trucklocationdetailsLayout = new javax.swing.GroupLayout(trucklocationdetails);
//                        trucklocationdetails.setLayout(trucklocationdetailsLayout);
//                        trucklocationdetailsLayout.setHorizontalGroup(
//                                trucklocationdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(trucklocationdetailsLayout.createSequentialGroup()
//                                                .addGap(140, 140, 140)
//                                                .addComponent(jLabel35MD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(342, Short.MAX_VALUE))
//                        );
//                        trucklocationdetailsLayout.setVerticalGroup(
//                                trucklocationdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(trucklocationdetailsLayout.createSequentialGroup()
//                                                .addGap(180, 180, 180)
//                                                .addComponent(jLabel35MD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(278, Short.MAX_VALUE))
//                        );
//
//                        homeMD.add(trucklocationdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
//                        trucklocationdetails.setVisible(false);
//                    }
//
//                    {
//                        truckdetails.setBackground(new java.awt.Color(4, 41, 58));
//
//                        jLabel29MD.setForeground(new java.awt.Color(255, 255, 255));
//                        jLabel29MD.setText("truck Details");
//
//                        javax.swing.GroupLayout truckdetailsLayout = new javax.swing.GroupLayout(truckdetails);
//                        truckdetails.setLayout(truckdetailsLayout);
//                        truckdetailsLayout.setHorizontalGroup(
//                                truckdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(truckdetailsLayout.createSequentialGroup()
//                                                .addGap(140, 140, 140)
//                                                .addComponent(jLabel29MD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(342, Short.MAX_VALUE))
//                        );
//                        truckdetailsLayout.setVerticalGroup(
//                                truckdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(truckdetailsLayout.createSequentialGroup()
//                                                .addGap(180, 180, 180)
//                                                .addComponent(jLabel29MD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(278, Short.MAX_VALUE))
//                        );
//
//                        homeMD.add(truckdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
//                        truckdetails.setVisible(false);
//                    }
//
//                    {
//                        branchdetails.setBackground(new java.awt.Color(4, 41, 58));
//
//                        jLabel13MD.setForeground(new java.awt.Color(255, 255, 255));
//                        jLabel13MD.setText("office Statistics");
//
//                        javax.swing.GroupLayout branchdetailsLayout = new javax.swing.GroupLayout(branchdetails);
//                        branchdetails.setLayout(branchdetailsLayout);
//                        branchdetailsLayout.setHorizontalGroup(
//                                branchdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(branchdetailsLayout.createSequentialGroup()
//                                                .addGap(140, 140, 140)
//                                                .addComponent(jLabel13MD, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(342, Short.MAX_VALUE))
//                        );
//                        branchdetailsLayout.setVerticalGroup(
//                                branchdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(branchdetailsLayout.createSequentialGroup()
//                                                .addGap(180, 180, 180)
//                                                .addComponent(jLabel13MD, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addContainerGap(278, Short.MAX_VALUE))
//                        );
//
//                        homeMD.add(branchdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));
//                        branchdetails.setVisible(false);
//                    }

                }

                ManagerDashboard.add(pnlSideBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 600));
                ManagerDashboard.add(pnlTopBarMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 740, 60));
                ManagerDashboard.add(homeMD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 740, 540));

            }

            /**
             * This is EmployeeForgetPass JPanel
             */

            {
                EmployeeForgetPass.setBackground(new java.awt.Color(255, 255, 255));
                EmployeeForgetPass.setForeground(new java.awt.Color(4, 41, 58));
                EmployeeForgetPass.setMaximumSize(new java.awt.Dimension(800, 600));
                EmployeeForgetPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnl1_EmployeeForgetPass.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_EmployeeForgetPass.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_EmployeeForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    lbl2_EmployeeForgetPass.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
                    lbl2_EmployeeForgetPass.setText("A Transportation Company Computerisation Software");

                    lbl3_EmployeeForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

                    javax.swing.GroupLayout pnl1_EmployeeForgetPassLayout = new javax.swing.GroupLayout(pnl1_EmployeeForgetPass);
                    pnl1_EmployeeForgetPass.setLayout(pnl1_EmployeeForgetPassLayout);
                    pnl1_EmployeeForgetPassLayout.setHorizontalGroup(
                            pnl1_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_EmployeeForgetPassLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addGroup(pnl1_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl2_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addComponent(lbl3_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(65, Short.MAX_VALUE))
                    );
                    pnl1_EmployeeForgetPassLayout.setVerticalGroup(
                            pnl1_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_EmployeeForgetPassLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(pnl1_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl3_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnl1_EmployeeForgetPassLayout.createSequentialGroup()
                                                            .addGap(20, 20, 20)
                                                            .addComponent(lbl1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbl2_EmployeeForgetPass)))
                                            .addContainerGap(13, Short.MAX_VALUE))
                    );
                }

                {
                    pnl2_EmployeeForgetPass.setBackground(new java.awt.Color(4, 41, 58));
                    pnl2_EmployeeForgetPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlCredentials_EmployeeForgetPass.setBackground(new java.awt.Color(6, 70, 99));

                        lbl4_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl4_EmployeeForgetPass.setText("Username");

                        lbl5_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl5_EmployeeForgetPass.setText("Date of Birth");

                        lbl6_EmployeeForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2) (1).png"))); // NOI18N

                        lbl7_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_EmployeeForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date-of-birth (1).png"))); // NOI18N

                        lbl8_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl8_EmployeeForgetPass.setText("Return to Login");
                        lbl8_EmployeeForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl8_EmployeeForgetPassMouseClicked(evt);
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                lbl8_EmployeeForgetPassMouseEntered(evt);
                            }

                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                lbl8_EmployeeForgetPassMouseExited(evt);
                            }
                        });

                        txt1_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        txt1_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt1_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        txt1_EmployeeForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt1_EmployeeForgetPass.setBorder(null);
                        txt1_EmployeeForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1_EmployeeForgetPassActionPerformed(evt);
                            }
                        });

                        txt2_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        txt2_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt2_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        txt2_EmployeeForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt2_EmployeeForgetPass.setText("YYYY-MM-DD");
                        txt2_EmployeeForgetPass.setBorder(null);

                        btn1_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        btn1_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn1_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        btn1_EmployeeForgetPass.setText("Reset Password");
                        btn1_EmployeeForgetPass.setBorder(null);
                        btn1_EmployeeForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn1_EmployeeForgetPassMouseClicked(evt);
                            }
                        });
                        btn1_EmployeeForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn1_EmployeeForgetPassActionPerformed(evt);
                            }
                        });


                        javax.swing.GroupLayout pnlCredentials_EmployeeForgetPassLayout = new javax.swing.GroupLayout(pnlCredentials_EmployeeForgetPass);
                        pnlCredentials_EmployeeForgetPass.setLayout(pnlCredentials_EmployeeForgetPassLayout);
                        pnlCredentials_EmployeeForgetPassLayout.setHorizontalGroup(
                                pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCredentials_EmployeeForgetPassLayout.createSequentialGroup()
                                                .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCredentials_EmployeeForgetPassLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(lbl4_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnlCredentials_EmployeeForgetPassLayout.createSequentialGroup()
                                                                        .addGap(64, 64, 64)
                                                                        .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbl7_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbl6_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txt1_EmployeeForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                                                                .addComponent(lbl5_EmployeeForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                                                                .addComponent(txt2_EmployeeForgetPass)))))
                                                .addContainerGap(83, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCredentials_EmployeeForgetPassLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lbl8_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        );
                        pnlCredentials_EmployeeForgetPassLayout.setVerticalGroup(
                                pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCredentials_EmployeeForgetPassLayout.createSequentialGroup()
                                                .addContainerGap(85, Short.MAX_VALUE)
                                                .addComponent(lbl4_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl6_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl5_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCredentials_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbl7_EmployeeForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(txt2_EmployeeForgetPass))
                                                .addGap(32, 32, 32)
                                                .addComponent(btn1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(89, 89, 89)
                                                .addComponent(lbl8_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                        );
                    }

                    {
                        pnlReset_EmployeeForgetPass.setBackground(new java.awt.Color(6, 70, 99));
                        pnlReset_EmployeeForgetPass.setVisible(false);

                        lbl9_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl9_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl9_EmployeeForgetPass.setText("New Password");

                        lbl10_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl10_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl10_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl10_EmployeeForgetPass.setText("Confirm Password");

                        lbl11_EmployeeForgetPass.setBackground(new java.awt.Color(6, 70, 99));
                        lbl11_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl11_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl11_EmployeeForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl11_EmployeeForgetPass.setText("Back");
                        lbl11_EmployeeForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl11_EmployeeForgetPassMouseClicked(evt);
                            }
                        });

                        pwd1_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        pwd1_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd1_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        pwd1_EmployeeForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd1_EmployeeForgetPass.setBorder(null);

                        pwd2_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        pwd2_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd2_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        pwd2_EmployeeForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd2_EmployeeForgetPass.setBorder(null);
                        pwd2_EmployeeForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pwd2_EmployeeForgetPassActionPerformed(evt);
                            }
                        });

                        btn2_EmployeeForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        btn2_EmployeeForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn2_EmployeeForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        btn2_EmployeeForgetPass.setText("OK");
                        btn2_EmployeeForgetPass.setBorder(null);
                        btn2_EmployeeForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn2_EmployeeForgetPassMouseClicked(evt);
                            }
                        });
                        btn2_EmployeeForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn2_EmployeeForgetPassActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlReset_EmployeeForgetPassLayout = new javax.swing.GroupLayout(pnlReset_EmployeeForgetPass);
                        pnlReset_EmployeeForgetPass.setLayout(pnlReset_EmployeeForgetPassLayout);
                        pnlReset_EmployeeForgetPassLayout.setHorizontalGroup(
                                pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                .addGroup(pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                                .addGroup(pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(pwd2_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btn2_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                                                                        .addContainerGap()
                                                                                                        .addComponent(lbl9_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                                                                        .addGap(101, 101, 101)
                                                                                                        .addComponent(lbl10_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                                                        .addGap(101, 101, 101)
                                                                                        .addComponent(pwd1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 77, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lbl11_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())
                        );
                        pnlReset_EmployeeForgetPassLayout.setVerticalGroup(
                                pnlReset_EmployeeForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReset_EmployeeForgetPassLayout.createSequentialGroup()
                                                .addContainerGap(70, Short.MAX_VALUE)
                                                .addComponent(lbl9_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pwd2_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lbl10_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pwd1_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(btn2_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98)
                                                .addComponent(lbl11_EmployeeForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                        );
                    }

                    pnl2_EmployeeForgetPass.add(pnlCredentials_EmployeeForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                    pnl2_EmployeeForgetPass.add(pnlReset_EmployeeForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                }

                EmployeeForgetPass.add(pnl1_EmployeeForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 160));
                EmployeeForgetPass.add(pnl2_EmployeeForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 460));


            }

            /**
             * This is ManagerForgetPass JPanel
             */

            {
                ManagerForgetPass.setBackground(new java.awt.Color(255, 255, 255));
                ManagerForgetPass.setForeground(new java.awt.Color(4, 41, 58));
                ManagerForgetPass.setMaximumSize(new java.awt.Dimension(800, 600));
                ManagerForgetPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                {
                    pnl1_ManagerForgetPass.setBackground(new java.awt.Color(255, 255, 255));

                    lbl1_ManagerForgetPass.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
                    lbl1_ManagerForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/New Project (4).png"))); // NOI18N

                    lbl2_ManagerForgetPass.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
                    lbl2_ManagerForgetPass.setText("A Transportation Company Computerisation Software");

                    lbl3_ManagerForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Logo.png"))); // NOI18N

                    javax.swing.GroupLayout pnl1_ManagerForgetPassLayout = new javax.swing.GroupLayout(pnl1_ManagerForgetPass);
                    pnl1_ManagerForgetPass.setLayout(pnl1_ManagerForgetPassLayout);
                    pnl1_ManagerForgetPassLayout.setHorizontalGroup(
                            pnl1_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_ManagerForgetPassLayout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addGroup(pnl1_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl2_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbl1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(51, 51, 51)
                                            .addComponent(lbl3_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap(65, Short.MAX_VALUE))
                    );
                    pnl1_ManagerForgetPassLayout.setVerticalGroup(
                            pnl1_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl1_ManagerForgetPassLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(pnl1_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl3_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(pnl1_ManagerForgetPassLayout.createSequentialGroup()
                                                            .addGap(20, 20, 20)
                                                            .addComponent(lbl1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lbl2_ManagerForgetPass)))
                                            .addContainerGap(13, Short.MAX_VALUE))
                    );
                }

                {
                    pnl2_ManagerForgetPass.setBackground(new java.awt.Color(4, 41, 58));
                    pnl2_ManagerForgetPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    {
                        pnlCredentials_ManagerForgetPass.setBackground(new java.awt.Color(6, 70, 99));

                        lbl4_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl4_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl4_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl4_ManagerForgetPass.setText("Username");

                        lbl5_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl5_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl5_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl5_ManagerForgetPass.setText("Date of Birth");

                        lbl6_ManagerForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2) (1).png"))); // NOI18N

                        lbl7_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl7_ManagerForgetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/date-of-birth (1).png"))); // NOI18N

                        lbl8_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl8_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl8_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl8_ManagerForgetPass.setText("Return to Login");
                        lbl8_ManagerForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl8_ManagerForgetPassMouseClicked(evt);
                            }

                            public void mouseEntered(java.awt.event.MouseEvent evt) {
                                lbl8_ManagerForgetPassMouseEntered(evt);
                            }

                            public void mouseExited(java.awt.event.MouseEvent evt) {
                                lbl8_ManagerForgetPassMouseExited(evt);
                            }
                        });

                        txt1_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        txt1_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt1_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        txt1_ManagerForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt1_ManagerForgetPass.setBorder(null);
                        txt1_ManagerForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1_ManagerForgetPassActionPerformed(evt);
                            }
                        });

                        txt2_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        txt2_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        txt2_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        txt2_ManagerForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        txt2_ManagerForgetPass.setText("YYYY-MM-DD");
                        txt2_ManagerForgetPass.setBorder(null);

                        btn1_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        btn1_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn1_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        btn1_ManagerForgetPass.setText("Reset Password");
                        btn1_ManagerForgetPass.setBorder(null);
                        btn1_ManagerForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn1_ManagerForgetPassMouseClicked(evt);
                            }
                        });
                        btn1_ManagerForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn1_ManagerForgetPassActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlCredentials_ManagerForgetPassLayout = new javax.swing.GroupLayout(pnlCredentials_ManagerForgetPass);
                        pnlCredentials_ManagerForgetPass.setLayout(pnlCredentials_ManagerForgetPassLayout);
                        pnlCredentials_ManagerForgetPassLayout.setHorizontalGroup(
                                pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCredentials_ManagerForgetPassLayout.createSequentialGroup()
                                                .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btn1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCredentials_ManagerForgetPassLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(lbl4_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(pnlCredentials_ManagerForgetPassLayout.createSequentialGroup()
                                                                        .addGap(64, 64, 64)
                                                                        .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lbl7_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(lbl6_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txt1_ManagerForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                                                                .addComponent(lbl5_ManagerForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                                                                .addComponent(txt2_ManagerForgetPass)))))
                                                .addContainerGap(83, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCredentials_ManagerForgetPassLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(lbl8_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        );
                        pnlCredentials_ManagerForgetPassLayout.setVerticalGroup(
                                pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlCredentials_ManagerForgetPassLayout.createSequentialGroup()
                                                .addContainerGap(88, Short.MAX_VALUE)
                                                .addComponent(lbl4_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl6_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl5_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlCredentials_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbl7_ManagerForgetPass, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                                        .addComponent(txt2_ManagerForgetPass))
                                                .addGap(32, 32, 32)
                                                .addComponent(btn1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addComponent(lbl8_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                        );
                    }

                    {
                        pnlReset_ManagerForgetPass.setBackground(new java.awt.Color(6, 70, 99));
                        pnlReset_ManagerForgetPass.setVisible(false);

                        lbl9_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl9_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl9_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl9_ManagerForgetPass.setText("New Password");

                        lbl10_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl10_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl10_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl10_ManagerForgetPass.setText("Confirm Password");

                        lbl11_ManagerForgetPass.setBackground(new java.awt.Color(6, 70, 99));
                        lbl11_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        lbl11_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        lbl11_ManagerForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        lbl11_ManagerForgetPass.setText("Back");
                        lbl11_ManagerForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lbl11_ManagerForgetPassMouseClicked(evt);
                            }
                        });

                        pwd1_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        pwd1_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd1_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        pwd1_ManagerForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd1_ManagerForgetPass.setBorder(null);

                        pwd2_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        pwd2_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
                        pwd2_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        pwd2_ManagerForgetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                        pwd2_ManagerForgetPass.setBorder(null);
                        pwd2_ManagerForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pwd2_ManagerForgetPassActionPerformed(evt);
                            }
                        });

                        btn2_ManagerForgetPass.setBackground(new java.awt.Color(115, 133, 152));
                        btn2_ManagerForgetPass.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
                        btn2_ManagerForgetPass.setForeground(new java.awt.Color(255, 255, 255));
                        btn2_ManagerForgetPass.setText("OK");
                        btn2_ManagerForgetPass.setBorder(null);
                        btn2_ManagerForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn2_ManagerForgetPassMouseClicked(evt);
                            }
                        });
                        btn2_ManagerForgetPass.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn2_ManagerForgetPassActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout pnlReset_ManagerForgetPassLayout = new javax.swing.GroupLayout(pnlReset_ManagerForgetPass);
                        pnlReset_ManagerForgetPass.setLayout(pnlReset_ManagerForgetPassLayout);
                        pnlReset_ManagerForgetPassLayout.setHorizontalGroup(
                                pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                .addGroup(pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                                .addGroup(pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(pwd2_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btn2_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                                                                        .addContainerGap()
                                                                                                        .addComponent(lbl9_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                                                                        .addGap(101, 101, 101)
                                                                                                        .addComponent(lbl10_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                                                        .addGap(101, 101, 101)
                                                                                        .addComponent(pwd1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 77, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lbl11_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap())
                        );
                        pnlReset_ManagerForgetPassLayout.setVerticalGroup(
                                pnlReset_ManagerForgetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlReset_ManagerForgetPassLayout.createSequentialGroup()
                                                .addContainerGap(70, Short.MAX_VALUE)
                                                .addComponent(lbl9_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pwd2_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lbl10_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pwd1_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(btn2_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(98, 98, 98)
                                                .addComponent(lbl11_ManagerForgetPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                        );
                    }

                    pnl2_ManagerForgetPass.add(pnlCredentials_ManagerForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                    pnl2_ManagerForgetPass.add(pnlReset_ManagerForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 450, 440));
                }

                ManagerForgetPass.add(pnl1_ManagerForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 160));
                ManagerForgetPass.add(pnl2_ManagerForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 800, 460));

            }

            mainPane.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(RegisterManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(SignInManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(SignInEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(EmployeeDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(ManagerDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(EmployeeForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));
            mainPane.add(ManagerForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));


            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainPane, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
            );

            pack();
        }

        private void lbl1_SidebarHMouseClicked(java.awt.event.MouseEvent evt) {
            int current_width=pnlSidebarH.getWidth();
            if(current_width<120) {
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width + i <= 240; i++) {
                                Thread.sleep(1);
                                pnlSidebarH.setSize(current_width + i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                lbl2_SidebarH.setVisible(true);
                lbl3_SidebarH.setVisible(true);
//            jLabel17.setVisible(true);

            }
            else{
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width - i >= 60; i++) {
                                Thread.sleep(1);
                                pnlSidebarH.setSize(current_width - i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                lbl2_SidebarH.setVisible(false);
                lbl3_SidebarH.setVisible(false);
//            jLabel17.setVisible(false);

            }
        }

        private void lbl1_SidebarHMouseEntered(java.awt.event.MouseEvent evt) {
            //        if(x==60){
            //           jPanel1.setSize(60,600);
            //           Thread th = new Thread(){
            //               @Override
            //               public void run(){
            //                   try{
            //                       for(int i=60; i<=240 ;i++){
            //                           Thread.sleep(1);
            //                           jPanel1.setSize(i,600);
            //                       }
            //                   } catch(Exception e){
            //                       JOptionPane.showMessageDialog(null,e);
            //                   }
            //               }
            //           };th.start();
            //           x=240;
            //       }
        }

        private void lbl1_SidebarHMouseExited(java.awt.event.MouseEvent evt) {
            //      if(x==240){
            //           jPanel1.setSize(60,600);
            //           Thread th = new Thread(){
            //               @Override
            //               public void run(){
            //                   try{
            //                       for(int i=240; i>=60 ;i--){
            //                           Thread.sleep(1);
            //                           jPanel1.setSize(i,600);
            //                       }
            //                   } catch(Exception e){
            //                       JOptionPane.showMessageDialog(null,e);
            //                   }
            //               }
            //           };th.start();
            //           x=60;
            //       }
        }

        private void lbl2_SidebarHMouseEntered(java.awt.event.MouseEvent evt) {
            lbl2_SidebarH.setBackground(Color.decode("#064663"));
        }

        private void lbl2_SidebarHMouseExited(java.awt.event.MouseEvent evt) {
            lbl2_SidebarH.setBackground(Color.decode("#041C32"));
        }

        private void lbl2_SidebarHPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl3_SidebarHMouseEntered(java.awt.event.MouseEvent evt) {
            lbl3_SidebarH.setBackground(Color.decode("#064663"));
        }

        private void lbl3_SidebarHMouseExited(java.awt.event.MouseEvent evt) {
            lbl3_SidebarH.setBackground(Color.decode("#041C32"));
        }

        private void lbl3_SidebarHPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void pnlSidebarHMouseClicked(java.awt.event.MouseEvent evt) {}

        private void pnlSidebarHMouseEntered(java.awt.event.MouseEvent evt) {}

        private void pnlSidebarHMouseExited(java.awt.event.MouseEvent evt) {}

        private void txt1_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt3_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt2_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt4_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void lbl2_SidebarHMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(true);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void lbl3_SidebarHMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(true);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void txt_SignInManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void pwd_SignInManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void lbl8_SignInManagerMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(true);
        }

        private void lbl8_SignInManagerMouseEntered(java.awt.event.MouseEvent evt) {
            lbl8_SignInManager.setBackground(Color.decode("#738598"));
        }

        private void lbl8_SignInManagerMouseExited(java.awt.event.MouseEvent evt) {
            lbl8_SignInManager.setBackground(Color.decode("#064663"));
        }

        private void lbl9_SignInManagerMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(true);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void lbl9_SignInManagerMouseEntered(java.awt.event.MouseEvent evt) {
            lbl9_SignInManager.setBackground(Color.decode("#738598"));
        }

        private void lbl9_SignInManagerMouseExited(java.awt.event.MouseEvent evt) {
            lbl9_SignInManager.setBackground(Color.decode("#064663"));
        }

        private void lbl8_SignInEmployeeMouseExited(java.awt.event.MouseEvent evt) {
            lbl8_SignInEmployee.setBackground(Color.decode("#064663"));
        }

        private void lbl8_SignInEmployeeMouseEntered(java.awt.event.MouseEvent evt) {
            lbl8_SignInEmployee.setBackground(Color.decode("#738598"));
        }

        private void lbl8_SignInEmployeeMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(true);
            ManagerForgetPass.setVisible(false);

        }

        private void pwd_SignInEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt_SignInEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void lbl9_RegisterManagerMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(true);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void lbl10_SignInManagerMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(true);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void lbl9_SignInEmployeeMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(true);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void HomeComponentHidden(java.awt.event.ComponentEvent evt) {}

        private void lblMenuEDMouseClicked(java.awt.event.MouseEvent evt) {
            int current_width=pnlSidebarED.getWidth();
            if(current_width<120) {
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width + i <= 240; i++) {
                                Thread.sleep(1);
                                pnlSidebarED.setSize(current_width + i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                lblAddCustED.setVisible(true);
                lblTrackConsignED.setVisible(true);
                lblAddConsignED.setVisible(true);
                lblHomeED.setVisible(true);
                lblHelpED.setVisible(true);
                lblSignOutED.setVisible(true);
            }
            else{
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width - i >= 60; i++) {
                                Thread.sleep(1);
                                pnlSidebarED.setSize(current_width - i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                lblAddCustED.setVisible(false);
                lblTrackConsignED.setVisible(false);
                lblAddConsignED.setVisible(false);
                lblHomeED.setVisible(false);
                lblHelpED.setVisible(false);
                lblSignOutED.setVisible(false);
            }
        }

        private void lblMenuEDMouseEntered(java.awt.event.MouseEvent evt) {}

        private void lblMenuEDMouseExited(java.awt.event.MouseEvent evt) {}

        private void lblAddCustEDMouseClicked(java.awt.event.MouseEvent evt) {
            pnlHomeED.setVisible(false);
            pnlAddCustomer.setVisible(true);
            pnlAddConsignment.setVisible(false);
            pnlTrackConsignment.setVisible(false);
            pnlConsignmentDetails.setVisible(false);
            lblMenuEDMouseClicked(evt);
        }

        private void lblAddCustEDMouseEntered(java.awt.event.MouseEvent evt) {
            lblAddCustED.setBackground(Color.decode("#064663"));
        }

        private void lblAddCustEDMouseExited(java.awt.event.MouseEvent evt) {
            lblAddCustED.setBackground(Color.decode("#041C32"));
        }

        private void lblAddCustEDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lblTrackConsignEDMouseClicked(java.awt.event.MouseEvent evt) {
            pnlHomeED.setVisible(false);
            pnlAddCustomer.setVisible(false);
            pnlAddConsignment.setVisible(false);
            pnlTrackConsignment.setVisible(true);
            pnlConsignmentDetails.setVisible(false);
            lblMenuEDMouseClicked(evt);
        }

        private void lblTrackConsignEDMouseEntered(java.awt.event.MouseEvent evt) {
            lblTrackConsignED.setBackground(Color.decode("#064663"));
        }

        private void lblTrackConsignEDMouseExited(java.awt.event.MouseEvent evt) {
            lblTrackConsignED.setBackground(Color.decode("#041C32"));
        }

        private void lblTrackConsignEDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lblAddConsignMouseClicked(java.awt.event.MouseEvent evt) {
            pnlHomeED.setVisible(false);
            pnlAddCustomer.setVisible(false);
            pnlAddConsignment.setVisible(true);
            pnlTrackConsignment.setVisible(false);
            pnlConsignmentDetails.setVisible(false);
            lblMenuEDMouseClicked(evt);
        }

        private void lblAddConsignMouseEntered(java.awt.event.MouseEvent evt) {
            lblAddConsignED.setBackground(Color.decode("#064663"));
        }

        private void lblAddConsignMouseExited(java.awt.event.MouseEvent evt) {
            lblAddConsignED.setBackground(Color.decode("#041C32"));
        }

        private void lblAddConsignPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lblHomeEDMouseClicked(java.awt.event.MouseEvent evt) {
            pnlHomeED.setVisible(true);
            pnlAddCustomer.setVisible(false);
            pnlAddConsignment.setVisible(false);
            pnlTrackConsignment.setVisible(false);
            pnlConsignmentDetails.setVisible(false);
            lblMenuEDMouseClicked(evt);
        }

        private void lblHomeEDMouseEntered(java.awt.event.MouseEvent evt) {
            lblHomeED.setBackground(Color.decode("#064663"));
        }

        private void lblHomeEDMouseExited(java.awt.event.MouseEvent evt) {
            lblHomeED.setBackground(Color.decode("#041C32"));
        }

        private void lblHomeEDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lblHelpEDMouseEntered(java.awt.event.MouseEvent evt) {
            lblHelpED.setBackground(Color.decode("#064663"));
        }

        private void lblHelpEDMouseExited(java.awt.event.MouseEvent evt) {
            lblHelpED.setBackground(Color.decode("#041C32"));
        }

        private void lblHelpEDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void pnlSidebarEDMouseClicked(java.awt.event.MouseEvent evt) {}

        private void pnlSidebarEDMouseEntered(java.awt.event.MouseEvent evt) {}

        private void pnlSidebarEDMouseExited(java.awt.event.MouseEvent evt) {}

        private void txt2_EnterCustActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt4_EnterCustActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt1_EnterCustActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt3_EnterCustActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt2_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt4_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt1_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt3_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {
            String senderid=txt1_EnterConsign.getText();
            String recieverid=txt2_EnterConsign.getText();
            String volumeid=txt3_EnterConsign.getText();
            int volume=Integer.parseInt(volumeid);
            String sourcezipcode=txt4_EnterConsign.getText();
            String destinationzipcode=txt5_EnterConsign.getText();
            try {
                if (Objects.equals(senderid, "") || Objects.equals(recieverid, "") || Objects.equals(volumeid, "") || Objects.equals(sourcezipcode, "") || Objects.equals(destinationzipcode, "")) {
                    JOptionPane.showMessageDialog(pnlEnterConsign, "Please fill all areas");
                }
                else if (!database.checkcustomer(senderid) || !database.checkcustomer(recieverid)){
                    JOptionPane.showMessageDialog(pnlEnterConsign, "Unregistered Customer");
                }
                else if (!database.checkoffice(sourcezipcode) || !database.checkoffice(destinationzipcode)){
                    JOptionPane.showMessageDialog(pnlEnterConsign, "No such Office exists in given ZIP code");
                }
                else {
                    int ID=database.addconsignment(senderid, recieverid, volume, sourcezipcode, destinationzipcode);
                    JOptionPane.showMessageDialog(pnlEnterConsign,"Registered with ID:  "+ String.valueOf(ID));
                    database.dispatchTruck(sourcezipcode, destinationzipcode);
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnlEnterConsign, "SQL exception");
            }

        }

        private void txt5_EnterConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt_TrackIDActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_TrackIDctionPerformed(java.awt.event.ActionEvent evt) {
            String conID = txt_TrackID.getText();
            String details[]={"","","","","","","",""};
            try {
                if (database.checkcon(conID)) {
                    pnlTrackConsignment.setVisible(false);
                    pnlConsignmentDetails.setVisible(true);
                    details = database.getdetails(conID);
                } else {
                    JOptionPane.showMessageDialog(pnlTrackID, "No Such ID exists");
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInEmployee, "SQL exception");
            }
            lbl3_ConsignmentBookingDetails.setText(details[0]);
            lbl5_ConsignmentBookingDetails.setText(details[1]);
            lbl7_ConsignmentBookingDetails.setText(details[2]);
            lbl9_ConsignmentBookingDetails.setText(details[3]);
            lbl11_ConsignmentBookingDetails.setText(details[4]);
            lbl3_ConsignmentDeliveryDetails.setText(details[5]);
            lbl5_ConsignmentDeliveryDetails.setText(details[6]);
            lbl7_ConsignmentDeliveryDetails.setText(details[7]);
        }

        private void btn_SignInEmployeeMouseClicked(java.awt.event.MouseEvent evt) {
            String username = txt_SignInEmployee.getText();
            String pass = String.valueOf(pwd_SignInEmployee.getPassword());
            try {
                if (username.equals("") || pass.equals("")) {
                    JOptionPane.showMessageDialog(pnl3_SignInEmployee, "Please Enter UserID or Password");
                } else if (database.employee_signin(username, pass)) {
                    Home.setVisible(false);
                    SignInEmployee.setVisible(false);
                    SignInManager.setVisible(false);
                    RegisterManager.setVisible(false);
                    EmployeeDashboard.setVisible(true);
                    ManagerDashboard.setVisible(false);
                    EmployeeForgetPass.setVisible(false);
                    ManagerForgetPass.setVisible(false);
                    lbl1_TopbarED.setText("Welcome Back "+ username);
                } else {
                    JOptionPane.showMessageDialog(pnl3_SignInEmployee, "Invalid UserID or Password");
                }
            }
            catch (SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInEmployee, "SQL exception");
            }
        }

        private void pnlManagerContentHMouseClicked(java.awt.event.MouseEvent evt) {}

        private void lbl2_EmployeeContentHMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(true);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void pnlEmployeeContentHMouseClicked(java.awt.event.MouseEvent evt) {}

        private void lbl2_ManagerContentHMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(false);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(true);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void lbl_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            int current_width=pnlSideBarMD.getWidth();
            if(current_width<120) {
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width + i <= 240; i++) {
                                Thread.sleep(1);
                                pnlSideBarMD.setSize(current_width + i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();

                lbl1_SideBarMD.setVisible(true);
                lbl2_SideBarMD.setVisible(true);
                lbl3_SideBarMD.setVisible(true);
                lbl4_SideBarMD.setVisible(true);
                lbl11_SideBarMD.setVisible(true);
                lbl6_SideBarMD.setVisible(true);
                lbl7_SideBarMD.setVisible(true);
                lbl8_SideBarMD.setVisible(true);
                lbl5_SideBarMD.setVisible(true);
                lbl9_SideBarMD.setVisible(true);
                lbl10_SideBarMD.setVisible(true);

            }
            else{
                Thread th = new Thread() {
                    @Override
                    public void run() {
                        try {
                            for (int i = 1; current_width - i >= 60; i++) {
                                Thread.sleep(1);
                                pnlSideBarMD.setSize(current_width - i, 600);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                };
                th.start();
                lbl1_SideBarMD.setVisible(false);
                lbl2_SideBarMD.setVisible(false);
                lbl3_SideBarMD.setVisible(false);
                lbl4_SideBarMD.setVisible(false);
                lbl11_SideBarMD.setVisible(false);
                lbl6_SideBarMD.setVisible(false);
                lbl7_SideBarMD.setVisible(false);
                lbl8_SideBarMD.setVisible(false);
                lbl5_SideBarMD.setVisible(false);
                lbl9_SideBarMD.setVisible(false);
                lbl10_SideBarMD.setVisible(false);

            }
        }

        private void lbl_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            //        if(x==60){
            //           jPanel1.setSize(60,600);
            //           Thread th = new Thread(){
            //               @Override
            //               public void run(){
            //                   try{
            //                       for(int i=60; i<=240 ;i++){
            //                           Thread.sleep(1);
            //                           jPanel1.setSize(i,600);
            //                       }
            //                   } catch(Exception e){
            //                       JOptionPane.showMessageDialog(null,e);
            //                   }
            //               }
            //           };th.start();
            //           x=240;
            //       }
        }

        private void lbl_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            //      if(x==240){
            //           jPanel1.setSize(60,600);
            //           Thread th = new Thread(){
            //               @Override
            //               public void run(){
            //                   try{
            //                       for(int i=240; i>=60 ;i--){
            //                           Thread.sleep(1);
            //                           jPanel1.setSize(i,600);
            //                       }
            //                   } catch(Exception e){
            //                       JOptionPane.showMessageDialog(null,e);
            //                   }
            //               }
            //           };th.start();
            //           x=60;
            //       }
        }

        private void lbl1_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl1_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl1_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl1_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl1_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl1_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl2_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_idleTime.setModel(new javax.swing.DefaultComboBoxModel<>(database.getTrucks()));
                lbl3_idleTime.setVisible(false);
            } catch (SQLException e) {

            }

            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(true);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl2_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl2_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl2_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl2_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl2_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl3_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_QueryConsign.setModel(new javax.swing.DefaultComboBoxModel<>(database.getConsignment()));
            }
            catch (SQLException e) {}
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(true);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl3_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl3_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl3_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl3_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl3_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl4_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_officeDetails.setModel(new javax.swing.DefaultComboBoxModel<>(database.getbranches()));
            }
            catch (SQLException e) {}

            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(true);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl4_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl4_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl4_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl4_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl4_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl11_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl11_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl11_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl11_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl11_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl6_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_truckStatus.setModel(new javax.swing.DefaultComboBoxModel<>(database.getTrucks()));
            } catch (SQLException e) {

            }
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(true);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl6_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl6_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl6_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl6_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl6_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl7_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_addTruck.setModel(new javax.swing.DefaultComboBoxModel<>(database.getbranches()));
                lbl3_addTruck.setVisible(false);
            }
            catch (SQLException e) {}

            homeMD.setVisible(true);
            addTruck.setVisible(true);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl7_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl7_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl7_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl7_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl7_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl5_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_changeRate.setModel(new javax.swing.DefaultComboBoxModel<>(database.getbranches()));
            }
            catch (SQLException e) {}
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(true);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl5_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl5_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl5_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl5_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl5_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl8_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(true);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl8_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl8_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl8_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl8_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl8_SideBarMDPropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lbl9_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            try {
                cbox_ConsignWaitTime.setModel(new javax.swing.DefaultComboBoxModel<>(database.getbranches()));
                lbl3_ConsignWaitTime.setVisible(false);
            }
            catch (SQLException e) {}

            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(true);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl9_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl9_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl9_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl9_SideBarMD.setBackground(Color.decode("#041C32"));
        }

        private void lbl10_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            homeMD.setVisible(true);
            addTruck.setVisible(false);
            QueryConsign.setVisible(false);
            officeDetails.setVisible(false);
            idleTime.setVisible(false);
            truckStatus.setVisible(false);
            changeRate.setVisible(false);
            addEmployee.setVisible(false);
            ConsignWaitTime.setVisible(false);
            lbl_SideBarMDMouseClicked(evt);
        }

        private void lbl10_SideBarMDMouseEntered(java.awt.event.MouseEvent evt) {
            lbl10_SideBarMD.setBackground(Color.decode("#064663"));
        }

        private void lbl10_SideBarMDMouseExited(java.awt.event.MouseEvent evt) {
            lbl10_SideBarMD.setBackground(Color.decode("#041C32"));
        }
        private void pnlSideBarMDMouseClicked(java.awt.event.MouseEvent evt) {}

        private void pnlSideBarMDMouseEntered(java.awt.event.MouseEvent evt) {}

        private void pnlSideBarMDMouseExited(java.awt.event.MouseEvent evt) {}

        private void btn_addTruckActionPerformed(java.awt.event.ActionEvent evt) {
            String office = String.valueOf(cbox_addTruck.getSelectedItem());
            try {
                int id = database.addTrucktoOffice(office);
                JOptionPane.showMessageDialog(pnl_addTruck, "Truck (ID: " + String.valueOf(id) + ") added to Office: " + office);
            }
            catch(SQLException except){
                JOptionPane.showMessageDialog(pnl_addTruck, "SQL exception");
            }
        }

        private void cbox_addTruckActionPerformed(java.awt.event.ActionEvent evt) {}

        private void cbox_QueryConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_QueryConsignMouseClicked(java.awt.event.MouseEvent evt) {
            String[] consignmentIDS = new String[0];
            try {
                consignmentIDS = database.getdetails(cbox_QueryConsign.getSelectedItem().toString());
            } catch (SQLException e) {
            }
            lbl4_QueryConsign.setText(consignmentIDS[2]);
            lbl6_QueryConsign.setText(consignmentIDS[1]);
            lbl8_QueryConsign.setText(consignmentIDS[3]);
            lbl10_QueryConsign.setText(consignmentIDS[0]);
            lbl12_QueryConsign.setText(consignmentIDS[4]);
            lbl15_QueryConsign.setText(consignmentIDS[5]);
            lbl17_QueryConsign.setText(consignmentIDS[6]);
            lbl19_QueryConsign.setText(consignmentIDS[7]);
        }

        private void btn_QueryConsignActionPerformed(java.awt.event.ActionEvent evt) {}

        private void cbox_idleTimeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_idleTimeActionPerformed(java.awt.event.ActionEvent evt) {
            float IdleTime=-1;
            try {
                IdleTime = database.get_truck_idle_Time(cbox_idleTime.getSelectedItem().toString());
                lbl3_idleTime.setText("<html><center>This trucks idle time is <br>"+ String.valueOf(IdleTime)+" days</center></html>");
                lbl3_idleTime.setVisible(true);
            }
            catch (SQLException e) {}
        }

        private void cbox_truckStatusActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_truckStatusMouseClicked(java.awt.event.MouseEvent evt) {
            String [] details= new String[5];
            try {
                details=database.get_truck_details(cbox_truckStatus.getSelectedItem().toString());
            }
            catch (SQLException e) {}

            lbl3_truckStatus.setText("<html><br>"+details[0]+"<br><br>"+details[1]+"<br><br>"+details[2]+"<br><br>"+details[3]+"<br><br>"+details[4]+"</html");

//        homeMD.setVisible(true);
//        addTruck.setVisible(false);
//        rev_det_cons.setVisible(false);
//        vol_det_cons.setVisible(false);
//        QueryConsign.setVisible(false);
//        officeDetails.setVisible(false);
//        branchdetails.setVisible(false);
//        idleTime.setVisible(false);
//        truckStatus.setVisible(false);
//        truckdetails.setVisible(false);
//        changeRate.setVisible(false);
//        trucklocationdetails.setVisible(false);
//        addEmployee.setVisible(false);
//        ConsignWaitTime.setVisible(false);
        }
        private void btn_EnterCustActionPerformed(java.awt.event.ActionEvent evt) {
            String name=txt1_EnterCust.getText();
            String street=txt2_EnterCust.getText();
            String city=txt3_EnterCust.getText();
            String state=txt4_EnterCust.getText();
            try {
                if (Objects.equals(name, "") || Objects.equals(street, "") || Objects.equals(city, "") || Objects.equals(state, "")) {
                    JOptionPane.showMessageDialog(pnlEnterCust, "Please Fill all Entries");
                } else {
                    int ID=database.addcust(name, street, city, state);
                    JOptionPane.showMessageDialog(pnlEnterCust,"registered with ID: " + String.valueOf(ID));
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnlEnterCust, "SQL exception");
            }

        }
        private void btn_truckStatusActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_addTruckMouseClicked(java.awt.event.MouseEvent evt) {
            String officeID=cbox_addTruck.getSelectedItem().toString();
            try {
                database.addTrucktoOffice(officeID);
                lbl3_addTruck.setText("New Truck added to this Office");
                lbl3_addTruck.setVisible(true);
            }
            catch (SQLException exception){}
        }

        private void btn1_changeRateActionPerformed(java.awt.event.ActionEvent evt) {
            String [] details= new String[5];
            try {
                details=database.get_office_stats(cbox_changeRate.getSelectedItem().toString());
            }
            catch (SQLException e) {}
            lbl5_changeRate.setText("The current "+details[1]);
        }

        private void txt_changeRateActionPerformed(java.awt.event.ActionEvent evt) {}

        private void cbox_changeRateActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt1_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
            String name = txt1_EnterEmployee.getText();
            String DOB = txt2_EnterEmployee.getText();
            String address = txt3_EnterEmployee.getText();
            String email = txt4_EnterEmployee.getText();
            String officeId = txt5_EnterEmployee.getText();
//
//        String pass = String.valueOf(jPasswordField6MD.getPassword());
//        String confirm_pass = String.valueOf(jPasswordField8MD.getPassword());
            String pass = txt6_EnterEmployee.getText();
            String confirm_pass = txt7_EnterEmployee.getText();
            try {
                if (Objects.equals(name, "") || Objects.equals(DOB, "") || Objects.equals(address, "") || Objects.equals(email, "") || Objects.equals(officeId, "") || Objects.equals(pass, "") || Objects.equals(confirm_pass, "")) {
                    JOptionPane.showMessageDialog(pnlEnterEmployee, "Complete All Fields");

                } else if (!Objects.equals(pass, confirm_pass)) {
                    JOptionPane.showMessageDialog(pnlEnterEmployee, "Passwords dont match");

                } else {
                    int Id = database.register_employee(name, DOB, address, email,officeId, pass);
                    JOptionPane.showMessageDialog(pnlEnterEmployee, "registered with ID: " + String.valueOf(Id));
                    homeMD.setVisible(true);
                    addTruck.setVisible(false);
                    QueryConsign.setVisible(false);
                    officeDetails.setVisible(false);
                    idleTime.setVisible(false);
                    truckStatus.setVisible(false);
                    changeRate.setVisible(false);
                    addEmployee.setVisible(false);
                    ConsignWaitTime.setVisible(false);

                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnlEnterEmployee, "SQL exception");
            }
        }

        private void txt3_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt5_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt2_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt6_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt4_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void txt7_EnterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_ConsignWaitTimeMouseClicked(java.awt.event.MouseEvent evt) {
            float waitTime = -1;
            try {
                waitTime = database.get_con_waiting_Time(cbox_ConsignWaitTime.getSelectedItem().toString());
            }
            catch (SQLException e) {}
            lbl3_ConsignWaitTime.setText("<html><center>The consignment waits for an average of<br>"+ String.valueOf(waitTime)  +" days <br> at this Office</center></html>");
        }

        private void btn_ConsignWaitTimeActionPerformed(java.awt.event.ActionEvent evt) {
            lbl3_ConsignWaitTime.setVisible(true);
        }

        private void cbox_ConsignWaitTimeActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_SignInManagerActionPerformed(java.awt.event.ActionEvent evt) {
            String username = txt_SignInManager.getText();
            String pass = String.valueOf(pwd_SignInManager.getPassword());
            try{
                if(username.equals("") || pass.equals("")){
                    JOptionPane.showMessageDialog(pnl3_SignInManager, "Please Enter UserID or Password");
                }
                else if(database.manager_signin(username,pass)){
                    Home.setVisible(false);
                    SignInEmployee.setVisible(false);
                    SignInManager.setVisible(false);
                    RegisterManager.setVisible(false);
                    EmployeeDashboard.setVisible(false);
                    ManagerDashboard.setVisible(true);
                    EmployeeForgetPass.setVisible(false);
                    ManagerForgetPass.setVisible(false);
                    lbl2_TopBarMD.setText("Welcome Back "+ username);
                }
                else{
                    JOptionPane.showMessageDialog(pnl3_SignInManager, "Invalid UserID or Password");
                }
            }
            catch (SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInManager, "SQL exception");
            }
        }

        private void cbox_officeDetailsActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_officeDetailsMouseClicked(java.awt.event.MouseEvent evt) {
            String [] details= new String[8];
            try {
                details=database.get_office_stats(cbox_officeDetails.getSelectedItem().toString());
            } catch (SQLException e) {

            }
            lbl3_officeDetails.setText("<html>"+details[0] +"<br>"+ details[1]+"<br>"+ details[2]+"<br>"+ details[3]+"<br>"+ details[4]+"<br>"+ details[5]+"<br>"+ details[6]+"<br>"+ details[7]+"</html>");
        }

        private void btn_officeDetailsActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn2_changeRateActionPerformed(java.awt.event.ActionEvent evt) {
            String newrate=txt_changeRate.getText();
            Float rate=Float.parseFloat(newrate);
            String Office=cbox_changeRate.getSelectedItem().toString();
            try {
                if (newrate == "" || Office == "") {
                    JOptionPane.showMessageDialog(pnl_changeRate, "Enter all Fields");
                } else {
                    database.changerate(rate, Office);
                    lbl5_changeRate.setText("The new rate is: "+newrate);
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnl_changeRate, "SQL exception");
            }
        }

        private void lbl11_SideBarMDMouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(true);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);

        }

        private void txt1_EmployeeForgetPassActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn1_EmployeeForgetPassMouseClicked(java.awt.event.MouseEvent evt) {}

        private void lbl8_EmployeeForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
            EmployeeForgetPass.setVisible(false);
            SignInEmployee.setVisible(true);
        }

        private void lbl8_EmployeeForgetPassMouseEntered(java.awt.event.MouseEvent evt) {
            lbl8_EmployeeForgetPass.setBackground(Color.decode("#738598"));
        }

        private void lbl8_EmployeeForgetPassMouseExited(java.awt.event.MouseEvent evt) {
            lbl8_EmployeeForgetPass.setBackground(Color.decode("#064663"));
        }

        private void btn2_EmployeeForgetPassMouseClicked(java.awt.event.MouseEvent evt) {}

        private void pwd2_EmployeeForgetPassActionPerformed(java.awt.event.ActionEvent evt) {}

        private void lbl11_EmployeeForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
            pnlCredentials_EmployeeForgetPass.setVisible(true);
            pnlReset_EmployeeForgetPass.setVisible(false);
        }

        private void btn2_EmployeeForgetPassActionPerformed(java.awt.event.ActionEvent evt) {
            // update password of employee in database
            String pass = String.valueOf(pwd2_EmployeeForgetPass.getPassword());
            String confirm_pass = String.valueOf(pwd1_EmployeeForgetPass.getPassword());
            try {
                if (pass.equals("") || confirm_pass.equals("")) {
                    JOptionPane.showMessageDialog(pnlReset_EmployeeForgetPass, "Please Fill in the Fields");
                } else if (pass.equals(confirm_pass)) {

                    database.resetemployeepassword(txt1_EmployeeForgetPass.getText(), pass);


                    SignInEmployee.setVisible(true);
                    EmployeeForgetPass.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(pnlReset_EmployeeForgetPass, "Passwords do not match");
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInManager, "SQL exception");
            }

        }

        private void btn1_EmployeeForgetPassActionPerformed(java.awt.event.ActionEvent evt) {
            String username=txt1_EmployeeForgetPass.getText();
            String date=txt2_EmployeeForgetPass.getText();
            try {
                if (username.equals("") || date.equals("")) {
                    JOptionPane.showMessageDialog(pnlCredentials_EmployeeForgetPass, "Please Enter Username or Date of Birth");
                } else if (database.check_credentials_employee(username, date)) {
                    pnlReset_EmployeeForgetPass.setVisible(true);
                    pnlCredentials_EmployeeForgetPass.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(pnlCredentials_EmployeeForgetPass, "Invalid Username or Date of Birth");
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInManager, "SQL exception");
            }
        }

        private void lblHelpED1MouseEntered(java.awt.event.MouseEvent evt) {
            lblSignOutED.setBackground(Color.decode("#064663"));
        }

        private void lblHelpED1MouseExited(java.awt.event.MouseEvent evt) {
            lblSignOutED.setBackground(Color.decode("#041C32"));
        }

        private void lblHelpED1PropertyChange(java.beans.PropertyChangeEvent evt) {}

        private void lblHelpED1MouseClicked(java.awt.event.MouseEvent evt) {
            Home.setVisible(true);
            SignInEmployee.setVisible(false);
            SignInManager.setVisible(false);
            RegisterManager.setVisible(false);
            EmployeeDashboard.setVisible(false);
            ManagerDashboard.setVisible(false);
            EmployeeForgetPass.setVisible(false);
            ManagerForgetPass.setVisible(false);
        }

        private void txt1_ManagerForgetPassActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn1_ManagerForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
//        pnlCredentials_ManagerForgetPass.setVisible(false);
//        pnlReset_ManagerForgetPass.setVisible(true);
        }

        private void btn1_ManagerForgetPassActionPerformed(java.awt.event.ActionEvent evt) {
            String username=txt1_ManagerForgetPass.getText();
            String date=txt2_ManagerForgetPass.getText();
            try {
                if (username.equals("") || date.equals("")) {
                    JOptionPane.showMessageDialog(pnlCredentials_ManagerForgetPass, "Please Enter Username or Date of Birth");
                } else if (database.check_credentials_manager(username, date)) {
                    pnlCredentials_ManagerForgetPass.setVisible(false);
                    pnlReset_ManagerForgetPass.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(pnlCredentials_ManagerForgetPass, "Invalid Username or Date of Birth");
                }
            }
            catch (SQLException exception){
                JOptionPane.showMessageDialog(pnlCredentials_ManagerForgetPass, "SQL exception");
            }
        }

        private void lbl8_ManagerForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
            ManagerForgetPass.setVisible(false);
            SignInManager.setVisible(true);
        }

        private void lbl8_ManagerForgetPassMouseEntered(java.awt.event.MouseEvent evt) {}

        private void lbl8_ManagerForgetPassMouseExited(java.awt.event.MouseEvent evt) {}

        private void btn2_ManagerForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
//            update database
//            ManagerForgetPass.setVisible(false);
//            SignInManager.setVisible(true);
        }

        private void btn2_ManagerForgetPassActionPerformed(java.awt.event.ActionEvent evt) {
            String pass = String.valueOf(pwd2_ManagerForgetPass.getPassword());
            String confirm_pass = String.valueOf(pwd1_ManagerForgetPass.getPassword());
            try {
                if (pass.equals("") || confirm_pass.equals("")) {
                    JOptionPane.showMessageDialog(pnlReset_ManagerForgetPass, "Please Fill in the Fields");
                } else if (pass.equals(confirm_pass)) {

                    database.resetmanagerpassword(txt1_ManagerForgetPass.getText(), pass);
                    ManagerForgetPass.setVisible(false);
                    SignInManager.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(pnlReset_ManagerForgetPass, "Passwords do not match");
                }
            }
            catch (SQLException exception) {
                JOptionPane.showMessageDialog(pnlReset_ManagerForgetPass, "SQL except");
            }
        }

        private void pwd2_ManagerForgetPassActionPerformed(java.awt.event.ActionEvent evt) {}

        private void lbl11_ManagerForgetPassMouseClicked(java.awt.event.MouseEvent evt) {
            pnlReset_ManagerForgetPass.setVisible(false);
            pnlCredentials_ManagerForgetPass.setVisible(true);
        }

        private void pwd1_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {}

        private void btn_RegisterManagerActionPerformed(java.awt.event.ActionEvent evt) {
            String name = txt1_RegisterManager.getText();
            String DOB = txt2_RegisterManager.getText();
            String address = txt3_RegisterManager.getText();
            String email = txt4_RegisterManager.getText();

            String pass = String.valueOf(pwd1_RegisterManager.getPassword());
            String confirm_pass = String.valueOf(pwd2_RegisterManager.getPassword());
            try {
                if (Objects.equals(name, "") || Objects.equals(DOB, "") || Objects.equals(address, "") || Objects.equals(email, "") || Objects.equals(pass, "") || Objects.equals(confirm_pass, "")) {
                    JOptionPane.showMessageDialog(pnl3_RegisterManager, "Complete All Fields");
                } else if (!Objects.equals(pass, confirm_pass)) {
                    JOptionPane.showMessageDialog(pnl3_RegisterManager, "Passwords dont match");
                }
                else {
                }
                int id  = database.register_manager(name, DOB, address, email, pass);
                if (id==0) {
                    JOptionPane.showMessageDialog(pnl3_RegisterManager, "Manager already exists");
                } else {
                    JOptionPane.showMessageDialog(pnl3_RegisterManager, "Registered with ID:" + String.valueOf(id));
                    Home.setVisible(false);
                    SignInEmployee.setVisible(false);
                    SignInManager.setVisible(true);
                    RegisterManager.setVisible(false);
                    EmployeeDashboard.setVisible(false);
                    ManagerDashboard.setVisible(false);
                    EmployeeForgetPass.setVisible(false);
                    ManagerForgetPass.setVisible(false);
                }
            }
            catch(SQLException exception){
                JOptionPane.showMessageDialog(pnl3_SignInManager, "SQL exception");
            }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TCCS.Application().setVisible(true);
                }
            });
        }

        /**
         * Variables declaration
         */

        private DAO database;
        private javax.swing.JLayeredPane mainPane;

        /**
        * These are JButton
        */
        private javax.swing.JButton btn_SignInEmployee;
        private javax.swing.JButton btn_SignInManager;
        private javax.swing.JButton btn_RegisterManager;
        private javax.swing.JButton btn_EnterCust;
        private javax.swing.JButton btn_EnterConsign;
        private javax.swing.JButton btn_TrackID;
        private javax.swing.JButton btn_officeDetails;
        private javax.swing.JButton btn_QueryConsign;
        private javax.swing.JButton btn1_changeRate;
        private javax.swing.JButton btn2_changeRate;
        private javax.swing.JButton btn_addTruck;
        private javax.swing.JButton btn_truckStatus;
        private javax.swing.JButton btn_idleTime;
        private javax.swing.JButton btn_ConsignWaitTime;
        private javax.swing.JButton btn_EnterEmployee;
        private javax.swing.JButton btn1_ManagerForgetPass;
        private javax.swing.JButton btn2_ManagerForgetPass;
        private javax.swing.JButton btn1_EmployeeForgetPass;
        private javax.swing.JButton btn2_EmployeeForgetPass;

        /**
        * These are JComboBox
        */
        private javax.swing.JComboBox<String> cbox_officeDetails;
        private javax.swing.JComboBox<String> cbox_QueryConsign;
        private javax.swing.JComboBox<String> cbox_changeRate;
        private javax.swing.JComboBox<String> cbox_addTruck;
        private javax.swing.JComboBox<String> cbox_truckStatus;
        private javax.swing.JComboBox<String> cbox_idleTime;
        private javax.swing.JComboBox<String> cbox_ConsignWaitTime;

        /**
        * These are JLabel
        */
        private javax.swing.JLabel lbl1_EmployeeContentH;
        private javax.swing.JLabel lbl2_EmployeeContentH;
        private javax.swing.JLabel lbl1_ManagerContentH;
        private javax.swing.JLabel lbl2_ManagerContentH;
        private javax.swing.JLabel lbl2_SidebarH;
        private javax.swing.JLabel lbl3_SidebarH;

        private javax.swing.JLabel lbl1_SignInEmployee;
        private javax.swing.JLabel lbl2_SignInEmployee;
        private javax.swing.JLabel lbl3_SignInEmployee;
        private javax.swing.JLabel lbl4_SignInEmployee;
        private javax.swing.JLabel lbl5_SignInEmployee;
        private javax.swing.JLabel lbl6_SignInEmployee;
        private javax.swing.JLabel lbl7_SignInEmployee;
        private javax.swing.JLabel lbl8_SignInEmployee;
        private javax.swing.JLabel lbl9_SignInEmployee;

        private javax.swing.JLabel lbl1_SideBarMD;
        private javax.swing.JLabel lbl2_SideBarMD;
        private javax.swing.JLabel lbl3_SideBarMD;
        private javax.swing.JLabel lbl4_SideBarMD;
        private javax.swing.JLabel lbl5_SideBarMD;
        private javax.swing.JLabel lbl6_SideBarMD;
        private javax.swing.JLabel lbl7_SideBarMD;
        private javax.swing.JLabel lbl8_SideBarMD;
        private javax.swing.JLabel lbl9_SideBarMD;
        private javax.swing.JLabel lbl10_SideBarMD;
        private javax.swing.JLabel lbl11_SideBarMD;

        private javax.swing.JLabel lbl3_idleTime;
        private javax.swing.JLabel lbl1_TitleH;
        private javax.swing.JLabel lbl1_addTruck;
        private javax.swing.JLabel lbl2_idleTime;
        private javax.swing.JLabel lbl1_idleTime;
        private javax.swing.JLabel lbl1_truckStatus;
        private javax.swing.JLabel lbl2_TitleH;
        private javax.swing.JLabel lbl3_changeRate;
        private javax.swing.JLabel lbl5_changeRate;
        private javax.swing.JLabel lbl2_changeRate;
        private javax.swing.JLabel lbl1_changeRate;

        private javax.swing.JLabel lbl1_RegisterManager;
        private javax.swing.JLabel lbl2_RegisterManager;
        private javax.swing.JLabel lbl3_RegisterManager;
        private javax.swing.JLabel lbl4_RegisterManager;
        private javax.swing.JLabel lbl5_RegisterManager;
        private javax.swing.JLabel lbl6_RegisterManager;
        private javax.swing.JLabel lbl7_RegisterManager;
        private javax.swing.JLabel lbl8_RegisterManager;
        private javax.swing.JLabel lbl9_RegisterManager;

        private javax.swing.JLabel lbl2_TopBarMD;
        private javax.swing.JLabel lbl2_TrackID;
        private javax.swing.JLabel lbl1_TrackID;
        private javax.swing.JLabel lbl3_TitleH;
        private javax.swing.JLabel lbl1_TopBarMD;
        private javax.swing.JLabel lbl1_SignInManager;
        private javax.swing.JLabel lbl2_SignInManager;
        private javax.swing.JLabel lbl4_changeRate;
        private javax.swing.JLabel lbl3_SignInManager;
        private javax.swing.JLabel lbl4_SignInManager;
        private javax.swing.JLabel lbl3_addTruck;
        private javax.swing.JLabel lbl5_SignInManager;
        private javax.swing.JLabel lbl1_ConsignWaitTime;
        private javax.swing.JLabel lbl7_SignInManager;
        private javax.swing.JLabel lbl2_ConsignWaitTime;
        private javax.swing.JLabel lbl6_SignInManager;
        private javax.swing.JLabel lbl3_ConsignWaitTime;
        private javax.swing.JLabel lbl8_SignInManager;
        private javax.swing.JLabel lbl3_truckStatus;
        private javax.swing.JLabel lbl9_SignInManager;
        private javax.swing.JLabel lbl2_addTruck;
        private javax.swing.JLabel lbl2_truckStatus;
        private javax.swing.JLabel lbl10_SignInManager;
        private javax.swing.JLabel lbl1_officeDetails;
        private javax.swing.JLabel lbl2_officeDetails;
        private javax.swing.JLabel lbl1_SidebarH;
        private javax.swing.JLabel lbl_SideBarMD;
        private javax.swing.JLabel lbl3_officeDetails;

        private javax.swing.JLabel lbl1_EnterCust;
        private javax.swing.JLabel lbl2_EnterCust;
        private javax.swing.JLabel lbl3_EnterCust;
        private javax.swing.JLabel lbl4_EnterCust;
        private javax.swing.JLabel lbl5_EnterCust;

        private javax.swing.JLabel lbl1_EnterConsign;
        private javax.swing.JLabel lbl2_EnterConsign;
        private javax.swing.JLabel lbl3_EnterConsign;
        private javax.swing.JLabel lbl4_EnterConsign;
        private javax.swing.JLabel lbl5_EnterConsign;
        private javax.swing.JLabel lbl6_EnterConsign;

        private javax.swing.JLabel lbl1_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl2_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl3_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl4_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl5_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl6_ConsignmentDeliveryDetails;
        private javax.swing.JLabel lbl7_ConsignmentDeliveryDetails;

        private javax.swing.JLabel lbl1_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl2_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl3_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl4_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl5_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl6_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl7_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl8_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl9_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl10_ConsignmentBookingDetails;
        private javax.swing.JLabel lbl11_ConsignmentBookingDetails;

        private javax.swing.JLabel lblHomeED;
        private javax.swing.JLabel lbl_TitleED;
        private javax.swing.JLabel lbl1_TopbarED;
        private javax.swing.JLabel lbl2_TopbarED;
        private javax.swing.JLabel lblMenuED;
        private javax.swing.JLabel lblAddCustED;
        private javax.swing.JLabel lblAddConsignED;
        private javax.swing.JLabel lblTrackConsignED;
        private javax.swing.JLabel lblHelpED;
        private javax.swing.JLabel lblSignOutED;

        private javax.swing.JLabel lbl_QueryConsign;
        private javax.swing.JLabel lbl1_QueryConsign;
        private javax.swing.JLabel lbl2_QueryConsign;
        private javax.swing.JLabel lbl3_QueryConsign;
        private javax.swing.JLabel lbl4_QueryConsign;
        private javax.swing.JLabel lbl5_QueryConsign;
        private javax.swing.JLabel lbl6_QueryConsign;
        private javax.swing.JLabel lbl7_QueryConsign;
        private javax.swing.JLabel lbl8_QueryConsign;
        private javax.swing.JLabel lbl9_QueryConsign;
        private javax.swing.JLabel lbl10_QueryConsign;
        private javax.swing.JLabel lbl11_QueryConsign;
        private javax.swing.JLabel lbl12_QueryConsign;
        private javax.swing.JLabel lbl13_QueryConsign;
        private javax.swing.JLabel lbl14_QueryConsign;
        private javax.swing.JLabel lbl15_QueryConsign;
        private javax.swing.JLabel lbl16_QueryConsign;
        private javax.swing.JLabel lbl17_QueryConsign;
        private javax.swing.JLabel lbl18_QueryConsign;
        private javax.swing.JLabel lbl19_QueryConsign;

        private javax.swing.JLabel lbl1_EnterEmployee;
        private javax.swing.JLabel lbl2_EnterEmployee;
        private javax.swing.JLabel lbl3_EnterEmployee;
        private javax.swing.JLabel lbl4_EnterEmployee;
        private javax.swing.JLabel lbl5_EnterEmployee;
        private javax.swing.JLabel lbl6_EnterEmployee;
        private javax.swing.JLabel lbl7_EnterEmployee;
        private javax.swing.JLabel lbl8_EnterEmployee;

        private javax.swing.JLabel lbl1_ManagerForgetPass;
        private javax.swing.JLabel lbl2_ManagerForgetPass;
        private javax.swing.JLabel lbl3_ManagerForgetPass;
        private javax.swing.JLabel lbl4_ManagerForgetPass;
        private javax.swing.JLabel lbl5_ManagerForgetPass;
        private javax.swing.JLabel lbl6_ManagerForgetPass;
        private javax.swing.JLabel lbl7_ManagerForgetPass;
        private javax.swing.JLabel lbl8_ManagerForgetPass;
        private javax.swing.JLabel lbl9_ManagerForgetPass;
        private javax.swing.JLabel lbl10_ManagerForgetPass;
        private javax.swing.JLabel lbl11_ManagerForgetPass;

        private javax.swing.JLabel lbl1_EmployeeForgetPass;
        private javax.swing.JLabel lbl2_EmployeeForgetPass;
        private javax.swing.JLabel lbl3_EmployeeForgetPass;
        private javax.swing.JLabel lbl4_EmployeeForgetPass;
        private javax.swing.JLabel lbl5_EmployeeForgetPass;
        private javax.swing.JLabel lbl6_EmployeeForgetPass;
        private javax.swing.JLabel lbl7_EmployeeForgetPass;
        private javax.swing.JLabel lbl8_EmployeeForgetPass;
        private javax.swing.JLabel lbl9_EmployeeForgetPass;
        private javax.swing.JLabel lbl10_EmployeeForgetPass;
        private javax.swing.JLabel lbl11_EmployeeForgetPass;



    /**
        * These are JPanel
        */
        private javax.swing.JPanel Home;
        private javax.swing.JPanel pnlSidebarH;
        private javax.swing.JPanel pnlTitleH;
        private javax.swing.JPanel pnlTopbarH;
        private javax.swing.JPanel pnlContentH;
        private javax.swing.JPanel pnlManagerContentH;
        private javax.swing.JPanel pnlEmployeeContentH;

        private javax.swing.JPanel RegisterManager;
        private javax.swing.JPanel pnl1_RegisterManager;
        private javax.swing.JPanel pnl2_RegisterManager;
        private javax.swing.JPanel pnl3_RegisterManager;
        private javax.swing.JPanel SignInManager;
        private javax.swing.JPanel pnl1_SignInManager;
        private javax.swing.JPanel pnl2_SignInManager;
        private javax.swing.JPanel pnl3_SignInManager;
        private javax.swing.JPanel SignInEmployee;
        private javax.swing.JPanel pnl1_SignInEmployee;
        private javax.swing.JPanel pnl2_SignInEmployee;
        private javax.swing.JPanel pnl3_SignInEmployee;

        private javax.swing.JPanel jPanel19;

        private javax.swing.JPanel EmployeeDashboard;
        private javax.swing.JPanel pnlHomeED;
        private javax.swing.JPanel pnlTitleED;
        private javax.swing.JPanel pnlTopbarED;
        private javax.swing.JPanel pnlSidebarED;
        private javax.swing.JPanel pnlAddCustomer;
        private javax.swing.JPanel pnlEnterCust;
        private javax.swing.JPanel pnlAddConsignment;
        private javax.swing.JPanel pnlEnterConsign;
        private javax.swing.JPanel pnlTrackConsignment;
        private javax.swing.JPanel pnlConsignmentDetails;
        private javax.swing.JPanel pnlConsignmentBookingDetails;
        private javax.swing.JPanel pnlConsignmentDeliveryDetails;

        private javax.swing.JPanel ManagerDashboard;
        private javax.swing.JPanel homeMD;
        private javax.swing.JPanel pnlTopBarMD;
        private javax.swing.JPanel pnlSideBarMD;
        private javax.swing.JPanel officeDetails;
        private javax.swing.JPanel pnl_officeDetails;
        private javax.swing.JPanel changeRate;
        private javax.swing.JPanel pnl_changeRate;
        private javax.swing.JPanel QueryConsign;
        private javax.swing.JPanel pnl_QueryConsign;
        private javax.swing.JPanel addEmployee;
        private javax.swing.JPanel pnl_addEmployee;
        private javax.swing.JPanel pnlEnterEmployee;
        private javax.swing.JPanel ConsignWaitTime;
        private javax.swing.JPanel pnl_ConsignWaitTime;
        private javax.swing.JPanel pnlTrackID;
        private javax.swing.JPanel addTruck;
        private javax.swing.JPanel pnl_addTruck;
        private javax.swing.JPanel truckStatus;
        private javax.swing.JPanel pnl_truckStatus;
        private javax.swing.JPanel idleTime;
        private javax.swing.JPanel pnl_idleTime;

        private javax.swing.JPanel ManagerForgetPass;
        private javax.swing.JPanel pnl1_ManagerForgetPass;
        private javax.swing.JPanel pnl2_ManagerForgetPass;
        private javax.swing.JPanel pnlCredentials_ManagerForgetPass;
        private javax.swing.JPanel pnlReset_ManagerForgetPass;

        private javax.swing.JPanel EmployeeForgetPass;
        private javax.swing.JPanel pnl1_EmployeeForgetPass;
        private javax.swing.JPanel pnl2_EmployeeForgetPass;
        private javax.swing.JPanel pnlCredentials_EmployeeForgetPass;
        private javax.swing.JPanel pnlReset_EmployeeForgetPass;

        /**
        * These are JPasswordField
        */
        private javax.swing.JPasswordField pwd1_RegisterManager;
        private javax.swing.JPasswordField pwd2_RegisterManager;
        private javax.swing.JPasswordField pwd_SignInManager;
        private javax.swing.JPasswordField pwd_SignInEmployee;
        private javax.swing.JPasswordField pwd1_EmployeeForgetPass;
        private javax.swing.JPasswordField pwd2_EmployeeForgetPass;
        private javax.swing.JPasswordField pwd1_ManagerForgetPass;
        private javax.swing.JPasswordField pwd2_ManagerForgetPass;

        /**
        * These are JTextField
        */
        private javax.swing.JTextField txt1_RegisterManager;
        private javax.swing.JTextField txt2_RegisterManager;
        private javax.swing.JTextField txt3_RegisterManager;
        private javax.swing.JTextField txt4_RegisterManager;
        private javax.swing.JTextField txt_SignInManager;
        private javax.swing.JTextField txt_SignInEmployee;
        private javax.swing.JTextField txt1_EnterCust;
        private javax.swing.JTextField txt2_EnterCust;
        private javax.swing.JTextField txt3_EnterCust;
        private javax.swing.JTextField txt4_EnterCust;
        private javax.swing.JTextField txt1_EnterConsign;
        private javax.swing.JTextField txt2_EnterConsign;
        private javax.swing.JTextField txt3_EnterConsign;
        private javax.swing.JTextField txt4_EnterConsign;
        private javax.swing.JTextField txt5_EnterConsign;
        private javax.swing.JTextField txt1_EnterEmployee;
        private javax.swing.JTextField txt2_EnterEmployee;
        private javax.swing.JTextField txt3_EnterEmployee;
        private javax.swing.JTextField txt4_EnterEmployee;
        private javax.swing.JTextField txt5_EnterEmployee;
        private javax.swing.JTextField txt6_EnterEmployee;
        private javax.swing.JTextField txt7_EnterEmployee;
        private javax.swing.JTextField txt_changeRate;
        private javax.swing.JTextField txt_TrackID;
        private javax.swing.JTextField txt1_ManagerForgetPass;
        private javax.swing.JTextField txt2_ManagerForgetPass;
        private javax.swing.JTextField txt1_EmployeeForgetPass;
        private javax.swing.JTextField txt2_EmployeeForgetPass;


    private javax.swing.JPanel addOffice;
    private javax.swing.JButton btn_addOffice;

    private javax.swing.JTextField txt1_addOffice;
    private javax.swing.JTextField txt2_addOffice;
    private javax.swing.JTextField txt3_addOffice;
    private javax.swing.JTextField txt4_addOffice;
    private javax.swing.JTextField txt5_addOffice;
    private javax.swing.JTextField txt6_addOffice;

    private javax.swing.JPanel pnl1_addOffice;
    private javax.swing.JPanel pnl2_addOffice;

    private javax.swing.JLabel lbl1_addOffice;
    private javax.swing.JLabel lbl2_addOffice;
    private javax.swing.JLabel lbl3_addOffice;
    private javax.swing.JLabel lbl4_addOffice;
    private javax.swing.JLabel lbl5_addOffice;
    private javax.swing.JLabel lbl6_addOffice;
    private javax.swing.JLabel lbl7_addOffice;

    }

