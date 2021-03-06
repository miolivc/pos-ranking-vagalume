package br.edu.ifpb.pos.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

/**
 *
 * @author Michelle Oliveira
 * @mail miolivc@outlook.com
 * @since 13/12/2017
 */

@Value.Immutable
@JsonDeserialize(as = ImmutableFragArtist.class)
@JsonSerialize(as = ImmutableFragArtist.class)

public interface FragArtist {

    public String name();
    
}
