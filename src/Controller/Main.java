package Controller;


         import Model.Service.Carservice;
         import Model.Service.Carservice;


         import javax.swing.*;


         public class Main {

    private static Main ourInstance = new Controller();




    public static Main getInstance() {
         return ourInstance;

    }




    private Main() {
    }




    public void delete(int number) {
         try {
             Carservice.getInstance().sell( number );

        } catch (Exception e) {
             JOptionPane.showMessageDialog( null, e.getMessage(), "WARNING", JOptionPane.WARNING_MESSAGE );

        }

    }
}
