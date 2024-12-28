package de.ottorohenkohl.bloggin.domain.person.value;

import org.mapstruct.Mapper;

@Mapper
public interface IssuerMapper {
    
    default String map(Issuer issuer) {
        return issuer.value();
    }
    
    default Issuer map(String value) {
        return new Issuer(value);
    }
}
