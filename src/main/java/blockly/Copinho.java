package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Copinho {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// copinho
public static Var tamanho() throws Exception {
 return new Callable<Var>() {

   private Var lista = Var.VAR_NULL;
   private Var copo_100_ml = Var.VAR_NULL;
   private Var copo_200_ml = Var.VAR_NULL;

   public Var call() throws Exception {

    lista =
    cronapi.list.Operations.newList(copo_100_ml, copo_200_ml);

    System.out.println(lista.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

