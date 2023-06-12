package snippet;

public class Snippet {

    public static void main(String[] args) {
        String springDatasourceUrl = "jdbc:mysql://localhost/toten_project";
        String springDatasourceUsername = "root";
        String springDatasourcePassword = "1234";
        String springDatasourceDriverClassName = "com.mysql.cj.jdbc.Driver";
        String springJpaHibernateDialect = "org.hibernate.dialect.MySQL5Dialect";
        boolean springJpaShowSql = true;
        String springJpaHibernateDdlAuto = "update";
        int serverPort = 8081;
        boolean debug = true;

        System.out.println("spring.datasource.url=" + springDatasourceUrl);
        System.out.println("spring.datasource.username=" + springDatasourceUsername);
        System.out.println("spring.datasource.password=" + springDatasourcePassword);
        System.out.println("spring.datasource.driver-class-name=" + springDatasourceDriverClassName);
        System.out.println("spring.jpa.properties.hibernate.dialect=" + springJpaHibernateDialect);
        System.out.println("spring.jpa.show-sql=" + springJpaShowSql);
        System.out.println("spring.jpa.hibernate.ddl-auto=" + springJpaHibernateDdlAuto);
        System.out.println("server.port=" + serverPort);
        System.out.println("debug=" + debug);
    }
}
