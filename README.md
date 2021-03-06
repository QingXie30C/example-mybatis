# example-mybatis
## MyBatis 基础练习学习

### 使用mysql 数据库

>pom.xml
```
  <dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.6</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.23</version>
</dependency>
```
>mysql table users

```
   CREATE TABLE `users` (
     `username` varchar(50) COLLATE utf8mb4_bin NOT NULL,
     `password` varchar(50) COLLATE utf8mb4_bin NOT NULL,
     `enabled` tinyint(1) NOT NULL,
     `id` bigint(20) NOT NULL AUTO_INCREMENT,
     PRIMARY KEY (`id`)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin

```

### configuration
> 部分配置
```
   <properties>
        <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/springsecuritydb"/>
        <property name="username" value="springsecurity"/>
        <property name="password" value="123456"/>
    </properties>
    <settings>
        <setting name="logImpl" value="LOG4J"/>
        <setting name="cacheEnabled" value="true"/>
    </settings>
    <environments default="development">
        <environment id="development">
            <transactionManager type="JDBC"/>
            <dataSource type="POOLED">
                <property name="driver" value="${driver}"/>
                <property name="url" value="${url}"/>
                <property name="username" value="${username}"/>
                <property name="password" value="${password}"/>
            </dataSource>
        </environment>
    </environments>
    <mappers>
        <mapper resource="mapper/Usermapper.xml"/>
    </mappers>

```

### SqlSession

```
    见实例代码

```


