public class Main {
    public static void main(String[] args) {
        String nombreAlumno = "David";
        double[] calificacionesAlumno = {100, 85, 90, 100, 93};

        CalificacionesAlumno alumno = new CalificacionesAlumno(nombreAlumno, calificacionesAlumno);
        alumno.imprimirResultados();
    }
}
