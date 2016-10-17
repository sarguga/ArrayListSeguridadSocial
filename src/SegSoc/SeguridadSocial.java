package SegSoc;

import java.util.ArrayList;

public class SeguridadSocial {

    private static ArrayList<Persona> personaList;

    public SeguridadSocial(){
        personaList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
public void altaPersona(Persona persona){
    boolean repetido = false;
    for(int i=0;i<personaList.size();i++){
        if(persona.getDni()==personaList.get(i).getDni()){
            repetido=true;
            System.out.println("El Dni introducido está repetido.");
        }if(persona.getNumSS()==personaList.get(i).getNumSS()){
            repetido=true;
            System.out.println("El nº de SS introducido está repetido.");
        }
    }
    if(repetido==false){
        personaList.add(persona);
        System.out.println("Persona dada de alta correctamente.");
    }
}

public void bajaPersona(String dni){

    personaList.remove(dni);
    System.out.println("Persona dada de baja correctamente.");


}

public void obtenerPersonaPorDNI(String dni){
    for(int i=0;i<personaList.size();i++){
        if(dni==personaList.get(i).getDni()){
            System.out.println("Nombre: "+personaList.get(i).getNombre());
            System.out.println("Apellidos: "+personaList.get(i).getApellidos());
            System.out.println("Edad: "+personaList.get(i).getEdad());
        }
    }
}

public void obtenerPersonaPorNumSS(String numSS){
    for(int i=0;i<personaList.size();i++){
        if(numSS==personaList.get(i).getNumSS()){
            System.out.println("Nombre: "+personaList.get(i).getNombre());
            System.out.println("Apellidos: "+personaList.get(i).getApellidos());
            System.out.println("Edad: "+personaList.get(i).getEdad());
        }
    }
}

public void obtenerTodas(){
    for(int i=0;i<personaList.size();i++){
        System.out.println("Nombre: "+personaList.get(i).getNombre());
        System.out.println("Apellidos: "+personaList.get(i).getApellidos());
        System.out.println("Edad: "+personaList.get(i).getEdad());
    }
}

public void obtenerPersonasRangoSalarial(double min, double max){
    for (int i=0;i<personaList.size();i++){
        if(personaList.get(i).getSalario()>= min && personaList.get(i).getSalario()<= max){
            System.out.println("Nombre: "+personaList.get(i).getNombre());
            System.out.println("Apellidos: "+personaList.get(i).getApellidos());
            System.out.println("Edad: "+personaList.get(i).getEdad());

        }
    }
}

public void obtenerPersonasMayoresQue(int edad){
    for(int i=0;i<personaList.size();i++) {
        if (edad < personaList.get(i).getEdad()) {
            System.out.println("Nombre: " + personaList.get(i).getNombre());
            System.out.println("Apellidos: " + personaList.get(i).getApellidos());
            System.out.println("Edad: " + personaList.get(i).getEdad());
        }
    }
}



    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personaList=" + personaList +
                '}';
    }
}