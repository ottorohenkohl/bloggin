package de.ottorohenkohl.bloggin.config;

import de.ottorohenkohl.bloggin.core.Repository;
import de.ottorohenkohl.bloggin.core.value.Identifier;
import org.hibernate.annotations.processing.Find;
import org.hibernate.annotations.processing.HQL;

interface ConfigRepository extends Repository<Config> {
    
    @Find
    Config read(Identifier identifier);
    
    @HQL("SELECT c FROM Config c")
    Config single();
}