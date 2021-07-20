module infrastructure {
    requires org.slf4j;
    requires lombok;
    requires application;
    requires domain;
    requires java.sql;

    exports infrastructure;
}