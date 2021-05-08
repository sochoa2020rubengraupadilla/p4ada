package ad.spring.practica4RubenGrauPadilla.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.practica4RubenGrauPadilla.domain.Artefactos;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;




/**
 * QArtefactos is a Querydsl query type for Artefactos
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArtefactos extends EntityPathBase<Artefactos> {

    private static final long serialVersionUID = -516700946L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArtefactos artefactos = new QArtefactos("artefactos");

    public final NumberPath<Integer> idArtefacto = createNumber("idArtefacto", Integer.class);

    public final StringPath nombreArtefacto = createString("nombreArtefacto");

    protected QPersonaje personaje;

    public final StringPath tipoArtefacto = createString("tipoArtefacto");

    public QArtefactos(String variable) {
        this(Artefactos.class, forVariable(variable), INITS);
    }

    public QArtefactos(Path<? extends Artefactos> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArtefactos(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArtefactos(PathMetadata metadata, PathInits inits) {
        this(Artefactos.class, metadata, inits);
    }

    public QArtefactos(Class<? extends Artefactos> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.personaje = inits.isInitialized("personaje") ? new QPersonaje(forProperty("personaje"), inits.get("personaje")) : null;
    }

    public QPersonaje personaje() {
        if (personaje == null) {
            personaje = new QPersonaje(forProperty("personaje"));
        }
        return personaje;
    }

}

