package com.Ejercicio.Ejercicio.Controller;

import com.Ejercicio.Ejercicio.Service.PcService;
import com.Ejercicio.Ejercicio.dto.PcDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "MiControlador", description = "Controlador de ejemplo")
@RestController
@RequestMapping("/pc")
public class PcController {
    @Autowired
    private PcService pcService;

    @Operation(summary = "Obtener todas las PC", description = "Devuelve una lista de todas las PC")
    @GetMapping("/")
    public ResponseEntity<List<PcDto>> findAll() {
        List<PcDto> lista = this.pcService.getAll();
        return ResponseEntity.ok(lista);
    }

    @Operation(summary = "Obtener PC por ID", description = "Devuelve una PC específica por su ID")
    @GetMapping("/{id}")
    public ResponseEntity<PcDto> findById(@PathVariable("id") Long id) {
        PcDto pc = this.pcService.getById(id);
        return ResponseEntity.ok(pc);
    }

    @Operation(summary = "Guardar una nueva PC", description = "Guarda una nueva PC en la base de datos")
    @PostMapping("/")
    public ResponseEntity<PcDto> save(@RequestBody PcDto pcDto) {
        PcDto saved = this.pcService.save(pcDto);
        return ResponseEntity.ok(saved);
    }

    @Operation(summary = "Actualizar una PC", description = "Actualiza una PC existente en la base de datos")
    @PutMapping("/{id}")
    public ResponseEntity<PcDto> update(@RequestBody PcDto pcDto, @PathVariable("id") Long id) {
        PcDto updated = this.pcService.update(pcDto, id);
        return ResponseEntity.ok(updated);
    }

    @Operation(summary = "Eliminar una PC", description = "Elimina una PC por su ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        try {
            this.pcService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
