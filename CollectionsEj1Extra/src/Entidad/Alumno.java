/*
Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
Necesidades:
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros ,
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
apellido de forma ascendente.
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su
nombre de forma descendente.
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas,
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 Realizar un reporte final de datos que informe:
o Cuantos alumnos son mayores de 25 años.
o Cuantos alumnos tiene su apellido que comienzan con letra L o P
o Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA –
VENEZOLANA.
Recordar:
 Hacer uso de paquetes y clases correspondientes para buena estructura de
nuestro proyecto.
 Todos los métodos deben ser pensados para reutilizar y adaptarse a futuros
cambios (por ejemplo, mañana quiero carga de 30 alumnos, y las instrucciones
deben prevenir esta modificación)
 */
package Entidad;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Mile
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date nacimiento;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", nacimiento=" + nacimiento + '}';
    }
    
    public static Comparator<Alumno> apellidoAsc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }
    };
    
    public static Comparator<Alumno> nombreDesc = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
            
}

