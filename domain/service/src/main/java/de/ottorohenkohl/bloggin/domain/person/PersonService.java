package de.ottorohenkohl.bloggin.domain.person;

import de.ottorohenkohl.bloggin.domain.core.value.Identifier;
import de.ottorohenkohl.bloggin.domain.person.object.PersonExisting;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.query.Page;

import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class PersonService {
    
    private final PersonExistingMapper personExistingMapper;
    private final PersonRepository personRepository;
    
    @Transactional
    public PersonExisting findExistingPerson(String identifier) {
        return personExistingMapper.export(personRepository.read(new Identifier(identifier)));
    }
    
    @Transactional
    public List<PersonExisting> findExistingPersons(Page page) {
        return personRepository.read(page).stream().map(personExistingMapper::export).toList();
    }
}