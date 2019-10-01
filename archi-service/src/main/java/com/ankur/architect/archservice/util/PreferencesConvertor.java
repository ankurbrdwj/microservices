package com.ankur.architect.archservice.util;

import com.ankur.architect.archservice.domain.Preferences;
import com.ankur.architect.archservice.dto.PreferencesDTO;

public class PreferencesConvertor implements GenericConvertor<Preferences, PreferencesDTO> {

    @Override
    public Preferences createEntity(PreferencesDTO dto) {
        Preferences dest = new Preferences();
        dest.setId(dto.getId());
        dest.setVersion(dto.getVersion());
        dest.setCreatedDate(dto.getCreatedDate());
        dest.setBudget(dto.getBudget());
        dest.setBuildingType(dto.getBuildingType());
        dest.setChangesRequired(dto.getChangesRequired());
        dest.setDesignPreference(dto.getDesignPreference());
        dest.setFeedback(dto.getFeedback());
        dest.setInteriorDetails(dto.getInteriorDetails());
        dest.setLifeStyle(dto.getLifeStyle());
        dest.setNegatives(dto.getNegatives());
        dest.setPointOfContact(dto.getPointOfContact());
        dest.setPositives(dto.getPositives());
        dest.setRoomDetails(dto.getRoomDetails());
        dest.setSiteSelection(dto.getSiteSelection());
        return dest;
    }

    @Override
    public PreferencesDTO createDTO(Preferences entity) {
        PreferencesDTO dest = new PreferencesDTO();
        dest.setId(entity.getId());
        dest.setVersion(entity.getVersion());
        dest.setCreatedDate(entity.getCreatedDate());
        dest.setBudget(entity.getBudget());
        dest.setBuildingType(entity.getBuildingType());
        dest.setChangesRequired(entity.getChangesRequired());
        dest.setDesignPreference(entity.getDesignPreference());
        dest.setFeedback(entity.getFeedback());
        dest.setInteriorDetails(entity.getInteriorDetails());
        dest.setLifeStyle(entity.getLifeStyle());
        dest.setNegatives(entity.getNegatives());
        dest.setPointOfContact(entity.getPointOfContact());
        dest.setPositives(entity.getPositives());
        dest.setRoomDetails(entity.getRoomDetails());
        dest.setSiteSelection(entity.getSiteSelection());
        return dest;
    }
}
