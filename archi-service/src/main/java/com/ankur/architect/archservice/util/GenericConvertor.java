package com.ankur.architect.archservice.util;


import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;


public interface GenericConvertor<E, D> {

    E createEntity(D dto);

    D createDTO(E entity);

    default Set<D> createFromEntities(final Collection<E> entities) {
        if (entities == null) return null;
        return entities.stream()
                .map(this::createDTO)
                .collect(Collectors.toSet());
    }

    default Set<E> createFromDtos(final Collection<D> dtos) {
        if (dtos == null) return null;
        return dtos.stream()
                .map(this::createEntity)
                .collect(Collectors.toSet());
    }
}
