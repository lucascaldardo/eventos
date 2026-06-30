package lucas.evento.infrastructure.presentation;

import lucas.evento.core.entites.Evento;
import lucas.evento.core.usecases.CriarEventoUseCase;
import lucas.evento.infrastructure.dto.EventoDTO;
import lucas.evento.infrastructure.mapper.EventoDtoMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")

public class EventoController {

    private final CriarEventoUseCase criarEventoUseCase;
    private final EventoDtoMapper eventoDtoMapper;

    public EventoController(CriarEventoUseCase criarEventoUseCase, EventoDtoMapper eventoDtoMapper) {
        this.criarEventoUseCase = criarEventoUseCase;
        this.eventoDtoMapper = eventoDtoMapper;
    }

    @PostMapping("/criarevento")
    public EventoDTO criarEvento(@RequestBody EventoDTO eventoDTO){
        Evento nvoEvento = criarEventoUseCase.execute(eventoDtoMapper.toDomain(eventoDTO));
        return eventoDtoMapper.toDto(nvoEvento);
    }

    @GetMapping("/listareventos")
    public String listarEvento(){
        return "lista";
    }

}
