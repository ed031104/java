import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1 = JOptionPane.showInputDialog("ingrese el primer dato");
        int nu = Integer.parseInt(num1);

        String num2 = JOptionPane.showInputDialog("ingrese el primer dato");
        int nu1 = Integer.parseInt(num2);

        int res = nu + nu1; 

       JOptionPane.showMessageDialog(null, "el resultadp es:" +res);        




    }
}
