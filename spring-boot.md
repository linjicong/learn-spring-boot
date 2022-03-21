###server.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties
源类型:org.springframework.boot.autoconfigure.web.ServerProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.jooq.xx
类型:org.springframework.boot.autoconfigure.jooq.JooqProperties
源类型:org.springframework.boot.autoconfigure.jooq.JooqProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| sql-dialect | org.jooq.SQLDialect | SQL dialect to use. Auto-detected by default. |  |  | 
###spring.jdbc.template.xx
类型:org.springframework.boot.autoconfigure.jdbc.JdbcProperties$Template
源类型:org.springframework.boot.autoconfigure.jdbc.JdbcProperties$Template

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.sql.init.xx
类型:org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties
源类型:org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| continue-on-error | java.lang.Boolean | Whether initialization should continue when an error occurs. | false |  | 
| data-locations | java.util.List<java.lang.String> | Locations of the data (DML) scripts to apply to the database. |  |  | 
| encoding | java.nio.charset.Charset | Encoding of the schema and data scripts. |  |  | 
| mode | org.springframework.boot.sql.init.DatabaseInitializationMode | Mode to apply when determining whether initialization should be performed. | embedded |  | 
| password | java.lang.String | Password of the database to use when applying initialization scripts (if different). |  |  | 
| platform | java.lang.String | Platform to use in the default schema or data script locations, schema-${platform}.sql and data-${platform}.sql. | all |  | 
| schema-locations | java.util.List<java.lang.String> | Locations of the schema (DDL) scripts to apply to the database. |  |  | 
| separator | java.lang.String | Statement separator in the schema and data scripts. | ; |  | 
| username | java.lang.String | Username of the database to use when applying initialization scripts (if different). |  |  | 
###spring.task.scheduling.shutdown.xx
类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Shutdown
源类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Shutdown

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | scheduling- |  | 
###spring.web.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties
源类型:org.springframework.boot.autoconfigure.web.WebProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| locale | java.util.Locale | Locale to use. By default, this locale is overridden by the "Accept-Language" header. |  |  | 
| locale-resolver | org.springframework.boot.autoconfigure.web.WebProperties$LocaleResolver | Define how the locale should be resolved. | accept-header |  | 
###spring.web.resources.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| locale | java.util.Locale | Locale to use. By default, this locale is overridden by the "Accept-Language" header. |  |  | 
| locale-resolver | org.springframework.boot.autoconfigure.web.WebProperties$LocaleResolver | Define how the locale should be resolved. | accept-header |  | 
###server.tomcat.resource.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Resource
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Resource

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| accept-count | java.lang.Integer | Maximum queue length for incoming connection requests when all possible request processing threads are in use. | 100 |  | 
| additional-tld-skip-patterns | java.util.List<java.lang.String> | Comma-separated list of additional patterns that match jars to ignore for TLD scanning. The special '?' and '*' characters can be used in the pattern to match one and only one character and zero or more characters respectively. |  |  | 
| background-processor-delay | java.time.Duration | Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used. | 10s |  | 
| basedir | java.io.File | Tomcat base directory. If not specified, a temporary directory is used. |  |  | 
| connection-timeout | java.time.Duration | Amount of time the connector will wait, after accepting a connection, for the request URI line to be presented. |  |  | 
| keep-alive-timeout | java.time.Duration | Time to wait for another HTTP request before the connection is closed. When not set the connectionTimeout is used. When set to -1 there will be no timeout. |  |  | 
| max-connections | java.lang.Integer | Maximum number of connections that the server accepts and processes at any given time. Once the limit has been reached, the operating system may still accept connections based on the "acceptCount" property. | 8192 |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 2MB |  | 
| max-keep-alive-requests | java.lang.Integer | Maximum number of HTTP requests that can be pipelined before the connection is closed. When set to 0 or 1, keep-alive and pipelining are disabled. When set to -1, an unlimited number of pipelined or keep-alive requests are allowed. | 100 |  | 
| max-swallow-size | org.springframework.util.unit.DataSize | Maximum amount of request body to swallow. | 2MB |  | 
| processor-cache | java.lang.Integer | Maximum number of idle processors that will be retained in the cache and reused with a subsequent request. When set to -1 the cache will be unlimited with a theoretical maximum size equal to the maximum number of connections. | 200 |  | 
| redirect-context-root | java.lang.Boolean | Whether requests to the context root should be redirected by appending a / to the path. When using SSL terminated at a proxy, this property should be set to false. | true |  | 
| reject-illegal-header | java.lang.Boolean | Whether to reject requests with illegal header names or values. | true |  | 
| relaxed-path-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI paths. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| relaxed-query-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI query strings. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| uri-encoding | java.nio.charset.Charset | Character encoding to use to decode the URI. | UTF-8 |  | 
| use-relative-redirects | java.lang.Boolean | Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects. | false |  | 
###spring.data.web.sort.xx
类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Sort
源类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Sort

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.integration.rsocket.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.elasticsearch.restclient.xx
类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties
源类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.cache.caffeine.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Caffeine
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Caffeine

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.redis.jedis.pool.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.netty.xx
类型:org.springframework.boot.autoconfigure.netty.NettyProperties
源类型:org.springframework.boot.autoconfigure.netty.NettyProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| leak-detection | org.springframework.boot.autoconfigure.netty.NettyProperties$LeakDetection | Level of leak detection for reference-counted buffers. | simple |  | 
###spring.web.resources.chain.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| add-mappings | java.lang.Boolean | Whether to enable default resource handling. | true |  | 
| static-locations | java.lang.String[] | Locations of static resources. Defaults to classpath:[/META-INF/resources/, /resources/, /static/, /public/]. | ["classpath:/META-INF/resources/","classpath:/resources/","classpath:/static/","classpath:/public/"] |  | 
###spring.kafka.security.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.kafka.consumer.security.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| auto-commit-interval | java.time.Duration | Frequency with which the consumer offsets are auto-committed to Kafka if 'enable.auto.commit' is set to true. |  |  | 
| auto-offset-reset | java.lang.String | What to do when there is no initial offset in Kafka or if the current offset no longer exists on the server. |  |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for consumers. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| enable-auto-commit | java.lang.Boolean | Whether the consumer's offset is periodically committed in the background. |  |  | 
| fetch-max-wait | java.time.Duration | Maximum amount of time the server blocks before answering the fetch request if there isn't sufficient data to immediately satisfy the requirement given by "fetch-min-size". |  |  | 
| fetch-min-size | org.springframework.util.unit.DataSize | Minimum amount of data the server should return for a fetch request. |  |  | 
| group-id | java.lang.String | Unique string that identifies the consumer group to which this consumer belongs. |  |  | 
| heartbeat-interval | java.time.Duration | Expected time between heartbeats to the consumer coordinator. |  |  | 
| isolation-level | org.springframework.boot.autoconfigure.kafka.KafkaProperties$IsolationLevel | Isolation level for reading messages that have been written transactionally. | read-uncommitted |  | 
| key-deserializer | java.lang.Class<?> | Deserializer class for keys. |  |  | 
| max-poll-records | java.lang.Integer | Maximum number of records returned in a single call to poll(). |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional consumer-specific properties used to configure the client. |  |  | 
| value-deserializer | java.lang.Class<?> | Deserializer class for values. |  |  | 
###spring.mongodb.embedded.xx
类型:org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties
源类型:org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| features | java.util.Set<de.flapdoodle.embed.mongo.distribution.Feature> | Comma-separated list of features to enable. Uses the defaults of the configured version by default. | ["sync_delay"] |  | 
| version | java.lang.String | Version of Mongo to use. |  |  | 
###spring.mvc.servlet.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Servlet
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###spring.mail.xx
类型:org.springframework.boot.autoconfigure.mail.MailProperties
源类型:org.springframework.boot.autoconfigure.mail.MailProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| default-encoding | java.nio.charset.Charset | Default MimeMessage encoding. | UTF-8 |  | 
| host | java.lang.String | SMTP server host. For instance, 'smtp.example.com'. |  |  | 
| jndi-name | java.lang.String | Session JNDI name. When set, takes precedence over other Session settings. |  |  | 
| password | java.lang.String | Login password of the SMTP server. |  |  | 
| port | java.lang.Integer | SMTP server port. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional JavaMail Session properties. |  |  | 
| protocol | java.lang.String | Protocol used by the SMTP server. | smtp |  | 
| test-connection | java.lang.Boolean | Whether to test that the mail server is available on startup. | false |  | 
| username | java.lang.String | Login user of the SMTP server. |  |  | 
###spring.kafka.jaas.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Jaas
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Jaas

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.webflux.format.xx
类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Format
源类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Format

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-path | java.lang.String | Base path for all web handlers. |  |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
###spring.r2dbc.pool.xx
类型:org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties$Pool
源类型:org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| generate-unique-name | java.lang.Boolean | Whether to generate a random database name. Ignore any configured name when enabled. | false |  | 
| name | java.lang.String | Database name. Set if no name is specified in the url. Default to "testdb" when using an embedded database. |  |  | 
| password | java.lang.String | Login password of the database. Set if no password is specified in the url. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional R2DBC options. |  |  | 
| url | java.lang.String | R2DBC URL of the database. database name, username, password and pooling options specified in the url take precedence over individual options. |  |  | 
| username | java.lang.String | Login username of the database. Set if no username is specified in the url. |  |  | 
###spring.kafka.admin.security.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| fail-fast | java.lang.Boolean | Whether to fail fast if the broker is not available on startup. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional admin-specific properties used to configure the client. |  |  | 
###server.http2.xx
类型:org.springframework.boot.web.server.Http2
源类型:org.springframework.boot.web.server.Http2

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.datasource.xx
类型:org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
源类型:org.springframework.boot.autoconfigure.jdbc.DataSourceProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| driver-class-name | java.lang.String | Fully qualified name of the JDBC driver. Auto-detected based on the URL by default. |  |  | 
| embedded-database-connection | org.springframework.boot.jdbc.EmbeddedDatabaseConnection | Connection details for an embedded database. Defaults to the most suitable embedded database that is available on the classpath. |  |  | 
| generate-unique-name | java.lang.Boolean | Whether to generate a random datasource name. | true |  | 
| jndi-name | java.lang.String | JNDI location of the datasource. Class, url, username and password are ignored when set. |  |  | 
| name | java.lang.String | Datasource name to use if "generate-unique-name" is false. Defaults to "testdb" when using an embedded database, otherwise null. |  |  | 
| password | java.lang.String | Login password of the database. |  |  | 
| type | java.lang.Class<? extends javax.sql.DataSource> | Fully qualified name of the connection pool implementation to use. By default, it is auto-detected from the classpath. |  |  | 
| url | java.lang.String | JDBC URL of the database. |  |  | 
| username | java.lang.String | Login username of the database. |  |  | 
| continue-on-error | java.lang.Boolean | Whether to stop if an error occurs while initializing the database. | false | true,spring.sql.init.continue-on-error,null | 
| data | java.util.List<java.lang.String> | Data (DML) script resource references. |  | true,spring.sql.init.data-locations,null | 
| data-password | java.lang.String | Password of the database to execute DML scripts (if different). |  | true,spring.sql.init.password,null | 
| data-username | java.lang.String | Username of the database to execute DML scripts (if different). |  | true,spring.sql.init.username,null | 
| initialization-mode | org.springframework.boot.jdbc.DataSourceInitializationMode | Mode to apply when determining if DataSource initialization should be performed using the available DDL and DML scripts. | embedded | true,spring.sql.init.mode,null | 
| platform | java.lang.String | Platform to use in the DDL or DML scripts (such as schema-${platform}.sql or data-${platform}.sql). | all | true,spring.sql.init.platform,null | 
| schema | java.util.List<java.lang.String> | Schema (DDL) script resource references. |  | true,spring.sql.init.schema-locations,null | 
| schema-password | java.lang.String | Password of the database to execute DDL scripts (if different). |  | true,spring.sql.init.password,null | 
| schema-username | java.lang.String | Username of the database to execute DDL scripts (if different). |  | true,spring.sql.init.username,null | 
| separator | java.lang.String | Statement separator in SQL initialization scripts. | ; | true,spring.sql.init.separator,null | 
| sql-script-encoding | java.nio.charset.Charset | SQL scripts encoding. |  | true,spring.sql.init.encoding,null | 
###spring.batch.xx
类型:org.springframework.boot.autoconfigure.batch.BatchProperties
源类型:org.springframework.boot.autoconfigure.batch.BatchProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | null | embedded | true,spring.batch.jdbc.initialize-schema,null | 
| schema | java.lang.String | null |  | true,spring.batch.jdbc.schema,null | 
| table-prefix | java.lang.String | null |  | true,spring.batch.jdbc.table-prefix,null | 
###spring.batch.jdbc.xx
类型:org.springframework.boot.autoconfigure.batch.BatchProperties$Jdbc
源类型:org.springframework.boot.autoconfigure.batch.BatchProperties$Jdbc

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | null | embedded | true,spring.batch.jdbc.initialize-schema,null | 
| schema | java.lang.String | null |  | true,spring.batch.jdbc.schema,null | 
| table-prefix | java.lang.String | null |  | true,spring.batch.jdbc.table-prefix,null | 
###spring.couchbase.env.io.xx
类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Io
源类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Io

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.kafka.consumer.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Consumer
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Consumer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.webflux.session.cookie.xx
类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Cookie
源类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Cookie

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.task.scheduling.xx
类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties
源类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | scheduling- |  | 
###spring.ldap.template.xx
类型:org.springframework.boot.autoconfigure.ldap.LdapProperties$Template
源类型:org.springframework.boot.autoconfigure.ldap.LdapProperties$Template

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| anonymous-read-only | java.lang.Boolean | Whether read-only operations should use an anonymous environment. Disabled by default unless a username is set. |  |  | 
| base | java.lang.String | Base suffix from which all operations should originate. |  |  | 
| base-environment | java.util.Map<java.lang.String,java.lang.String> | LDAP specification settings. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| urls | java.lang.String[] | LDAP URLs of the server. |  |  | 
| username | java.lang.String | Login username of the server. |  |  | 
###spring.mvc.contentnegotiation.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Contentnegotiation
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Contentnegotiation

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###spring.rabbitmq.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###spring.security.oauth2.resourceserver.opaquetoken.xx
类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Opaquetoken
源类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Opaquetoken

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###server.tomcat.accesslog.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Accesslog
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Accesslog

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| accept-count | java.lang.Integer | Maximum queue length for incoming connection requests when all possible request processing threads are in use. | 100 |  | 
| additional-tld-skip-patterns | java.util.List<java.lang.String> | Comma-separated list of additional patterns that match jars to ignore for TLD scanning. The special '?' and '*' characters can be used in the pattern to match one and only one character and zero or more characters respectively. |  |  | 
| background-processor-delay | java.time.Duration | Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used. | 10s |  | 
| basedir | java.io.File | Tomcat base directory. If not specified, a temporary directory is used. |  |  | 
| connection-timeout | java.time.Duration | Amount of time the connector will wait, after accepting a connection, for the request URI line to be presented. |  |  | 
| keep-alive-timeout | java.time.Duration | Time to wait for another HTTP request before the connection is closed. When not set the connectionTimeout is used. When set to -1 there will be no timeout. |  |  | 
| max-connections | java.lang.Integer | Maximum number of connections that the server accepts and processes at any given time. Once the limit has been reached, the operating system may still accept connections based on the "acceptCount" property. | 8192 |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 2MB |  | 
| max-keep-alive-requests | java.lang.Integer | Maximum number of HTTP requests that can be pipelined before the connection is closed. When set to 0 or 1, keep-alive and pipelining are disabled. When set to -1, an unlimited number of pipelined or keep-alive requests are allowed. | 100 |  | 
| max-swallow-size | org.springframework.util.unit.DataSize | Maximum amount of request body to swallow. | 2MB |  | 
| processor-cache | java.lang.Integer | Maximum number of idle processors that will be retained in the cache and reused with a subsequent request. When set to -1 the cache will be unlimited with a theoretical maximum size equal to the maximum number of connections. | 200 |  | 
| redirect-context-root | java.lang.Boolean | Whether requests to the context root should be redirected by appending a / to the path. When using SSL terminated at a proxy, this property should be set to false. | true |  | 
| reject-illegal-header | java.lang.Boolean | Whether to reject requests with illegal header names or values. | true |  | 
| relaxed-path-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI paths. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| relaxed-query-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI query strings. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| uri-encoding | java.nio.charset.Charset | Character encoding to use to decode the URI. | UTF-8 |  | 
| use-relative-redirects | java.lang.Boolean | Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects. | false |  | 
###spring.rabbitmq.template.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Template
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Template

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###spring.session.redis.xx
类型:org.springframework.boot.autoconfigure.session.RedisSessionProperties
源类型:org.springframework.boot.autoconfigure.session.RedisSessionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cleanup-cron | java.lang.String | Cron expression for expired session cleanup job. | 0 * * * * * |  | 
| configure-action | org.springframework.boot.autoconfigure.session.RedisSessionProperties$ConfigureAction | The configure action to apply when no user defined ConfigureRedisAction bean is present. | notify-keyspace-events |  | 
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| namespace | java.lang.String | Namespace for keys used to store sessions. | spring:session |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 
###spring.kafka.streams.cleanup.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Cleanup
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Cleanup

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-id | java.lang.String | Kafka streams application.id property; default spring.application.name. |  |  | 
| auto-startup | java.lang.Boolean | Whether or not to auto-start the streams factory bean. | true |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for streams. |  |  | 
| cache-max-size-buffering | org.springframework.util.unit.DataSize | Maximum memory size to be used for buffering across all threads. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Kafka properties used to configure the streams. |  |  | 
| replication-factor | java.lang.Integer | The replication factor for change log topics and repartition topics created by the stream processing application. |  |  | 
| state-dir | java.lang.String | Directory location for the state store. |  |  | 
###spring.mvc.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###server.servlet.session.cookie.xx
类型:org.springframework.boot.web.servlet.server.Session$Cookie
源类型:org.springframework.boot.web.servlet.server.Session$Cookie

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| persistent | java.lang.Boolean | Whether to persist session data between restarts. | false |  | 
| store-dir | java.io.File | Directory used to store session data. |  |  | 
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. | 30m |  | 
| tracking-modes | java.util.Set<org.springframework.boot.web.servlet.server.Session$SessionTrackingMode> | Session tracking modes. |  |  | 
###spring.mustache.xx
类型:org.springframework.boot.autoconfigure.mustache.MustacheProperties
源类型:org.springframework.boot.autoconfigure.mustache.MustacheProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-request-override | java.lang.Boolean | Whether HttpServletRequest attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| allow-session-override | java.lang.Boolean | Whether HttpSession attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| cache | java.lang.Boolean | Whether to enable template caching. | false |  | 
| charset | java.nio.charset.Charset | Template encoding. | UTF-8 |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| content-type | org.springframework.util.MimeType | Content-Type value. | text/html |  | 
| enabled | java.lang.Boolean | Whether to enable MVC view resolution for this technology. | true |  | 
| expose-request-attributes | java.lang.Boolean | Whether all request attributes should be added to the model prior to merging with the template. | false |  | 
| expose-session-attributes | java.lang.Boolean | Whether all HttpSession attributes should be added to the model prior to merging with the template. | false |  | 
| expose-spring-macro-helpers | java.lang.Boolean | Whether to expose a RequestContext for use by Spring's macro library, under the name "springMacroRequestContext". | true |  | 
| prefix | java.lang.String | Prefix to apply to template names. | classpath:/templates/ |  | 
| request-context-attribute | java.lang.String | Name of the RequestContext attribute for all views. |  |  | 
| suffix | java.lang.String | Suffix to apply to template names. | .mustache |  | 
| view-names | java.lang.String[] | View names that can be resolved. |  |  | 
###spring.redis.lettuce.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-name | java.lang.String | Client name to be set on connections with CLIENT SETNAME. |  |  | 
| client-type | org.springframework.boot.autoconfigure.data.redis.RedisProperties$ClientType | Type of client to use. By default, auto-detected according to the classpath. |  |  | 
| connect-timeout | java.time.Duration | Connection timeout. |  |  | 
| database | java.lang.Integer | Database index used by the connection factory. | 0 |  | 
| host | java.lang.String | Redis server host. | localhost |  | 
| password | java.lang.String | Login password of the redis server. |  |  | 
| port | java.lang.Integer | Redis server port. | 6379 |  | 
| ssl | java.lang.Boolean | Whether to enable SSL support. | false |  | 
| timeout | java.time.Duration | Read timeout. |  |  | 
| url | java.lang.String | Connection URL. Overrides host, port, and password. User is ignored. Example: redis://user:password@example.com:6379 |  |  | 
| username | java.lang.String | Login username of the redis server. |  |  | 
###spring.kafka.admin.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Admin
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Admin

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.kafka.template.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Template
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Template

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.activemq.packages.xx
类型:org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties$Packages
源类型:org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties$Packages

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | URL of the ActiveMQ broker. Auto-generated by default. |  |  | 
| close-timeout | java.time.Duration | Time to wait before considering a close complete. | 15s |  | 
| in-memory | java.lang.Boolean | Whether the default broker URL should be in memory. Ignored if an explicit broker has been specified. | true |  | 
| non-blocking-redelivery | java.lang.Boolean | Whether to stop message delivery before re-delivering messages from a rolled back transaction. This implies that message order is not preserved when this is enabled. | false |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| send-timeout | java.time.Duration | Time to wait on message sends for a response. Set it to 0 to wait forever. | 0ms |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
###server.netty.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Netty
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Netty

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###server.tomcat.mbeanregistry.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Mbeanregistry
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Mbeanregistry

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| accept-count | java.lang.Integer | Maximum queue length for incoming connection requests when all possible request processing threads are in use. | 100 |  | 
| additional-tld-skip-patterns | java.util.List<java.lang.String> | Comma-separated list of additional patterns that match jars to ignore for TLD scanning. The special '?' and '*' characters can be used in the pattern to match one and only one character and zero or more characters respectively. |  |  | 
| background-processor-delay | java.time.Duration | Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used. | 10s |  | 
| basedir | java.io.File | Tomcat base directory. If not specified, a temporary directory is used. |  |  | 
| connection-timeout | java.time.Duration | Amount of time the connector will wait, after accepting a connection, for the request URI line to be presented. |  |  | 
| keep-alive-timeout | java.time.Duration | Time to wait for another HTTP request before the connection is closed. When not set the connectionTimeout is used. When set to -1 there will be no timeout. |  |  | 
| max-connections | java.lang.Integer | Maximum number of connections that the server accepts and processes at any given time. Once the limit has been reached, the operating system may still accept connections based on the "acceptCount" property. | 8192 |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 2MB |  | 
| max-keep-alive-requests | java.lang.Integer | Maximum number of HTTP requests that can be pipelined before the connection is closed. When set to 0 or 1, keep-alive and pipelining are disabled. When set to -1, an unlimited number of pipelined or keep-alive requests are allowed. | 100 |  | 
| max-swallow-size | org.springframework.util.unit.DataSize | Maximum amount of request body to swallow. | 2MB |  | 
| processor-cache | java.lang.Integer | Maximum number of idle processors that will be retained in the cache and reused with a subsequent request. When set to -1 the cache will be unlimited with a theoretical maximum size equal to the maximum number of connections. | 200 |  | 
| redirect-context-root | java.lang.Boolean | Whether requests to the context root should be redirected by appending a / to the path. When using SSL terminated at a proxy, this property should be set to false. | true |  | 
| reject-illegal-header | java.lang.Boolean | Whether to reject requests with illegal header names or values. | true |  | 
| relaxed-path-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI paths. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| relaxed-query-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI query strings. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| uri-encoding | java.nio.charset.Charset | Character encoding to use to decode the URI. | UTF-8 |  | 
| use-relative-redirects | java.lang.Boolean | Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects. | false |  | 
###spring.web.resources.chain.strategy.content.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Content
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Content

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.elasticsearch.rest.sniffer.xx
类型:org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties$Sniffer
源类型:org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties$Sniffer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Connection timeout. | 1s | true,spring.elasticsearch.connection-timeout,null | 
| password | java.lang.String | Credentials password. |  | true,spring.elasticsearch.password,null | 
| read-timeout | java.time.Duration | Read timeout. | 30s | true,spring.elasticsearch.socket-timeout,null | 
| uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. | ["http://localhost:9200"] | true,spring.elasticsearch.uris,null | 
| username | java.lang.String | Credentials username. |  | true,spring.elasticsearch.username,null | 
###spring.webservices.servlet.xx
类型:org.springframework.boot.autoconfigure.webservices.WebServicesProperties$Servlet
源类型:org.springframework.boot.autoconfigure.webservices.WebServicesProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| path | java.lang.String | Path that serves as the base URI for the services. | /services |  | 
###spring.gson.xx
类型:org.springframework.boot.autoconfigure.gson.GsonProperties
源类型:org.springframework.boot.autoconfigure.gson.GsonProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| date-format | java.lang.String | Format to use when serializing Date objects. |  |  | 
| disable-html-escaping | java.lang.Boolean | Whether to disable the escaping of HTML characters such as '<', '>', etc. |  |  | 
| disable-inner-class-serialization | java.lang.Boolean | Whether to exclude inner classes during serialization. |  |  | 
| enable-complex-map-key-serialization | java.lang.Boolean | Whether to enable serialization of complex map keys (i.e. non-primitives). |  |  | 
| exclude-fields-without-expose-annotation | java.lang.Boolean | Whether to exclude all fields from consideration for serialization or deserialization that do not have the "Expose" annotation. |  |  | 
| field-naming-policy | com.google.gson.FieldNamingPolicy | Naming policy that should be applied to an object's field during serialization and deserialization. |  |  | 
| generate-non-executable-json | java.lang.Boolean | Whether to generate non executable JSON by prefixing the output with some special text. |  |  | 
| lenient | java.lang.Boolean | Whether to be lenient about parsing JSON that doesn't conform to RFC 4627. |  |  | 
| long-serialization-policy | com.google.gson.LongSerializationPolicy | Serialization policy for Long and long types. |  |  | 
| pretty-printing | java.lang.Boolean | Whether to output serialized JSON that fits in a page for pretty printing. |  |  | 
| serialize-nulls | java.lang.Boolean | Whether to serialize null fields. |  |  | 
###spring.codec.xx
类型:org.springframework.boot.autoconfigure.codec.CodecProperties
源类型:org.springframework.boot.autoconfigure.codec.CodecProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| log-request-details | java.lang.Boolean | Whether to log form data at DEBUG level, and headers at TRACE level. | false |  | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. This applies only to the auto-configured WebFlux server and WebClient instances. By default this is not set, in which case individual codec defaults apply. Most codecs are limited to 256K by default. |  |  | 
###spring.data.cassandra.pool.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Pool
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| compression | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Compression | Compression supported by the Cassandra binary protocol. | none |  | 
| config | org.springframework.core.io.Resource | Location of the configuration file to use. |  |  | 
| contact-points | java.util.List<java.lang.String> | Cluster node addresses in the form 'host:port', or a simple 'host' to use the configured port. | ["127.0.0.1:9042"] |  | 
| keyspace-name | java.lang.String | Keyspace name to use. |  |  | 
| local-datacenter | java.lang.String | Datacenter that is considered "local". Contact points should be from this datacenter. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| port | java.lang.Integer | Port to use if a contact point does not specify one. | 9042 |  | 
| schema-action | java.lang.String | Schema action to take at startup. | none |  | 
| session-name | java.lang.String | Name of the Cassandra session. |  |  | 
| ssl | java.lang.Boolean | Enable SSL support. | false |  | 
| username | java.lang.String | Login user of the server. |  |  | 
###spring.kafka.admin.ssl.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| fail-fast | java.lang.Boolean | Whether to fail fast if the broker is not available on startup. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional admin-specific properties used to configure the client. |  |  | 
###spring.integration.rsocket.server.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Server
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Server

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.lifecycle.xx
类型:org.springframework.boot.autoconfigure.context.LifecycleProperties
源类型:org.springframework.boot.autoconfigure.context.LifecycleProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| timeout-per-shutdown-phase | java.time.Duration | Timeout for the shutdown of any phase (group of SmartLifecycle beans with the same 'phase' value). | 30s |  | 
###spring.web.resources.chain.strategy.fixed.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Fixed
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Fixed

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.session.xx
类型:org.springframework.boot.autoconfigure.session.SessionProperties
源类型:org.springframework.boot.autoconfigure.session.SessionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| store-type | org.springframework.boot.autoconfigure.session.StoreType | Session store type. |  |  | 
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. |  |  | 
###spring.rsocket.server.xx
类型:org.springframework.boot.autoconfigure.rsocket.RSocketProperties$Server
源类型:org.springframework.boot.autoconfigure.rsocket.RSocketProperties$Server

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.cache.infinispan.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Infinispan
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Infinispan

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.security.oauth2.resourceserver.jwt.xx
类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Jwt
源类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Jwt

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.couchbase.xx
类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties
源类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-string | java.lang.String | Connection string used to locate the Couchbase cluster. |  |  | 
| password | java.lang.String | Cluster password. |  |  | 
| username | java.lang.String | Cluster username. |  |  | 
###spring.jersey.filter.xx
类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties$Filter
源类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties$Filter

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-path | java.lang.String | Path that serves as the base URI for the application. If specified, overrides the value of "@ApplicationPath". |  |  | 
| init | java.util.Map<java.lang.String,java.lang.String> | Init parameters to pass to Jersey through the servlet or filter. |  |  | 
| type | org.springframework.boot.autoconfigure.jersey.JerseyProperties$Type | Jersey integration type. | servlet |  | 
###spring.data.cassandra.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| compression | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Compression | Compression supported by the Cassandra binary protocol. | none |  | 
| config | org.springframework.core.io.Resource | Location of the configuration file to use. |  |  | 
| contact-points | java.util.List<java.lang.String> | Cluster node addresses in the form 'host:port', or a simple 'host' to use the configured port. | ["127.0.0.1:9042"] |  | 
| keyspace-name | java.lang.String | Keyspace name to use. |  |  | 
| local-datacenter | java.lang.String | Datacenter that is considered "local". Contact points should be from this datacenter. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| port | java.lang.Integer | Port to use if a contact point does not specify one. | 9042 |  | 
| schema-action | java.lang.String | Schema action to take at startup. | none |  | 
| session-name | java.lang.String | Name of the Cassandra session. |  |  | 
| ssl | java.lang.Boolean | Enable SSL support. | false |  | 
| username | java.lang.String | Login user of the server. |  |  | 
###spring.quartz.jdbc.xx
类型:org.springframework.boot.autoconfigure.quartz.QuartzProperties$Jdbc
源类型:org.springframework.boot.autoconfigure.quartz.QuartzProperties$Jdbc

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| auto-startup | java.lang.Boolean | Whether to automatically start the scheduler after initialization. | true |  | 
| job-store-type | org.springframework.boot.autoconfigure.quartz.JobStoreType | Quartz job store type. | memory |  | 
| overwrite-existing-jobs | java.lang.Boolean | Whether configured jobs should overwrite existing job definitions. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Quartz Scheduler properties. |  |  | 
| scheduler-name | java.lang.String | Name of the scheduler. | quartzScheduler |  | 
| startup-delay | java.time.Duration | Delay after which the scheduler is started once initialization completes. Setting this property makes sense if no jobs should be run before the entire application has started up. | 0s |  | 
| wait-for-jobs-to-complete-on-shutdown | java.lang.Boolean | Whether to wait for running jobs to complete on shutdown. | false |  | 
###spring.elasticsearch.webclient.xx
类型:org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientProperties
源类型:org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. |  |  | 
###spring.batch.job.xx
类型:org.springframework.boot.autoconfigure.batch.BatchProperties$Job
源类型:org.springframework.boot.autoconfigure.batch.BatchProperties$Job

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | null | embedded | true,spring.batch.jdbc.initialize-schema,null | 
| schema | java.lang.String | null |  | true,spring.batch.jdbc.schema,null | 
| table-prefix | java.lang.String | null |  | true,spring.batch.jdbc.table-prefix,null | 
###spring.session.mongodb.xx
类型:org.springframework.boot.autoconfigure.session.MongoSessionProperties
源类型:org.springframework.boot.autoconfigure.session.MongoSessionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| collection-name | java.lang.String | Collection name used to store sessions. | sessions |  | 
###spring.info.git.xx
类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Git
源类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Git

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.groovy.template.configuration.xx
类型:org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer
源类型:org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.redis.lettuce.pool.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| shutdown-timeout | java.time.Duration | Shutdown timeout. | 100ms |  | 
###spring.kafka.producer.ssl.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| acks | java.lang.String | Number of acknowledgments the producer requires the leader to have received before considering a request complete. |  |  | 
| batch-size | org.springframework.util.unit.DataSize | Default batch size. A small batch size will make batching less common and may reduce throughput (a batch size of zero disables batching entirely). |  |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for producers. |  |  | 
| buffer-memory | org.springframework.util.unit.DataSize | Total memory size the producer can use to buffer records waiting to be sent to the server. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| compression-type | java.lang.String | Compression type for all data generated by the producer. |  |  | 
| key-serializer | java.lang.Class<?> | Serializer class for keys. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional producer-specific properties used to configure the client. |  |  | 
| retries | java.lang.Integer | When greater than zero, enables retrying of failed sends. |  |  | 
| transaction-id-prefix | java.lang.String | When non empty, enables transaction support for producer. |  |  | 
| value-serializer | java.lang.Class<?> | Serializer class for values. |  |  | 
###spring.integration.management.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Management
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Management

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.kafka.streams.ssl.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-id | java.lang.String | Kafka streams application.id property; default spring.application.name. |  |  | 
| auto-startup | java.lang.Boolean | Whether or not to auto-start the streams factory bean. | true |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for streams. |  |  | 
| cache-max-size-buffering | org.springframework.util.unit.DataSize | Maximum memory size to be used for buffering across all threads. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Kafka properties used to configure the streams. |  |  | 
| replication-factor | java.lang.Integer | The replication factor for change log topics and repartition topics created by the stream processing application. |  |  | 
| state-dir | java.lang.String | Directory location for the state store. |  |  | 
###spring.session.servlet.xx
类型:org.springframework.boot.autoconfigure.session.SessionProperties$Servlet
源类型:org.springframework.boot.autoconfigure.session.SessionProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| store-type | org.springframework.boot.autoconfigure.session.StoreType | Session store type. |  |  | 
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. |  |  | 
###server.jetty.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.webservices.xx
类型:org.springframework.boot.autoconfigure.webservices.WebServicesProperties
源类型:org.springframework.boot.autoconfigure.webservices.WebServicesProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| path | java.lang.String | Path that serves as the base URI for the services. | /services |  | 
###spring.security.xx
类型:org.springframework.boot.autoconfigure.security.SecurityProperties
源类型:org.springframework.boot.autoconfigure.security.SecurityProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###server.jetty.accesslog.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Accesslog
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Accesslog

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-idle-timeout | java.time.Duration | Time that the connection can be idle before it is closed. |  |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 200000B |  | 
###spring.ldap.embedded.xx
类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties
源类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-dn | java.util.List<java.lang.String> | List of base DNs. |  |  | 
| ldif | java.lang.String | Schema (LDIF) script resource reference. | classpath:schema.ldif |  | 
| port | java.lang.Integer | Embedded LDAP port. | 0 |  | 
###spring.webflux.xx
类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties
源类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-path | java.lang.String | Base path for all web handlers. |  |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
###spring.couchbase.env.ssl.xx
类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Ssl
源类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.jms.xx
类型:org.springframework.boot.autoconfigure.jms.JmsProperties
源类型:org.springframework.boot.autoconfigure.jms.JmsProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| jndi-name | java.lang.String | Connection factory JNDI name. When set, takes precedence to others connection factory auto-configurations. |  |  | 
| pub-sub-domain | java.lang.Boolean | Whether the default destination type is topic. | false |  | 
###spring.freemarker.xx
类型:org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties
源类型:org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-request-override | java.lang.Boolean | Whether HttpServletRequest attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| allow-session-override | java.lang.Boolean | Whether HttpSession attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| cache | java.lang.Boolean | Whether to enable template caching. | false |  | 
| charset | java.nio.charset.Charset | Template encoding. | UTF-8 |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| content-type | org.springframework.util.MimeType | Content-Type value. | text/html |  | 
| enabled | java.lang.Boolean | Whether to enable MVC view resolution for this technology. | true |  | 
| expose-request-attributes | java.lang.Boolean | Whether all request attributes should be added to the model prior to merging with the template. | false |  | 
| expose-session-attributes | java.lang.Boolean | Whether all HttpSession attributes should be added to the model prior to merging with the template. | false |  | 
| expose-spring-macro-helpers | java.lang.Boolean | Whether to expose a RequestContext for use by Spring's macro library, under the name "springMacroRequestContext". | true |  | 
| prefer-file-system-access | java.lang.Boolean | Whether to prefer file system access for template loading to enable hot detection of template changes. When a template path is detected as a directory, templates are loaded from the directory only and other matching classpath locations will not be considered. | false |  | 
| prefix | java.lang.String | Prefix that gets prepended to view names when building a URL. |  |  | 
| request-context-attribute | java.lang.String | Name of the RequestContext attribute for all views. |  |  | 
| settings | java.util.Map<java.lang.String,java.lang.String> | Well-known FreeMarker keys which are passed to FreeMarker's Configuration. |  |  | 
| suffix | java.lang.String | Suffix that gets appended to view names when building a URL. | .ftlh |  | 
| template-loader-path | java.lang.String[] | Comma-separated list of template paths. | ["classpath:/templates/"] |  | 
| view-names | java.lang.String[] | View names that can be resolved. |  |  | 
###spring.liquibase.xx
类型:org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties
源类型:org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| change-log | java.lang.String | Change log configuration path. | classpath:/db/changelog/db.changelog-master.yaml |  | 
| clear-checksums | java.lang.Boolean | Whether to clear all checksums in the current changelog, so they will be recalculated upon the next update. | false |  | 
| contexts | java.lang.String | Comma-separated list of runtime contexts to use. |  |  | 
| database-change-log-lock-table | java.lang.String | Name of table to use for tracking concurrent Liquibase usage. | DATABASECHANGELOGLOCK |  | 
| database-change-log-table | java.lang.String | Name of table to use for tracking change history. | DATABASECHANGELOG |  | 
| default-schema | java.lang.String | Default database schema. |  |  | 
| driver-class-name | java.lang.String | Fully qualified name of the JDBC driver. Auto-detected based on the URL by default. |  |  | 
| drop-first | java.lang.Boolean | Whether to first drop the database schema. | false |  | 
| enabled | java.lang.Boolean | Whether to enable Liquibase support. | true |  | 
| labels | java.lang.String | Comma-separated list of runtime labels to use. |  |  | 
| liquibase-schema | java.lang.String | Schema to use for Liquibase objects. |  |  | 
| liquibase-tablespace | java.lang.String | Tablespace to use for Liquibase objects. |  |  | 
| parameters | java.util.Map<java.lang.String,java.lang.String> | Change log parameters. |  |  | 
| password | java.lang.String | Login password of the database to migrate. |  |  | 
| rollback-file | java.io.File | File to which rollback SQL is written when an update is performed. |  |  | 
| tag | java.lang.String | Tag name to use when applying database changes. Can also be used with "rollbackFile" to generate a rollback script for all existing changes associated with that tag. |  |  | 
| test-rollback-on-update | java.lang.Boolean | Whether rollback should be tested before update is performed. | false |  | 
| url | java.lang.String | JDBC URL of the database to migrate. If not set, the primary configured data source is used. |  |  | 
| user | java.lang.String | Login user of the database to migrate. |  |  | 
###server.undertow.threads.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Threads
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Threads

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-encoded-slash | java.lang.Boolean | Whether the server should decode percent encoded slash characters. Enabling encoded slashes can have security implications due to different servers interpreting the slash differently. Only enable this if you have a legacy application that requires it. | false |  | 
| always-set-keep-alive | java.lang.Boolean | Whether the 'Connection: keep-alive' header should be added to all responses, even if not required by the HTTP specification. | true |  | 
| buffer-size | org.springframework.util.unit.DataSize | Size of each buffer. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| decode-url | java.lang.Boolean | Whether the URL should be decoded. When disabled, percent-encoded characters in the URL will be left as-is. | true |  | 
| direct-buffers | java.lang.Boolean | Whether to allocate buffers outside the Java heap. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| eager-filter-init | java.lang.Boolean | Whether servlet filters should be initialized on startup. | true |  | 
| max-cookies | java.lang.Integer | Maximum number of cookies that are allowed. This limit exists to prevent hash collision based DOS attacks. | 200 |  | 
| max-headers | java.lang.Integer | Maximum number of headers that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| max-http-post-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP post content. When the value is -1, the default, the size is unlimited. | -1B |  | 
| max-parameters | java.lang.Integer | Maximum number of query or path parameters that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| no-request-timeout | java.time.Duration | Amount of time a connection can sit idle without processing a request, before it is closed by the server. |  |  | 
| preserve-path-on-forward | java.lang.Boolean | Whether to preserve the path of a request when it is forwarded. | false |  | 
| url-charset | java.nio.charset.Charset | Charset used to decode URLs. | UTF-8 |  | 
###spring.security.user.xx
类型:org.springframework.boot.autoconfigure.security.SecurityProperties$User
源类型:org.springframework.boot.autoconfigure.security.SecurityProperties$User

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.ldap.xx
类型:org.springframework.boot.autoconfigure.ldap.LdapProperties
源类型:org.springframework.boot.autoconfigure.ldap.LdapProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| anonymous-read-only | java.lang.Boolean | Whether read-only operations should use an anonymous environment. Disabled by default unless a username is set. |  |  | 
| base | java.lang.String | Base suffix from which all operations should originate. |  |  | 
| base-environment | java.util.Map<java.lang.String,java.lang.String> | LDAP specification settings. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| urls | java.lang.String[] | LDAP URLs of the server. |  |  | 
| username | java.lang.String | Login username of the server. |  |  | 
###spring.jpa.hibernate.xx
类型:org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties
源类型:org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| ddl-auto | java.lang.String | DDL mode. This is actually a shortcut for the "hibernate.hbm2ddl.auto" property. Defaults to "create-drop" when using an embedded database and no schema manager was detected. Otherwise, defaults to "none". |  |  | 
| use-new-id-generator-mappings | java.lang.Boolean | Whether to use Hibernate's newer IdentifierGenerator for AUTO, TABLE and SEQUENCE. This is actually a shortcut for the "hibernate.id.new_generator_mappings" property. When not specified will default to "true". |  |  | 
###spring.data.web.xx
类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties
源类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.r2dbc.xx
类型:org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties
源类型:org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| generate-unique-name | java.lang.Boolean | Whether to generate a random database name. Ignore any configured name when enabled. | false |  | 
| name | java.lang.String | Database name. Set if no name is specified in the url. Default to "testdb" when using an embedded database. |  |  | 
| password | java.lang.String | Login password of the database. Set if no password is specified in the url. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional R2DBC options. |  |  | 
| url | java.lang.String | R2DBC URL of the database. database name, username, password and pooling options specified in the url take precedence over individual options. |  |  | 
| username | java.lang.String | Login username of the database. Set if no username is specified in the url. |  |  | 
###spring.activemq.pool.xx
类型:org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties
源类型:org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | URL of the ActiveMQ broker. Auto-generated by default. |  |  | 
| close-timeout | java.time.Duration | Time to wait before considering a close complete. | 15s |  | 
| in-memory | java.lang.Boolean | Whether the default broker URL should be in memory. Ignored if an explicit broker has been specified. | true |  | 
| non-blocking-redelivery | java.lang.Boolean | Whether to stop message delivery before re-delivering messages from a rolled back transaction. This implies that message order is not preserved when this is enabled. | false |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| send-timeout | java.time.Duration | Time to wait on message sends for a response. Set it to 0 to wait forever. | 0ms |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
###spring.neo4j.security.xx
类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Security
源类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Timeout for borrowing connections from the pool. | 30s |  | 
| max-transaction-retry-time | java.time.Duration | Maximum time transactions are allowed to retry. | 30s |  | 
| uri | java.net.URI | URI used by the driver. | bolt://localhost:7687 |  | 
###spring.security.saml2.relyingparty.xx
类型:org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties
源类型:org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| registration | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties$Registration> | SAML2 relying party registrations. |  |  | 
###spring.hazelcast.xx
类型:org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties
源类型:org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| config | org.springframework.core.io.Resource | The location of the configuration file to use to initialize Hazelcast. |  |  | 
###spring.kafka.ssl.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.kafka.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.rabbitmq.listener.direct.retry.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| acknowledge-mode | org.springframework.amqp.core.AcknowledgeMode | Acknowledge mode of container. |  |  | 
| auto-startup | java.lang.Boolean | Whether to start the container automatically on startup. | true |  | 
| consumers-per-queue | java.lang.Integer | Number of consumers per queue. |  |  | 
| de-batching-enabled | java.lang.Boolean | Whether the container should present batched messages as discrete messages or call the listener with the batch. | true |  | 
| default-requeue-rejected | java.lang.Boolean | Whether rejected deliveries are re-queued by default. |  |  | 
| idle-event-interval | java.time.Duration | How often idle container events should be published. |  |  | 
| missing-queues-fatal | java.lang.Boolean | Whether to fail if the queues declared by the container are not available on the broker. | false |  | 
| prefetch | java.lang.Integer | Maximum number of unacknowledged messages that can be outstanding at each consumer. |  |  | 
###spring.security.filter.xx
类型:org.springframework.boot.autoconfigure.security.SecurityProperties$Filter
源类型:org.springframework.boot.autoconfigure.security.SecurityProperties$Filter

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.servlet.multipart.xx
类型:org.springframework.boot.autoconfigure.web.servlet.MultipartProperties
源类型:org.springframework.boot.autoconfigure.web.servlet.MultipartProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| enabled | java.lang.Boolean | Whether to enable support of multipart uploads. | true |  | 
| file-size-threshold | org.springframework.util.unit.DataSize | Threshold after which files are written to disk. | 0B |  | 
| location | java.lang.String | Intermediate location of uploaded files. |  |  | 
| max-file-size | org.springframework.util.unit.DataSize | Max file size. | 1MB |  | 
| max-request-size | org.springframework.util.unit.DataSize | Max request size. | 10MB |  | 
| resolve-lazily | java.lang.Boolean | Whether to resolve the multipart request lazily at the time of file or parameter access. | false |  | 
###spring.security.oauth2.client.xx
类型:org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties
源类型:org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| provider | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties$Provider> | OAuth provider details. |  |  | 
| registration | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties$Registration> | OAuth client registrations. |  |  | 
###spring.integration.error.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Error
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Error

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.task.execution.shutdown.xx
类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Shutdown
源类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Shutdown

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | task- |  | 
###spring.thymeleaf.xx
类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties
源类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache | java.lang.Boolean | Whether to enable template caching. | true |  | 
| check-template | java.lang.Boolean | Whether to check that the template exists before rendering it. | true |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| enable-spring-el-compiler | java.lang.Boolean | Enable the SpringEL compiler in SpringEL expressions. | false |  | 
| enabled | java.lang.Boolean | Whether to enable Thymeleaf view resolution for Web frameworks. | true |  | 
| encoding | java.nio.charset.Charset | Template files encoding. | UTF-8 |  | 
| excluded-view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that should be excluded from resolution. |  |  | 
| mode | java.lang.String | Template mode to be applied to templates. See also Thymeleaf's TemplateMode enum. | HTML |  | 
| prefix | java.lang.String | Prefix that gets prepended to view names when building a URL. | classpath:/templates/ |  | 
| render-hidden-markers-before-checkboxes | java.lang.Boolean | Whether hidden form inputs acting as markers for checkboxes should be rendered before the checkbox element itself. | false |  | 
| suffix | java.lang.String | Suffix that gets appended to view names when building a URL. | .html |  | 
| template-resolver-order | java.lang.Integer | Order of the template resolver in the chain. By default, the template resolver is first in the chain. Order start at 1 and should only be set if you have defined additional "TemplateResolver" beans. |  |  | 
| view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that can be resolved. |  |  | 
###spring.rabbitmq.listener.direct.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$DirectContainer
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$DirectContainer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| type | org.springframework.boot.autoconfigure.amqp.RabbitProperties$ContainerType | Listener container type. | simple |  | 
###spring.task.execution.pool.xx
类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Pool
源类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | task- |  | 
###spring.rabbitmq.cache.connection.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Connection
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Connection

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.elasticsearch.restclient.sniffer.xx
类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties$Sniffer
源类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties$Sniffer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.ldap.embedded.validation.xx
类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Validation
源类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Validation

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-dn | java.util.List<java.lang.String> | List of base DNs. |  |  | 
| ldif | java.lang.String | Schema (LDIF) script resource reference. | classpath:schema.ldif |  | 
| port | java.lang.Integer | Embedded LDAP port. | 0 |  | 
###spring.kafka.listener.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Listener
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Listener

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###server.servlet.jsp.xx
类型:org.springframework.boot.web.servlet.server.Jsp
源类型:org.springframework.boot.web.servlet.server.Jsp

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-display-name | java.lang.String | Display name of the application. | application |  | 
| context-parameters | java.util.Map<java.lang.String,java.lang.String> | Servlet context init parameters. |  |  | 
| context-path | java.lang.String | Context path of the application. |  |  | 
| register-default-servlet | java.lang.Boolean | Whether to register the default Servlet with the container. | false |  | 
###spring.data.couchbase.xx
类型:org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataProperties
源类型:org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| auto-index | java.lang.Boolean | Automatically create views and indexes. Use the meta-data provided by "@ViewIndexed", "@N1qlPrimaryIndexed" and "@N1qlSecondaryIndexed". | false |  | 
| bucket-name | java.lang.String | Name of the bucket to connect to. |  |  | 
| field-naming-strategy | java.lang.Class<?> | Fully qualified name of the FieldNamingStrategy to use. |  |  | 
| scope-name | java.lang.String | Name of the scope used for all collection access. |  |  | 
| type-key | java.lang.String | Name of the field that stores the type information for complex types when using "MappingCouchbaseConverter". | _class |  | 
###spring.jdbc.xx
类型:org.springframework.boot.autoconfigure.jdbc.JdbcProperties
源类型:org.springframework.boot.autoconfigure.jdbc.JdbcProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###server.undertow.accesslog.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Accesslog
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Accesslog

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-encoded-slash | java.lang.Boolean | Whether the server should decode percent encoded slash characters. Enabling encoded slashes can have security implications due to different servers interpreting the slash differently. Only enable this if you have a legacy application that requires it. | false |  | 
| always-set-keep-alive | java.lang.Boolean | Whether the 'Connection: keep-alive' header should be added to all responses, even if not required by the HTTP specification. | true |  | 
| buffer-size | org.springframework.util.unit.DataSize | Size of each buffer. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| decode-url | java.lang.Boolean | Whether the URL should be decoded. When disabled, percent-encoded characters in the URL will be left as-is. | true |  | 
| direct-buffers | java.lang.Boolean | Whether to allocate buffers outside the Java heap. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| eager-filter-init | java.lang.Boolean | Whether servlet filters should be initialized on startup. | true |  | 
| max-cookies | java.lang.Integer | Maximum number of cookies that are allowed. This limit exists to prevent hash collision based DOS attacks. | 200 |  | 
| max-headers | java.lang.Integer | Maximum number of headers that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| max-http-post-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP post content. When the value is -1, the default, the size is unlimited. | -1B |  | 
| max-parameters | java.lang.Integer | Maximum number of query or path parameters that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| no-request-timeout | java.time.Duration | Amount of time a connection can sit idle without processing a request, before it is closed by the server. |  |  | 
| preserve-path-on-forward | java.lang.Boolean | Whether to preserve the path of a request when it is forwarded. | false |  | 
| url-charset | java.nio.charset.Charset | Charset used to decode URLs. | UTF-8 |  | 
###spring.rabbitmq.ssl.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Ssl
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###spring.webflux.session.xx
类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Session
源类型:org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Session

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-path | java.lang.String | Base path for all web handlers. |  |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
###server.reactive.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Reactive
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Reactive

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.jpa.hibernate.naming.xx
类型:org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties$Naming
源类型:org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties$Naming

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| ddl-auto | java.lang.String | DDL mode. This is actually a shortcut for the "hibernate.hbm2ddl.auto" property. Defaults to "create-drop" when using an embedded database and no schema manager was detected. Otherwise, defaults to "none". |  |  | 
| use-new-id-generator-mappings | java.lang.Boolean | Whether to use Hibernate's newer IdentifierGenerator for AUTO, TABLE and SEQUENCE. This is actually a shortcut for the "hibernate.id.new_generator_mappings" property. When not specified will default to "true". |  |  | 
###server.reactive.session.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Reactive$Session
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Reactive$Session

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.data.cassandra.connection.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Connection
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Connection

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| compression | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Compression | Compression supported by the Cassandra binary protocol. | none |  | 
| config | org.springframework.core.io.Resource | Location of the configuration file to use. |  |  | 
| contact-points | java.util.List<java.lang.String> | Cluster node addresses in the form 'host:port', or a simple 'host' to use the configured port. | ["127.0.0.1:9042"] |  | 
| keyspace-name | java.lang.String | Keyspace name to use. |  |  | 
| local-datacenter | java.lang.String | Datacenter that is considered "local". Contact points should be from this datacenter. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| port | java.lang.Integer | Port to use if a contact point does not specify one. | 9042 |  | 
| schema-action | java.lang.String | Schema action to take at startup. | none |  | 
| session-name | java.lang.String | Name of the Cassandra session. |  |  | 
| ssl | java.lang.Boolean | Enable SSL support. | false |  | 
| username | java.lang.String | Login user of the server. |  |  | 
###spring.neo4j.xx
类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties
源类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Timeout for borrowing connections from the pool. | 30s |  | 
| max-transaction-retry-time | java.time.Duration | Maximum time transactions are allowed to retry. | 30s |  | 
| uri | java.net.URI | URI used by the driver. | bolt://localhost:7687 |  | 
###server.servlet.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Servlet
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.datasource.hikari.xx
类型:com.zaxxer.hikari.HikariDataSource
源类型:com.zaxxer.hikari.HikariDataSource

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.session.jdbc.xx
类型:org.springframework.boot.autoconfigure.session.JdbcSessionProperties
源类型:org.springframework.boot.autoconfigure.session.JdbcSessionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cleanup-cron | java.lang.String | Cron expression for expired session cleanup job. | 0 * * * * * |  | 
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | Database schema initialization mode. | embedded |  | 
| platform | java.lang.String | Platform to use in initialization scripts if the @@platform@@ placeholder is used. Auto-detected by default. |  |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 
| schema | java.lang.String | Path to the SQL file to use to initialize the database schema. | classpath:org/springframework/session/jdbc/schema-@@platform@@.sql |  | 
| table-name | java.lang.String | Name of the database table used to store sessions. | SPRING_SESSION |  | 
###spring.artemis.embedded.xx
类型:org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties$Embedded
源类型:org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties$Embedded

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | Artemis broker port. | tcp://localhost:61616 |  | 
| mode | org.springframework.boot.autoconfigure.jms.artemis.ArtemisMode | Artemis deployment mode, auto-detected by default. |  |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
| host | java.lang.String | Artemis broker host. |  | true,spring.artemis.broker-url,null | 
| port | java.lang.Integer | Artemis broker port. | 61616 | true,spring.artemis.broker-url,null | 
###spring.rabbitmq.stream.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Stream
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Stream

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###server.ssl.xx
类型:org.springframework.boot.web.server.Ssl
源类型:org.springframework.boot.web.server.Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###server.tomcat.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###server.servlet.encoding.xx
类型:org.springframework.boot.web.servlet.server.Encoding
源类型:org.springframework.boot.web.servlet.server.Encoding

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-display-name | java.lang.String | Display name of the application. | application |  | 
| context-parameters | java.util.Map<java.lang.String,java.lang.String> | Servlet context init parameters. |  |  | 
| context-path | java.lang.String | Context path of the application. |  |  | 
| register-default-servlet | java.lang.Boolean | Whether to register the default Servlet with the container. | false |  | 
###spring.rabbitmq.listener.simple.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$SimpleContainer
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$SimpleContainer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| type | org.springframework.boot.autoconfigure.amqp.RabbitProperties$ContainerType | Listener container type. | simple |  | 
###spring.jta.xx
类型:org.springframework.boot.autoconfigure.transaction.jta.JtaProperties
源类型:org.springframework.boot.autoconfigure.transaction.jta.JtaProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| log-dir | java.lang.String | Transaction logs directory. |  |  | 
| transaction-manager-id | java.lang.String | Transaction manager unique identifier. |  |  | 
###spring.redis.cluster.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Cluster
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Cluster

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-name | java.lang.String | Client name to be set on connections with CLIENT SETNAME. |  |  | 
| client-type | org.springframework.boot.autoconfigure.data.redis.RedisProperties$ClientType | Type of client to use. By default, auto-detected according to the classpath. |  |  | 
| connect-timeout | java.time.Duration | Connection timeout. |  |  | 
| database | java.lang.Integer | Database index used by the connection factory. | 0 |  | 
| host | java.lang.String | Redis server host. | localhost |  | 
| password | java.lang.String | Login password of the redis server. |  |  | 
| port | java.lang.Integer | Redis server port. | 6379 |  | 
| ssl | java.lang.Boolean | Whether to enable SSL support. | false |  | 
| timeout | java.time.Duration | Read timeout. |  |  | 
| url | java.lang.String | Connection URL. Overrides host, port, and password. User is ignored. Example: redis://user:password@example.com:6379 |  |  | 
| username | java.lang.String | Login username of the redis server. |  |  | 
###spring.datasource.xa.xx
类型:org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$Xa
源类型:org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$Xa

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| driver-class-name | java.lang.String | Fully qualified name of the JDBC driver. Auto-detected based on the URL by default. |  |  | 
| embedded-database-connection | org.springframework.boot.jdbc.EmbeddedDatabaseConnection | Connection details for an embedded database. Defaults to the most suitable embedded database that is available on the classpath. |  |  | 
| generate-unique-name | java.lang.Boolean | Whether to generate a random datasource name. | true |  | 
| jndi-name | java.lang.String | JNDI location of the datasource. Class, url, username and password are ignored when set. |  |  | 
| name | java.lang.String | Datasource name to use if "generate-unique-name" is false. Defaults to "testdb" when using an embedded database, otherwise null. |  |  | 
| password | java.lang.String | Login password of the database. |  |  | 
| type | java.lang.Class<? extends javax.sql.DataSource> | Fully qualified name of the connection pool implementation to use. By default, it is auto-detected from the classpath. |  |  | 
| url | java.lang.String | JDBC URL of the database. |  |  | 
| username | java.lang.String | Login username of the database. |  |  | 
| continue-on-error | java.lang.Boolean | Whether to stop if an error occurs while initializing the database. | false | true,spring.sql.init.continue-on-error,null | 
| data | java.util.List<java.lang.String> | Data (DML) script resource references. |  | true,spring.sql.init.data-locations,null | 
| data-password | java.lang.String | Password of the database to execute DML scripts (if different). |  | true,spring.sql.init.password,null | 
| data-username | java.lang.String | Username of the database to execute DML scripts (if different). |  | true,spring.sql.init.username,null | 
| initialization-mode | org.springframework.boot.jdbc.DataSourceInitializationMode | Mode to apply when determining if DataSource initialization should be performed using the available DDL and DML scripts. | embedded | true,spring.sql.init.mode,null | 
| platform | java.lang.String | Platform to use in the DDL or DML scripts (such as schema-${platform}.sql or data-${platform}.sql). | all | true,spring.sql.init.platform,null | 
| schema | java.util.List<java.lang.String> | Schema (DDL) script resource references. |  | true,spring.sql.init.schema-locations,null | 
| schema-password | java.lang.String | Password of the database to execute DDL scripts (if different). |  | true,spring.sql.init.password,null | 
| schema-username | java.lang.String | Username of the database to execute DDL scripts (if different). |  | true,spring.sql.init.username,null | 
| separator | java.lang.String | Statement separator in SQL initialization scripts. | ; | true,spring.sql.init.separator,null | 
| sql-script-encoding | java.nio.charset.Charset | SQL scripts encoding. |  | true,spring.sql.init.encoding,null | 
###spring.mongodb.embedded.storage.xx
类型:org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties$Storage
源类型:org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties$Storage

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| features | java.util.Set<de.flapdoodle.embed.mongo.distribution.Feature> | Comma-separated list of features to enable. Uses the defaults of the configured version by default. | ["sync_delay"] |  | 
| version | java.lang.String | Version of Mongo to use. |  |  | 
###server.undertow.options.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Options
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Options

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-encoded-slash | java.lang.Boolean | Whether the server should decode percent encoded slash characters. Enabling encoded slashes can have security implications due to different servers interpreting the slash differently. Only enable this if you have a legacy application that requires it. | false |  | 
| always-set-keep-alive | java.lang.Boolean | Whether the 'Connection: keep-alive' header should be added to all responses, even if not required by the HTTP specification. | true |  | 
| buffer-size | org.springframework.util.unit.DataSize | Size of each buffer. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| decode-url | java.lang.Boolean | Whether the URL should be decoded. When disabled, percent-encoded characters in the URL will be left as-is. | true |  | 
| direct-buffers | java.lang.Boolean | Whether to allocate buffers outside the Java heap. The default is derived from the maximum amount of memory that is available to the JVM. |  |  | 
| eager-filter-init | java.lang.Boolean | Whether servlet filters should be initialized on startup. | true |  | 
| max-cookies | java.lang.Integer | Maximum number of cookies that are allowed. This limit exists to prevent hash collision based DOS attacks. | 200 |  | 
| max-headers | java.lang.Integer | Maximum number of headers that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| max-http-post-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP post content. When the value is -1, the default, the size is unlimited. | -1B |  | 
| max-parameters | java.lang.Integer | Maximum number of query or path parameters that are allowed. This limit exists to prevent hash collision based DOS attacks. |  |  | 
| no-request-timeout | java.time.Duration | Amount of time a connection can sit idle without processing a request, before it is closed by the server. |  |  | 
| preserve-path-on-forward | java.lang.Boolean | Whether to preserve the path of a request when it is forwarded. | false |  | 
| url-charset | java.nio.charset.Charset | Charset used to decode URLs. | UTF-8 |  | 
###spring.datasource.dbcp2.xx
类型:org.apache.commons.dbcp2.BasicDataSource
源类型:org.apache.commons.dbcp2.BasicDataSource

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.thymeleaf.servlet.xx
类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Servlet
源类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache | java.lang.Boolean | Whether to enable template caching. | true |  | 
| check-template | java.lang.Boolean | Whether to check that the template exists before rendering it. | true |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| enable-spring-el-compiler | java.lang.Boolean | Enable the SpringEL compiler in SpringEL expressions. | false |  | 
| enabled | java.lang.Boolean | Whether to enable Thymeleaf view resolution for Web frameworks. | true |  | 
| encoding | java.nio.charset.Charset | Template files encoding. | UTF-8 |  | 
| excluded-view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that should be excluded from resolution. |  |  | 
| mode | java.lang.String | Template mode to be applied to templates. See also Thymeleaf's TemplateMode enum. | HTML |  | 
| prefix | java.lang.String | Prefix that gets prepended to view names when building a URL. | classpath:/templates/ |  | 
| render-hidden-markers-before-checkboxes | java.lang.Boolean | Whether hidden form inputs acting as markers for checkboxes should be rendered before the checkbox element itself. | false |  | 
| suffix | java.lang.String | Suffix that gets appended to view names when building a URL. | .html |  | 
| template-resolver-order | java.lang.Integer | Order of the template resolver in the chain. By default, the template resolver is first in the chain. Order start at 1 and should only be set if you have defined additional "TemplateResolver" beans. |  |  | 
| view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that can be resolved. |  |  | 
###spring.kafka.streams.security.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-id | java.lang.String | Kafka streams application.id property; default spring.application.name. |  |  | 
| auto-startup | java.lang.Boolean | Whether or not to auto-start the streams factory bean. | true |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for streams. |  |  | 
| cache-max-size-buffering | org.springframework.util.unit.DataSize | Maximum memory size to be used for buffering across all threads. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Kafka properties used to configure the streams. |  |  | 
| replication-factor | java.lang.Integer | The replication factor for change log topics and repartition topics created by the stream processing application. |  |  | 
| state-dir | java.lang.String | Directory location for the state store. |  |  | 
###spring.neo4j.pool.xx
类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Pool
源类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Timeout for borrowing connections from the pool. | 30s |  | 
| max-transaction-retry-time | java.time.Duration | Maximum time transactions are allowed to retry. | 30s |  | 
| uri | java.net.URI | URI used by the driver. | bolt://localhost:7687 |  | 
###spring.mvc.format.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Format
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Format

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###server.undertow.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Undertow

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.integration.poller.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Poller
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Poller

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.jersey.xx
类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties
源类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-path | java.lang.String | Path that serves as the base URI for the application. If specified, overrides the value of "@ApplicationPath". |  |  | 
| init | java.util.Map<java.lang.String,java.lang.String> | Init parameters to pass to Jersey through the servlet or filter. |  |  | 
| type | org.springframework.boot.autoconfigure.jersey.JerseyProperties$Type | Jersey integration type. | servlet |  | 
###server.tomcat.threads.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Threads
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Threads

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| accept-count | java.lang.Integer | Maximum queue length for incoming connection requests when all possible request processing threads are in use. | 100 |  | 
| additional-tld-skip-patterns | java.util.List<java.lang.String> | Comma-separated list of additional patterns that match jars to ignore for TLD scanning. The special '?' and '*' characters can be used in the pattern to match one and only one character and zero or more characters respectively. |  |  | 
| background-processor-delay | java.time.Duration | Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used. | 10s |  | 
| basedir | java.io.File | Tomcat base directory. If not specified, a temporary directory is used. |  |  | 
| connection-timeout | java.time.Duration | Amount of time the connector will wait, after accepting a connection, for the request URI line to be presented. |  |  | 
| keep-alive-timeout | java.time.Duration | Time to wait for another HTTP request before the connection is closed. When not set the connectionTimeout is used. When set to -1 there will be no timeout. |  |  | 
| max-connections | java.lang.Integer | Maximum number of connections that the server accepts and processes at any given time. Once the limit has been reached, the operating system may still accept connections based on the "acceptCount" property. | 8192 |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 2MB |  | 
| max-keep-alive-requests | java.lang.Integer | Maximum number of HTTP requests that can be pipelined before the connection is closed. When set to 0 or 1, keep-alive and pipelining are disabled. When set to -1, an unlimited number of pipelined or keep-alive requests are allowed. | 100 |  | 
| max-swallow-size | org.springframework.util.unit.DataSize | Maximum amount of request body to swallow. | 2MB |  | 
| processor-cache | java.lang.Integer | Maximum number of idle processors that will be retained in the cache and reused with a subsequent request. When set to -1 the cache will be unlimited with a theoretical maximum size equal to the maximum number of connections. | 200 |  | 
| redirect-context-root | java.lang.Boolean | Whether requests to the context root should be redirected by appending a / to the path. When using SSL terminated at a proxy, this property should be set to false. | true |  | 
| reject-illegal-header | java.lang.Boolean | Whether to reject requests with illegal header names or values. | true |  | 
| relaxed-path-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI paths. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| relaxed-query-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI query strings. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| uri-encoding | java.nio.charset.Charset | Character encoding to use to decode the URI. | UTF-8 |  | 
| use-relative-redirects | java.lang.Boolean | Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects. | false |  | 
###spring.session.hazelcast.xx
类型:org.springframework.boot.autoconfigure.session.HazelcastSessionProperties
源类型:org.springframework.boot.autoconfigure.session.HazelcastSessionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| map-name | java.lang.String | Name of the map used to store sessions. | spring:session:sessions |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 
###spring.elasticsearch.xx
类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties
源类型:org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Connection timeout used when communicating with Elasticsearch. | 1s |  | 
| password | java.lang.String | Password for authentication with Elasticsearch. |  |  | 
| path-prefix | java.lang.String | Prefix added to the path of every request sent to Elasticsearch. |  |  | 
| socket-timeout | java.time.Duration | Socket timeout used when communicating with Elasticsearch. | 30s |  | 
| uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. | ["http://localhost:9200"] |  | 
| username | java.lang.String | Username for authentication with Elasticsearch. |  |  | 
###spring.web.resources.chain.strategy.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache | java.lang.Boolean | Whether to enable caching in the Resource chain. | true |  | 
| compressed | java.lang.Boolean | Whether to enable resolution of already compressed resources (gzip, brotli). Checks for a resource name with the '.gz' or '.br' file extensions. | false |  | 
| enabled | java.lang.Boolean | Whether to enable the Spring Resource Handling chain. By default, disabled unless at least one strategy has been enabled. |  |  | 
###server.tomcat.remoteip.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Remoteip
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Remoteip

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| accept-count | java.lang.Integer | Maximum queue length for incoming connection requests when all possible request processing threads are in use. | 100 |  | 
| additional-tld-skip-patterns | java.util.List<java.lang.String> | Comma-separated list of additional patterns that match jars to ignore for TLD scanning. The special '?' and '*' characters can be used in the pattern to match one and only one character and zero or more characters respectively. |  |  | 
| background-processor-delay | java.time.Duration | Delay between the invocation of backgroundProcess methods. If a duration suffix is not specified, seconds will be used. | 10s |  | 
| basedir | java.io.File | Tomcat base directory. If not specified, a temporary directory is used. |  |  | 
| connection-timeout | java.time.Duration | Amount of time the connector will wait, after accepting a connection, for the request URI line to be presented. |  |  | 
| keep-alive-timeout | java.time.Duration | Time to wait for another HTTP request before the connection is closed. When not set the connectionTimeout is used. When set to -1 there will be no timeout. |  |  | 
| max-connections | java.lang.Integer | Maximum number of connections that the server accepts and processes at any given time. Once the limit has been reached, the operating system may still accept connections based on the "acceptCount" property. | 8192 |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 2MB |  | 
| max-keep-alive-requests | java.lang.Integer | Maximum number of HTTP requests that can be pipelined before the connection is closed. When set to 0 or 1, keep-alive and pipelining are disabled. When set to -1, an unlimited number of pipelined or keep-alive requests are allowed. | 100 |  | 
| max-swallow-size | org.springframework.util.unit.DataSize | Maximum amount of request body to swallow. | 2MB |  | 
| processor-cache | java.lang.Integer | Maximum number of idle processors that will be retained in the cache and reused with a subsequent request. When set to -1 the cache will be unlimited with a theoretical maximum size equal to the maximum number of connections. | 200 |  | 
| redirect-context-root | java.lang.Boolean | Whether requests to the context root should be redirected by appending a / to the path. When using SSL terminated at a proxy, this property should be set to false. | true |  | 
| reject-illegal-header | java.lang.Boolean | Whether to reject requests with illegal header names or values. | true |  | 
| relaxed-path-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI paths. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| relaxed-query-chars | java.util.List<java.lang.Character> | Comma-separated list of additional unencoded characters that should be allowed in URI query strings. Only "< > [ \ ] ^ ` { | }" are allowed. |  |  | 
| uri-encoding | java.nio.charset.Charset | Character encoding to use to decode the URI. | UTF-8 |  | 
| use-relative-redirects | java.lang.Boolean | Whether HTTP 1.1 and later location headers generated by a call to sendRedirect will use relative or absolute redirects. | false |  | 
###spring.integration.rsocket.client.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Client
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Client

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.data.web.pageable.xx
类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Pageable
源类型:org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Pageable

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.integration.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.sendgrid.proxy.xx
类型:org.springframework.boot.autoconfigure.sendgrid.SendGridProperties$Proxy
源类型:org.springframework.boot.autoconfigure.sendgrid.SendGridProperties$Proxy

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| api-key | java.lang.String | SendGrid API key. |  |  | 
###spring.cache.couchbase.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Couchbase
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Couchbase

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.redis.lettuce.cluster.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| shutdown-timeout | java.time.Duration | Shutdown timeout. | 100ms |  | 
###server.jetty.threads.xx
类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Threads
源类型:org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Threads

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-idle-timeout | java.time.Duration | Time that the connection can be idle before it is closed. |  |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 200000B |  | 
###spring.messages.xx
类型:org.springframework.boot.autoconfigure.context.MessageSourceProperties
源类型:org.springframework.boot.autoconfigure.context.MessageSourceProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.jms.listener.xx
类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Listener
源类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Listener

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| jndi-name | java.lang.String | Connection factory JNDI name. When set, takes precedence to others connection factory auto-configurations. |  |  | 
| pub-sub-domain | java.lang.Boolean | Whether the default destination type is topic. | false |  | 
###spring.webflux.multipart.xx
类型:org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties
源类型:org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| file-storage-directory | java.lang.String | Directory used to store file parts larger than 'maxInMemorySize'. Default is a directory named 'spring-multipart' created under the system temporary directory. Ignored when streaming is enabled. |  |  | 
| headers-charset | java.nio.charset.Charset | Character set used to decode headers. | UTF-8 |  | 
| max-disk-usage-per-part | org.springframework.util.unit.DataSize | Maximum amount of disk space allowed per part. Default is -1 which enforces no limits. Ignored when streaming is enabled. | -1B |  | 
| max-headers-size | org.springframework.util.unit.DataSize | Maximum amount of memory allowed per headers section of each part. Set to -1 to enforce no limits. | 10KB |  | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Maximum amount of memory allowed per part before it's written to disk. Set to -1 to store all contents in memory. Ignored when streaming is enabled. | 256KB |  | 
| max-parts | java.lang.Integer | Maximum number of parts allowed in a given multipart request. Default is -1 which enforces no limits. | -1 |  | 
| streaming | java.lang.Boolean | Whether to stream directly from the parsed input buffer stream without storing in memory nor file. Default is non-streaming. | false |  | 
###spring.sendgrid.xx
类型:org.springframework.boot.autoconfigure.sendgrid.SendGridProperties
源类型:org.springframework.boot.autoconfigure.sendgrid.SendGridProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| api-key | java.lang.String | SendGrid API key. |  |  | 
###spring.influx.xx
类型:org.springframework.boot.autoconfigure.influx.InfluxDbProperties
源类型:org.springframework.boot.autoconfigure.influx.InfluxDbProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| password | java.lang.String | Login password. |  |  | 
| url | java.lang.String | URL of the InfluxDB instance to which to connect. |  |  | 
| user | java.lang.String | Login user. |  |  | 
###spring.redis.sentinel.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Sentinel
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Sentinel

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-name | java.lang.String | Client name to be set on connections with CLIENT SETNAME. |  |  | 
| client-type | org.springframework.boot.autoconfigure.data.redis.RedisProperties$ClientType | Type of client to use. By default, auto-detected according to the classpath. |  |  | 
| connect-timeout | java.time.Duration | Connection timeout. |  |  | 
| database | java.lang.Integer | Database index used by the connection factory. | 0 |  | 
| host | java.lang.String | Redis server host. | localhost |  | 
| password | java.lang.String | Login password of the redis server. |  |  | 
| port | java.lang.Integer | Redis server port. | 6379 |  | 
| ssl | java.lang.Boolean | Whether to enable SSL support. | false |  | 
| timeout | java.time.Duration | Read timeout. |  |  | 
| url | java.lang.String | Connection URL. Overrides host, port, and password. User is ignored. Example: redis://user:password@example.com:6379 |  |  | 
| username | java.lang.String | Login username of the redis server. |  |  | 
###spring.rsocket.server.ssl.xx
类型:org.springframework.boot.web.server.Ssl
源类型:org.springframework.boot.web.server.Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| fragment-size | org.springframework.util.unit.DataSize | Maximum transmission unit. Frames larger than the specified value are fragmented. |  |  | 
| mapping-path | java.lang.String | Path under which RSocket handles requests (only works with websocket transport). |  |  | 
| port | java.lang.Integer | Server port. |  |  | 
| transport | org.springframework.boot.rsocket.server.RSocketServer$Transport | RSocket transport protocol. | tcp |  | 
###spring.security.oauth2.resourceserver.xx
类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties
源类型:org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.task.execution.xx
类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties
源类型:org.springframework.boot.autoconfigure.task.TaskExecutionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | task- |  | 
###spring.info.build.xx
类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Build
源类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Build

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.integration.endpoint.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Endpoint
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Endpoint

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.web.resources.cache.cachecontrol.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache$Cachecontrol
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache$Cachecontrol

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| period | java.time.Duration | Cache period for the resources served by the resource handler. If a duration suffix is not specified, seconds will be used. Can be overridden by the 'spring.web.resources.cache.cachecontrol' properties. |  |  | 
| use-last-modified | java.lang.Boolean | Whether we should use the "lastModified" metadata of the files in HTTP caching headers. | true |  | 
###spring.jersey.servlet.xx
类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties$Servlet
源类型:org.springframework.boot.autoconfigure.jersey.JerseyProperties$Servlet

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-path | java.lang.String | Path that serves as the base URI for the application. If specified, overrides the value of "@ApplicationPath". |  |  | 
| init | java.util.Map<java.lang.String,java.lang.String> | Init parameters to pass to Jersey through the servlet or filter. |  |  | 
| type | org.springframework.boot.autoconfigure.jersey.JerseyProperties$Type | Jersey integration type. | servlet |  | 
###spring.cache.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.integration.channel.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Channel
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Channel

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.mvc.async.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Async
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Async

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###spring.groovy.template.xx
类型:org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateProperties
源类型:org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| allow-request-override | java.lang.Boolean | Whether HttpServletRequest attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| allow-session-override | java.lang.Boolean | Whether HttpSession attributes are allowed to override (hide) controller generated model attributes of the same name. | false |  | 
| cache | java.lang.Boolean | Whether to enable template caching. | false |  | 
| charset | java.nio.charset.Charset | Template encoding. | UTF-8 |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| content-type | org.springframework.util.MimeType | Content-Type value. | text/html |  | 
| enabled | java.lang.Boolean | Whether to enable MVC view resolution for this technology. | true |  | 
| expose-request-attributes | java.lang.Boolean | Whether all request attributes should be added to the model prior to merging with the template. | false |  | 
| expose-session-attributes | java.lang.Boolean | Whether all HttpSession attributes should be added to the model prior to merging with the template. | false |  | 
| expose-spring-macro-helpers | java.lang.Boolean | Whether to expose a RequestContext for use by Spring's macro library, under the name "springMacroRequestContext". | true |  | 
| prefix | java.lang.String | Prefix that gets prepended to view names when building a URL. |  |  | 
| request-context-attribute | java.lang.String | Name of the RequestContext attribute for all views. |  |  | 
| resource-loader-path | java.lang.String | Template path. | classpath:/templates/ |  | 
| suffix | java.lang.String | Suffix that gets appended to view names when building a URL. | .tpl |  | 
| view-names | java.lang.String[] | View names that can be resolved. |  |  | 
###spring.ldap.embedded.credential.xx
类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Credential
源类型:org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Credential

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-dn | java.util.List<java.lang.String> | List of base DNs. |  |  | 
| ldif | java.lang.String | Schema (LDIF) script resource reference. | classpath:schema.ldif |  | 
| port | java.lang.Integer | Embedded LDAP port. | 0 |  | 
###spring.h2.console.xx
类型:org.springframework.boot.autoconfigure.h2.H2ConsoleProperties
源类型:org.springframework.boot.autoconfigure.h2.H2ConsoleProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| enabled | java.lang.Boolean | Whether to enable the console. | false |  | 
| path | java.lang.String | Path at which the console is available. | /h2-console |  | 
###server.error.whitelabel.xx
类型:org.springframework.boot.autoconfigure.web.ErrorProperties$Whitelabel
源类型:org.springframework.boot.autoconfigure.web.ErrorProperties$Whitelabel

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| include-binding-errors | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include "errors" attribute. | never |  | 
| include-exception | java.lang.Boolean | Include the "exception" attribute. | false |  | 
| include-message | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include "message" attribute. | never |  | 
| include-stacktrace | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include the "trace" attribute. | never |  | 
| path | java.lang.String | Path of the error controller. | /error |  | 
###spring.hateoas.xx
类型:org.springframework.boot.autoconfigure.hateoas.HateoasProperties
源类型:org.springframework.boot.autoconfigure.hateoas.HateoasProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| use-hal-as-default-json-media-type | java.lang.Boolean | Whether application/hal+json responses should be sent to requests that accept application/json. | true |  | 
###spring.redis.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-name | java.lang.String | Client name to be set on connections with CLIENT SETNAME. |  |  | 
| client-type | org.springframework.boot.autoconfigure.data.redis.RedisProperties$ClientType | Type of client to use. By default, auto-detected according to the classpath. |  |  | 
| connect-timeout | java.time.Duration | Connection timeout. |  |  | 
| database | java.lang.Integer | Database index used by the connection factory. | 0 |  | 
| host | java.lang.String | Redis server host. | localhost |  | 
| password | java.lang.String | Login password of the redis server. |  |  | 
| port | java.lang.Integer | Redis server port. | 6379 |  | 
| ssl | java.lang.Boolean | Whether to enable SSL support. | false |  | 
| timeout | java.time.Duration | Read timeout. |  |  | 
| url | java.lang.String | Connection URL. Overrides host, port, and password. User is ignored. Example: redis://user:password@example.com:6379 |  |  | 
| username | java.lang.String | Login username of the redis server. |  |  | 
###spring.web.resources.cache.xx
类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache
源类型:org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| add-mappings | java.lang.Boolean | Whether to enable default resource handling. | true |  | 
| static-locations | java.lang.String[] | Locations of static resources. Defaults to classpath:[/META-INF/resources/, /resources/, /static/, /public/]. | ["classpath:/META-INF/resources/","classpath:/resources/","classpath:/static/","classpath:/public/"] |  | 
###spring.rabbitmq.cache.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###spring.rabbitmq.cache.channel.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Channel
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Channel

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.cache.redis.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Redis
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$Redis

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###server.compression.xx
类型:org.springframework.boot.web.server.Compression
源类型:org.springframework.boot.web.server.Compression

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.h2.console.settings.xx
类型:org.springframework.boot.autoconfigure.h2.H2ConsoleProperties$Settings
源类型:org.springframework.boot.autoconfigure.h2.H2ConsoleProperties$Settings

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| enabled | java.lang.Boolean | Whether to enable the console. | false |  | 
| path | java.lang.String | Path at which the console is available. | /h2-console |  | 
###spring.jackson.xx
类型:org.springframework.boot.autoconfigure.jackson.JacksonProperties
源类型:org.springframework.boot.autoconfigure.jackson.JacksonProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| constructor-detector | org.springframework.boot.autoconfigure.jackson.JacksonProperties$ConstructorDetectorStrategy | Strategy to use to auto-detect constructor, and in particular behavior with single-argument constructors. | default |  | 
| date-format | java.lang.String | Date format string or a fully-qualified date format class name. For instance, 'yyyy-MM-dd HH:mm:ss'. |  |  | 
| default-leniency | java.lang.Boolean | Global default setting (if any) for leniency. |  |  | 
| default-property-inclusion | com.fasterxml.jackson.annotation.JsonInclude$Include | Controls the inclusion of properties during serialization. Configured with one of the values in Jackson's JsonInclude.Include enumeration. |  |  | 
| deserialization | java.util.Map<com.fasterxml.jackson.databind.DeserializationFeature,java.lang.Boolean> | Jackson on/off features that affect the way Java objects are deserialized. |  |  | 
| generator | java.util.Map<com.fasterxml.jackson.core.JsonGenerator$Feature,java.lang.Boolean> | Jackson on/off features for generators. |  |  | 
| locale | java.util.Locale | Locale used for formatting. |  |  | 
| mapper | java.util.Map<com.fasterxml.jackson.databind.MapperFeature,java.lang.Boolean> | Jackson general purpose on/off features. |  |  | 
| parser | java.util.Map<com.fasterxml.jackson.core.JsonParser$Feature,java.lang.Boolean> | Jackson on/off features for parsers. |  |  | 
| property-naming-strategy | java.lang.String | One of the constants on Jackson's PropertyNamingStrategies. Can also be a fully-qualified class name of a PropertyNamingStrategy implementation. |  |  | 
| serialization | java.util.Map<com.fasterxml.jackson.databind.SerializationFeature,java.lang.Boolean> | Jackson on/off features that affect the way Java objects are serialized. |  |  | 
| time-zone | java.util.TimeZone | Time zone used when formatting dates. For instance, "America/Los_Angeles" or "GMT+10". |  |  | 
| visibility | java.util.Map<com.fasterxml.jackson.annotation.PropertyAccessor,com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility> | Jackson visibility thresholds that can be used to limit which methods (and fields) are auto-detected. |  |  | 
###spring.data.cassandra.request.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Request
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Request

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| compression | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Compression | Compression supported by the Cassandra binary protocol. | none |  | 
| config | org.springframework.core.io.Resource | Location of the configuration file to use. |  |  | 
| contact-points | java.util.List<java.lang.String> | Cluster node addresses in the form 'host:port', or a simple 'host' to use the configured port. | ["127.0.0.1:9042"] |  | 
| keyspace-name | java.lang.String | Keyspace name to use. |  |  | 
| local-datacenter | java.lang.String | Datacenter that is considered "local". Contact points should be from this datacenter. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| port | java.lang.Integer | Port to use if a contact point does not specify one. | 9042 |  | 
| schema-action | java.lang.String | Schema action to take at startup. | none |  | 
| session-name | java.lang.String | Name of the Cassandra session. |  |  | 
| ssl | java.lang.Boolean | Enable SSL support. | false |  | 
| username | java.lang.String | Login user of the server. |  |  | 
###spring.couchbase.env.xx
类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env
源类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-string | java.lang.String | Connection string used to locate the Couchbase cluster. |  |  | 
| password | java.lang.String | Cluster password. |  |  | 
| username | java.lang.String | Cluster username. |  |  | 
###spring.jpa.xx
类型:org.springframework.boot.autoconfigure.orm.jpa.JpaProperties
源类型:org.springframework.boot.autoconfigure.orm.jpa.JpaProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| database | org.springframework.orm.jpa.vendor.Database | Target database to operate on, auto-detected by default. Can be alternatively set using the "databasePlatform" property. |  |  | 
| database-platform | java.lang.String | Name of the target database to operate on, auto-detected by default. Can be alternatively set using the "Database" enum. |  |  | 
| generate-ddl | java.lang.Boolean | Whether to initialize the schema on startup. | false |  | 
| mapping-resources | java.util.List<java.lang.String> | Mapping resources (equivalent to "mapping-file" entries in persistence.xml). |  |  | 
| open-in-view | java.lang.Boolean | Register OpenEntityManagerInViewInterceptor. Binds a JPA EntityManager to the thread for the entire processing of the request. | true |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional native properties to set on the JPA provider. |  |  | 
| show-sql | java.lang.Boolean | Whether to enable logging of SQL statements. | false |  | 
###spring.quartz.xx
类型:org.springframework.boot.autoconfigure.quartz.QuartzProperties
源类型:org.springframework.boot.autoconfigure.quartz.QuartzProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| auto-startup | java.lang.Boolean | Whether to automatically start the scheduler after initialization. | true |  | 
| job-store-type | org.springframework.boot.autoconfigure.quartz.JobStoreType | Quartz job store type. | memory |  | 
| overwrite-existing-jobs | java.lang.Boolean | Whether configured jobs should overwrite existing job definitions. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Quartz Scheduler properties. |  |  | 
| scheduler-name | java.lang.String | Name of the scheduler. | quartzScheduler |  | 
| startup-delay | java.time.Duration | Delay after which the scheduler is started once initialization completes. Setting this property makes sense if no jobs should be run before the entire application has started up. | 0s |  | 
| wait-for-jobs-to-complete-on-shutdown | java.lang.Boolean | Whether to wait for running jobs to complete on shutdown. | false |  | 
###spring.thymeleaf.reactive.xx
类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Reactive
源类型:org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Reactive

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache | java.lang.Boolean | Whether to enable template caching. | true |  | 
| check-template | java.lang.Boolean | Whether to check that the template exists before rendering it. | true |  | 
| check-template-location | java.lang.Boolean | Whether to check that the templates location exists. | true |  | 
| enable-spring-el-compiler | java.lang.Boolean | Enable the SpringEL compiler in SpringEL expressions. | false |  | 
| enabled | java.lang.Boolean | Whether to enable Thymeleaf view resolution for Web frameworks. | true |  | 
| encoding | java.nio.charset.Charset | Template files encoding. | UTF-8 |  | 
| excluded-view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that should be excluded from resolution. |  |  | 
| mode | java.lang.String | Template mode to be applied to templates. See also Thymeleaf's TemplateMode enum. | HTML |  | 
| prefix | java.lang.String | Prefix that gets prepended to view names when building a URL. | classpath:/templates/ |  | 
| render-hidden-markers-before-checkboxes | java.lang.Boolean | Whether hidden form inputs acting as markers for checkboxes should be rendered before the checkbox element itself. | false |  | 
| suffix | java.lang.String | Suffix that gets appended to view names when building a URL. | .html |  | 
| template-resolver-order | java.lang.Integer | Order of the template resolver in the chain. By default, the template resolver is first in the chain. Order start at 1 and should only be set if you have defined additional "TemplateResolver" beans. |  |  | 
| view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that can be resolved. |  |  | 
###spring.integration.jdbc.xx
类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Jdbc
源类型:org.springframework.boot.autoconfigure.integration.IntegrationProperties$Jdbc

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###server.servlet.session.xx
类型:org.springframework.boot.web.servlet.server.Session
源类型:org.springframework.boot.web.servlet.server.Session

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| application-display-name | java.lang.String | Display name of the application. | application |  | 
| context-parameters | java.util.Map<java.lang.String,java.lang.String> | Servlet context init parameters. |  |  | 
| context-path | java.lang.String | Context path of the application. |  |  | 
| register-default-servlet | java.lang.Boolean | Whether to register the default Servlet with the container. | false |  | 
###spring.elasticsearch.rest.xx
类型:org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties
源类型:org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Connection timeout. | 1s | true,spring.elasticsearch.connection-timeout,null | 
| password | java.lang.String | Credentials password. |  | true,spring.elasticsearch.password,null | 
| read-timeout | java.time.Duration | Read timeout. | 30s | true,spring.elasticsearch.socket-timeout,null | 
| uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. | ["http://localhost:9200"] | true,spring.elasticsearch.uris,null | 
| username | java.lang.String | Credentials username. |  | true,spring.elasticsearch.username,null | 
###spring.rabbitmq.listener.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address-shuffle-mode | org.springframework.amqp.rabbit.connection.AbstractConnectionFactory$AddressShuffleMode | Mode used to shuffle configured addresses. | none |  | 
| addresses | java.lang.String | Comma-separated list of addresses to which the client should connect. When set, the host and port are ignored. |  |  | 
| channel-rpc-timeout | java.time.Duration | Continuation timeout for RPC calls in channels. Set it to zero to wait forever. | 10m |  | 
| connection-timeout | java.time.Duration | Connection timeout. Set it to zero to wait forever. |  |  | 
| host | java.lang.String | RabbitMQ host. Ignored if an address is set. | localhost |  | 
| password | java.lang.String | Login to authenticate against the broker. | guest |  | 
| port | java.lang.Integer | RabbitMQ port. Ignored if an address is set. Default to 5672, or 5671 if SSL is enabled. |  |  | 
| publisher-confirm-type | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$ConfirmType | Type of publisher confirms to use. |  |  | 
| publisher-returns | java.lang.Boolean | Whether to enable publisher returns. | false |  | 
| requested-channel-max | java.lang.Integer | Number of channels per connection requested by the client. Use 0 for unlimited. | 2047 |  | 
| requested-heartbeat | java.time.Duration | Requested heartbeat timeout; zero for none. If a duration suffix is not specified, seconds will be used. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. | guest |  | 
| virtual-host | java.lang.String | Virtual host to use when connecting to the broker. |  |  | 
###spring.transaction.xx
类型:org.springframework.boot.autoconfigure.transaction.TransactionProperties
源类型:org.springframework.boot.autoconfigure.transaction.TransactionProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| default-timeout | java.time.Duration | Default transaction timeout. If a duration suffix is not specified, seconds will be used. |  |  | 
| rollback-on-commit-failure | java.lang.Boolean | Whether to roll back on commit failures. |  |  | 
###spring.jms.template.xx
类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Template
源类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Template

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| jndi-name | java.lang.String | Connection factory JNDI name. When set, takes precedence to others connection factory auto-configurations. |  |  | 
| pub-sub-domain | java.lang.Boolean | Whether the default destination type is topic. | false |  | 
###spring.artemis.pool.xx
类型:org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties
源类型:org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | Artemis broker port. | tcp://localhost:61616 |  | 
| mode | org.springframework.boot.autoconfigure.jms.artemis.ArtemisMode | Artemis deployment mode, auto-detected by default. |  |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
| host | java.lang.String | Artemis broker host. |  | true,spring.artemis.broker-url,null | 
| port | java.lang.Integer | Artemis broker port. | 61616 | true,spring.artemis.broker-url,null | 
###spring.redis.lettuce.cluster.refresh.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster$Refresh
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster$Refresh

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.kafka.consumer.ssl.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| auto-commit-interval | java.time.Duration | Frequency with which the consumer offsets are auto-committed to Kafka if 'enable.auto.commit' is set to true. |  |  | 
| auto-offset-reset | java.lang.String | What to do when there is no initial offset in Kafka or if the current offset no longer exists on the server. |  |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for consumers. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| enable-auto-commit | java.lang.Boolean | Whether the consumer's offset is periodically committed in the background. |  |  | 
| fetch-max-wait | java.time.Duration | Maximum amount of time the server blocks before answering the fetch request if there isn't sufficient data to immediately satisfy the requirement given by "fetch-min-size". |  |  | 
| fetch-min-size | org.springframework.util.unit.DataSize | Minimum amount of data the server should return for a fetch request. |  |  | 
| group-id | java.lang.String | Unique string that identifies the consumer group to which this consumer belongs. |  |  | 
| heartbeat-interval | java.time.Duration | Expected time between heartbeats to the consumer coordinator. |  |  | 
| isolation-level | org.springframework.boot.autoconfigure.kafka.KafkaProperties$IsolationLevel | Isolation level for reading messages that have been written transactionally. | read-uncommitted |  | 
| key-deserializer | java.lang.Class<?> | Deserializer class for keys. |  |  | 
| max-poll-records | java.lang.Integer | Maximum number of records returned in a single call to poll(). |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional consumer-specific properties used to configure the client. |  |  | 
| value-deserializer | java.lang.Class<?> | Deserializer class for values. |  |  | 
###spring.rsocket.xx
类型:org.springframework.boot.autoconfigure.rsocket.RSocketProperties
源类型:org.springframework.boot.autoconfigure.rsocket.RSocketProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.cache.ehcache.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$EhCache
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$EhCache

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.rabbitmq.listener.simple.retry.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| acknowledge-mode | org.springframework.amqp.core.AcknowledgeMode | Acknowledge mode of container. |  |  | 
| auto-startup | java.lang.Boolean | Whether to start the container automatically on startup. | true |  | 
| batch-size | java.lang.Integer | Batch size, expressed as the number of physical messages, to be used by the container. |  |  | 
| concurrency | java.lang.Integer | Minimum number of listener invoker threads. |  |  | 
| consumer-batch-enabled | java.lang.Boolean | Whether the container creates a batch of messages based on the 'receive-timeout' and 'batch-size'. Coerces 'de-batching-enabled' to true to include the contents of a producer created batch in the batch as discrete records. | false |  | 
| de-batching-enabled | java.lang.Boolean | Whether the container should present batched messages as discrete messages or call the listener with the batch. | true |  | 
| default-requeue-rejected | java.lang.Boolean | Whether rejected deliveries are re-queued by default. |  |  | 
| idle-event-interval | java.time.Duration | How often idle container events should be published. |  |  | 
| max-concurrency | java.lang.Integer | Maximum number of listener invoker threads. |  |  | 
| missing-queues-fatal | java.lang.Boolean | Whether to fail if the queues declared by the container are not available on the broker and/or whether to stop the container if one or more queues are deleted at runtime. | true |  | 
| prefetch | java.lang.Integer | Maximum number of unacknowledged messages that can be outstanding at each consumer. |  |  | 
###spring.kafka.streams.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.mvc.view.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$View
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$View

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###spring.activemq.xx
类型:org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties
源类型:org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | URL of the ActiveMQ broker. Auto-generated by default. |  |  | 
| close-timeout | java.time.Duration | Time to wait before considering a close complete. | 15s |  | 
| in-memory | java.lang.Boolean | Whether the default broker URL should be in memory. Ignored if an explicit broker has been specified. | true |  | 
| non-blocking-redelivery | java.lang.Boolean | Whether to stop message delivery before re-delivering messages from a rolled back transaction. This implies that message order is not preserved when this is enabled. | false |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| send-timeout | java.time.Duration | Time to wait on message sends for a response. Set it to 0 to wait forever. | 0ms |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
###spring.redis.jedis.xx
类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Jedis
源类型:org.springframework.boot.autoconfigure.data.redis.RedisProperties$Jedis

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| client-name | java.lang.String | Client name to be set on connections with CLIENT SETNAME. |  |  | 
| client-type | org.springframework.boot.autoconfigure.data.redis.RedisProperties$ClientType | Type of client to use. By default, auto-detected according to the classpath. |  |  | 
| connect-timeout | java.time.Duration | Connection timeout. |  |  | 
| database | java.lang.Integer | Database index used by the connection factory. | 0 |  | 
| host | java.lang.String | Redis server host. | localhost |  | 
| password | java.lang.String | Login password of the redis server. |  |  | 
| port | java.lang.Integer | Redis server port. | 6379 |  | 
| ssl | java.lang.Boolean | Whether to enable SSL support. | false |  | 
| timeout | java.time.Duration | Read timeout. |  |  | 
| url | java.lang.String | Connection URL. Overrides host, port, and password. User is ignored. Example: redis://user:password@example.com:6379 |  |  | 
| username | java.lang.String | Login username of the redis server. |  |  | 
###spring.jms.cache.xx
类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Cache
源类型:org.springframework.boot.autoconfigure.jms.JmsProperties$Cache

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| jndi-name | java.lang.String | Connection factory JNDI name. When set, takes precedence to others connection factory auto-configurations. |  |  | 
| pub-sub-domain | java.lang.Boolean | Whether the default destination type is topic. | false |  | 
###spring.task.scheduling.pool.xx
类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Pool
源类型:org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Pool

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | scheduling- |  | 
###spring.data.solr.xx
类型:org.springframework.boot.autoconfigure.solr.SolrProperties
源类型:org.springframework.boot.autoconfigure.solr.SolrProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| host | java.lang.String | Solr host. Ignored if "zk-host" is set. | http://127.0.0.1:8983/solr |  | 
| zk-host | java.lang.String | ZooKeeper host address in the form HOST:PORT. |  |  | 
###spring.flyway.xx
类型:org.springframework.boot.autoconfigure.flyway.FlywayProperties
源类型:org.springframework.boot.autoconfigure.flyway.FlywayProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| baseline-description | java.lang.String | Description to tag an existing schema with when applying a baseline. | << Flyway Baseline >> |  | 
| baseline-migration-prefix | java.lang.String | Filename prefix for baseline migrations. Requires Flyway Teams. | B |  | 
| baseline-on-migrate | java.lang.Boolean | Whether to automatically call baseline when migrating a non-empty schema. | false |  | 
| baseline-version | java.lang.String | Version to tag an existing schema with when executing baseline. | 1 |  | 
| batch | java.lang.Boolean | Whether to batch SQL statements when executing them. Requires Flyway Teams. |  |  | 
| cherry-pick | java.lang.String[] | Migrations that Flyway should consider when migrating or undoing. When empty all available migrations are considered. Requires Flyway Teams. |  |  | 
| clean-disabled | java.lang.Boolean | Whether to disable cleaning of the database. | false |  | 
| clean-on-validation-error | java.lang.Boolean | Whether to automatically call clean when a validation error occurs. | false |  | 
| connect-retries | java.lang.Integer | Maximum number of retries when attempting to connect to the database. | 0 |  | 
| connect-retries-interval | java.time.Duration | Maximum time between retries when attempting to connect to the database. If a duration suffix is not specified, seconds will be used. | 120 |  | 
| create-schemas | java.lang.Boolean | Whether Flyway should attempt to create the schemas specified in the schemas property. | true |  | 
| default-schema | java.lang.String | Default schema name managed by Flyway (case-sensitive). |  |  | 
| detect-encoding | java.lang.Boolean | Whether to attempt to automatically detect SQL migration file encoding. Requires Flyway Teams. |  |  | 
| driver-class-name | java.lang.String | Fully qualified name of the JDBC driver. Auto-detected based on the URL by default. |  |  | 
| enabled | java.lang.Boolean | Whether to enable flyway. | true |  | 
| encoding | java.nio.charset.Charset | Encoding of SQL migrations. | UTF-8 |  | 
| error-overrides | java.lang.String[] | Rules for the built-in error handling to override specific SQL states and error codes. Requires Flyway Teams. |  |  | 
| fail-on-missing-locations | java.lang.Boolean | Whether to fail if a location of migration scripts doesn't exist. | false |  | 
| group | java.lang.Boolean | Whether to group all pending migrations together in the same transaction when applying them. | false |  | 
| ignore-migration-patterns | java.util.List<java.lang.String> | Ignore migrations that match this comma-separated list of patterns when validating migrations. Requires Flyway Teams. |  |  | 
| init-sqls | java.util.List<java.lang.String> | SQL statements to execute to initialize a connection immediately after obtaining it. |  |  | 
| installed-by | java.lang.String | Username recorded in the schema history table as having applied the migration. |  |  | 
| jdbc-properties | java.util.Map<java.lang.String,java.lang.String> | Properties to pass to the JDBC driver. Requires Flyway Teams. |  |  | 
| kerberos-config-file | java.lang.String | Path of the Kerberos config file. Requires Flyway Teams. |  |  | 
| license-key | java.lang.String | Licence key for Flyway Teams. |  |  | 
| locations | java.util.List<java.lang.String> | Locations of migrations scripts. Can contain the special "{vendor}" placeholder to use vendor-specific locations. | ["classpath:db/migration"] |  | 
| lock-retry-count | java.lang.Integer | Maximum number of retries when trying to obtain a lock. | 50 |  | 
| mixed | java.lang.Boolean | Whether to allow mixing transactional and non-transactional statements within the same migration. | false |  | 
| oracle-kerberos-cache-file | java.lang.String | Path of the Oracle Kerberos cache file. Requires Flyway Teams. |  |  | 
| oracle-sqlplus | java.lang.Boolean | Whether to enable support for Oracle SQL*Plus commands. Requires Flyway Teams. |  |  | 
| oracle-sqlplus-warn | java.lang.Boolean | Whether to issue a warning rather than an error when a not-yet-supported Oracle SQL*Plus statement is encountered. Requires Flyway Teams. |  |  | 
| oracle-wallet-location | java.lang.String | Location of the Oracle Wallet, used to sign-in to the database automatically. Requires Flyway Teams. |  |  | 
| out-of-order | java.lang.Boolean | Whether to allow migrations to be run out of order. | false |  | 
| output-query-results | java.lang.Boolean | Whether Flyway should output a table with the results of queries when executing migrations. Requires Flyway Teams. |  |  | 
| password | java.lang.String | Login password of the database to migrate. |  |  | 
| placeholder-prefix | java.lang.String | Prefix of placeholders in migration scripts. | ${ |  | 
| placeholder-replacement | java.lang.Boolean | Perform placeholder replacement in migration scripts. | true |  | 
| placeholder-suffix | java.lang.String | Suffix of placeholders in migration scripts. | } |  | 
| placeholders | java.util.Map<java.lang.String,java.lang.String> | Placeholders and their replacements to apply to sql migration scripts. |  |  | 
| repeatable-sql-migration-prefix | java.lang.String | File name prefix for repeatable SQL migrations. | R |  | 
| schemas | java.util.List<java.lang.String> | Scheme names managed by Flyway (case-sensitive). |  |  | 
| script-placeholder-prefix | java.lang.String | Prefix of placeholders in migration scripts. | FP__ |  | 
| script-placeholder-suffix | java.lang.String | Suffix of placeholders in migration scripts. | __ |  | 
| skip-default-callbacks | java.lang.Boolean | Whether to skip default callbacks. If true, only custom callbacks are used. | false |  | 
| skip-default-resolvers | java.lang.Boolean | Whether to skip default resolvers. If true, only custom resolvers are used. | false |  | 
| skip-executing-migrations | java.lang.Boolean | Whether Flyway should skip executing the contents of the migrations and only update the schema history table. Requires Flyway teams. |  |  | 
| sql-migration-prefix | java.lang.String | File name prefix for SQL migrations. | V |  | 
| sql-migration-separator | java.lang.String | File name separator for SQL migrations. | __ |  | 
| sql-migration-suffixes | java.util.List<java.lang.String> | File name suffix for SQL migrations. | [".sql"] |  | 
| sql-server-kerberos-login-file | java.lang.String | Path to the SQL Server Kerberos login file. Requires Flyway Teams. |  |  | 
| stream | java.lang.Boolean | Whether to stream SQL migrations when executing them. Requires Flyway Teams. |  |  | 
| table | java.lang.String | Name of the schema history table that will be used by Flyway. | flyway_schema_history |  | 
| tablespace | java.lang.String | Tablespace in which the schema history table is created. Ignored when using a database that does not support tablespaces. Defaults to the default tablespace of the connection used by Flyway. |  |  | 
| target | java.lang.String | Target version up to which migrations should be considered. |  |  | 
| url | java.lang.String | JDBC url of the database to migrate. If not set, the primary configured data source is used. |  |  | 
| user | java.lang.String | Login user of the database to migrate. |  |  | 
| validate-migration-naming | java.lang.Boolean | Whether to validate migrations and callbacks whose scripts do not obey the correct naming convention. | false |  | 
| validate-on-migrate | java.lang.Boolean | Whether to automatically call validate when performing a migration. | true |  | 
| check-location | java.lang.Boolean | Whether to check that migration scripts location exists. Should be set to false when using a wildcard location or a remote-hosted location such as S3 or GCS. | true | true,null,Locations can no longer be checked accurately due to changes in Flyway's location support. | 
| dry-run-output | java.io.File | File to which the SQL statements of a migration dry run should be output. Requires Flyway Teams. |  | true,null,Flyway pro edition only. | 
| ignore-future-migrations | java.lang.Boolean | Whether to ignore future migrations when reading the schema history table. | true | true,spring.flyway.ignore-migration-patterns,null | 
| ignore-ignored-migrations | java.lang.Boolean | Whether to ignore ignored migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns,null | 
| ignore-missing-migrations | java.lang.Boolean | Whether to ignore missing migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns,null | 
| ignore-pending-migrations | java.lang.Boolean | Whether to ignore pending migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns,null | 
| oracle-kerberos-config-file | java.lang.String | null |  | true,spring.flyway.kerberos-config-file,null | 
| undo-sql-migration-prefix | java.lang.String | File name prefix for undo SQL migrations. Requires Flyway Teams. |  | true,null,Flyway pro edition only. | 
###spring.data.cassandra.controlconnection.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Controlconnection
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Controlconnection

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| compression | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Compression | Compression supported by the Cassandra binary protocol. | none |  | 
| config | org.springframework.core.io.Resource | Location of the configuration file to use. |  |  | 
| contact-points | java.util.List<java.lang.String> | Cluster node addresses in the form 'host:port', or a simple 'host' to use the configured port. | ["127.0.0.1:9042"] |  | 
| keyspace-name | java.lang.String | Keyspace name to use. |  |  | 
| local-datacenter | java.lang.String | Datacenter that is considered "local". Contact points should be from this datacenter. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| port | java.lang.Integer | Port to use if a contact point does not specify one. | 9042 |  | 
| schema-action | java.lang.String | Schema action to take at startup. | none |  | 
| session-name | java.lang.String | Name of the Cassandra session. |  |  | 
| ssl | java.lang.Boolean | Enable SSL support. | false |  | 
| username | java.lang.String | Login user of the server. |  |  | 
###spring.datasource.tomcat.xx
类型:org.apache.tomcat.jdbc.pool.DataSource
源类型:org.apache.tomcat.jdbc.pool.DataSource

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.info.xx
类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties
源类型:org.springframework.boot.autoconfigure.info.ProjectInfoProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.mvc.pathmatch.xx
类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Pathmatch
源类型:org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Pathmatch

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date,null | 
###spring.kafka.producer.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Producer
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Producer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 
###spring.neo4j.authentication.xx
类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Authentication
源类型:org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Authentication

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Timeout for borrowing connections from the pool. | 30s |  | 
| max-transaction-retry-time | java.time.Duration | Maximum time transactions are allowed to retry. | 30s |  | 
| uri | java.net.URI | URI used by the driver. | bolt://localhost:7687 |  | 
###spring.rabbitmq.template.retry.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Retry
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$Retry

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| default-receive-queue | java.lang.String | Name of the default queue to receive messages from when none is specified explicitly. |  |  | 
| exchange | java.lang.String | Name of the default exchange to use for send operations. |  |  | 
| mandatory | java.lang.Boolean | Whether to enable mandatory messages. |  |  | 
| receive-timeout | java.time.Duration | Timeout for receive() operations. |  |  | 
| reply-timeout | java.time.Duration | Timeout for sendAndReceive() operations. |  |  | 
| routing-key | java.lang.String | Value of a default routing key to use for send operations. |  |  | 
###spring.couchbase.env.timeouts.xx
类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Timeouts
源类型:org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Timeouts

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.kafka.producer.security.xx
类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security
源类型:org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| acks | java.lang.String | Number of acknowledgments the producer requires the leader to have received before considering a request complete. |  |  | 
| batch-size | org.springframework.util.unit.DataSize | Default batch size. A small batch size will make batching less common and may reduce throughput (a batch size of zero disables batching entirely). |  |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for producers. |  |  | 
| buffer-memory | org.springframework.util.unit.DataSize | Total memory size the producer can use to buffer records waiting to be sent to the server. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| compression-type | java.lang.String | Compression type for all data generated by the producer. |  |  | 
| key-serializer | java.lang.Class<?> | Serializer class for keys. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional producer-specific properties used to configure the client. |  |  | 
| retries | java.lang.Integer | When greater than zero, enables retrying of failed sends. |  |  | 
| transaction-id-prefix | java.lang.String | When non empty, enables transaction support for producer. |  |  | 
| value-serializer | java.lang.Class<?> | Serializer class for values. |  |  | 
###server.error.xx
类型:org.springframework.boot.autoconfigure.web.ErrorProperties
源类型:org.springframework.boot.autoconfigure.web.ErrorProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 
###spring.data.cassandra.request.throttler.xx
类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Throttler
源类型:org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Throttler

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| consistency | com.datastax.oss.driver.api.core.DefaultConsistencyLevel | Queries consistency level. |  |  | 
| page-size | java.lang.Integer | How many rows will be retrieved simultaneously in a single network roundtrip. | 5000 |  | 
| serial-consistency | com.datastax.oss.driver.api.core.DefaultConsistencyLevel | Queries serial consistency level. |  |  | 
| timeout | java.time.Duration | How long the driver waits for a request to complete. | 2s |  | 
###spring.data.rest.xx
类型:org.springframework.boot.autoconfigure.data.rest.RepositoryRestProperties
源类型:org.springframework.boot.autoconfigure.data.rest.RepositoryRestProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| base-path | java.lang.String | Base path to be used by Spring Data REST to expose repository resources. |  |  | 
| default-media-type | org.springframework.http.MediaType | Content type to use as a default when none is specified. |  |  | 
| default-page-size | java.lang.Integer | Default size of pages. |  |  | 
| detection-strategy | org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy$RepositoryDetectionStrategies | Strategy to use to determine which repositories get exposed. | default |  | 
| enable-enum-translation | java.lang.Boolean | Whether to enable enum value translation through the Spring Data REST default resource bundle. |  |  | 
| limit-param-name | java.lang.String | Name of the URL query string parameter that indicates how many results to return at once. |  |  | 
| max-page-size | java.lang.Integer | Maximum size of pages. |  |  | 
| page-param-name | java.lang.String | Name of the URL query string parameter that indicates what page to return. |  |  | 
| return-body-on-create | java.lang.Boolean | Whether to return a response body after creating an entity. |  |  | 
| return-body-on-update | java.lang.Boolean | Whether to return a response body after updating an entity. |  |  | 
| sort-param-name | java.lang.String | Name of the URL query string parameter that indicates what direction to sort results. |  |  | 
###spring.data.elasticsearch.client.reactive.xx
类型:org.springframework.boot.autoconfigure.data.elasticsearch.DeprecatedReactiveElasticsearchRestClientProperties
源类型:org.springframework.boot.autoconfigure.data.elasticsearch.DeprecatedReactiveElasticsearchRestClientProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| connection-timeout | java.time.Duration | Connection timeout. |  | true,spring.elasticsearch.connection-timeout,null | 
| endpoints | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch endpoints to connect to. | ["localhost:9200"] | true,spring.elasticsearch.uris,null | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. |  | true,spring.elasticsearch.webclient.max-in-memory-size,null | 
| password | java.lang.String | Credentials password. |  | true,spring.elasticsearch.password,null | 
| socket-timeout | java.time.Duration | Read and Write Socket timeout. |  | true,spring.elasticsearch.socket-timeout,null | 
| use-ssl | java.lang.Boolean | Whether the client should use SSL to connect to the endpoints. | false | true,null,Use of SSL should be indicated through an https URI scheme | 
| username | java.lang.String | Credentials username. |  | true,spring.elasticsearch.username,null | 
###spring.rabbitmq.listener.stream.xx
类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$StreamContainer
源类型:org.springframework.boot.autoconfigure.amqp.RabbitProperties$StreamContainer

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| type | org.springframework.boot.autoconfigure.amqp.RabbitProperties$ContainerType | Listener container type. | simple |  | 
###spring.data.neo4j.xx
类型:org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataProperties
源类型:org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| database | java.lang.String | Database name to use. By default, the server decides the default database to use. |  |  | 
###spring.data.mongodb.xx
类型:org.springframework.boot.autoconfigure.mongo.MongoProperties
源类型:org.springframework.boot.autoconfigure.mongo.MongoProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| authentication-database | java.lang.String | Authentication database name. |  |  | 
| auto-index-creation | java.lang.Boolean | Whether to enable auto-index creation. |  |  | 
| database | java.lang.String | Database name. |  |  | 
| field-naming-strategy | java.lang.Class<?> | Fully qualified name of the FieldNamingStrategy to use. |  |  | 
| host | java.lang.String | Mongo server host. Cannot be set with URI. |  |  | 
| password | java.lang.Character[] | Login password of the mongo server. Cannot be set with URI. |  |  | 
| port | java.lang.Integer | Mongo server port. Cannot be set with URI. |  |  | 
| replica-set-name | java.lang.String | Required replica set name for the cluster. Cannot be set with URI. |  |  | 
| uri | java.lang.String | Mongo database URI. Cannot be set with host, port, credentials and replica set name. | mongodb://localhost/test |  | 
| username | java.lang.String | Login user of the mongo server. Cannot be set with URI. |  |  | 
| uuid-representation | org.bson.UuidRepresentation | Representation to use when converting a UUID to a BSON binary value. | java-legacy |  | 
###spring.artemis.xx
类型:org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties
源类型:org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| broker-url | java.lang.String | Artemis broker port. | tcp://localhost:61616 |  | 
| mode | org.springframework.boot.autoconfigure.jms.artemis.ArtemisMode | Artemis deployment mode, auto-detected by default. |  |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
| host | java.lang.String | Artemis broker host. |  | true,spring.artemis.broker-url,null | 
| port | java.lang.Integer | Artemis broker port. | 61616 | true,spring.artemis.broker-url,null | 
###spring.datasource.oracleucp.xx
类型:oracle.ucp.jdbc.PoolDataSourceImpl
源类型:oracle.ucp.jdbc.PoolDataSourceImpl

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
###spring.cache.jcache.xx
类型:org.springframework.boot.autoconfigure.cache.CacheProperties$JCache
源类型:org.springframework.boot.autoconfigure.cache.CacheProperties$JCache

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 
###spring.data.mongodb.gridfs.xx
类型:org.springframework.boot.autoconfigure.mongo.MongoProperties$Gridfs
源类型:org.springframework.boot.autoconfigure.mongo.MongoProperties$Gridfs

| 名称       | 类型       | 描述                                  | 默认值   |过期替代|
|-----------|------------|---------------------------------------|---------|-----------|
| authentication-database | java.lang.String | Authentication database name. |  |  | 
| auto-index-creation | java.lang.Boolean | Whether to enable auto-index creation. |  |  | 
| database | java.lang.String | Database name. |  |  | 
| field-naming-strategy | java.lang.Class<?> | Fully qualified name of the FieldNamingStrategy to use. |  |  | 
| host | java.lang.String | Mongo server host. Cannot be set with URI. |  |  | 
| password | java.lang.Character[] | Login password of the mongo server. Cannot be set with URI. |  |  | 
| port | java.lang.Integer | Mongo server port. Cannot be set with URI. |  |  | 
| replica-set-name | java.lang.String | Required replica set name for the cluster. Cannot be set with URI. |  |  | 
| uri | java.lang.String | Mongo database URI. Cannot be set with host, port, credentials and replica set name. | mongodb://localhost/test |  | 
| username | java.lang.String | Login user of the mongo server. Cannot be set with URI. |  |  | 
| uuid-representation | org.bson.UuidRepresentation | Representation to use when converting a UUID to a BSON binary value. | java-legacy |  | 

