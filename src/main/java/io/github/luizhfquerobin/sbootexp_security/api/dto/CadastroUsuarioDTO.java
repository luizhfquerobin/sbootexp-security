package io.github.luizhfquerobin.sbootexp_security.api.dto;

import io.github.luizhfquerobin.sbootexp_security.domain.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class CadastroUsuarioDTO {

    private Usuario usuario;
    private List<String> permissoes;
}
