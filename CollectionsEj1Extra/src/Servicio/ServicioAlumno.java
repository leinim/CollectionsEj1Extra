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
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioAlumno {
    Scanner leer = new Scanner(System.in);
    public void alta(ArrayList<Alumno> a){
        if (a.size() < 19){
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese el apellido");
            String apellido = leer.nextLine();
            System.out.println("Ingrese la nacionalidad (ARGENTINA-CHILENA-VENEZOLANA)");
            String nacionalidad = leer.next();
            System.out.println("Ingrese su fecha de nacimiento(dia, mes, año)");
            Date fecha = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());
            Alumno a1 = new Alumno(nombre, apellido, nacionalidad, fecha);
            a.add(a1);
        } else {
            System.out.println("La cantidad de alumnos registrados ha alcanzado su máximo(20)");
        }    
    }
    
    public void baja(ArrayList<Alumno> a){
        System.out.println("Ingrese el apellido del alumno a eliminar del registro");
        String apellido = leer.nextLine();
        Iterator<Alumno> it = a.iterator();
        int contador = 0;
        while (it.hasNext()){
            if (it.next().getApellido().equalsIgnoreCase(apellido)){
                it.remove();
            } else {
                contador++;
            }
        }
        if (contador == a.size()-1){
            System.out.println("No se encuentra registrado ningun alumno con el apellido ingresado");
        }
    }
    
    public void modificacion(ArrayList<Alumno> a){
        System.out.println("Ingrese el apellido del alumno a modificar");
        String apellido = leer.next();
        Iterator<Alumno> it = a.iterator();
        int contador = 0;
        while (it.hasNext()){
            if (it.next().getApellido().equalsIgnoreCase(apellido)) {
                int opcion = 0;
                do {
                    System.out.println("Elija una opción:");
                    System.out.println("1 - Modificar nombre");
                    System.out.println("2 - Modificar apellido");
                    System.out.println("3 - Modificar nacionalidad");
                    System.out.println("4 - Modificar fecha de nacimiento");
                    System.out.println("5 - Volver al menu principal");
                    opcion = leer.nextInt();
                    switch (opcion) {
                        case 1: 
                            System.out.println("Ingrese el nuevo nombre");
                            it.next().setNombre(leer.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo apellido");
                            it.next().setApellido(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese la nueva nacionalidad");
                            it.next().setNacionalidad(leer.next());
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva fecha de nacimiento(dia-mes-año)");
                            Date nueva = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());
                            it.next().setNacimiento(nueva);
                            break;
                        case 5:
                            System.out.println("Saliendo del menu de modificacion de datos.");
                            break;
                        default:
                            System.out.println("Opcion invalida.");
                            break;
                    }
                } while (opcion != 5);   
            } else {
                contador++;
            }
        }
        if (contador == a.size()-1){
            System.out.println("No se encuentra registrado ningun alumno con el apellido ingresado");
        }
    }
    
    public void mostrarLista(ArrayList<Alumno> a){
        
    }
    
    public void edadAlumno(ArrayList<Alumno> a){
        
    }
    
    public void listasPorNacionalidad(ArrayList<Alumno> a){
        
    }
    
    public void mayores25(ArrayList<Alumno> a){
        
    }
    
    public void apellidoLP(ArrayList<Alumno> a){
        
    }
    
    public void cantidadPorNacionalidad(ArrayList<Alumno> a){
        
    }
}
