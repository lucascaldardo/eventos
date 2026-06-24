package lucas.frellas.core.entites;

import java.time.LocalDateTime;

public record Estabelecimento(

     Long id,

     String estabelecimento,

     String descriçãoEstabelcimento,

     LocalDateTime inicio,

     LocalDateTime fim,

     String local,

     String vagas,

     String funcaoRequisitada,

     String notaPorFrellancers
){}


