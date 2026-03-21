package com.catalendas.algafood.domain.service;

import com.catalendas.algafood.domain.filter.VendaDiariaFilter;
import com.catalendas.algafood.domain.model.dto.VendaDiaria;

import java.util.List;

public interface VendaQueryService {

	List<VendaDiaria> consultarVendasDiarias(VendaDiariaFilter filtro, String timeOffset);

}
