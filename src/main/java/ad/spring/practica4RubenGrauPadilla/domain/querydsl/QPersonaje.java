package ad.spring.practica4RubenGrauPadilla.domain.querydsl;

import static com.querydsl.core.types.PathMetadataFactory.*;

import ad.spring.practica4RubenGrauPadilla.domain.Artefactos;
import ad.spring.practica4RubenGrauPadilla.domain.Personaje;
import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;




/**
 * QPersonaje is a Querydsl query type for Personaje
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersonaje extends EntityPathBase<Personaje> {

    private static final long serialVersionUID = 1636011947L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPersonaje personaje = new QPersonaje("personaje");

    public final SetPath<Artefactos, QArtefactos> artefactos = this.<Artefactos, QArtefactos>createSet("artefactos", Artefactos.class, QArtefactos.class, PathInits.DIRECT2);

    protected QElemento elemento;

    public final NumberPath<Integer> idPersonaje = createNumber("idPersonaje", Integer.class);

    public final StringPath nivelPersonaje = createString("nivelPersonaje");

    public final StringPath nombrePersonaje = createString("nombrePersonaje");

    public QPersonaje(String variable) {
        this(Personaje.class, forVariable(variable), INITS);
    }

    public QPersonaje(Path<? extends Personaje> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPersonaje(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPersonaje(PathMetadata metadata, PathInits inits) {
        this(Personaje.class, metadata, inits);
    }

    public QPersonaje(Class<? extends Personaje> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.elemento = inits.isInitialized("elemento") ? new QElemento(forProperty("elemento"), inits.get("elemento")) : null;
    }

    public QElemento elemento() {
        if (elemento == null) {
            elemento = new QElemento(forProperty("elemento"));
        }
        return elemento;
    }

}

