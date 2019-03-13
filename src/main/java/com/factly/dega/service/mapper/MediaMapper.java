package com.factly.dega.service.mapper;

import com.factly.dega.domain.Media;
import com.factly.dega.service.dto.MediaDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity Media and its DTO MediaDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MediaMapper extends EntityMapper<MediaDTO, Media> {



    default Media fromId(String id) {
        if (id == null) {
            return null;
        }
        Media media = new Media();
        media.setId(id);
        return media;
    }
}
