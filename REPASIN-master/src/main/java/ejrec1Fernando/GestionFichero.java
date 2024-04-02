/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejrec1Fernando;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author fer
 */
public class GestionFichero {

    public static void main(String[] args) throws IOException {

        //APARTO A
        List<Curso> listaCursos = generarListaFichero("RegActForCep.csv", ";");

        listaCursos.forEach(System.out::println);
        
        //APARTADO B
        //Ordeno la lista 
        List<Curso> listaOrdenada = listaCursos.stream()
                .sorted(Comparator.comparing(Curso::getFechaInicio)
                        .thenComparing(Curso::getTitulo))
                .collect(Collectors.toList());

        
        listaOrdenada.forEach(System.out::println); //Lista ya ordenada
        
        //APARTDO C
        generarFicheroTxT("cursos.txt", listaCursos);
        
        

        Map<String, Integer> map = generarMap(listaCursos);

        generarArchivoJSON("centros.json", map);
        
    }

    public static List<Curso> generarListaFichero(String nomFichero, String separador) {

        List<Curso> listaCursos = new ArrayList<>();

        String idFichero = nomFichero;
        String[] tokens;
        String linea = "";

        Curso c = null;

        int contador = 0; // Variable para contar las líneas leídas

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); // Guarda la línea completa en un String

                //Salta las 5 primeras lineas del fichero
                if (contador < 5) {
                    contador++;
                    continue;
                }

                tokens = linea.split(separador); // Se guarda cada elemento en función del separador

                c = new Curso(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);

                listaCursos.add(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return listaCursos;
    }

    public static void generarFicheroTxT(String nomFichero, List<Curso> listaCursos) {

        String idFichero = nomFichero;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaLimite = LocalDate.of(2020, 3, 31);

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Curso c : listaCursos) {

                LocalDate fechaFinalizacion = LocalDate.parse(c.getFechaFin(), formatter);

                if (fechaFinalizacion.isBefore(fechaLimite) || fechaFinalizacion.equals(fechaLimite)) {

                    flujo.write(c.getTitulo() + ";" + c.getFechaFin());
                    flujo.newLine();
                }

            }
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
    
    

    public static Map<String, Integer> generarMap(List<Curso> listaCursos) {

        Map<String, Integer> map = new HashMap<>();


        for (Curso c : listaCursos) { //Recorro la lista de los cursos

            if (map.containsKey(c.getCentro())) { //Si el centro esta en el map le sumo 1 

                map.put(c.getCentro(), map.get(c.getCentro()) + 1); 
            } else {

                map.put(c.getCentro(), 1); //Si no esta lo meto dentro y le dejo en 1 el valor del value

            }

        }

        return map;

    }

    public static void generarArchivoJSON(String nomFichero, Map<String, Integer> map) throws IOException {

        ObjectMapper mapeador = new ObjectMapper();

        mapeador.registerModule(new JavaTimeModule());

        //Formato del Json
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(nomFichero), map);

    }
}
