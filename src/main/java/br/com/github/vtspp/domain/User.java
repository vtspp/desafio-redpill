package br.com.github.vtspp.domain;

import br.com.github.vtspp.constant.Schemas;
import br.com.github.vtspp.constant.Sequences;
import br.com.github.vtspp.constant.Tables;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table (name = Tables.TB_USER, schema = Schemas.RED_PILL)
public class User implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = Sequences.SQ_USER)
    @SequenceGenerator(name = Sequences.SQ_USER, sequenceName = Sequences.SQ_USER, schema = Schemas.RED_PILL, allocationSize = 1)
    @Column (name = "id", nullable = false)
    private Long id;

    @Column (name = "name", length = 50)
    private String name;

    @Column (name = "identifier", length = 14)
    private String identifier;

    @Column (name = "identifiertype", length = 4)
    private String identifierType;
}