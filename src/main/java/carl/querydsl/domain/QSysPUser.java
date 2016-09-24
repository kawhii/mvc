package carl.querydsl.domain;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DatePath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.SimplePath;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.sql.ColumnMetadata;

import javax.annotation.Generated;
import java.sql.Types;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;


/**
 * QSysPUser is a Querydsl query type for QSysPUser
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSysPUser extends com.querydsl.sql.RelationalPathBase<QSysPUser> {

    private static final long serialVersionUID = -1784196123;

    public static final QSysPUser sysPUser = new QSysPUser("SYS_P_USER");

    public final SimplePath<Object> account = createSimple("account", Object.class);

    public final SimplePath<Object> address = createSimple("address", Object.class);

    public final NumberPath<Integer> deptId = createNumber("deptId", Integer.class);

    public final SimplePath<Object> email = createSimple("email", Object.class);

    public final SimplePath<Object> fax = createSimple("fax", Object.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lockReason = createString("lockReason");

    public final NumberPath<Byte> lockStatus = createNumber("lockStatus", Byte.class);

    public final DatePath<java.sql.Date> lockTime = createDate("lockTime", java.sql.Date.class);

    public final SimplePath<Object> mobilePhone = createSimple("mobilePhone", Object.class);

    public final SimplePath<Object> name = createSimple("name", Object.class);

    public final NumberPath<Integer> netId = createNumber("netId", Integer.class);

    public final SimplePath<Object> note = createSimple("note", Object.class);

    public final SimplePath<Object> password = createSimple("password", Object.class);

    public final SimplePath<Object> position = createSimple("position", Object.class);

    public final NumberPath<Byte> sex = createNumber("sex", Byte.class);

    public final NumberPath<Byte> statusId = createNumber("statusId", Byte.class);

    public final SimplePath<Object> telephone = createSimple("telephone", Object.class);

    public final NumberPath<Byte> typeId = createNumber("typeId", Byte.class);

    public final StringPath uuid = createString("uuid");

    public final SimplePath<Object> zipCode = createSimple("zipCode", Object.class);

    public final com.querydsl.sql.PrimaryKey<QSysPUser> bIN$PQHsbTC0LZHgUKjA62Qojg_$0 = createPrimaryKey(id);

    public QSysPUser(String variable) {
        super(QSysPUser.class, forVariable(variable), "ESALEB_DEV", "SYS_P_USER");
        addMetadata();
    }

    public QSysPUser(String variable, String schema, String table) {
        super(QSysPUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSysPUser(String variable, String schema) {
        super(QSysPUser.class, forVariable(variable), schema, "SYS_P_USER");
        addMetadata();
    }

    public QSysPUser(Path<? extends QSysPUser> path) {
        super(path.getType(), path.getMetadata(), "ESALEB_DEV", "SYS_P_USER");
        addMetadata();
    }

    public QSysPUser(PathMetadata metadata) {
        super(QSysPUser.class, metadata, "ESALEB_DEV", "SYS_P_USER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(account, ColumnMetadata.named("ACCOUNT").withIndex(2).ofType(Types.OTHER).withSize(32).notNull());
        addMetadata(address, ColumnMetadata.named("ADDRESS").withIndex(8).ofType(Types.OTHER).withSize(255));
        addMetadata(deptId, ColumnMetadata.named("DEPT_ID").withIndex(15).ofType(Types.DECIMAL).withSize(8));
        addMetadata(email, ColumnMetadata.named("EMAIL").withIndex(13).ofType(Types.OTHER).withSize(32));
        addMetadata(fax, ColumnMetadata.named("FAX").withIndex(7).ofType(Types.OTHER).withSize(20));
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.DECIMAL).withSize(8).notNull());
        addMetadata(lockReason, ColumnMetadata.named("LOCK_REASON").withIndex(20).ofType(Types.VARCHAR).withSize(200));
        addMetadata(lockStatus, ColumnMetadata.named("LOCK_STATUS").withIndex(18).ofType(Types.DECIMAL).withSize(2));
        addMetadata(lockTime, ColumnMetadata.named("LOCK_TIME").withIndex(19).ofType(Types.DATE).withSize(7));
        addMetadata(mobilePhone, ColumnMetadata.named("MOBILE_PHONE").withIndex(5).ofType(Types.OTHER).withSize(11));
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(3).ofType(Types.OTHER).withSize(200).notNull());
        addMetadata(netId, ColumnMetadata.named("NET_ID").withIndex(14).ofType(Types.DECIMAL).withSize(8));
        addMetadata(note, ColumnMetadata.named("NOTE").withIndex(17).ofType(Types.OTHER).withSize(255));
        addMetadata(password, ColumnMetadata.named("PASSWORD").withIndex(11).ofType(Types.OTHER).withSize(80).notNull());
        addMetadata(position, ColumnMetadata.named("POSITION").withIndex(16).ofType(Types.OTHER).withSize(15));
        addMetadata(sex, ColumnMetadata.named("SEX").withIndex(4).ofType(Types.DECIMAL).withSize(2));
        addMetadata(statusId, ColumnMetadata.named("STATUS_ID").withIndex(12).ofType(Types.DECIMAL).withSize(2));
        addMetadata(telephone, ColumnMetadata.named("TELEPHONE").withIndex(6).ofType(Types.OTHER).withSize(20));
        addMetadata(typeId, ColumnMetadata.named("TYPE_ID").withIndex(10).ofType(Types.DECIMAL).withSize(2).notNull());
        addMetadata(uuid, ColumnMetadata.named("UUID").withIndex(21).ofType(Types.VARCHAR).withSize(200));
        addMetadata(zipCode, ColumnMetadata.named("ZIP_CODE").withIndex(9).ofType(Types.OTHER).withSize(8));
    }

}

