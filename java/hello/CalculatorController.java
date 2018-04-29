package hello;

import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/api/v1/calculator/add/**")
    public Data add(HttpServletRequest request) {
       String strDatos      =  request.getRequestURI();
       String strNumeros    =  strDatos.replace("/api/v1/calculator/add/","");
       String[] lstnumeros  =  strNumeros.split("/");
       double resultado     =  0;
       for(Integer i=0;i<=lstnumeros.length-1;i++)
    	   resultado += Double.parseDouble(lstnumeros[i]); 
       
       Data d   =  new Data();
       d.setResultado(resultado);
       d.setMensaje("Suma calculada con exito");
       return d;
    }
    @GetMapping("/api/v1/calculator/subs/**")
    public Data subs(HttpServletRequest request) {
    	String strDatos      =  request.getRequestURI();
        String strNumeros    =  strDatos.replace("/api/v1/calculator/subs/","");
        String[] lstnumeros  =  strNumeros.split("/");
        double resultado     =  Double.parseDouble(lstnumeros[0]);
        for(Integer i=1;i<=lstnumeros.length-1;i++)
     	   resultado -= Double.parseDouble(lstnumeros[i]); 
        
        Data d   =  new Data();
        d.setResultado(resultado);
        d.setMensaje("Resta calculada con exito");
        return d;
    }
    
    @GetMapping("/api/v1/calculator/mult/**")
    public Data mult(HttpServletRequest request) {
    	String strDatos      =  request.getRequestURI();
        String strNumeros    =  strDatos.replace("/api/v1/calculator/mult/","");
        String[] lstnumeros  =  strNumeros.split("/");
        double resultado     =  1;
        for(Integer i=0;i<=lstnumeros.length-1;i++)
     	   resultado *= Double.parseDouble(lstnumeros[i]); 
        
        Data d   =  new Data();
        d.setResultado(resultado);
        d.setMensaje("Producto calculado con exito");
        return d;
    }
    
    @GetMapping("/api/v1/calculator/div/**")
    public Data div(HttpServletRequest request) {
    	String strDatos      =  request.getRequestURI();
        String strNumeros    =  strDatos.replace("/api/v1/calculator/div/","");
        String[] lstnumeros  =  strNumeros.split("/");
        double resultado     =  Double.parseDouble(lstnumeros[0]);
        for(Integer i=1;i<=lstnumeros.length-1;i++)
     	   resultado /= Double.parseDouble(lstnumeros[i]); 
        
        Data d   =  new Data();
        d.setResultado(resultado);
        d.setMensaje("Division calculada con exito");
        return d;
    }

}
