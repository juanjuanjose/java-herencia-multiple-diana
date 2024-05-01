interface Actividad {
    void realizar();
}

class Triatleta {
    private Actividad ciclismo;
    private Actividad natacion;
    private Actividad carrera;

    public Triatleta(Actividad ciclismo, Actividad natacion, Actividad carrera) {
        this.ciclismo = ciclismo;
        this.natacion = natacion;
        this.carrera = carrera;
    }

    public void montarBicicleta() {
        ciclismo.realizar();
    }

    public void nadar() {
        natacion.realizar();
    }

    public void correr() {
        carrera.realizar();
    }
}

class Ciclismo implements Actividad {
    @Override
    public void realizar() {
        System.out.println("El triatleta está montando bicicleta");
    }
}

class Natacion implements Actividad {
    @Override
    public void realizar() {
        System.out.println("El triatleta está nadando");
    }
}

class Carrera implements Actividad {
    @Override
    public void realizar() {
        System.out.println("El triatleta está corriendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Ciclismo ciclismo = new Ciclismo();
        Natacion natacion = new Natacion();
        Carrera carrera = new Carrera();

        Triatleta triatleta = new Triatleta(ciclismo, natacion, carrera);

        triatleta.correr();
        triatleta.montarBicicleta();
        triatleta.nadar();
    }
}
