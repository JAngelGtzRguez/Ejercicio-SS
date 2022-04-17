package uv.mx.ejercicioss;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.uv_mx.ejercicioss.BorrarReservacionRequest;
import https.uv_mx.ejercicioss.BorrarReservacionResponse;
import https.uv_mx.ejercicioss.BuscarReservacionResponse;
import https.uv_mx.ejercicioss.ModificarReservacionRequest;
import https.uv_mx.ejercicioss.ModificarReservacionResponse;
import https.uv_mx.ejercicioss.ReservarRequest;
import https.uv_mx.ejercicioss.ReservarResponse;




@Endpoint
public class reservacionEndPoint {


    @Autowired
    Ireservadores ireservadores;

    @PayloadRoot(localPart = "ReservarRequest",namespace = "https://uv.mx/ejercicioss")
    @ResponsePayload 
    public ReservarResponse Reservar(@RequestPayload ReservarRequest peticion){
        ReservarResponse respuesta = new ReservarResponse();
        respuesta.setRespuesta("HOLA " + peticion.getNombre() + " TU RESERVACIÓN ESTA LISTA");

        //------------------------
        Reservadores reservacion = new Reservadores();
        reservacion.setFecha(peticion.getFecha());
        reservacion.setHora(peticion.getHora());
        reservacion.setNoPersonas(peticion.getNoPersonas());
        reservacion.setNombre(peticion.getNombre());
        ireservadores.save(reservacion);

        return respuesta;
    }



    //BUSCAR RESERVACION 
    @PayloadRoot(localPart = "BuscarReservacionRequest",namespace = "https://uv.mx/ejercicioss")
    @ResponsePayload
    public BuscarReservacionResponse buscarReservaciones(){
        BuscarReservacionResponse respuesta = new BuscarReservacionResponse();

       Iterable<Reservadores> lista = ireservadores.findAll();
        for (Reservadores o : lista) {
                BuscarReservacionResponse.Reservaciones e = new BuscarReservacionResponse.Reservaciones();
                e.setNombre(o.getNombre());
                e.setFecha(o.getFecha());
                e.setHora(o.getHora());
                e.setNoPersonas(o.getNoPersonas());
                e.setId(o.getId());
               
                respuesta.getReservaciones().add(e);
         }

        return respuesta;

    }



    //MODIFICAR RESERVACION
    @PayloadRoot(localPart = "ModificarReservacionRequest",namespace = "https://uv.mx/ejercicioss")
    @ResponsePayload
    public ModificarReservacionResponse modificarSaludo(@RequestPayload ModificarReservacionRequest peticion){
        ModificarReservacionResponse respuesta = new ModificarReservacionResponse();


        Reservadores e = new Reservadores();
        e.setId(peticion.getId());
        e.setNombre(peticion.getNombre());
        e.setFecha(peticion.getFecha());
        e.setHora(peticion.getHora());
        e.setNoPersonas(peticion.getNoPersonas());
        
        ireservadores.save(e);
        respuesta.setRespuesta(true);

        return respuesta;
    }



    //ELIMINAR RESERVACION 
    @PayloadRoot(localPart = "BorrarReservacionRequest",namespace = "https://uv.mx/ejercicioss")
    @ResponsePayload
    public BorrarReservacionResponse borrarSaludo (@RequestPayload BorrarReservacionRequest peticion){
        BorrarReservacionResponse respuesta = new BorrarReservacionResponse();
        
        // for (Saludo o : saludos){
        //     if(o.getId() == peticion.getId()){
        //         saludos.remove(o);
        //         break;
        //     }
        // }
        ireservadores.deleteById(peticion.getId());
        respuesta.setRespuesta(true);
        return respuesta;

    }
    
}
