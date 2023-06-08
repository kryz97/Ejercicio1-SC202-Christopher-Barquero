package test1;
import javax.swing.JOptionPane;

public class Test1 {

    
    public static void main(String[] args) {
        //Variables
        String data = JOptionPane.showInputDialog("Ingrese la cantidad de empleados");
        int employees = Integer.parseInt(data);
        double total=0;
        double salary=0;
        double sum=0;
        double sem = 0.0925;
        double ivm = 0.0508;
        
        //for para calcular la cantidad a pagar
        for(int i=0; i<employees; i++){
            salary = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
            sum = (salary*sem)+(salary*ivm);
            total=sum+total;
        }
        JOptionPane.showConfirmDialog(null, "El total de pagar a la caja es de "+total);
        
        
    }
    
}
