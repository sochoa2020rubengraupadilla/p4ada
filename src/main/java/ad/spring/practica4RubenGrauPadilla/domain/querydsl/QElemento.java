package ad.spring.practica4RubenGrauPadilla.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.practica4RubenGrauPadilla.domain.Elemento;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QElemento is a Querydsl query type for Elemento
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QElemento extends EntityPathBase<Elemento> {

    private static final long serialVersionUID = 2095123119L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QElemento elemento = new QElemento("elemento");

    public final NumberPath<Integer> idElemento = createNumber("idElemento", Integer.class);

    public final StringPath nombreElemento = createString("nombreElemento");

    protected QPersonaje personaje;

    public QElemento(String variable) {
        this(Elemento.class, forVariable(variable), INITS);
    }

    public QElemento(Path<? extends Elemento> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QElemento(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QElemento(PathMetadata metadata, PathInits inits) {
        this(Elemento.class, metadata, inits);
    }

    public QElemento(Class<? extends Elemento> type, PathMetadata metadata, PathInits inits) {
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

