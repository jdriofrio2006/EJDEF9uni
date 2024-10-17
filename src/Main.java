import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad();

        uni.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre de la Universidad"));
        uni.setCiudad(JOptionPane.showInputDialog(null,"Ingrese la ciudad donde esta ubicada la U"));
        uni.setUbicacion(JOptionPane.showInputDialog(null, "Ingrese el sector donde esta ubicada la U"));

        Estudiante est = new Estudiante();

        est.setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante"));
        est.setId(JOptionPane.showInputDialog(null,"Ingrese el ID del estudiante"));
        est.setCarrera(JOptionPane.showInputDialog(null,"Ingrese la carrera del estudiante"));
        est.setModalidad(JOptionPane.showInputDialog(null,"Ingrese la modalidad (flex/presencial)"));

        Curso c = new Curso();

        c.setHorario(JOptionPane.showInputDialog(null,"Ingrese si el horario es diurno o nocturno"));
        c.setNrc(JOptionPane.showInputDialog(null,"Ingrese el NRC del curso"));
        c.setParalelo(JOptionPane.showInputDialog(null,"Ingrese el paralelo"));

        //System.out.println(uni.detalleUni());
        //System.out.println(est.detalleEst());
        //System.out.println(c.detalleCur());
        JOptionPane.showMessageDialog(null,uni.detalleUni()+"\n"+est.detalleEst()+"\n"+c.detalleCur());
    }
}