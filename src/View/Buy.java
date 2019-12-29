package View;
import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

         public class Buy extends JFrame {
     public Buy() {
                 initComponents();
             }


            private void initComponents() {

                 dialogPane = new JPanel();
                 contentPanel = new JPanel();
                 buttonBar = new JPanel();
                 okButton = new JButton();
                 cancelButton = new JButton();
                 Container contentPane = getContentPane();
                 contentPane.setLayout(new BorderLayout());

                 {
                         dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
                         dialogPane.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
                                 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
                                 . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
                                 red ) ,dialogPane. getBorder () ) ); dialogPane. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
             beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
                         dialogPane.setLayout(new BorderLayout());


                    {


                                 GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                                 contentPanel.setLayout(contentPanelLayout);
                                 contentPanelLayout.setHorizontalGroup(
                                             contentPanelLayout.createParallelGroup()
                                                 .addGap(0, 400, Short.MAX_VALUE)
                                         );
                                 contentPanelLayout.setVerticalGroup(
                                             contentPanelLayout.createParallelGroup()
                                                 .addGap(0, 300, Short.MAX_VALUE)
                                         );
                             }
                       dialogPane.add(contentPanel, BorderLayout.CENTER);



                         {
                                 buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                                 buttonBar.setLayout(new GridBagLayout());
                                 ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                                 ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                                 okButton.setText("OK");
                                 buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                             new Insets(0, 0, 0, 5), 0, 0));


                                 //---- cancelButton ----
                                 cancelButton.setText("Cancel");
                                 buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                                             GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                             new Insets(0, 0, 0, 0), 0, 0));
                             }
                         dialogPane.add(buttonBar, BorderLayout.SOUTH);
                     }
                 contentPane.add(dialogPane, BorderLayout.CENTER);
                 pack();
                 setLocationRelativeTo(getOwner());
                 // JFormDesigner - End of component initialization  //GEN-END:initComponents
             }
             private JPanel dialogPane;
     private JPanel contentPanel;
     private JPanel buttonBar;
     private JButton okButton;
     private JButton cancelButton;

        }

