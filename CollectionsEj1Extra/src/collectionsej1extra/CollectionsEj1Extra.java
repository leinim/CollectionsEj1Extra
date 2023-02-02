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
package collectionsej1extra;

import Entidad.Alumno;
import Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class CollectionsEj1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno sa = new ServicioAlumno();
        ArrayList<Alumno> alumnos = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1 - Alta de alumno");
            System.out.println("2 - Baja de alumno");
            System.out.println("3 - Modificar alumno");
            System.out.println("4 - Mostrar la lista de alumnos ordenados por orden alfabético según su\n" +
            "apellido de forma ascendente");
            System.out.println("5 - Mostrar la lista de alumnos ordenados por orden alfabético según su\n" +
            "nombre de forma descendente.");
            System.out.println("6 - Obtener edad de un alumno");
            System.out.println("7 - Mostrar lista de alumnos por nacionalidad");
            System.out.println("8 - Reportes");
            System.out.println("9 - Salir");
            opcion = leer.nextInt();        
            
            switch (opcion) {
                case 1:
                    sa.alta(alumnos);
                    break;
                case 2:
                    sa.baja(alumnos);
                    break;
                case 3:
                    sa.modificacion(alumnos);
                    break;
                case 4:                    
                    sa.mostrarListaApellidoAsc(alumnos);
                    break;
                case 5:
                    sa.mostrarListaNombreDesc(alumnos);
                    break;
                case 6:
                    sa.edadAlumno(alumnos);
                    break;
                case 7:
                    sa.listasPorNacionalidad(alumnos);
                    break;
                case 8:
                    System.out.println("Elija una opcion");
                    System.out.println("1 - Alumnos mayores de 25");
                    System.out.println("2 - Alumnos con primera letra del apellido L o P");
                    System.out.println("3 - Cantidad de alumnos por nacionalidad");
                    int opcionR = leer.nextInt();
                    
                    switch (opcionR){
                        case 1:
                            sa.mayores25(alumnos);
                            break;
                        case 2:
                            sa.apellidoLP(alumnos);
                            break;
                        case 3:
                            sa.cantidadPorNacionalidad(alumnos);
                            break;
                    }                    
                    break;
                case 9:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 9);              
        
    }
    
}
