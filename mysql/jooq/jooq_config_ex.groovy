/**
 *  This is an example of using jooq to map the tables created by the flyway migration
 *   'src/main/resources/db/migration',
 *
 *   This will create POJO's and DAO's that can be used against the DB JOOQ 'read' to create these objs.
 */
jooq {
    eval(sourceSets.main) {
        jdbc {
            driver = 'com.mysql.jdbc.Driver'
            url = 'jdbc:mysql://localhost:3306/eval'
            user = 'admin'
            password = 'admin'
        }
        generator {
            name = 'org.jooq.codegen.DefaultGenerator'
            strategy {
                name = 'org.jooq.codegen.DefaultGeneratorStrategy'
            }
            database {
                name = 'org.jooq.meta.mysql.MySQLDatabase'
                inputSchema = 'eval'
                forcedTypes {
                    forcedType {
                        name = 'BOOLEAN' // sql has no boolean, convert when generating.
                        types = 'tinyint'
                    }


                }
            }
            generate {
                relations = true
                deprecated = false
                records = true
                immutablePojos = true
                fluentSetters = true
            }
            target {
                packageName = 'com.eval'
                directory = 'src/generated/jooq'
            }
        }
    }
}
