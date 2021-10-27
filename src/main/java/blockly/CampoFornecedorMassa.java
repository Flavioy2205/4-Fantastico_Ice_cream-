package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CampoFornecedorMassa {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// CampoFornecedorMassa
public static Var ObterValorDoSorvete(@ParamMetaData(description = "saborSorvete") Var saborSorvete) throws Exception {
 return new Callable<Var>() {

   private Var ValorSorvete = Var.VAR_NULL;

   public Var call() throws Exception {

    ValorSorvete =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.Sorvete"),Var.valueOf("select s.valor from Sorvete s where s.id = :id"),Var.valueOf("id",saborSorvete))));
    return ValorSorvete;
   }
 }.call();
}

}

