class Main{
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "Ingenieria en Sistemas", 3);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(3);

        estudiante1.mostrarInfo();
        estudiante1.bajarCalificacion(5);

        estudiante1.mostrarInfo();
    }
}


