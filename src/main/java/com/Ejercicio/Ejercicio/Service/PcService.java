package com.Ejercicio.Ejercicio.Service;

import com.Ejercicio.Ejercicio.dto.PcDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PcService {
    private Map<Long, PcDto> list = new HashMap<Long, PcDto>();
    private Long id =1L;
    public List<PcDto> getAll(){
        return  new ArrayList<PcDto>(list.values());
    }
    public PcDto getById(Long id){
        return  list.get(id);
    }
    public PcDto save(PcDto pc){
        pc.setId(id);
        list.put(pc.getId(),pc);
        id++;
        return pc;
    }
    public PcDto update(PcDto pc, Long id) {
    if (list.containsKey(id)){
        pc.setId(id);
        list.put(id,pc);
        return pc;
    }else{
       return null;
    }
    }

    public void delete(Long id) {
        list.remove(id);
    }
}
