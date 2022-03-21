
### server.xx
描述: 服务器-基础
类型:`org.springframework.boot.autoconfigure.web.ServerProperties`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| forward-headers-strategy | org.springframework.boot.autoconfigure.web.ServerProperties$ForwardHeadersStrategy | Strategy for handling X-Forwarded-* headers. |  |  | 
| max-http-header-size | org.springframework.util.unit.DataSize | Maximum size of the HTTP message header. | 8KB |  | 
| port | java.lang.Integer | Server HTTP port. | 8080 |  | 
| server-header | java.lang.String | Value to use for the Server response header (if empty, no header is sent). |  |  | 
| shutdown | org.springframework.boot.web.server.Shutdown | Type of shutdown that the server will support. | immediate |  | 

### server.compression.xx
描述: 服务器-压缩
类型:`org.springframework.boot.web.server.Compression`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether response compression is enabled. | false |  | 
| excluded-user-agents | java.lang.String[] | Comma-separated list of user agents for which responses should not be compressed. |  |  | 
| mime-types | java.lang.String[] | Comma-separated list of MIME types that should be compressed. | ["text/html","text/xml","text/plain","text/css","text/javascript","application/javascript","application/json","application/xml"] |  | 
| min-response-size | org.springframework.util.unit.DataSize | Minimum "Content-Length" value that is required for compression to be performed. | 2KB |  | 

### server.error.xx
描述: 服务器-错误
类型:`org.springframework.boot.autoconfigure.web.ErrorProperties`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| include-binding-errors | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include "errors" attribute. | never |  | 
| include-exception | java.lang.Boolean | Include the "exception" attribute. | false |  | 
| include-message | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include "message" attribute. | never |  | 
| include-stacktrace | org.springframework.boot.autoconfigure.web.ErrorProperties$IncludeAttribute | When to include the "trace" attribute. | never |  | 
| path | java.lang.String | Path of the error controller. | /error |  | 

### server.error.whitelabel.xx
描述: 服务器-错误
类型:`org.springframework.boot.autoconfigure.web.ErrorProperties$Whitelabel`
源类型:`org.springframework.boot.autoconfigure.web.ErrorProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the default error page displayed in browsers in case of a server error. | true |  | 

### server.http2.xx
描述: 服务器-http2
类型:`org.springframework.boot.web.server.Http2`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable HTTP/2 support, if the current environment supports it. | false |  | 

### server.jetty.xx
描述: 服务器-jetty
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Jetty`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-idle-timeout | java.time.Duration | Time that the connection can be idle before it is closed. |  |  | 
| max-http-form-post-size | org.springframework.util.unit.DataSize | Maximum size of the form content in any HTTP post request. | 200000B |  | 

### server.jetty.accesslog.xx
描述: 服务器-jetty-访问日志
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Accesslog`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Jetty`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| append | java.lang.Boolean | Append to log. | false |  | 
| custom-format | java.lang.String | Custom log format, see org.eclipse.jetty.server.CustomRequestLog. If defined, overrides the "format" configuration key. |  |  | 
| enabled | java.lang.Boolean | Enable access log. | false |  | 
| file-date-format | java.lang.String | Date format to place in log file name. |  |  | 
| filename | java.lang.String | Log filename. If not specified, logs redirect to "System.err". |  |  | 
| format | org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Accesslog$FORMAT | Log format. | ncsa |  | 
| ignore-paths | java.util.List<java.lang.String> | Request paths that should not be logged. |  |  | 
| retention-period | java.lang.Integer | Number of days before rotated log files are deleted. | 31 |  | 

### server.jetty.threads.xx
描述: 服务器-jetty-线程
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Jetty$Threads`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Jetty`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| acceptors | java.lang.Integer | Number of acceptor threads to use. When the value is -1, the default, the number of acceptors is derived from the operating environment. | -1 |  | 
| idle-timeout | java.time.Duration | Maximum thread idle time. | 60000ms |  | 
| max | java.lang.Integer | Maximum number of threads. | 200 |  | 
| max-queue-capacity | java.lang.Integer | Maximum capacity of the thread pool's backing queue. A default is computed based on the threading configuration. |  |  | 
| min | java.lang.Integer | Minimum number of threads. | 8 |  | 
| selectors | java.lang.Integer | Number of selector threads to use. When the value is -1, the default, the number of selectors is derived from the operating environment. | -1 |  | 

### server.netty.xx
描述: 服务器-netty
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Netty`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-timeout | java.time.Duration | Connection timeout of the Netty channel. |  |  | 
| h2c-max-content-length | org.springframework.util.unit.DataSize | Maximum content length of an H2C upgrade request. | 0B |  | 
| idle-timeout | java.time.Duration | Idle timeout of the Netty channel. When not specified, an infinite timeout is used. |  |  | 
| initial-buffer-size | org.springframework.util.unit.DataSize | Initial buffer size for HTTP request decoding. | 128B |  | 
| max-chunk-size | org.springframework.util.unit.DataSize | Maximum chunk size that can be decoded for an HTTP request. | 8KB |  | 
| max-initial-line-length | org.springframework.util.unit.DataSize | Maximum length that can be decoded for an HTTP request's initial line. | 4KB |  | 
| validate-headers | java.lang.Boolean | Whether to validate headers when decoding requests. | true |  | 

### server.reactive.xx
描述: 服务器-响应式
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Reactive`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### server.reactive.session.xx
描述: 服务器-响应式-会话
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Reactive$Session`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Reactive`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. | 30m |  | 

### server.servlet.xx
描述: 服务器-应用
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| application-display-name | java.lang.String | Display name of the application. | application |  | 
| context-parameters | java.util.Map<java.lang.String,java.lang.String> | Servlet context init parameters. |  |  | 
| context-path | java.lang.String | Context path of the application. |  |  | 
| register-default-servlet | java.lang.Boolean | Whether to register the default Servlet with the container. | false |  | 

### server.servlet.encoding.xx
描述: 服务器-应用-编码
类型:`org.springframework.boot.web.servlet.server.Encoding`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Servlet`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| charset | java.nio.charset.Charset | null |  |  | 
| force | java.lang.Boolean | null |  |  | 
| force-request | java.lang.Boolean | null |  |  | 
| force-response | java.lang.Boolean | null |  |  | 
| mapping | java.util.Map<java.util.Locale,java.nio.charset.Charset> | null |  |  | 

### server.servlet.jsp.xx
描述: 服务器-应用-jsp
类型:`org.springframework.boot.web.servlet.server.Jsp`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Servlet`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| class-name | java.lang.String | Class name of the servlet to use for JSPs. If registered is true and this class	 * is on the classpath then it will be registered. | org.apache.jasper.servlet.JspServlet |  | 
| init-parameters | java.util.Map<java.lang.String,java.lang.String> | Init parameters used to configure the JSP servlet. |  |  | 
| registered | java.lang.Boolean | Whether the JSP servlet is registered. | true |  | 

### server.servlet.session.xx
描述: 服务器-应用-会话(session)
类型:`org.springframework.boot.web.servlet.server.Session`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Servlet`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| persistent | java.lang.Boolean | Whether to persist session data between restarts. | false |  | 
| store-dir | java.io.File | Directory used to store session data. |  |  | 
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. | 30m |  | 
| tracking-modes | java.util.Set<org.springframework.boot.web.servlet.server.Session$SessionTrackingMode> | Session tracking modes. |  |  | 

### server.servlet.session.cookie.xx
描述: 服务器-应用-会话(cookie)
类型:`org.springframework.boot.web.servlet.server.Session$Cookie`
源类型:`org.springframework.boot.web.servlet.server.Session`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| comment | java.lang.String | null |  |  | 
| domain | java.lang.String | null |  |  | 
| http-only | java.lang.Boolean | null |  |  | 
| max-age | java.time.Duration | null |  |  | 
| name | java.lang.String | null |  |  | 
| path | java.lang.String | null |  |  | 
| same-site | org.springframework.boot.web.server.Cookie$SameSite | null |  |  | 
| secure | java.lang.Boolean | null |  |  | 

### server.ssl.xx
描述: 服务器-SSL
类型:`org.springframework.boot.web.server.Ssl`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ciphers | java.lang.String[] | Supported SSL ciphers. |  |  | 
| client-auth | org.springframework.boot.web.server.Ssl$ClientAuth | Client authentication mode. Requires a trust store. |  |  | 
| enabled | java.lang.Boolean | Whether to enable SSL support. | true |  | 
| enabled-protocols | java.lang.String[] | Enabled SSL protocols. |  |  | 
| key-alias | java.lang.String | Alias that identifies the key in the key store. |  |  | 
| key-password | java.lang.String | Password used to access the key in the key store. |  |  | 
| key-store | java.lang.String | Path to the key store that holds the SSL certificate (typically a jks file). |  |  | 
| key-store-password | java.lang.String | Password used to access the key store. |  |  | 
| key-store-provider | java.lang.String | Provider for the key store. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. | TLS |  | 
| trust-store | java.lang.String | Trust store that holds SSL certificates. |  |  | 
| trust-store-password | java.lang.String | Password used to access the trust store. |  |  | 
| trust-store-provider | java.lang.String | Provider for the trust store. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| ciphers | java.lang.String[] | null |  |  | 
| client-auth | org.springframework.boot.web.server.Ssl$ClientAuth | null |  |  | 
| enabled | java.lang.Boolean | null |  |  | 
| enabled-protocols | java.lang.String[] | null |  |  | 
| key-alias | java.lang.String | null |  |  | 
| key-password | java.lang.String | null |  |  | 
| key-store | java.lang.String | null |  |  | 
| key-store-password | java.lang.String | null |  |  | 
| key-store-provider | java.lang.String | null |  |  | 
| key-store-type | java.lang.String | null |  |  | 
| protocol | java.lang.String | null |  |  | 
| trust-store | java.lang.String | null |  |  | 
| trust-store-password | java.lang.String | null |  |  | 
| trust-store-provider | java.lang.String | null |  |  | 
| trust-store-type | java.lang.String | null |  |  | 

### server.tomcat.xx
描述: 服务器-tomcat
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### server.tomcat.accesslog.xx
描述: 服务器-tomcat-访问日志
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Accesslog`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| buffered | java.lang.Boolean | Whether to buffer output such that it is flushed only periodically. | true |  | 
| check-exists | java.lang.Boolean | Whether to check for log file existence so it can be recreated it if an external process has renamed it. | false |  | 
| condition-if | java.lang.String | Whether logging of the request will only be enabled if "ServletRequest.getAttribute(conditionIf)" does not yield null. |  |  | 
| condition-unless | java.lang.String | Whether logging of the request will only be enabled if "ServletRequest.getAttribute(conditionUnless)" yield null. |  |  | 
| directory | java.lang.String | Directory in which log files are created. Can be absolute or relative to the Tomcat base dir. | logs |  | 
| enabled | java.lang.Boolean | Enable access log. | false |  | 
| encoding | java.lang.String | Character set used by the log file. Default to the system default character set. |  |  | 
| file-date-format | java.lang.String | Date format to place in the log file name. | .yyyy-MM-dd |  | 
| ipv6-canonical | java.lang.Boolean | Whether to use IPv6 canonical representation format as defined by RFC 5952. | false |  | 
| locale | java.lang.String | Locale used to format timestamps in log entries and in log file name suffix. Default to the default locale of the Java process. |  |  | 
| max-days | java.lang.Integer | Number of days to retain the access log files before they are removed. | -1 |  | 
| pattern | java.lang.String | Format pattern for access logs. | common |  | 
| prefix | java.lang.String | Log file name prefix. | access_log |  | 
| rename-on-rotate | java.lang.Boolean | Whether to defer inclusion of the date stamp in the file name until rotate time. | false |  | 
| request-attributes-enabled | java.lang.Boolean | Set request attributes for the IP address, Hostname, protocol, and port used for the request. | false |  | 
| rotate | java.lang.Boolean | Whether to enable access log rotation. | true |  | 
| suffix | java.lang.String | Log file name suffix. | .log |  | 

### server.tomcat.mbeanregistry.xx
描述: 服务器-tomcat-指标
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Mbeanregistry`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether Tomcat's MBean Registry should be enabled. | false |  | 

### server.tomcat.remoteip.xx
描述: 服务器-tomcat-remoteip
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Remoteip`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| host-header | java.lang.String | Name of the HTTP header from which the remote host is extracted. | X-Forwarded-Host |  | 
| internal-proxies | java.lang.String | Regular expression that matches proxies that are to be trusted. | 10\.\d{1,3}\.\d{1,3}\.\d{1,3}|192\.168\.\d{1,3}\.\d{1,3}|169\.254\.\d{1,3}\.\d{1,3}|127\.\d{1,3}\.\d{1,3}\.\d{1,3}|172\.1[6-9]{1}\.\d{1,3}\.\d{1,3}|172\.2[0-9]{1}\.\d{1,3}\.\d{1,3}|172\.3[0-1]{1}\.\d{1,3}\.\d{1,3}|0:0:0:0:0:0:0:1|::1 |  | 
| port-header | java.lang.String | Name of the HTTP header used to override the original port value. | X-Forwarded-Port |  | 
| protocol-header | java.lang.String | Header that holds the incoming protocol, usually named "X-Forwarded-Proto". |  |  | 
| protocol-header-https-value | java.lang.String | Value of the protocol header indicating whether the incoming request uses SSL. | https |  | 
| remote-ip-header | java.lang.String | Name of the HTTP header from which the remote IP is extracted. For instance, 'X-FORWARDED-FOR'. |  |  | 

### server.tomcat.resource.xx
描述: 服务器-tomcat-资源
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Resource`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| allow-caching | java.lang.Boolean | Whether static resource caching is permitted for this web application. | true |  | 
| cache-ttl | java.time.Duration | Time-to-live of the static resource cache. |  |  | 

### server.tomcat.threads.xx
描述:服务器-tomcat-线程
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat$Threads`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| max | java.lang.Integer | Maximum amount of worker threads. | 200 |  | 
| min-spare | java.lang.Integer | Minimum amount of worker threads. | 10 |  | 

### server.undertow.xx
描述: 服务器-undertow
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### server.undertow.accesslog.xx
描述: 服务器-undertow-访问日志
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Accesslog`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| dir | java.io.File | Undertow access log directory. |  |  | 
| enabled | java.lang.Boolean | Whether to enable the access log. | false |  | 
| pattern | java.lang.String | Format pattern for access logs. | common |  | 
| prefix | java.lang.String | Log file name prefix. | access_log. |  | 
| rotate | java.lang.Boolean | Whether to enable access log rotation. | true |  | 
| suffix | java.lang.String | Log file name suffix. | log |  | 

### server.undertow.options.xx
描述: 服务器-undertow-选项
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Options`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| server | java.util.Map<java.lang.String,java.lang.String> | null |  |  | 
| socket | java.util.Map<java.lang.String,java.lang.String> | null |  |  | 

### server.undertow.threads.xx
描述: 服务器-undertow-线程
类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow$Threads`
源类型:`org.springframework.boot.autoconfigure.web.ServerProperties$Undertow`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| io | java.lang.Integer | Number of I/O threads to create for the worker. The default is derived from the number of available processors. |  |  | 
| worker | java.lang.Integer | Number of worker threads. The default is 8 times the number of I/O threads. |  |  | 

### spring.activemq.xx
描述: spring-activemq
类型:`org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties`
源类型:`org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| broker-url | java.lang.String | URL of the ActiveMQ broker. Auto-generated by default. |  |  | 
| close-timeout | java.time.Duration | Time to wait before considering a close complete. | 15s |  | 
| in-memory | java.lang.Boolean | Whether the default broker URL should be in memory. Ignored if an explicit broker has been specified. | true |  | 
| non-blocking-redelivery | java.lang.Boolean | Whether to stop message delivery before re-delivering messages from a rolled back transaction. This implies that message order is not preserved when this is enabled. | false |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| send-timeout | java.time.Duration | Time to wait on message sends for a response. Set it to 0 to wait forever. | 0ms |  | 
| user | java.lang.String | Login user of the broker. |  |  | 

### spring.activemq.packages.xx
描述: spring-activemq-包
类型:`org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties$Packages`
源类型:`org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| trust-all | java.lang.Boolean | Whether to trust all packages. |  |  | 
| trusted | java.util.List<java.lang.String> | Comma-separated list of specific packages to trust (when not trusting all packages). |  |  | 

### spring.activemq.pool.xx
描述: spring-activemq-连接池
类型:`org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties`
源类型:`org.springframework.boot.autoconfigure.jms.activemq.ActiveMQProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| block-if-full | java.lang.Boolean | Whether to block when a connection is requested and the pool is full. Set it to false to throw a "JMSException" instead. | true |  | 
| block-if-full-timeout | java.time.Duration | Blocking period before throwing an exception if the pool is still full. | -1ms |  | 
| enabled | java.lang.Boolean | Whether a JmsPoolConnectionFactory should be created, instead of a regular ConnectionFactory. | false |  | 
| idle-timeout | java.time.Duration | Connection idle timeout. | 30s |  | 
| max-connections | java.lang.Integer | Maximum number of pooled connections. | 1 |  | 
| max-sessions-per-connection | java.lang.Integer | Maximum number of pooled sessions per connection in the pool. | 500 |  | 
| time-between-expiration-check | java.time.Duration | Time to sleep between runs of the idle connection eviction thread. When negative, no idle connection eviction thread runs. | -1ms |  | 
| use-anonymous-producers | java.lang.Boolean | Whether to use only one anonymous "MessageProducer" instance. Set it to false to create one "MessageProducer" every time one is required. | true |  | 
| block-if-full | java.lang.Boolean | Whether to block when a connection is requested and the pool is full. Set it to false to throw a "JMSException" instead. | true |  | 
| block-if-full-timeout | java.time.Duration | Blocking period before throwing an exception if the pool is still full. | -1ms |  | 
| enabled | java.lang.Boolean | Whether a JmsPoolConnectionFactory should be created, instead of a regular ConnectionFactory. | false |  | 
| idle-timeout | java.time.Duration | Connection idle timeout. | 30s |  | 
| max-connections | java.lang.Integer | Maximum number of pooled connections. | 1 |  | 
| max-sessions-per-connection | java.lang.Integer | Maximum number of pooled sessions per connection in the pool. | 500 |  | 
| time-between-expiration-check | java.time.Duration | Time to sleep between runs of the idle connection eviction thread. When negative, no idle connection eviction thread runs. | -1ms |  | 
| use-anonymous-producers | java.lang.Boolean | Whether to use only one anonymous "MessageProducer" instance. Set it to false to create one "MessageProducer" every time one is required. | true |  | 

### spring.artemis.xx
描述:spring-artemis
类型:`org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties`
源类型:`org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| broker-url | java.lang.String | Artemis broker port. | tcp://localhost:61616 |  | 
| mode | org.springframework.boot.autoconfigure.jms.artemis.ArtemisMode | Artemis deployment mode, auto-detected by default. |  |  | 
| password | java.lang.String | Login password of the broker. |  |  | 
| user | java.lang.String | Login user of the broker. |  |  | 
| host | java.lang.String | Artemis broker host. |  | true,spring.artemis.broker-url | 
| port | java.lang.Integer | Artemis broker port. | 61616 | true,spring.artemis.broker-url | 

### spring.artemis.embedded.xx
描述:spring-artemis-嵌入式
类型:`org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties$Embedded`
源类型:`org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cluster-password | java.lang.String | Cluster password. Randomly generated on startup by default. |  |  | 
| data-directory | java.lang.String | Journal file directory. Not necessary if persistence is turned off. |  |  | 
| enabled | java.lang.Boolean | Whether to enable embedded mode if the Artemis server APIs are available. | true |  | 
| persistent | java.lang.Boolean | Whether to enable persistent store. | false |  | 
| queues | java.lang.String[] | Comma-separated list of queues to create on startup. | [] |  | 
| server-id | java.lang.Integer | Server ID. By default, an auto-incremented counter is used. | 0 |  | 
| topics | java.lang.String[] | Comma-separated list of topics to create on startup. | [] |  | 

### spring.artemis.pool.xx
描述:spring-artemis-连接池
类型:`org.springframework.boot.autoconfigure.jms.JmsPoolConnectionFactoryProperties`
源类型:`org.springframework.boot.autoconfigure.jms.artemis.ArtemisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| block-if-full | java.lang.Boolean | Whether to block when a connection is requested and the pool is full. Set it to false to throw a "JMSException" instead. | true |  | 
| block-if-full-timeout | java.time.Duration | Blocking period before throwing an exception if the pool is still full. | -1ms |  | 
| enabled | java.lang.Boolean | Whether a JmsPoolConnectionFactory should be created, instead of a regular ConnectionFactory. | false |  | 
| idle-timeout | java.time.Duration | Connection idle timeout. | 30s |  | 
| max-connections | java.lang.Integer | Maximum number of pooled connections. | 1 |  | 
| max-sessions-per-connection | java.lang.Integer | Maximum number of pooled sessions per connection in the pool. | 500 |  | 
| time-between-expiration-check | java.time.Duration | Time to sleep between runs of the idle connection eviction thread. When negative, no idle connection eviction thread runs. | -1ms |  | 
| use-anonymous-producers | java.lang.Boolean | Whether to use only one anonymous "MessageProducer" instance. Set it to false to create one "MessageProducer" every time one is required. | true |  | 
| block-if-full | java.lang.Boolean | Whether to block when a connection is requested and the pool is full. Set it to false to throw a "JMSException" instead. | true |  | 
| block-if-full-timeout | java.time.Duration | Blocking period before throwing an exception if the pool is still full. | -1ms |  | 
| enabled | java.lang.Boolean | Whether a JmsPoolConnectionFactory should be created, instead of a regular ConnectionFactory. | false |  | 
| idle-timeout | java.time.Duration | Connection idle timeout. | 30s |  | 
| max-connections | java.lang.Integer | Maximum number of pooled connections. | 1 |  | 
| max-sessions-per-connection | java.lang.Integer | Maximum number of pooled sessions per connection in the pool. | 500 |  | 
| time-between-expiration-check | java.time.Duration | Time to sleep between runs of the idle connection eviction thread. When negative, no idle connection eviction thread runs. | -1ms |  | 
| use-anonymous-producers | java.lang.Boolean | Whether to use only one anonymous "MessageProducer" instance. Set it to false to create one "MessageProducer" every time one is required. | true |  | 

### spring.batch.xx
描述:spring-batch
类型:`org.springframework.boot.autoconfigure.batch.BatchProperties`
源类型:`org.springframework.boot.autoconfigure.batch.BatchProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | null | embedded | true,spring.batch.jdbc.initialize-schema | 
| schema | java.lang.String | null |  | true,spring.batch.jdbc.schema | 
| table-prefix | java.lang.String | null |  | true,spring.batch.jdbc.table-prefix | 

### spring.batch.jdbc.xx
描述:spring-batch-jdbc
类型:`org.springframework.boot.autoconfigure.batch.BatchProperties$Jdbc`
源类型:`org.springframework.boot.autoconfigure.batch.BatchProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | Database schema initialization mode. | embedded |  | 
| platform | java.lang.String | Platform to use in initialization scripts if the @@platform@@ placeholder is used. Auto-detected by default. |  |  | 
| schema | java.lang.String | Path to the SQL file to use to initialize the database schema. | classpath:org/springframework/batch/core/schema-@@platform@@.sql |  | 
| table-prefix | java.lang.String | Table prefix for all the batch meta-data tables. |  |  | 

### spring.batch.job.xx
描述:spring-batch-job
类型:`org.springframework.boot.autoconfigure.batch.BatchProperties$Job`
源类型:`org.springframework.boot.autoconfigure.batch.BatchProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| names | java.lang.String | Comma-separated list of job names to execute on startup (for instance, 'job1,job2'). By default, all Jobs found in the context are executed. |  |  | 

### spring.cache.xx
描述:spring-cache
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cache-names | java.util.List<java.lang.String> | Comma-separated list of cache names to create if supported by the underlying cache manager. Usually, this disables the ability to create additional caches on-the-fly. |  |  | 
| type | org.springframework.boot.autoconfigure.cache.CacheType | Cache type. By default, auto-detected according to the environment. |  |  | 

### spring.cache.caffeine.xx
描述:spring-cache-caffeine
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$Caffeine`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| spec | java.lang.String | The spec to use to create caches. See CaffeineSpec for more details on the spec format. |  |  | 

### spring.cache.couchbase.xx
描述:spring-cache-couchbase
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$Couchbase`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| expiration | java.time.Duration | Entry expiration. By default the entries never expire. Note that this value is ultimately converted to seconds. |  |  | 

### spring.cache.ehcache.xx
描述:spring-cache-ehcache
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$EhCache`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| config | org.springframework.core.io.Resource | The location of the configuration file to use to initialize EhCache. |  |  | 

### spring.cache.infinispan.xx
描述:spring-cache-infinispan
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$Infinispan`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| config | org.springframework.core.io.Resource | The location of the configuration file to use to initialize Infinispan. |  |  | 

### spring.cache.jcache.xx
描述:spring-cache-jcache
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$JCache`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| config | org.springframework.core.io.Resource | The location of the configuration file to use to initialize the cache manager. The configuration file is dependent of the underlying cache implementation. |  |  | 
| provider | java.lang.String | Fully qualified name of the CachingProvider implementation to use to retrieve the JSR-107 compliant cache manager. Needed only if more than one JSR-107 implementation is available on the classpath. |  |  | 

### spring.cache.redis.xx
描述:spring-cache-redis
类型:`org.springframework.boot.autoconfigure.cache.CacheProperties$Redis`
源类型:`org.springframework.boot.autoconfigure.cache.CacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cache-null-values | java.lang.Boolean | Allow caching null values. | true |  | 
| enable-statistics | java.lang.Boolean | Whether to enable cache statistics. | false |  | 
| key-prefix | java.lang.String | Key prefix. |  |  | 
| time-to-live | java.time.Duration | Entry expiration. By default the entries never expire. |  |  | 
| use-key-prefix | java.lang.Boolean | Whether to use the key prefix when writing to Redis. | true |  | 

### spring.codec.xx
描述:spring-codec,WebClient
类型:`org.springframework.boot.autoconfigure.codec.CodecProperties`
源类型:`org.springframework.boot.autoconfigure.codec.CodecProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| log-request-details | java.lang.Boolean | Whether to log form data at DEBUG level, and headers at TRACE level. | false |  | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. This applies only to the auto-configured WebFlux server and WebClient instances. By default this is not set, in which case individual codec defaults apply. Most codecs are limited to 256K by default. |  |  | 

### spring.couchbase.xx
描述: spring-[couchbase](https://www.couchbase.com/)
类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties`
源类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-string | java.lang.String | Connection string used to locate the Couchbase cluster. |  |  | 
| password | java.lang.String | Cluster password. |  |  | 
| username | java.lang.String | Cluster username. |  |  | 

### spring.couchbase.env.xx
描述:spring-couchbase-env
类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env`
源类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.couchbase.env.io.xx
描述:spring-couchbase-env-io
类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Io`
源类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| idle-http-connection-timeout | java.time.Duration | Length of time an HTTP connection may remain idle before it is closed and removed from the pool. | 4500ms |  | 
| max-endpoints | java.lang.Integer | Maximum number of sockets per node. | 12 |  | 
| min-endpoints | java.lang.Integer | Minimum number of sockets per node. | 1 |  | 

### spring.couchbase.env.ssl.xx
描述:spring-couchbase-env-ssl
类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable SSL support. Enabled automatically if a "keyStore" is provided unless specified otherwise. |  |  | 
| key-store | java.lang.String | Path to the JVM key store that holds the certificates. |  |  | 
| key-store-password | java.lang.String | Password used to access the key store. |  |  | 

### spring.couchbase.env.timeouts.xx
描述:spring-couchbase-env-timeouts
类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Timeouts`
源类型:`org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties$Env`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| analytics | java.time.Duration | Timeout for the analytics service. | 75s |  | 
| connect | java.time.Duration | Bucket connect timeout. | 10s |  | 
| disconnect | java.time.Duration | Bucket disconnect timeout. | 10s |  | 
| key-value | java.time.Duration | Timeout for operations on a specific key-value. | 2500ms |  | 
| key-value-durable | java.time.Duration | Timeout for operations on a specific key-value with a durability level. | 10s |  | 
| management | java.time.Duration | Timeout for the management operations. | 75s |  | 
| query | java.time.Duration | N1QL query operations timeout. | 75s |  | 
| search | java.time.Duration | Timeout for the search service. | 75s |  | 
| view | java.time.Duration | Regular and geospatial view operations timeout. | 75s |  | 

### spring.data.cassandra.xx
描述:spring-data-[cassandra](https://cassandra.apache.org)
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.data.cassandra.connection.xx
描述:spring-data-cassandra-连接
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Connection`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connect-timeout | java.time.Duration | Timeout to use when establishing driver connections. |  |  | 
| init-query-timeout | java.time.Duration | Timeout to use for internal queries that run as part of the initialization process, just after a connection is opened. | 5s |  | 

### spring.data.cassandra.controlconnection.xx
描述:spring-data-cassandra-控制连接
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Controlconnection`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| timeout | java.time.Duration | Timeout to use for control queries. | 5s |  | 

### spring.data.cassandra.pool.xx
描述:spring-data-cassandra-连接池
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| heartbeat-interval | java.time.Duration | Heartbeat interval after which a message is sent on an idle connection to make sure it's still alive. | 30s |  | 
| idle-timeout | java.time.Duration | Idle timeout before an idle connection is removed. | 5s |  | 

### spring.data.cassandra.request.xx
描述:spring-data-cassandra-请求
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Request`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| consistency | com.datastax.oss.driver.api.core.DefaultConsistencyLevel | Queries consistency level. |  |  | 
| page-size | java.lang.Integer | How many rows will be retrieved simultaneously in a single network roundtrip. | 5000 |  | 
| serial-consistency | com.datastax.oss.driver.api.core.DefaultConsistencyLevel | Queries serial consistency level. |  |  | 
| timeout | java.time.Duration | How long the driver waits for a request to complete. | 2s |  | 

### spring.data.cassandra.request.throttler.xx
描述: spring-data-cassandra-请求-节流
类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Throttler`
源类型:`org.springframework.boot.autoconfigure.cassandra.CassandraProperties$Request`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| drain-interval | java.time.Duration | How often the throttler attempts to dequeue requests. Set this high enough that each attempt will process multiple entries in the queue, but not delay requests too much. |  |  | 
| max-concurrent-requests | java.lang.Integer | Maximum number of requests that are allowed to execute in parallel. | 0 |  | 
| max-queue-size | java.lang.Integer | Maximum number of requests that can be enqueued when the throttling threshold is exceeded. | 0 |  | 
| max-requests-per-second | java.lang.Integer | Maximum allowed request rate. | 0 |  | 
| type | org.springframework.boot.autoconfigure.cassandra.CassandraProperties$ThrottlerType | Request throttling type. | none |  | 

### spring.data.couchbase.xx
描述: spring-data-couchbase
类型:`org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataProperties`
源类型:`org.springframework.boot.autoconfigure.data.couchbase.CouchbaseDataProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| auto-index | java.lang.Boolean | Automatically create views and indexes. Use the meta-data provided by "@ViewIndexed", "@N1qlPrimaryIndexed" and "@N1qlSecondaryIndexed". | false |  | 
| bucket-name | java.lang.String | Name of the bucket to connect to. |  |  | 
| field-naming-strategy | java.lang.Class<?> | Fully qualified name of the FieldNamingStrategy to use. |  |  | 
| scope-name | java.lang.String | Name of the scope used for all collection access. |  |  | 
| type-key | java.lang.String | Name of the field that stores the type information for complex types when using "MappingCouchbaseConverter". | _class |  | 

### spring.data.elasticsearch.client.reactive.xx
描述: spring-data-elasticsearch-client
类型:`org.springframework.boot.autoconfigure.data.elasticsearch.DeprecatedReactiveElasticsearchRestClientProperties`
源类型:`org.springframework.boot.autoconfigure.data.elasticsearch.DeprecatedReactiveElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-timeout | java.time.Duration | Connection timeout. |  | true,spring.elasticsearch.connection-timeout | 
| endpoints | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch endpoints to connect to. | ["localhost:9200"] | true,spring.elasticsearch.uris | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. |  | true,spring.elasticsearch.webclient.max-in-memory-size | 
| password | java.lang.String | Credentials password. |  | true,spring.elasticsearch.password | 
| socket-timeout | java.time.Duration | Read and Write Socket timeout. |  | true,spring.elasticsearch.socket-timeout | 
| use-ssl | java.lang.Boolean | Whether the client should use SSL to connect to the endpoints. | false | true,Use of SSL should be indicated through an https URI scheme | 
| username | java.lang.String | Credentials username. |  | true,spring.elasticsearch.username | 

### spring.data.mongodb.xx
描述: spring-data-mongodb
类型:`org.springframework.boot.autoconfigure.mongo.MongoProperties`
源类型:`org.springframework.boot.autoconfigure.mongo.MongoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.data.mongodb.gridfs.xx
描述:spring-data-mongodb-文件系统
类型:`org.springframework.boot.autoconfigure.mongo.MongoProperties$Gridfs`
源类型:`org.springframework.boot.autoconfigure.mongo.MongoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| bucket | java.lang.String | GridFS bucket name. |  |  | 
| database | java.lang.String | GridFS database name. |  |  | 

### spring.data.neo4j.xx
描述:spring-data-neo4j
类型:`org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataProperties`
源类型:`org.springframework.boot.autoconfigure.data.neo4j.Neo4jDataProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| database | java.lang.String | Database name to use. By default, the server decides the default database to use. |  |  | 

### spring.data.rest.xx
描述:spring-data-rest
类型:`org.springframework.boot.autoconfigure.data.rest.RepositoryRestProperties`
源类型:`org.springframework.boot.autoconfigure.data.rest.RepositoryRestProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.data.solr.xx
描述:spring-data-solr
类型:`org.springframework.boot.autoconfigure.solr.SolrProperties`
源类型:`org.springframework.boot.autoconfigure.solr.SolrProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| host | java.lang.String | Solr host. Ignored if "zk-host" is set. | http://127.0.0.1:8983/solr |  | 
| zk-host | java.lang.String | ZooKeeper host address in the form HOST:PORT. |  |  | 

### spring.data.web.xx
描述:spring-data-web
类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties`
源类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.data.web.pageable.xx
描述:spring-data-web-分页
类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Pageable`
源类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-page-size | java.lang.Integer | Default page size. | 20 |  | 
| max-page-size | java.lang.Integer | Maximum page size to be accepted. | 2000 |  | 
| one-indexed-parameters | java.lang.Boolean | Whether to expose and assume 1-based page number indexes. Defaults to "false", meaning a page number of 0 in the request equals the first page. | false |  | 
| page-parameter | java.lang.String | Page index parameter name. | page |  | 
| prefix | java.lang.String | General prefix to be prepended to the page number and page size parameters. |  |  | 
| qualifier-delimiter | java.lang.String | Delimiter to be used between the qualifier and the actual page number and size properties. | _ |  | 
| size-parameter | java.lang.String | Page size parameter name. | size |  | 

### spring.data.web.sort.xx
描述:spring-data-web-排序
类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties$Sort`
源类型:`org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| sort-parameter | java.lang.String | Sort parameter name. | sort |  | 

### spring.datasource.xx
描述:spring-数据源
类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceProperties`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| driver-class-name | java.lang.String | Fully qualified name of the JDBC driver. Auto-detected based on the URL by default. |  |  | 
| embedded-database-connection | org.springframework.boot.jdbc.EmbeddedDatabaseConnection | Connection details for an embedded database. Defaults to the most suitable embedded database that is available on the classpath. |  |  | 
| generate-unique-name | java.lang.Boolean | Whether to generate a random datasource name. | true |  | 
| jndi-name | java.lang.String | JNDI location of the datasource. Class, url, username and password are ignored when set. |  |  | 
| name | java.lang.String | Datasource name to use if "generate-unique-name" is false. Defaults to "testdb" when using an embedded database, otherwise null. |  |  | 
| password | java.lang.String | Login password of the database. |  |  | 
| type | java.lang.Class<? extends javax.sql.DataSource> | Fully qualified name of the connection pool implementation to use. By default, it is auto-detected from the classpath. |  |  | 
| url | java.lang.String | JDBC URL of the database. |  |  | 
| username | java.lang.String | Login username of the database. |  |  | 
| continue-on-error | java.lang.Boolean | Whether to stop if an error occurs while initializing the database. | false | true,spring.sql.init.continue-on-error | 
| data | java.util.List<java.lang.String> | Data (DML) script resource references. |  | true,spring.sql.init.data-locations | 
| data-password | java.lang.String | Password of the database to execute DML scripts (if different). |  | true,spring.sql.init.password | 
| data-username | java.lang.String | Username of the database to execute DML scripts (if different). |  | true,spring.sql.init.username | 
| initialization-mode | org.springframework.boot.jdbc.DataSourceInitializationMode | Mode to apply when determining if DataSource initialization should be performed using the available DDL and DML scripts. | embedded | true,spring.sql.init.mode | 
| platform | java.lang.String | Platform to use in the DDL or DML scripts (such as schema-${platform}.sql or data-${platform}.sql). | all | true,spring.sql.init.platform | 
| schema | java.util.List<java.lang.String> | Schema (DDL) script resource references. |  | true,spring.sql.init.schema-locations | 
| schema-password | java.lang.String | Password of the database to execute DDL scripts (if different). |  | true,spring.sql.init.password | 
| schema-username | java.lang.String | Username of the database to execute DDL scripts (if different). |  | true,spring.sql.init.username | 
| separator | java.lang.String | Statement separator in SQL initialization scripts. | ; | true,spring.sql.init.separator | 
| sql-script-encoding | java.nio.charset.Charset | SQL scripts encoding. |  | true,spring.sql.init.encoding | 

### spring.datasource.dbcp2.xx
描述:spring-数据源-dbcp2
类型:`org.apache.commons.dbcp2.BasicDataSource`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Dbcp2`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| abandoned-usage-tracking | java.lang.Boolean | null |  |  | 
| access-to-underlying-connection-allowed | java.lang.Boolean | null |  |  | 
| auto-commit-on-return | java.lang.Boolean | null |  |  | 
| cache-state | java.lang.Boolean | null |  |  | 
| clear-statement-pool-on-return | java.lang.Boolean | null |  |  | 
| connection-factory-class-name | java.lang.String | null |  |  | 
| connection-init-sqls | java.util.List<java.lang.String> | null |  |  | 
| default-auto-commit | java.lang.Boolean | null |  |  | 
| default-catalog | java.lang.String | null |  |  | 
| default-query-timeout | java.lang.Integer | null |  |  | 
| default-read-only | java.lang.Boolean | null |  |  | 
| default-schema | java.lang.String | null |  |  | 
| default-transaction-isolation | java.lang.Integer | null |  |  | 
| disconnection-sql-codes | java.util.Set<java.lang.String> | null |  |  | 
| driver | java.sql.Driver | null |  |  | 
| driver-class-name | java.lang.String | null |  |  | 
| eviction-policy-class-name | java.lang.String | null |  |  | 
| fast-fail-validation | java.lang.Boolean | null |  |  | 
| initial-size | java.lang.Integer | null |  |  | 
| jmx-name | java.lang.String | null |  |  | 
| lifo | java.lang.Boolean | null |  |  | 
| log-abandoned | java.lang.Boolean | null |  |  | 
| log-expired-connections | java.lang.Boolean | null |  |  | 
| login-timeout | java.lang.Integer | null |  |  | 
| max-conn-lifetime-millis | java.lang.Long | null |  |  | 
| max-idle | java.lang.Integer | null |  |  | 
| max-open-prepared-statements | java.lang.Integer | null |  |  | 
| max-total | java.lang.Integer | null |  |  | 
| max-wait-millis | java.lang.Long | null |  |  | 
| min-evictable-idle-time-millis | java.lang.Long | null |  |  | 
| min-idle | java.lang.Integer | null |  |  | 
| num-tests-per-eviction-run | java.lang.Integer | null |  |  | 
| password | java.lang.String | null |  |  | 
| pool-prepared-statements | java.lang.Boolean | null |  |  | 
| remove-abandoned-on-borrow | java.lang.Boolean | null |  |  | 
| remove-abandoned-on-maintenance | java.lang.Boolean | null |  |  | 
| remove-abandoned-timeout | java.lang.Integer | null |  |  | 
| rollback-on-return | java.lang.Boolean | null |  |  | 
| soft-min-evictable-idle-time-millis | java.lang.Long | null |  |  | 
| test-on-borrow | java.lang.Boolean | null |  |  | 
| test-on-create | java.lang.Boolean | null |  |  | 
| test-on-return | java.lang.Boolean | null |  |  | 
| test-while-idle | java.lang.Boolean | null |  |  | 
| time-between-eviction-runs-millis | java.lang.Long | null |  |  | 
| url | java.lang.String | null |  |  | 
| username | java.lang.String | null |  |  | 
| validation-query | java.lang.String | null |  |  | 
| validation-query-timeout | java.lang.Integer | null |  |  | 
| enable-auto-commit-on-return | java.lang.Boolean | null |  | true | 

### spring.datasource.hikari.xx
描述:spring-数据源-hikari
类型:`com.zaxxer.hikari.HikariDataSource`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Hikari`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| allow-pool-suspension | java.lang.Boolean | null |  |  | 
| auto-commit | java.lang.Boolean | null |  |  | 
| catalog | java.lang.String | null |  |  | 
| connection-init-sql | java.lang.String | null |  |  | 
| connection-test-query | java.lang.String | null |  |  | 
| connection-timeout | java.lang.Long | null |  |  | 
| data-source-class-name | java.lang.String | null |  |  | 
| data-source-j-n-d-i | java.lang.String | null |  |  | 
| data-source-properties | java.util.Properties | null |  |  | 
| driver-class-name | java.lang.String | null |  |  | 
| exception-override-class-name | java.lang.String | null |  |  | 
| health-check-properties | java.util.Properties | null |  |  | 
| health-check-registry | java.lang.Object | null |  |  | 
| idle-timeout | java.lang.Long | null |  |  | 
| initialization-fail-timeout | java.lang.Long | null |  |  | 
| isolate-internal-queries | java.lang.Boolean | null |  |  | 
| jdbc-url | java.lang.String | null |  |  | 
| keepalive-time | java.lang.Long | null |  |  | 
| leak-detection-threshold | java.lang.Long | null |  |  | 
| login-timeout | java.lang.Integer | null |  |  | 
| max-lifetime | java.lang.Long | null |  |  | 
| maximum-pool-size | java.lang.Integer | null |  |  | 
| metric-registry | java.lang.Object | null |  |  | 
| metrics-tracker-factory | com.zaxxer.hikari.metrics.MetricsTrackerFactory | null |  |  | 
| minimum-idle | java.lang.Integer | null |  |  | 
| password | java.lang.String | null |  |  | 
| pool-name | java.lang.String | null |  |  | 
| read-only | java.lang.Boolean | null |  |  | 
| register-mbeans | java.lang.Boolean | null |  |  | 
| scheduled-executor | java.util.concurrent.ScheduledExecutorService | null |  |  | 
| schema | java.lang.String | null |  |  | 
| transaction-isolation | java.lang.String | null |  |  | 
| username | java.lang.String | null |  |  | 
| validation-timeout | java.lang.Long | null |  |  | 

### spring.datasource.oracleucp.xx
描述:spring-数据源-oracleucp
类型:`oracle.ucp.jdbc.PoolDataSourceImpl`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$OracleUcp`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| abandoned-connection-timeout | java.lang.Integer | null |  |  | 
| connection-factory-class-name | java.lang.String | null |  |  | 
| connection-factory-properties | java.util.Properties | null |  |  | 
| connection-harvest-max-count | java.lang.Integer | null |  |  | 
| connection-harvest-trigger-count | java.lang.Integer | null |  |  | 
| connection-labeling-high-cost | java.lang.Integer | null |  |  | 
| connection-pool-name | java.lang.String | null |  |  | 
| connection-properties | java.util.Properties | null |  |  | 
| connection-repurpose-threshold | java.lang.Integer | null |  |  | 
| connection-validation-timeout | java.lang.Integer | null |  |  | 
| connection-wait-timeout | java.lang.Integer | null |  |  | 
| data-source-name | java.lang.String | null |  |  | 
| database-name | java.lang.String | null |  |  | 
| description | java.lang.String | null |  |  | 
| fast-connection-failover-enabled | java.lang.Boolean | null |  |  | 
| high-cost-connection-reuse-threshold | java.lang.Integer | null |  |  | 
| inactive-connection-timeout | java.lang.Integer | null |  |  | 
| initial-pool-size | java.lang.Integer | null |  |  | 
| login-timeout | java.lang.Integer | null |  |  | 
| max-connection-reuse-count | java.lang.Integer | null |  |  | 
| max-connection-reuse-time | java.lang.Long | null |  |  | 
| max-connections-per-shard | java.lang.Integer | null |  |  | 
| max-idle-time | java.lang.Integer | null |  |  | 
| max-pool-size | java.lang.Integer | null |  |  | 
| max-statements | java.lang.Integer | null |  |  | 
| min-pool-size | java.lang.Integer | null |  |  | 
| network-protocol | java.lang.String | null |  |  | 
| o-n-s-configuration | java.lang.String | null |  |  | 
| pdb-roles | java.util.Properties | null |  |  | 
| port-number | java.lang.Integer | null |  |  | 
| property-cycle | java.lang.Integer | null |  |  | 
| query-timeout | java.lang.Integer | null |  |  | 
| read-only-instance-allowed | java.lang.Boolean | null |  |  | 
| role-name | java.lang.String | null |  |  | 
| s-q-l-for-validate-connection | java.lang.String | null |  |  | 
| seconds-to-trust-idle-connection | java.lang.Integer | null |  |  | 
| server-name | java.lang.String | null |  |  | 
| sharding-mode | java.lang.Boolean | null |  |  | 
| time-to-live-connection-timeout | java.lang.Integer | null |  |  | 
| timeout-check-interval | java.lang.Integer | null |  |  | 
| u-r-l | java.lang.String | null |  |  | 
| user | java.lang.String | null |  |  | 
| validate-connection-on-borrow | java.lang.Boolean | null |  |  | 

### spring.datasource.tomcat.xx
描述:spring-数据源-tomcat
类型:`org.apache.tomcat.jdbc.pool.DataSource`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Tomcat`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| abandon-when-percentage-full | java.lang.Integer | null |  |  | 
| access-to-underlying-connection-allowed | java.lang.Boolean | null |  |  | 
| alternate-username-allowed | java.lang.Boolean | null |  |  | 
| commit-on-return | java.lang.Boolean | null |  |  | 
| connection-properties | java.lang.String | null |  |  | 
| data-source | java.lang.Object | null |  |  | 
| data-source-j-n-d-i | java.lang.String | null |  |  | 
| db-properties | java.util.Properties | null |  |  | 
| default-auto-commit | java.lang.Boolean | null |  |  | 
| default-catalog | java.lang.String | null |  |  | 
| default-read-only | java.lang.Boolean | null |  |  | 
| default-transaction-isolation | java.lang.Integer | null |  |  | 
| driver-class-name | java.lang.String | null |  |  | 
| fair-queue | java.lang.Boolean | null |  |  | 
| ignore-exception-on-pre-load | java.lang.Boolean | null |  |  | 
| init-s-q-l | java.lang.String | null |  |  | 
| initial-size | java.lang.Integer | null |  |  | 
| jdbc-interceptors | java.lang.String | null |  |  | 
| jmx-enabled | java.lang.Boolean | null |  |  | 
| log-abandoned | java.lang.Boolean | null |  |  | 
| log-validation-errors | java.lang.Boolean | null |  |  | 
| login-timeout | java.lang.Integer | null |  |  | 
| max-active | java.lang.Integer | null |  |  | 
| max-age | java.lang.Long | null |  |  | 
| max-idle | java.lang.Integer | null |  |  | 
| max-wait | java.lang.Integer | null |  |  | 
| min-evictable-idle-time-millis | java.lang.Integer | null |  |  | 
| min-idle | java.lang.Integer | null |  |  | 
| name | java.lang.String | null |  |  | 
| num-tests-per-eviction-run | java.lang.Integer | null |  |  | 
| password | java.lang.String | null |  |  | 
| propagate-interrupt-state | java.lang.Boolean | null |  |  | 
| remove-abandoned | java.lang.Boolean | null |  |  | 
| remove-abandoned-timeout | java.lang.Integer | null |  |  | 
| rollback-on-return | java.lang.Boolean | null |  |  | 
| suspect-timeout | java.lang.Integer | null |  |  | 
| test-on-borrow | java.lang.Boolean | null |  |  | 
| test-on-connect | java.lang.Boolean | null |  |  | 
| test-on-return | java.lang.Boolean | null |  |  | 
| test-while-idle | java.lang.Boolean | null |  |  | 
| time-between-eviction-runs-millis | java.lang.Integer | null |  |  | 
| url | java.lang.String | null |  |  | 
| use-disposable-connection-facade | java.lang.Boolean | null |  |  | 
| use-equals | java.lang.Boolean | null |  |  | 
| use-lock | java.lang.Boolean | null |  |  | 
| use-statement-facade | java.lang.Boolean | null |  |  | 
| username | java.lang.String | null |  |  | 
| validation-interval | java.lang.Long | null |  |  | 
| validation-query | java.lang.String | null |  |  | 
| validation-query-timeout | java.lang.Integer | null |  |  | 
| validator-class-name | java.lang.String | null |  |  | 

### spring.datasource.xa.xx
描述:spring-数据源-xa
类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$Xa`
源类型:`org.springframework.boot.autoconfigure.jdbc.DataSourceProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| data-source-class-name | java.lang.String | XA datasource fully qualified name. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Properties to pass to the XA data source. |  |  | 

### spring.elasticsearch.xx
描述:spring-elasticsearch
类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties`
源类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-timeout | java.time.Duration | Connection timeout used when communicating with Elasticsearch. | 1s |  | 
| password | java.lang.String | Password for authentication with Elasticsearch. |  |  | 
| path-prefix | java.lang.String | Prefix added to the path of every request sent to Elasticsearch. |  |  | 
| socket-timeout | java.time.Duration | Socket timeout used when communicating with Elasticsearch. | 30s |  | 
| uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. | ["http://localhost:9200"] |  | 
| username | java.lang.String | Username for authentication with Elasticsearch. |  |  | 

### spring.elasticsearch.rest.xx
描述:spring-elasticsearch-rest
类型:`org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties`
源类型:`org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-timeout | java.time.Duration | Connection timeout. | 1s | true,spring.elasticsearch.connection-timeout | 
| password | java.lang.String | Credentials password. |  | true,spring.elasticsearch.password | 
| read-timeout | java.time.Duration | Read timeout. | 30s | true,spring.elasticsearch.socket-timeout | 
| uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. | ["http://localhost:9200"] | true,spring.elasticsearch.uris | 
| username | java.lang.String | Credentials username. |  | true,spring.elasticsearch.username | 

### spring.elasticsearch.rest.sniffer.xx
描述:spring-elasticsearch-rest-sniffer
类型:`org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties$Sniffer`
源类型:`org.springframework.boot.autoconfigure.elasticsearch.DeprecatedElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| delay-after-failure | java.time.Duration | Delay of a sniff execution scheduled after a failure. | 1m | true,spring.elasticsearch.restclient.sniffer.delay-after-failure | 
| interval | java.time.Duration | Interval between consecutive ordinary sniff executions. | 5m | true,spring.elasticsearch.restclient.sniffer.interval | 

### spring.elasticsearch.restclient.xx
描述:spring-elasticsearch-restclient
类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties`
源类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.elasticsearch.restclient.sniffer.xx
描述:spring-elasticsearch-restclient-sniffer
类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties$Sniffer`
源类型:`org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| delay-after-failure | java.time.Duration | Delay of a sniff execution scheduled after a failure. | 1m |  | 
| interval | java.time.Duration | Interval between consecutive ordinary sniff executions. | 5m |  | 

### spring.elasticsearch.webclient.xx
描述:spring-elasticsearch-webclient
类型:`org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientProperties`
源类型:`org.springframework.boot.autoconfigure.data.elasticsearch.ReactiveElasticsearchRestClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| max-in-memory-size | org.springframework.util.unit.DataSize | Limit on the number of bytes that can be buffered whenever the input stream needs to be aggregated. |  |  | 

### spring.flyway.xx
描述:spring-[flyway](https://flywaydb.org/)
类型:`org.springframework.boot.autoconfigure.flyway.FlywayProperties`
源类型:`org.springframework.boot.autoconfigure.flyway.FlywayProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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
| check-location | java.lang.Boolean | Whether to check that migration scripts location exists. Should be set to false when using a wildcard location or a remote-hosted location such as S3 or GCS. | true | true,Locations can no longer be checked accurately due to changes in Flyway's location support. | 
| dry-run-output | java.io.File | File to which the SQL statements of a migration dry run should be output. Requires Flyway Teams. |  | true,error,Flyway pro edition only. | 
| ignore-future-migrations | java.lang.Boolean | Whether to ignore future migrations when reading the schema history table. | true | true,spring.flyway.ignore-migration-patterns | 
| ignore-ignored-migrations | java.lang.Boolean | Whether to ignore ignored migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns | 
| ignore-missing-migrations | java.lang.Boolean | Whether to ignore missing migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns | 
| ignore-pending-migrations | java.lang.Boolean | Whether to ignore pending migrations when reading the schema history table. | false | true,spring.flyway.ignore-migration-patterns | 
| oracle-kerberos-config-file | java.lang.String | null |  | true,spring.flyway.kerberos-config-file | 
| undo-sql-migration-prefix | java.lang.String | File name prefix for undo SQL migrations. Requires Flyway Teams. |  | true,error,Flyway pro edition only. | 

### spring.freemarker.xx
描述:spring-freemarker
类型:`org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties`
源类型:`org.springframework.boot.autoconfigure.freemarker.FreeMarkerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.groovy.template.xx
描述:spring-groovy-模板
类型:`org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateProperties`
源类型:`org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.groovy.template.configuration.xx
描述:spring-groovy-模板-配置
类型:`org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer`
源类型:`org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration$GroovyMarkupConfiguration`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| auto-escape | java.lang.Boolean | null |  |  | 
| auto-indent | java.lang.Boolean | null |  |  | 
| auto-indent-string | java.lang.String | null |  |  | 
| auto-new-line | java.lang.Boolean | null |  |  | 
| base-template-class | java.lang.Class<? extends groovy.text.markup.BaseTemplate> | null |  |  | 
| cache-templates | java.lang.Boolean | null |  |  | 
| declaration-encoding | java.lang.String | null |  |  | 
| expand-empty-elements | java.lang.Boolean | null |  |  | 
| locale | java.util.Locale | null |  |  | 
| new-line-string | java.lang.String | null |  |  | 
| resource-loader-path | java.lang.String | null |  |  | 
| use-double-quotes | java.lang.Boolean | null |  |  | 

### spring.gson.xx
描述:spring-gson
类型:`org.springframework.boot.autoconfigure.gson.GsonProperties`
源类型:`org.springframework.boot.autoconfigure.gson.GsonProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.h2.console.xx
描述:spring-h2-控制台
类型:`org.springframework.boot.autoconfigure.h2.H2ConsoleProperties`
源类型:`org.springframework.boot.autoconfigure.h2.H2ConsoleProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the console. | false |  | 
| path | java.lang.String | Path at which the console is available. | /h2-console |  | 

### spring.h2.console.settings.xx
描述:spring-h2-控制台-设置
类型:`org.springframework.boot.autoconfigure.h2.H2ConsoleProperties$Settings`
源类型:`org.springframework.boot.autoconfigure.h2.H2ConsoleProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| trace | java.lang.Boolean | Whether to enable trace output. | false |  | 
| web-admin-password | java.lang.String | Password to access preferences and tools of H2 Console. |  |  | 
| web-allow-others | java.lang.Boolean | Whether to enable remote access. | false |  | 

### spring.hateoas.xx
描述:spring-hateoas,是约束REST的“统一接口”特征的重要组成部分
类型:`org.springframework.boot.autoconfigure.hateoas.HateoasProperties`
源类型:`org.springframework.boot.autoconfigure.hateoas.HateoasProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| use-hal-as-default-json-media-type | java.lang.Boolean | Whether application/hal+json responses should be sent to requests that accept application/json. | true |  | 

### spring.hazelcast.xx
描述:spring-[hazelcast](https://hazelcast.com/),分布式内存级别的缓存数据库
类型:`org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties`
源类型:`org.springframework.boot.autoconfigure.hazelcast.HazelcastProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| config | org.springframework.core.io.Resource | The location of the configuration file to use to initialize Hazelcast. |  |  | 

### spring.influx.xx
描述:spring-influx
类型:`org.springframework.boot.autoconfigure.influx.InfluxDbProperties`
源类型:`org.springframework.boot.autoconfigure.influx.InfluxDbProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| password | java.lang.String | Login password. |  |  | 
| url | java.lang.String | URL of the InfluxDB instance to which to connect. |  |  | 
| user | java.lang.String | Login user. |  |  | 

### spring.info.xx
描述:spring-info
类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties`
源类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.info.build.xx
描述:spring-info-build
类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Build`
源类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| encoding | java.nio.charset.Charset | File encoding. | UTF-8 |  | 
| location | org.springframework.core.io.Resource | Location of the generated build-info.properties file. | classpath:META-INF/build-info.properties |  | 

### spring.info.git.xx
描述:spring-info-git
类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties$Git`
源类型:`org.springframework.boot.autoconfigure.info.ProjectInfoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| encoding | java.nio.charset.Charset | File encoding. | UTF-8 |  | 
| location | org.springframework.core.io.Resource | Location of the generated git.properties file. | classpath:git.properties |  | 

### spring.integration.xx
描述:spring-integration
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.integration.channel.xx
描述:spring-integration-channel
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Channel`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| auto-create | java.lang.Boolean | Whether to create input channels if necessary. | true |  | 
| max-broadcast-subscribers | java.lang.Integer | Default number of subscribers allowed on, for example, a 'PublishSubscribeChannel'. |  |  | 
| max-unicast-subscribers | java.lang.Integer | Default number of subscribers allowed on, for example, a 'DirectChannel'. |  |  | 

### spring.integration.endpoint.xx
描述:spring-integration-endpoint
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Endpoint`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| no-auto-startup | java.util.List<java.lang.String> | A comma-separated list of endpoint bean names patterns that should not be started automatically during application startup. |  |  | 
| read-only-headers | java.util.List<java.lang.String> | A comma-separated list of message header names that should not be populated into Message instances during a header copying operation. |  |  | 
| throw-exception-on-late-reply | java.lang.Boolean | Whether to throw an exception when a reply is not expected anymore by a gateway. | false |  | 

### spring.integration.error.xx
描述:spring-integration-error
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Error`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ignore-failures | java.lang.Boolean | Whether to ignore failures for one or more of the handlers of the global 'errorChannel'. | true |  | 
| require-subscribers | java.lang.Boolean | Whether to not silently ignore messages on the global 'errorChannel' when they are no subscribers. | true |  | 

### spring.integration.jdbc.xx
描述:spring-integration-jdbc
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Jdbc`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | Database schema initialization mode. | embedded |  | 
| platform | java.lang.String | Platform to use in initialization scripts if the @@platform@@ placeholder is used. Auto-detected by default. |  |  | 
| schema | java.lang.String | Path to the SQL file to use to initialize the database schema. | classpath:org/springframework/integration/jdbc/schema-@@platform@@.sql |  | 

### spring.integration.management.xx
描述:spring-integration-management
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Management`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-logging-enabled | java.lang.Boolean | Whether Spring Integration components should perform logging in the main message flow. When disabled, such logging will be skipped without checking the logging level. When enabled, such logging is controlled as normal by the logging system's log level configuration. | true |  | 

### spring.integration.poller.xx
描述:spring-integration-poller
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$Poller`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cron | java.lang.String | Cron expression for polling. Mutually exclusive with 'fixedDelay' and 'fixedRate'. |  |  | 
| fixed-delay | java.time.Duration | Polling delay period. Mutually exclusive with 'cron' and 'fixedRate'. |  |  | 
| fixed-rate | java.time.Duration | Polling rate period. Mutually exclusive with 'fixedDelay' and 'cron'. |  |  | 
| initial-delay | java.time.Duration | Polling initial delay. Applied for 'fixedDelay' and 'fixedRate'; ignored for 'cron'. |  |  | 
| max-messages-per-poll | java.lang.Integer | Maximum number of messages to poll per polling cycle. |  |  | 
| receive-timeout | java.time.Duration | How long to wait for messages on poll. | 1s |  | 

### spring.integration.rsocket.xx
描述:spring-integration-rsocket
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.integration.rsocket.client.xx
描述:spring-integration-rsocket-client
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Client`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| host | java.lang.String | TCP RSocket server host to connect to. |  |  | 
| port | java.lang.Integer | TCP RSocket server port to connect to. |  |  | 
| uri | java.net.URI | WebSocket RSocket server uri to connect to. |  |  | 

### spring.integration.rsocket.server.xx
描述:spring-integration-rsocket-server
类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket$Server`
源类型:`org.springframework.boot.autoconfigure.integration.IntegrationProperties$RSocket`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| message-mapping-enabled | java.lang.Boolean | Whether to handle message mapping for RSocket via Spring Integration. | false |  | 

### spring.jackson.xx
描述:spring-jackson
类型:`org.springframework.boot.autoconfigure.jackson.JacksonProperties`
源类型:`org.springframework.boot.autoconfigure.jackson.JacksonProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.jdbc.xx
描述:spring-jdbc
类型:`org.springframework.boot.autoconfigure.jdbc.JdbcProperties`
源类型:`org.springframework.boot.autoconfigure.jdbc.JdbcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.jdbc.template.xx
描述:spring-jdbc-模板
类型:`org.springframework.boot.autoconfigure.jdbc.JdbcProperties$Template`
源类型:`org.springframework.boot.autoconfigure.jdbc.JdbcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| fetch-size | java.lang.Integer | Number of rows that should be fetched from the database when more rows are needed. Use -1 to use the JDBC driver's default configuration. | -1 |  | 
| max-rows | java.lang.Integer | Maximum number of rows. Use -1 to use the JDBC driver's default configuration. | -1 |  | 
| query-timeout | java.time.Duration | Query timeout. Default is to use the JDBC driver's default configuration. If a duration suffix is not specified, seconds will be used. |  |  | 

### spring.jersey.xx
描述:spring-jersey
类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties`
源类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| application-path | java.lang.String | Path that serves as the base URI for the application. If specified, overrides the value of "@ApplicationPath". |  |  | 
| init | java.util.Map<java.lang.String,java.lang.String> | Init parameters to pass to Jersey through the servlet or filter. |  |  | 
| type | org.springframework.boot.autoconfigure.jersey.JerseyProperties$Type | Jersey integration type. | servlet |  | 

### spring.jersey.filter.xx
描述:spring-jersey-filter
类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties$Filter`
源类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| order | java.lang.Integer | Jersey filter chain order. | 0 |  | 

### spring.jersey.servlet.xx
描述:spring-jersey-servlet
类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.jersey.JerseyProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| load-on-startup | java.lang.Integer | Load on startup priority of the Jersey servlet. | -1 |  | 

### spring.jms.xx
描述:spring-jms
类型:`org.springframework.boot.autoconfigure.jms.JmsProperties`
源类型:`org.springframework.boot.autoconfigure.jms.JmsProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| jndi-name | java.lang.String | Connection factory JNDI name. When set, takes precedence to others connection factory auto-configurations. |  |  | 
| pub-sub-domain | java.lang.Boolean | Whether the default destination type is topic. | false |  | 

### spring.jms.cache.xx
描述:spring-jms-cache
类型:`org.springframework.boot.autoconfigure.jms.JmsProperties$Cache`
源类型:`org.springframework.boot.autoconfigure.jms.JmsProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| consumers | java.lang.Boolean | Whether to cache message consumers. | false |  | 
| enabled | java.lang.Boolean | Whether to cache sessions. | true |  | 
| producers | java.lang.Boolean | Whether to cache message producers. | true |  | 
| session-cache-size | java.lang.Integer | Size of the session cache (per JMS Session type). | 1 |  | 

### spring.jms.listener.xx
描述:spring-jms-listener
类型:`org.springframework.boot.autoconfigure.jms.JmsProperties$Listener`
源类型:`org.springframework.boot.autoconfigure.jms.JmsProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| acknowledge-mode | org.springframework.boot.autoconfigure.jms.JmsProperties$AcknowledgeMode | Acknowledge mode of the container. By default, the listener is transacted with automatic acknowledgment. |  |  | 
| auto-startup | java.lang.Boolean | Start the container automatically on startup. | true |  | 
| concurrency | java.lang.Integer | Minimum number of concurrent consumers. |  |  | 
| max-concurrency | java.lang.Integer | Maximum number of concurrent consumers. |  |  | 
| receive-timeout | java.time.Duration | Timeout to use for receive calls. Use -1 for a no-wait receive or 0 for no timeout at all. The latter is only feasible if not running within a transaction manager and is generally discouraged since it prevents clean shutdown. | 1s |  | 

### spring.jms.template.xx
描述:spring-jms-template
类型:`org.springframework.boot.autoconfigure.jms.JmsProperties$Template`
源类型:`org.springframework.boot.autoconfigure.jms.JmsProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-destination | java.lang.String | Default destination to use on send and receive operations that do not have a destination parameter. |  |  | 
| delivery-delay | java.time.Duration | Delivery delay to use for send calls. |  |  | 
| delivery-mode | org.springframework.boot.autoconfigure.jms.JmsProperties$DeliveryMode | Delivery mode. Enables QoS (Quality of Service) when set. |  |  | 
| priority | java.lang.Integer | Priority of a message when sending. Enables QoS (Quality of Service) when set. |  |  | 
| qos-enabled | java.lang.Boolean | Whether to enable explicit QoS (Quality of Service) when sending a message. When enabled, the delivery mode, priority and time-to-live properties will be used when sending a message. QoS is automatically enabled when at least one of those settings is customized. |  |  | 
| receive-timeout | java.time.Duration | Timeout to use for receive calls. |  |  | 
| time-to-live | java.time.Duration | Time-to-live of a message when sending. Enables QoS (Quality of Service) when set. |  |  | 

### spring.jooq.xx
描述:spring-[jooq](https://www.jooq.org/)
类型:`org.springframework.boot.autoconfigure.jooq.JooqProperties`
源类型:`org.springframework.boot.autoconfigure.jooq.JooqProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| sql-dialect | org.jooq.SQLDialect | SQL dialect to use. Auto-detected by default. |  |  | 

### spring.jpa.xx
描述:spring-jpa
类型:`org.springframework.boot.autoconfigure.orm.jpa.JpaProperties`
源类型:`org.springframework.boot.autoconfigure.orm.jpa.JpaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| database | org.springframework.orm.jpa.vendor.Database | Target database to operate on, auto-detected by default. Can be alternatively set using the "databasePlatform" property. |  |  | 
| database-platform | java.lang.String | Name of the target database to operate on, auto-detected by default. Can be alternatively set using the "Database" enum. |  |  | 
| generate-ddl | java.lang.Boolean | Whether to initialize the schema on startup. | false |  | 
| mapping-resources | java.util.List<java.lang.String> | Mapping resources (equivalent to "mapping-file" entries in persistence.xml). |  |  | 
| open-in-view | java.lang.Boolean | Register OpenEntityManagerInViewInterceptor. Binds a JPA EntityManager to the thread for the entire processing of the request. | true |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional native properties to set on the JPA provider. |  |  | 
| show-sql | java.lang.Boolean | Whether to enable logging of SQL statements. | false |  | 

### spring.jpa.hibernate.xx
描述:spring-jpa-hibernate
类型:`org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties`
源类型:`org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ddl-auto | java.lang.String | DDL mode. This is actually a shortcut for the "hibernate.hbm2ddl.auto" property. Defaults to "create-drop" when using an embedded database and no schema manager was detected. Otherwise, defaults to "none". |  |  | 
| use-new-id-generator-mappings | java.lang.Boolean | Whether to use Hibernate's newer IdentifierGenerator for AUTO, TABLE and SEQUENCE. This is actually a shortcut for the "hibernate.id.new_generator_mappings" property. When not specified will default to "true". |  |  | 

### spring.jpa.hibernate.naming.xx
描述:spring-jpa-hibernate-naming
类型:`org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties$Naming`
源类型:`org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| implicit-strategy | java.lang.String | Fully qualified name of the implicit naming strategy. |  |  | 
| physical-strategy | java.lang.String | Fully qualified name of the physical naming strategy. |  |  | 

### spring.jta.xx
描述:spring-jta
类型:`org.springframework.boot.autoconfigure.transaction.jta.JtaProperties`
源类型:`org.springframework.boot.autoconfigure.transaction.jta.JtaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| log-dir | java.lang.String | Transaction logs directory. |  |  | 
| transaction-manager-id | java.lang.String | Transaction manager unique identifier. |  |  | 

### spring.kafka.xx
描述:spring-kafka
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Applies to all components unless overridden. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties, common to producers and consumers, used to configure the client. |  |  | 

### spring.kafka.admin.xx
描述:spring-kafka-admin
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Admin`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| fail-fast | java.lang.Boolean | Whether to fail fast if the broker is not available on startup. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional admin-specific properties used to configure the client. |  |  | 

### spring.kafka.admin.security.xx
描述:spring-kafka-admin-protocol
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Admin`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 

### spring.kafka.admin.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Admin`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 

### spring.kafka.consumer.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Consumer`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.kafka.consumer.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Consumer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 

### spring.kafka.consumer.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Consumer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 

### spring.kafka.jaas.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Jaas`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| control-flag | org.springframework.kafka.security.jaas.KafkaJaasLoginModuleInitializer$ControlFlag | Control flag for login configuration. | required |  | 
| enabled | java.lang.Boolean | Whether to enable JAAS configuration. | false |  | 
| login-module | java.lang.String | Login module. | com.sun.security.auth.module.Krb5LoginModule |  | 
| options | java.util.Map<java.lang.String,java.lang.String> | Additional JAAS options. |  |  | 

### spring.kafka.listener.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Listener`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ack-count | java.lang.Integer | Number of records between offset commits when ackMode is "COUNT" or "COUNT_TIME". |  |  | 
| ack-mode | org.springframework.kafka.listener.ContainerProperties$AckMode | Listener AckMode. See the spring-kafka documentation. |  |  | 
| ack-time | java.time.Duration | Time between offset commits when ackMode is "TIME" or "COUNT_TIME". |  |  | 
| client-id | java.lang.String | Prefix for the listener's consumer client.id property. |  |  | 
| concurrency | java.lang.Integer | Number of threads to run in the listener containers. |  |  | 
| idle-between-polls | java.time.Duration | Sleep interval between Consumer.poll(Duration) calls. | 0 |  | 
| idle-event-interval | java.time.Duration | Time between publishing idle consumer events (no data received). |  |  | 
| log-container-config | java.lang.Boolean | Whether to log the container configuration during initialization (INFO level). |  |  | 
| missing-topics-fatal | java.lang.Boolean | Whether the container should fail to start if at least one of the configured topics are not present on the broker. | false |  | 
| monitor-interval | java.time.Duration | Time between checks for non-responsive consumers. If a duration suffix is not specified, seconds will be used. |  |  | 
| no-poll-threshold | java.lang.Float | Multiplier applied to "pollTimeout" to determine if a consumer is non-responsive. |  |  | 
| only-log-record-metadata | java.lang.Boolean | Whether to suppress the entire record from being written to the log when retries are being attempted. | true |  | 
| poll-timeout | java.time.Duration | Timeout to use when polling the consumer. |  |  | 
| type | org.springframework.boot.autoconfigure.kafka.KafkaProperties$Listener$Type | Listener type. | single |  | 

### spring.kafka.producer.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Producer`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.kafka.producer.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Producer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 

### spring.kafka.producer.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Producer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 

### spring.kafka.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 

### spring.kafka.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 

### spring.kafka.streams.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| application-id | java.lang.String | Kafka streams application.id property; default spring.application.name. |  |  | 
| auto-startup | java.lang.Boolean | Whether or not to auto-start the streams factory bean. | true |  | 
| bootstrap-servers | java.util.List<java.lang.String> | Comma-delimited list of host:port pairs to use for establishing the initial connections to the Kafka cluster. Overrides the global property, for streams. |  |  | 
| cache-max-size-buffering | org.springframework.util.unit.DataSize | Maximum memory size to be used for buffering across all threads. |  |  | 
| client-id | java.lang.String | ID to pass to the server when making requests. Used for server-side logging. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Kafka properties used to configure the streams. |  |  | 
| replication-factor | java.lang.Integer | The replication factor for change log topics and repartition topics created by the stream processing application. |  |  | 
| state-dir | java.lang.String | Directory location for the state store. |  |  | 

### spring.kafka.streams.cleanup.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Cleanup`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| on-shutdown | java.lang.Boolean | Cleanup the application’s local state directory on shutdown. | false |  | 
| on-startup | java.lang.Boolean | Cleanup the application’s local state directory on startup. | false |  | 

### spring.kafka.streams.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Security`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 
| protocol | java.lang.String | Security protocol used to communicate with brokers. |  |  | 

### spring.kafka.streams.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Streams`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| key-password | java.lang.String | Password of the private key in either key store key or key store file. |  |  | 
| key-store-certificate-chain | java.lang.String | Certificate chain in PEM format with a list of X.509 certificates. |  |  | 
| key-store-key | java.lang.String | Private key in PEM format with PKCS#8 keys. |  |  | 
| key-store-location | org.springframework.core.io.Resource | Location of the key store file. |  |  | 
| key-store-password | java.lang.String | Store password for the key store file. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. |  |  | 
| trust-store-certificates | java.lang.String | Trusted certificates in PEM format with X.509 certificates. |  |  | 
| trust-store-location | org.springframework.core.io.Resource | Location of the trust store file. |  |  | 
| trust-store-password | java.lang.String | Store password for the trust store file. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 

### spring.kafka.template.xx
描述:
类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties$Template`
源类型:`org.springframework.boot.autoconfigure.kafka.KafkaProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-topic | java.lang.String | Default topic to which messages are sent. |  |  | 

### spring.ldap.xx
描述:
类型:`org.springframework.boot.autoconfigure.ldap.LdapProperties`
源类型:`org.springframework.boot.autoconfigure.ldap.LdapProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| anonymous-read-only | java.lang.Boolean | Whether read-only operations should use an anonymous environment. Disabled by default unless a username is set. |  |  | 
| base | java.lang.String | Base suffix from which all operations should originate. |  |  | 
| base-environment | java.util.Map<java.lang.String,java.lang.String> | LDAP specification settings. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| urls | java.lang.String[] | LDAP URLs of the server. |  |  | 
| username | java.lang.String | Login username of the server. |  |  | 

### spring.ldap.embedded.xx
描述:
类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties`
源类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| base-dn | java.util.List<java.lang.String> | List of base DNs. |  |  | 
| ldif | java.lang.String | Schema (LDIF) script resource reference. | classpath:schema.ldif |  | 
| port | java.lang.Integer | Embedded LDAP port. | 0 |  | 

### spring.ldap.embedded.credential.xx
描述:
类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Credential`
源类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| password | java.lang.String | Embedded LDAP password. |  |  | 
| username | java.lang.String | Embedded LDAP username. |  |  | 

### spring.ldap.embedded.validation.xx
描述:
类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties$Validation`
源类型:`org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable LDAP schema validation. | true |  | 
| schema | org.springframework.core.io.Resource | Path to the custom schema. |  |  | 

### spring.ldap.template.xx
描述:
类型:`org.springframework.boot.autoconfigure.ldap.LdapProperties$Template`
源类型:`org.springframework.boot.autoconfigure.ldap.LdapProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ignore-name-not-found-exception | java.lang.Boolean | Whether NameNotFoundException should be ignored in searches via the LdapTemplate. | false |  | 
| ignore-partial-result-exception | java.lang.Boolean | Whether PartialResultException should be ignored in searches via the LdapTemplate. | false |  | 
| ignore-size-limit-exceeded-exception | java.lang.Boolean | Whether SizeLimitExceededException should be ignored in searches via the LdapTemplate. | true |  | 

### spring.lifecycle.xx
描述:
类型:`org.springframework.boot.autoconfigure.context.LifecycleProperties`
源类型:`org.springframework.boot.autoconfigure.context.LifecycleProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| timeout-per-shutdown-phase | java.time.Duration | Timeout for the shutdown of any phase (group of SmartLifecycle beans with the same 'phase' value). | 30s |  | 

### spring.liquibase.xx
描述:
类型:`org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties`
源类型:`org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.mail.xx
描述:
类型:`org.springframework.boot.autoconfigure.mail.MailProperties`
源类型:`org.springframework.boot.autoconfigure.mail.MailProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-encoding | java.nio.charset.Charset | Default MimeMessage encoding. | UTF-8 |  | 
| host | java.lang.String | SMTP server host. For instance, 'smtp.example.com'. |  |  | 
| jndi-name | java.lang.String | Session JNDI name. When set, takes precedence over other Session settings. |  |  | 
| password | java.lang.String | Login password of the SMTP server. |  |  | 
| port | java.lang.Integer | SMTP server port. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional JavaMail Session properties. |  |  | 
| protocol | java.lang.String | Protocol used by the SMTP server. | smtp |  | 
| test-connection | java.lang.Boolean | Whether to test that the mail server is available on startup. | false |  | 
| username | java.lang.String | Login user of the SMTP server. |  |  | 

### spring.messages.xx
描述:
类型:`org.springframework.boot.autoconfigure.context.MessageSourceProperties`
源类型:`org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| always-use-message-format | java.lang.Boolean | Whether to always apply the MessageFormat rules, parsing even messages without arguments. | false |  | 
| basename | java.lang.String | Comma-separated list of basenames (essentially a fully-qualified classpath location), each following the ResourceBundle convention with relaxed support for slash based locations. If it doesn't contain a package qualifier (such as "org.mypackage"), it will be resolved from the classpath root. | messages |  | 
| cache-duration | java.time.Duration | Loaded resource bundle files cache duration. When not set, bundles are cached forever. If a duration suffix is not specified, seconds will be used. |  |  | 
| encoding | java.nio.charset.Charset | Message bundles encoding. | UTF-8 |  | 
| fallback-to-system-locale | java.lang.Boolean | Whether to fall back to the system Locale if no files for a specific Locale have been found. if this is turned off, the only fallback will be the default file (e.g. "messages.properties" for basename "messages"). | true |  | 
| use-code-as-default-message | java.lang.Boolean | Whether to use the message code as the default message instead of throwing a "NoSuchMessageException". Recommended during development only. | false |  | 

### spring.mongodb.embedded.xx
描述:
类型:`org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties`
源类型:`org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| features | java.util.Set<de.flapdoodle.embed.mongo.distribution.Feature> | Comma-separated list of features to enable. Uses the defaults of the configured version by default. | ["sync_delay"] |  | 
| version | java.lang.String | Version of Mongo to use. |  |  | 

### spring.mongodb.embedded.storage.xx
描述:
类型:`org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties$Storage`
源类型:`org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| database-dir | java.lang.String | Directory used for data storage. |  |  | 
| oplog-size | org.springframework.util.unit.DataSize | Maximum size of the oplog. |  |  | 
| repl-set-name | java.lang.String | Name of the replica set. |  |  | 

### spring.mustache.xx
描述:
类型:`org.springframework.boot.autoconfigure.mustache.MustacheProperties`
源类型:`org.springframework.boot.autoconfigure.mustache.MustacheProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.mvc.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| dispatch-options-request | java.lang.Boolean | Whether to dispatch OPTIONS requests to the FrameworkServlet doService method. | true |  | 
| dispatch-trace-request | java.lang.Boolean | Whether to dispatch TRACE requests to the FrameworkServlet doService method. | false |  | 
| ignore-default-model-on-redirect | java.lang.Boolean | Whether the content of the "default" model should be ignored during redirect scenarios. | true |  | 
| log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false |  | 
| log-resolved-exception | java.lang.Boolean | Whether to enable warn logging of exceptions resolved by a "HandlerExceptionResolver", except for "DefaultHandlerExceptionResolver". | false |  | 
| message-codes-resolver-format | org.springframework.validation.DefaultMessageCodesResolver$Format | Formatting strategy for message codes. For instance, 'PREFIX_ERROR_CODE'. |  |  | 
| publish-request-handled-events | java.lang.Boolean | Whether to publish a ServletRequestHandledEvent at the end of each request. | true |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 
| throw-exception-if-no-handler-found | java.lang.Boolean | Whether a "NoHandlerFoundException" should be thrown if no Handler was found to process a request. | false |  | 
| date-format | java.lang.String | null |  | true,spring.mvc.format.date | 

### spring.mvc.async.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Async`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| request-timeout | java.time.Duration | Amount of time before asynchronous request handling times out. If this value is not set, the default timeout of the underlying implementation is used. |  |  | 

### spring.mvc.contentnegotiation.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Contentnegotiation`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| favor-parameter | java.lang.Boolean | Whether a request parameter ("format" by default) should be used to determine the requested media type. | false |  | 
| media-types | java.util.Map<java.lang.String,org.springframework.http.MediaType> | Map file extensions to media types for content negotiation. For instance, yml to text/yaml. |  |  | 
| parameter-name | java.lang.String | Query parameter name to use when "favor-parameter" is enabled. |  |  | 
| favor-path-extension | java.lang.Boolean | Whether the path extension in the URL path should be used to determine the requested media type. If enabled a request "/users.pdf" will be interpreted as a request for "application/pdf" regardless of the 'Accept' header. | false | true,Use of path extensions for request mapping and for content negotiation is discouraged. | 

### spring.mvc.format.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Format`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| date | java.lang.String | Date format to use, for example 'dd/MM/yyyy'. |  |  | 
| date-time | java.lang.String | Date-time format to use, for example 'yyyy-MM-dd HH:mm:ss'. |  |  | 
| time | java.lang.String | Time format to use, for example 'HH:mm:ss'. |  |  | 

### spring.mvc.pathmatch.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Pathmatch`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| matching-strategy | org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$MatchingStrategy | Choice of strategy for matching request paths against registered mappings. | path-pattern-parser |  | 
| use-registered-suffix-pattern | java.lang.Boolean | Whether suffix pattern matching should work only against extensions registered with "spring.mvc.contentnegotiation.media-types.*". This is generally recommended to reduce ambiguity and to avoid issues such as when a "." appears in the path for other reasons. Enabling this option is not compatible with the PathPatternParser matching strategy. | false | true,Use of path extensions for request mapping and for content negotiation is discouraged. | 
| use-suffix-pattern | java.lang.Boolean | Whether to use suffix pattern match (".*") when matching patterns to requests. If enabled a method mapped to "/users" also matches to "/users.*". Enabling this option is not compatible with the PathPatternParser matching strategy. | false | true,Use of path extensions for request mapping and for content negotiation is discouraged. | 

### spring.mvc.servlet.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| load-on-startup | java.lang.Integer | Load on startup priority of the dispatcher servlet. | -1 |  | 
| path | java.lang.String | Path of the dispatcher servlet. Setting a custom value for this property is not compatible with the PathPatternParser matching strategy. | / |  | 

### spring.mvc.view.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties$View`
源类型:`org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| prefix | java.lang.String | Spring MVC view prefix. |  |  | 
| suffix | java.lang.String | Spring MVC view suffix. |  |  | 

### spring.neo4j.xx
描述:
类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties`
源类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-timeout | java.time.Duration | Timeout for borrowing connections from the pool. | 30s |  | 
| max-transaction-retry-time | java.time.Duration | Maximum time transactions are allowed to retry. | 30s |  | 
| uri | java.net.URI | URI used by the driver. | bolt://localhost:7687 |  | 

### spring.neo4j.authentication.xx
描述:
类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Authentication`
源类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| kerberos-ticket | java.lang.String | Kerberos ticket for connecting to the database. Mutual exclusive with a given username. |  |  | 
| password | java.lang.String | Login password of the server. |  |  | 
| realm | java.lang.String | Realm to connect to. |  |  | 
| username | java.lang.String | Login user of the server. |  |  | 

### spring.neo4j.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| connection-acquisition-timeout | java.time.Duration | Acquisition of new connections will be attempted for at most configured timeout. | 60s |  | 
| idle-time-before-connection-test | java.time.Duration | Pooled connections that have been idle in the pool for longer than this threshold will be tested before they are used again. |  |  | 
| log-leaked-sessions | java.lang.Boolean | Whether to log leaked sessions. | false |  | 
| max-connection-lifetime | java.time.Duration | Pooled connections older than this threshold will be closed and removed from the pool. | 1h |  | 
| max-connection-pool-size | java.lang.Integer | Maximum amount of connections in the connection pool towards a single database. | 100 |  | 
| metrics-enabled | java.lang.Boolean | Whether to enable metrics. | false |  | 

### spring.neo4j.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Security`
源类型:`org.springframework.boot.autoconfigure.neo4j.Neo4jProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cert-file | java.io.File | Path to the file that holds the trusted certificates. |  |  | 
| encrypted | java.lang.Boolean | Whether the driver should use encrypted traffic. | false |  | 
| hostname-verification-enabled | java.lang.Boolean | Whether hostname verification is required. | true |  | 
| trust-strategy | org.springframework.boot.autoconfigure.neo4j.Neo4jProperties$Security$TrustStrategy | Trust strategy to use. | trust-system-ca-signed-certificates |  | 

### spring.netty.xx
描述:
类型:`org.springframework.boot.autoconfigure.netty.NettyProperties`
源类型:`org.springframework.boot.autoconfigure.netty.NettyProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| leak-detection | org.springframework.boot.autoconfigure.netty.NettyProperties$LeakDetection | Level of leak detection for reference-counted buffers. | simple |  | 

### spring.quartz.xx
描述:
类型:`org.springframework.boot.autoconfigure.quartz.QuartzProperties`
源类型:`org.springframework.boot.autoconfigure.quartz.QuartzProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| auto-startup | java.lang.Boolean | Whether to automatically start the scheduler after initialization. | true |  | 
| job-store-type | org.springframework.boot.autoconfigure.quartz.JobStoreType | Quartz job store type. | memory |  | 
| overwrite-existing-jobs | java.lang.Boolean | Whether configured jobs should overwrite existing job definitions. | false |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional Quartz Scheduler properties. |  |  | 
| scheduler-name | java.lang.String | Name of the scheduler. | quartzScheduler |  | 
| startup-delay | java.time.Duration | Delay after which the scheduler is started once initialization completes. Setting this property makes sense if no jobs should be run before the entire application has started up. | 0s |  | 
| wait-for-jobs-to-complete-on-shutdown | java.lang.Boolean | Whether to wait for running jobs to complete on shutdown. | false |  | 

### spring.quartz.jdbc.xx
描述:
类型:`org.springframework.boot.autoconfigure.quartz.QuartzProperties$Jdbc`
源类型:`org.springframework.boot.autoconfigure.quartz.QuartzProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| comment-prefix | java.util.List<java.lang.String> | Prefixes for single-line comments in SQL initialization scripts. | ["#","--"] |  | 
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | Database schema initialization mode. | embedded |  | 
| platform | java.lang.String | Platform to use in initialization scripts if the @@platform@@ placeholder is used. Auto-detected by default. |  |  | 
| schema | java.lang.String | Path to the SQL file to use to initialize the database schema. | classpath:org/quartz/impl/jdbcjobstore/tables_@@platform@@.sql |  | 

### spring.r2dbc.xx
描述:
类型:`org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties`
源类型:`org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| generate-unique-name | java.lang.Boolean | Whether to generate a random database name. Ignore any configured name when enabled. | false |  | 
| name | java.lang.String | Database name. Set if no name is specified in the url. Default to "testdb" when using an embedded database. |  |  | 
| password | java.lang.String | Login password of the database. Set if no password is specified in the url. |  |  | 
| properties | java.util.Map<java.lang.String,java.lang.String> | Additional R2DBC options. |  |  | 
| url | java.lang.String | R2DBC URL of the database. database name, username, password and pooling options specified in the url take precedence over individual options. |  |  | 
| username | java.lang.String | Login username of the database. Set if no username is specified in the url. |  |  | 

### spring.r2dbc.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether pooling is enabled. Requires r2dbc-pool. | true |  | 
| initial-size | java.lang.Integer | Initial connection pool size. | 10 |  | 
| max-acquire-time | java.time.Duration | Maximum time to acquire a connection from the pool. By default, wait indefinitely. |  |  | 
| max-create-connection-time | java.time.Duration | Maximum time to wait to create a new connection. By default, wait indefinitely. |  |  | 
| max-idle-time | java.time.Duration | Maximum amount of time that a connection is allowed to sit idle in the pool. | 30m |  | 
| max-life-time | java.time.Duration | Maximum lifetime of a connection in the pool. By default, connections have an infinite lifetime. |  |  | 
| max-size | java.lang.Integer | Maximal connection pool size. | 10 |  | 
| validation-depth | io.r2dbc.spi.ValidationDepth | Validation depth. | local |  | 
| validation-query | java.lang.String | Validation query. |  |  | 

### spring.rabbitmq.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.rabbitmq.cache.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.rabbitmq.cache.channel.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Channel`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| checkout-timeout | java.time.Duration | Duration to wait to obtain a channel if the cache size has been reached. If 0, always create a new channel. |  |  | 
| size | java.lang.Integer | Number of channels to retain in the cache. When "check-timeout" > 0, max channels per connection. |  |  | 

### spring.rabbitmq.cache.connection.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache$Connection`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Cache`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| mode | org.springframework.amqp.rabbit.connection.CachingConnectionFactory$CacheMode | Connection factory cache mode. | channel |  | 
| size | java.lang.Integer | Number of connections to cache. Only applies when mode is CONNECTION. |  |  | 

### spring.rabbitmq.listener.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| type | org.springframework.boot.autoconfigure.amqp.RabbitProperties$ContainerType | Listener container type. | simple |  | 

### spring.rabbitmq.listener.direct.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$DirectContainer`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| acknowledge-mode | org.springframework.amqp.core.AcknowledgeMode | Acknowledge mode of container. |  |  | 
| auto-startup | java.lang.Boolean | Whether to start the container automatically on startup. | true |  | 
| consumers-per-queue | java.lang.Integer | Number of consumers per queue. |  |  | 
| de-batching-enabled | java.lang.Boolean | Whether the container should present batched messages as discrete messages or call the listener with the batch. | true |  | 
| default-requeue-rejected | java.lang.Boolean | Whether rejected deliveries are re-queued by default. |  |  | 
| idle-event-interval | java.time.Duration | How often idle container events should be published. |  |  | 
| missing-queues-fatal | java.lang.Boolean | Whether to fail if the queues declared by the container are not available on the broker. | false |  | 
| prefetch | java.lang.Integer | Maximum number of unacknowledged messages that can be outstanding at each consumer. |  |  | 

### spring.rabbitmq.listener.direct.retry.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$DirectContainer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether publishing retries are enabled. | false |  | 
| initial-interval | java.time.Duration | Duration between the first and second attempt to deliver a message. | 1000ms |  | 
| max-attempts | java.lang.Integer | Maximum number of attempts to deliver a message. | 3 |  | 
| max-interval | java.time.Duration | Maximum duration between attempts. | 10000ms |  | 
| multiplier | java.lang.Double | Multiplier to apply to the previous retry interval. | 1 |  | 
| stateless | java.lang.Boolean | Whether retries are stateless or stateful. | true |  | 
| enabled | java.lang.Boolean | Whether publishing retries are enabled. | false |  | 
| initial-interval | java.time.Duration | Duration between the first and second attempt to deliver a message. | 1000ms |  | 
| max-attempts | java.lang.Integer | Maximum number of attempts to deliver a message. | 3 |  | 
| max-interval | java.time.Duration | Maximum duration between attempts. | 10000ms |  | 
| multiplier | java.lang.Double | Multiplier to apply to the previous retry interval. | 1 |  | 
| stateless | java.lang.Boolean | Whether retries are stateless or stateful. | true |  | 

### spring.rabbitmq.listener.simple.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$SimpleContainer`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.rabbitmq.listener.simple.retry.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$ListenerRetry`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$SimpleContainer`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether publishing retries are enabled. | false |  | 
| initial-interval | java.time.Duration | Duration between the first and second attempt to deliver a message. | 1000ms |  | 
| max-attempts | java.lang.Integer | Maximum number of attempts to deliver a message. | 3 |  | 
| max-interval | java.time.Duration | Maximum duration between attempts. | 10000ms |  | 
| multiplier | java.lang.Double | Multiplier to apply to the previous retry interval. | 1 |  | 
| stateless | java.lang.Boolean | Whether retries are stateless or stateful. | true |  | 
| enabled | java.lang.Boolean | Whether publishing retries are enabled. | false |  | 
| initial-interval | java.time.Duration | Duration between the first and second attempt to deliver a message. | 1000ms |  | 
| max-attempts | java.lang.Integer | Maximum number of attempts to deliver a message. | 3 |  | 
| max-interval | java.time.Duration | Maximum duration between attempts. | 10000ms |  | 
| multiplier | java.lang.Double | Multiplier to apply to the previous retry interval. | 1 |  | 
| stateless | java.lang.Boolean | Whether retries are stateless or stateful. | true |  | 

### spring.rabbitmq.listener.stream.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$StreamContainer`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Listener`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| auto-startup | java.lang.Boolean | Whether to start the container automatically on startup. | true |  | 
| native-listener | java.lang.Boolean | Whether the container will support listeners that consume native stream messages instead of Spring AMQP messages. | false |  | 

### spring.rabbitmq.ssl.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Ssl`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| algorithm | java.lang.String | SSL algorithm to use. By default, configured by the Rabbit client library. |  |  | 
| enabled | java.lang.Boolean | Whether to enable SSL support. Determined automatically if an address is provided with the protocol (amqp:// vs. amqps://). |  |  | 
| key-store | java.lang.String | Path to the key store that holds the SSL certificate. |  |  | 
| key-store-algorithm | java.lang.String | Key store algorithm. | SunX509 |  | 
| key-store-password | java.lang.String | Password used to access the key store. |  |  | 
| key-store-type | java.lang.String | Key store type. | PKCS12 |  | 
| trust-store | java.lang.String | Trust store that holds SSL certificates. |  |  | 
| trust-store-algorithm | java.lang.String | Trust store algorithm. | SunX509 |  | 
| trust-store-password | java.lang.String | Password used to access the trust store. |  |  | 
| trust-store-type | java.lang.String | Trust store type. | JKS |  | 
| validate-server-certificate | java.lang.Boolean | Whether to enable server side certificate validation. | true |  | 
| verify-hostname | java.lang.Boolean | Whether to enable hostname verification. | true |  | 

### spring.rabbitmq.stream.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Stream`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| host | java.lang.String | Host of a RabbitMQ instance with the Stream plugin enabled. | localhost |  | 
| password | java.lang.String | Login password to authenticate to the broker. When not set spring.rabbitmq.password is used. |  |  | 
| port | java.lang.Integer | Stream port of a RabbitMQ instance with the Stream plugin enabled. |  |  | 
| username | java.lang.String | Login user to authenticate to the broker. When not set, spring.rabbitmq.username is used. |  |  | 

### spring.rabbitmq.template.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Template`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-receive-queue | java.lang.String | Name of the default queue to receive messages from when none is specified explicitly. |  |  | 
| exchange | java.lang.String | Name of the default exchange to use for send operations. |  |  | 
| mandatory | java.lang.Boolean | Whether to enable mandatory messages. |  |  | 
| receive-timeout | java.time.Duration | Timeout for receive() operations. |  |  | 
| reply-timeout | java.time.Duration | Timeout for sendAndReceive() operations. |  |  | 
| routing-key | java.lang.String | Value of a default routing key to use for send operations. |  |  | 

### spring.rabbitmq.template.retry.xx
描述:
类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Retry`
源类型:`org.springframework.boot.autoconfigure.amqp.RabbitProperties$Template`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether publishing retries are enabled. | false |  | 
| initial-interval | java.time.Duration | Duration between the first and second attempt to deliver a message. | 1000ms |  | 
| max-attempts | java.lang.Integer | Maximum number of attempts to deliver a message. | 3 |  | 
| max-interval | java.time.Duration | Maximum duration between attempts. | 10000ms |  | 
| multiplier | java.lang.Double | Multiplier to apply to the previous retry interval. | 1 |  | 

### spring.redis.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.redis.cluster.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Cluster`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| max-redirects | java.lang.Integer | Maximum number of redirects to follow when executing commands across the cluster. |  |  | 
| nodes | java.util.List<java.lang.String> | Comma-separated list of "host:port" pairs to bootstrap from. This represents an "initial" list of cluster nodes and is required to have at least one entry. |  |  | 

### spring.redis.jedis.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Jedis`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.redis.jedis.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Jedis`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the pool. Enabled automatically if "commons-pool2" is available. With Jedis, pooling is implicitly enabled in sentinel mode and this setting only applies to single node setup. |  |  | 
| max-active | java.lang.Integer | Maximum number of connections that can be allocated by the pool at a given time. Use a negative value for no limit. | 8 |  | 
| max-idle | java.lang.Integer | Maximum number of "idle" connections in the pool. Use a negative value to indicate an unlimited number of idle connections. | 8 |  | 
| max-wait | java.time.Duration | Maximum amount of time a connection allocation should block before throwing an exception when the pool is exhausted. Use a negative value to block indefinitely. | -1ms |  | 
| min-idle | java.lang.Integer | Target for the minimum number of idle connections to maintain in the pool. This setting only has an effect if both it and time between eviction runs are positive. | 0 |  | 
| time-between-eviction-runs | java.time.Duration | Time between runs of the idle object evictor thread. When positive, the idle object evictor thread starts, otherwise no idle object eviction is performed. |  |  | 
| enabled | java.lang.Boolean | Whether to enable the pool. Enabled automatically if "commons-pool2" is available. With Jedis, pooling is implicitly enabled in sentinel mode and this setting only applies to single node setup. |  |  | 
| max-active | java.lang.Integer | Maximum number of connections that can be allocated by the pool at a given time. Use a negative value for no limit. | 8 |  | 
| max-idle | java.lang.Integer | Maximum number of "idle" connections in the pool. Use a negative value to indicate an unlimited number of idle connections. | 8 |  | 
| max-wait | java.time.Duration | Maximum amount of time a connection allocation should block before throwing an exception when the pool is exhausted. Use a negative value to block indefinitely. | -1ms |  | 
| min-idle | java.lang.Integer | Target for the minimum number of idle connections to maintain in the pool. This setting only has an effect if both it and time between eviction runs are positive. | 0 |  | 
| time-between-eviction-runs | java.time.Duration | Time between runs of the idle object evictor thread. When positive, the idle object evictor thread starts, otherwise no idle object eviction is performed. |  |  | 

### spring.redis.lettuce.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| shutdown-timeout | java.time.Duration | Shutdown timeout. | 100ms |  | 

### spring.redis.lettuce.cluster.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.redis.lettuce.cluster.refresh.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster$Refresh`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce$Cluster`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| adaptive | java.lang.Boolean | Whether adaptive topology refreshing using all available refresh triggers should be used. | false |  | 
| dynamic-refresh-sources | java.lang.Boolean | Whether to discover and query all cluster nodes for obtaining the cluster topology. When set to false, only the initial seed nodes are used as sources for topology discovery. | true |  | 
| period | java.time.Duration | Cluster topology refresh period. |  |  | 

### spring.redis.lettuce.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Lettuce`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the pool. Enabled automatically if "commons-pool2" is available. With Jedis, pooling is implicitly enabled in sentinel mode and this setting only applies to single node setup. |  |  | 
| max-active | java.lang.Integer | Maximum number of connections that can be allocated by the pool at a given time. Use a negative value for no limit. | 8 |  | 
| max-idle | java.lang.Integer | Maximum number of "idle" connections in the pool. Use a negative value to indicate an unlimited number of idle connections. | 8 |  | 
| max-wait | java.time.Duration | Maximum amount of time a connection allocation should block before throwing an exception when the pool is exhausted. Use a negative value to block indefinitely. | -1ms |  | 
| min-idle | java.lang.Integer | Target for the minimum number of idle connections to maintain in the pool. This setting only has an effect if both it and time between eviction runs are positive. | 0 |  | 
| time-between-eviction-runs | java.time.Duration | Time between runs of the idle object evictor thread. When positive, the idle object evictor thread starts, otherwise no idle object eviction is performed. |  |  | 
| enabled | java.lang.Boolean | Whether to enable the pool. Enabled automatically if "commons-pool2" is available. With Jedis, pooling is implicitly enabled in sentinel mode and this setting only applies to single node setup. |  |  | 
| max-active | java.lang.Integer | Maximum number of connections that can be allocated by the pool at a given time. Use a negative value for no limit. | 8 |  | 
| max-idle | java.lang.Integer | Maximum number of "idle" connections in the pool. Use a negative value to indicate an unlimited number of idle connections. | 8 |  | 
| max-wait | java.time.Duration | Maximum amount of time a connection allocation should block before throwing an exception when the pool is exhausted. Use a negative value to block indefinitely. | -1ms |  | 
| min-idle | java.lang.Integer | Target for the minimum number of idle connections to maintain in the pool. This setting only has an effect if both it and time between eviction runs are positive. | 0 |  | 
| time-between-eviction-runs | java.time.Duration | Time between runs of the idle object evictor thread. When positive, the idle object evictor thread starts, otherwise no idle object eviction is performed. |  |  | 

### spring.redis.sentinel.xx
描述:
类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties$Sentinel`
源类型:`org.springframework.boot.autoconfigure.data.redis.RedisProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| master | java.lang.String | Name of the Redis server. |  |  | 
| nodes | java.util.List<java.lang.String> | Comma-separated list of "host:port" pairs. |  |  | 
| password | java.lang.String | Password for authenticating with sentinel(s). |  |  | 

### spring.rsocket.xx
描述:
类型:`org.springframework.boot.autoconfigure.rsocket.RSocketProperties`
源类型:`org.springframework.boot.autoconfigure.rsocket.RSocketProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.rsocket.server.xx
描述:
类型:`org.springframework.boot.autoconfigure.rsocket.RSocketProperties$Server`
源类型:`org.springframework.boot.autoconfigure.rsocket.RSocketProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| address | java.net.InetAddress | Network address to which the server should bind. |  |  | 
| fragment-size | org.springframework.util.unit.DataSize | Maximum transmission unit. Frames larger than the specified value are fragmented. |  |  | 
| mapping-path | java.lang.String | Path under which RSocket handles requests (only works with websocket transport). |  |  | 
| port | java.lang.Integer | Server port. |  |  | 
| transport | org.springframework.boot.rsocket.server.RSocketServer$Transport | RSocket transport protocol. | tcp |  | 

### spring.rsocket.server.ssl.xx
描述:
类型:`org.springframework.boot.web.server.Ssl`
源类型:`org.springframework.boot.autoconfigure.rsocket.RSocketProperties$Server`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| ciphers | java.lang.String[] | Supported SSL ciphers. |  |  | 
| client-auth | org.springframework.boot.web.server.Ssl$ClientAuth | Client authentication mode. Requires a trust store. |  |  | 
| enabled | java.lang.Boolean | Whether to enable SSL support. | true |  | 
| enabled-protocols | java.lang.String[] | Enabled SSL protocols. |  |  | 
| key-alias | java.lang.String | Alias that identifies the key in the key store. |  |  | 
| key-password | java.lang.String | Password used to access the key in the key store. |  |  | 
| key-store | java.lang.String | Path to the key store that holds the SSL certificate (typically a jks file). |  |  | 
| key-store-password | java.lang.String | Password used to access the key store. |  |  | 
| key-store-provider | java.lang.String | Provider for the key store. |  |  | 
| key-store-type | java.lang.String | Type of the key store. |  |  | 
| protocol | java.lang.String | SSL protocol to use. | TLS |  | 
| trust-store | java.lang.String | Trust store that holds SSL certificates. |  |  | 
| trust-store-password | java.lang.String | Password used to access the trust store. |  |  | 
| trust-store-provider | java.lang.String | Provider for the trust store. |  |  | 
| trust-store-type | java.lang.String | Type of the trust store. |  |  | 
| ciphers | java.lang.String[] | null |  |  | 
| client-auth | org.springframework.boot.web.server.Ssl$ClientAuth | null |  |  | 
| enabled | java.lang.Boolean | null |  |  | 
| enabled-protocols | java.lang.String[] | null |  |  | 
| key-alias | java.lang.String | null |  |  | 
| key-password | java.lang.String | null |  |  | 
| key-store | java.lang.String | null |  |  | 
| key-store-password | java.lang.String | null |  |  | 
| key-store-provider | java.lang.String | null |  |  | 
| key-store-type | java.lang.String | null |  |  | 
| protocol | java.lang.String | null |  |  | 
| trust-store | java.lang.String | null |  |  | 
| trust-store-password | java.lang.String | null |  |  | 
| trust-store-provider | java.lang.String | null |  |  | 
| trust-store-type | java.lang.String | null |  |  | 

### spring.security.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.SecurityProperties`
源类型:`org.springframework.boot.autoconfigure.security.SecurityProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.security.filter.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.SecurityProperties$Filter`
源类型:`org.springframework.boot.autoconfigure.security.SecurityProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| dispatcher-types | java.util.Set<org.springframework.boot.web.servlet.DispatcherType> | Security filter chain dispatcher types. | ["async","error","request"] |  | 
| order | java.lang.Integer | Security filter chain order. | -100 |  | 

### spring.security.oauth2.client.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties`
源类型:`org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| provider | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties$Provider> | OAuth provider details. |  |  | 
| registration | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties$Registration> | OAuth client registrations. |  |  | 

### spring.security.oauth2.resourceserver.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties`
源类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.security.oauth2.resourceserver.jwt.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Jwt`
源类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| issuer-uri | java.lang.String | URI that can either be an OpenID Connect discovery endpoint or an OAuth 2.0 Authorization Server Metadata endpoint defined by RFC 8414. |  |  | 
| jwk-set-uri | java.lang.String | JSON Web Key URI to use to verify the JWT token. |  |  | 
| jws-algorithm | java.lang.String | JSON Web Algorithm used for verifying the digital signatures. | RS256 |  | 
| public-key-location | org.springframework.core.io.Resource | Location of the file containing the public key used to verify a JWT. |  |  | 

### spring.security.oauth2.resourceserver.opaquetoken.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties$Opaquetoken`
源类型:`org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| client-id | java.lang.String | Client id used to authenticate with the token introspection endpoint. |  |  | 
| client-secret | java.lang.String | Client secret used to authenticate with the token introspection endpoint. |  |  | 
| introspection-uri | java.lang.String | OAuth 2.0 endpoint through which token introspection is accomplished. |  |  | 

### spring.security.saml2.relyingparty.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties`
源类型:`org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| registration | java.util.Map<java.lang.String,org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties$Registration> | SAML2 relying party registrations. |  |  | 

### spring.security.user.xx
描述:
类型:`org.springframework.boot.autoconfigure.security.SecurityProperties$User`
源类型:`org.springframework.boot.autoconfigure.security.SecurityProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| name | java.lang.String | Default user name. | user |  | 
| password | java.lang.String | Password for the default user name. |  |  | 
| roles | java.util.List<java.lang.String> | Granted roles for the default user name. |  |  | 

### spring.sendgrid.xx
描述:
类型:`org.springframework.boot.autoconfigure.sendgrid.SendGridProperties`
源类型:`org.springframework.boot.autoconfigure.sendgrid.SendGridProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| api-key | java.lang.String | SendGrid API key. |  |  | 

### spring.sendgrid.proxy.xx
描述:
类型:`org.springframework.boot.autoconfigure.sendgrid.SendGridProperties$Proxy`
源类型:`org.springframework.boot.autoconfigure.sendgrid.SendGridProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| host | java.lang.String | SendGrid proxy host. |  |  | 
| port | java.lang.Integer | SendGrid proxy port. |  |  | 

### spring.servlet.multipart.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.servlet.MultipartProperties`
源类型:`org.springframework.boot.autoconfigure.web.servlet.MultipartProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable support of multipart uploads. | true |  | 
| file-size-threshold | org.springframework.util.unit.DataSize | Threshold after which files are written to disk. | 0B |  | 
| location | java.lang.String | Intermediate location of uploaded files. |  |  | 
| max-file-size | org.springframework.util.unit.DataSize | Max file size. | 1MB |  | 
| max-request-size | org.springframework.util.unit.DataSize | Max request size. | 10MB |  | 
| resolve-lazily | java.lang.Boolean | Whether to resolve the multipart request lazily at the time of file or parameter access. | false |  | 

### spring.session.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.SessionProperties`
源类型:`org.springframework.boot.autoconfigure.session.SessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| store-type | org.springframework.boot.autoconfigure.session.StoreType | Session store type. |  |  | 
| timeout | java.time.Duration | Session timeout. If a duration suffix is not specified, seconds will be used. |  |  | 

### spring.session.hazelcast.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.HazelcastSessionProperties`
源类型:`org.springframework.boot.autoconfigure.session.HazelcastSessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| map-name | java.lang.String | Name of the map used to store sessions. | spring:session:sessions |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 

### spring.session.jdbc.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.JdbcSessionProperties`
源类型:`org.springframework.boot.autoconfigure.session.JdbcSessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cleanup-cron | java.lang.String | Cron expression for expired session cleanup job. | 0 * * * * * |  | 
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| initialize-schema | org.springframework.boot.sql.init.DatabaseInitializationMode | Database schema initialization mode. | embedded |  | 
| platform | java.lang.String | Platform to use in initialization scripts if the @@platform@@ placeholder is used. Auto-detected by default. |  |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 
| schema | java.lang.String | Path to the SQL file to use to initialize the database schema. | classpath:org/springframework/session/jdbc/schema-@@platform@@.sql |  | 
| table-name | java.lang.String | Name of the database table used to store sessions. | SPRING_SESSION |  | 

### spring.session.mongodb.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.MongoSessionProperties`
源类型:`org.springframework.boot.autoconfigure.session.MongoSessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| collection-name | java.lang.String | Collection name used to store sessions. | sessions |  | 

### spring.session.redis.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.RedisSessionProperties`
源类型:`org.springframework.boot.autoconfigure.session.RedisSessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cleanup-cron | java.lang.String | Cron expression for expired session cleanup job. | 0 * * * * * |  | 
| configure-action | org.springframework.boot.autoconfigure.session.RedisSessionProperties$ConfigureAction | The configure action to apply when no user defined ConfigureRedisAction bean is present. | notify-keyspace-events |  | 
| flush-mode | org.springframework.session.FlushMode | Sessions flush mode. Determines when session changes are written to the session store. | on-save |  | 
| namespace | java.lang.String | Namespace for keys used to store sessions. | spring:session |  | 
| save-mode | org.springframework.session.SaveMode | Sessions save mode. Determines how session changes are tracked and saved to the session store. | on-set-attribute |  | 

### spring.session.servlet.xx
描述:
类型:`org.springframework.boot.autoconfigure.session.SessionProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.session.SessionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| filter-dispatcher-types | java.util.Set<org.springframework.boot.web.servlet.DispatcherType> | Session repository filter dispatcher types. | ["async","error","request"] |  | 
| filter-order | java.lang.Integer | Session repository filter order. |  |  | 

### spring.sql.init.xx
描述:
类型:`org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties`
源类型:`org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| continue-on-error | java.lang.Boolean | Whether initialization should continue when an error occurs. | false |  | 
| data-locations | java.util.List<java.lang.String> | Locations of the data (DML) scripts to apply to the database. |  |  | 
| encoding | java.nio.charset.Charset | Encoding of the schema and data scripts. |  |  | 
| mode | org.springframework.boot.sql.init.DatabaseInitializationMode | Mode to apply when determining whether initialization should be performed. | embedded |  | 
| password | java.lang.String | Password of the database to use when applying initialization scripts (if different). |  |  | 
| platform | java.lang.String | Platform to use in the default schema or data script locations, schema-${platform}.sql and data-${platform}.sql. | all |  | 
| schema-locations | java.util.List<java.lang.String> | Locations of the schema (DDL) scripts to apply to the database. |  |  | 
| separator | java.lang.String | Statement separator in the schema and data scripts. | ; |  | 
| username | java.lang.String | Username of the database to use when applying initialization scripts (if different). |  |  | 

### spring.task.execution.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties`
源类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | task- |  | 

### spring.task.execution.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| allow-core-thread-timeout | java.lang.Boolean | Whether core threads are allowed to time out. This enables dynamic growing and shrinking of the pool. | true |  | 
| core-size | java.lang.Integer | Core number of threads. | 8 |  | 
| keep-alive | java.time.Duration | Time limit for which threads may remain idle before being terminated. | 60s |  | 
| max-size | java.lang.Integer | Maximum allowed number of threads. If tasks are filling up the queue, the pool can expand up to that size to accommodate the load. Ignored if the queue is unbounded. |  |  | 
| queue-capacity | java.lang.Integer | Queue capacity. An unbounded capacity does not increase the pool and therefore ignores the "max-size" property. |  |  | 

### spring.task.execution.shutdown.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties$Shutdown`
源类型:`org.springframework.boot.autoconfigure.task.TaskExecutionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| await-termination | java.lang.Boolean | Whether the executor should wait for scheduled tasks to complete on shutdown. | false |  | 
| await-termination-period | java.time.Duration | Maximum time the executor should wait for remaining tasks to complete. |  |  | 

### spring.task.scheduling.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties`
源类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| thread-name-prefix | java.lang.String | Prefix to use for the names of newly created threads. | scheduling- |  | 

### spring.task.scheduling.pool.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Pool`
源类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| size | java.lang.Integer | Maximum allowed number of threads. | 1 |  | 

### spring.task.scheduling.shutdown.xx
描述:
类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties$Shutdown`
源类型:`org.springframework.boot.autoconfigure.task.TaskSchedulingProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| await-termination | java.lang.Boolean | Whether the executor should wait for scheduled tasks to complete on shutdown. | false |  | 
| await-termination-period | java.time.Duration | Maximum time the executor should wait for remaining tasks to complete. |  |  | 

### spring.thymeleaf.xx
描述:
类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties`
源类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
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

### spring.thymeleaf.reactive.xx
描述:
类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Reactive`
源类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| chunked-mode-view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that should be the only ones executed in CHUNKED mode when a max chunk size is set. |  |  | 
| full-mode-view-names | java.lang.String[] | Comma-separated list of view names (patterns allowed) that should be executed in FULL mode even if a max chunk size is set. |  |  | 
| max-chunk-size | org.springframework.util.unit.DataSize | Maximum size of data buffers used for writing to the response. Templates will execute in CHUNKED mode by default if this is set. | 0B |  | 
| media-types | java.util.List<org.springframework.http.MediaType> | Media types supported by the view technology. |  |  | 

### spring.thymeleaf.servlet.xx
描述:
类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| content-type | org.springframework.util.MimeType | Content-Type value written to HTTP responses. | text/html |  | 
| produce-partial-output-while-processing | java.lang.Boolean | Whether Thymeleaf should start writing partial output as soon as possible or buffer until template processing is finished. | true |  | 

### spring.transaction.xx
描述:
类型:`org.springframework.boot.autoconfigure.transaction.TransactionProperties`
源类型:`org.springframework.boot.autoconfigure.transaction.TransactionProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| default-timeout | java.time.Duration | Default transaction timeout. If a duration suffix is not specified, seconds will be used. |  |  | 
| rollback-on-commit-failure | java.lang.Boolean | Whether to roll back on commit failures. |  |  | 

### spring.web.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| locale | java.util.Locale | Locale to use. By default, this locale is overridden by the "Accept-Language" header. |  |  | 
| locale-resolver | org.springframework.boot.autoconfigure.web.WebProperties$LocaleResolver | Define how the locale should be resolved. | accept-header |  | 

### spring.web.resources.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| add-mappings | java.lang.Boolean | Whether to enable default resource handling. | true |  | 
| static-locations | java.lang.String[] | Locations of static resources. Defaults to classpath:[/META-INF/resources/, /resources/, /static/, /public/]. | ["classpath:/META-INF/resources/","classpath:/resources/","classpath:/static/","classpath:/public/"] |  | 

### spring.web.resources.cache.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| period | java.time.Duration | Cache period for the resources served by the resource handler. If a duration suffix is not specified, seconds will be used. Can be overridden by the 'spring.web.resources.cache.cachecontrol' properties. |  |  | 
| use-last-modified | java.lang.Boolean | Whether we should use the "lastModified" metadata of the files in HTTP caching headers. | true |  | 

### spring.web.resources.cache.cachecontrol.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache$Cachecontrol`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Cache`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cache-private | java.lang.Boolean | Indicate that the response message is intended for a single user and must not be stored by a shared cache. |  |  | 
| cache-public | java.lang.Boolean | Indicate that any cache may store the response. |  |  | 
| max-age | java.time.Duration | Maximum time the response should be cached, in seconds if no duration suffix is not specified. |  |  | 
| must-revalidate | java.lang.Boolean | Indicate that once it has become stale, a cache must not use the response without re-validating it with the server. |  |  | 
| no-cache | java.lang.Boolean | Indicate that the cached response can be reused only if re-validated with the server. |  |  | 
| no-store | java.lang.Boolean | Indicate to not cache the response in any case. |  |  | 
| no-transform | java.lang.Boolean | Indicate intermediaries (caches and others) that they should not transform the response content. |  |  | 
| proxy-revalidate | java.lang.Boolean | Same meaning as the "must-revalidate" directive, except that it does not apply to private caches. |  |  | 
| s-max-age | java.time.Duration | Maximum time the response should be cached by shared caches, in seconds if no duration suffix is not specified. |  |  | 
| stale-if-error | java.time.Duration | Maximum time the response may be used when errors are encountered, in seconds if no duration suffix is not specified. |  |  | 
| stale-while-revalidate | java.time.Duration | Maximum time the response can be served after it becomes stale, in seconds if no duration suffix is not specified. |  |  | 

### spring.web.resources.chain.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| cache | java.lang.Boolean | Whether to enable caching in the Resource chain. | true |  | 
| compressed | java.lang.Boolean | Whether to enable resolution of already compressed resources (gzip, brotli). Checks for a resource name with the '.gz' or '.br' file extensions. | false |  | 
| enabled | java.lang.Boolean | Whether to enable the Spring Resource Handling chain. By default, disabled unless at least one strategy has been enabled. |  |  | 

### spring.web.resources.chain.strategy.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.web.resources.chain.strategy.content.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Content`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the content Version Strategy. | false |  | 
| paths | java.lang.String[] | Comma-separated list of patterns to apply to the content Version Strategy. | ["/**"] |  | 

### spring.web.resources.chain.strategy.fixed.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy$Fixed`
源类型:`org.springframework.boot.autoconfigure.web.WebProperties$Resources$Chain$Strategy`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| enabled | java.lang.Boolean | Whether to enable the fixed Version Strategy. | false |  | 
| paths | java.lang.String[] | Comma-separated list of patterns to apply to the fixed Version Strategy. | ["/**"] |  | 
| version | java.lang.String | Version string to use for the fixed Version Strategy. |  |  | 

### spring.webflux.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties`
源类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| base-path | java.lang.String | Base path for all web handlers. |  |  | 
| static-path-pattern | java.lang.String | Path pattern used for static resources. | /** |  | 

### spring.webflux.format.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Format`
源类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| date | java.lang.String | Date format to use, for example 'dd/MM/yyyy'. |  |  | 
| date-time | java.lang.String | Date-time format to use, for example 'yyyy-MM-dd HH:mm:ss'. |  |  | 
| time | java.lang.String | Time format to use, for example 'HH:mm:ss'. |  |  | 

### spring.webflux.multipart.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties`
源类型:`org.springframework.boot.autoconfigure.web.reactive.ReactiveMultipartProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| file-storage-directory | java.lang.String | Directory used to store file parts larger than 'maxInMemorySize'. Default is a directory named 'spring-multipart' created under the system temporary directory. Ignored when streaming is enabled. |  |  | 
| headers-charset | java.nio.charset.Charset | Character set used to decode headers. | UTF-8 |  | 
| max-disk-usage-per-part | org.springframework.util.unit.DataSize | Maximum amount of disk space allowed per part. Default is -1 which enforces no limits. Ignored when streaming is enabled. | -1B |  | 
| max-headers-size | org.springframework.util.unit.DataSize | Maximum amount of memory allowed per headers section of each part. Set to -1 to enforce no limits. | 10KB |  | 
| max-in-memory-size | org.springframework.util.unit.DataSize | Maximum amount of memory allowed per part before it's written to disk. Set to -1 to store all contents in memory. Ignored when streaming is enabled. | 256KB |  | 
| max-parts | java.lang.Integer | Maximum number of parts allowed in a given multipart request. Default is -1 which enforces no limits. | -1 |  | 
| streaming | java.lang.Boolean | Whether to stream directly from the parsed input buffer stream without storing in memory nor file. Default is non-streaming. | false |  | 

### spring.webflux.session.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Session`
源类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|

### spring.webflux.session.cookie.xx
描述:
类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Cookie`
源类型:`org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$Session`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| same-site | org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties$SameSite | SameSite attribute value for session Cookies. |  | true,server.reactive.session.cookie.same-site | 

### spring.webservices.xx
描述:
类型:`org.springframework.boot.autoconfigure.webservices.WebServicesProperties`
源类型:`org.springframework.boot.autoconfigure.webservices.WebServicesProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| path | java.lang.String | Path that serves as the base URI for the services. | /services |  | 

### spring.webservices.servlet.xx
描述:
类型:`org.springframework.boot.autoconfigure.webservices.WebServicesProperties$Servlet`
源类型:`org.springframework.boot.autoconfigure.webservices.WebServicesProperties`

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| init | java.util.Map<java.lang.String,java.lang.String> | Servlet init parameters to pass to Spring Web Services. |  |  | 
| load-on-startup | java.lang.Integer | Load on startup priority of the Spring Web Services servlet. | -1 |  | 

### 未分类
描述:

| 名称 | 类型 | 描述 | 默认值 | 过期替代 |
|-----|------|-----|-------|---------|
| server.connection-timeout | java.time.Duration | null |  | true,error,Each server behaves differently. Use server specific properties instead. | 
| server.jetty.accesslog.date-format | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.accesslog.extended-format | null | null |  | true,error,server.jetty.accesslog.format | 
| server.jetty.accesslog.locale | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.accesslog.log-cookies | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.accesslog.log-latency | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.accesslog.log-server | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.accesslog.time-zone | null | null |  | true,error,server.jetty.accesslog.custom-format | 
| server.jetty.max-http-post-size | org.springframework.util.unit.DataSize | null |  | true,error,server.jetty.max-http-form-post-size | 
| server.max-http-post-size | java.lang.Integer | Maximum size in bytes of the HTTP post content. | 0 | true,error,Use dedicated property for each container. | 
| server.servlet.encoding.enabled | java.lang.Boolean | Whether to enable http encoding support. | true |  | 
| server.servlet.path | java.lang.String | Path of the main dispatcher servlet. | / | true,error,spring.mvc.servlet.path | 
| server.tomcat.max-http-post-size | org.springframework.util.unit.DataSize | null |  | true,error,server.tomcat.max-http-form-post-size | 
| server.undertow.buffers-per-region | java.lang.Integer | Number of buffer per region. |  | true,error | 
| server.use-forward-headers | java.lang.Boolean | null |  | true,error,server.forward-headers-strategy,Replaced to support additional strategies. | 
| spring.activemq.pool.create-connection-on-startup | java.lang.Boolean | Whether to create a connection on startup. Can be used to warm up the pool on startup. | true | true,error | 
| spring.activemq.pool.expiry-timeout | java.time.Duration | Connection expiration timeout. | 0ms | true,error | 
| spring.activemq.pool.maximum-active-session-per-connection | null | null |  | true,spring.activemq.pool.max-sessions-per-connection | 
| spring.activemq.pool.reconnect-on-exception | java.lang.Boolean | Reset the connection when a "JMSException" occurs. | true | true,error | 
| spring.aop.auto | java.lang.Boolean | Add @EnableAspectJAutoProxy. | true |  | 
| spring.aop.proxy-target-class | java.lang.Boolean | Whether subclass-based (CGLIB) proxies are to be created (true), as opposed to standard Java interface-based proxies (false). | true |  | 
| spring.application.admin.enabled | java.lang.Boolean | Whether to enable admin features for the application. | false |  | 
| spring.application.admin.jmx-name | java.lang.String | JMX name of the application admin MBean. | org.springframework.boot:type=Admin,name=SpringApplication |  | 
| spring.artemis.pool.maximum-active-session-per-connection | null | null |  | true,spring.artemis.pool.max-sessions-per-connection | 
| spring.autoconfigure.exclude | java.util.List<java.lang.Class> | Auto-configuration classes to exclude. |  |  | 
| spring.batch.initializer.enabled | java.lang.Boolean | Create the required batch tables on startup if necessary. Enabled automatically if no custom table prefix is set or if a custom schema is configured. |  | true,error,spring.batch.jdbc.initialize-schema | 
| spring.batch.job.enabled | java.lang.Boolean | Execute all Spring Batch jobs in the context on startup. | true |  | 
| spring.couchbase.bootstrap-hosts | java.util.List<java.lang.String> | Couchbase nodes (host or IP address) to bootstrap from. |  | true,error,spring.couchbase.connection-string | 
| spring.couchbase.bucket.name | java.lang.String | Name of the bucket to connect to. |  | true,error,A bucket is no longer auto-configured. | 
| spring.couchbase.bucket.password | java.lang.String | Password of the bucket. |  | true,error,A bucket is no longer auto-configured. | 
| spring.couchbase.env.bootstrap.http-direct-port | java.lang.Integer | Port for the HTTP bootstrap. |  | true,error | 
| spring.couchbase.env.bootstrap.http-ssl-port | java.lang.Integer | Port for the HTTPS bootstrap. |  | true,error | 
| spring.couchbase.env.endpoints.key-value | java.lang.Integer | Number of sockets per node against the key/value service. |  | true,error | 
| spring.couchbase.env.endpoints.query | java.lang.Integer | Number of sockets per node against the query (N1QL) service. |  | true,error | 
| spring.couchbase.env.endpoints.queryservice.max-endpoints | java.lang.Integer | Maximum number of sockets per node. |  | true,error,spring.couchbase.env.io.max-endpoints | 
| spring.couchbase.env.endpoints.queryservice.min-endpoints | java.lang.Integer | Minimum number of sockets per node. |  | true,error,spring.couchbase.env.io.min-endpoints | 
| spring.couchbase.env.endpoints.view | java.lang.Integer | Number of sockets per node against the view service. |  | true,error | 
| spring.couchbase.env.endpoints.viewservice.max-endpoints | java.lang.Integer | Maximum number of sockets per node. |  | true,error,spring.couchbase.env.io.max-endpoints | 
| spring.couchbase.env.endpoints.viewservice.min-endpoints | java.lang.Integer | Minimum number of sockets per node. |  | true,error,spring.couchbase.env.io.min-endpoints | 
| spring.couchbase.env.timeouts.socket-connect | java.time.Duration | Socket connect connections timeout. |  | true,error | 
| spring.dao.exceptiontranslation.enabled | java.lang.Boolean | Whether to enable the PersistenceExceptionTranslationPostProcessor. | true |  | 
| spring.data.cassandra.connection.connection-timeout | null | null | 5s |  | 
| spring.data.cassandra.jmx-enabled | java.lang.Boolean | Whether to enable JMX reporting. Default to false as Cassandra JMX reporting is not compatible with Dropwizard Metrics. |  | true,error,Cassandra no longer provides JMX metrics. | 
| spring.data.cassandra.load-balancing-policy | java.lang.Class | Class name of the load balancing policy. The class must have a default constructor. |  | true,error | 
| spring.data.cassandra.pool.max-queue-size | java.lang.Integer | null |  | true,error,spring.data.cassandra.request.throttler.max-queue-size | 
| spring.data.cassandra.pool.pool-timeout | java.time.Duration | Pool timeout when trying to acquire a connection from a host's pool. |  | true,error,No longer available. | 
| spring.data.cassandra.reconnection-policy | java.lang.Class | Class name of the reconnection policy. The class must have a default constructor. |  | true,error | 
| spring.data.cassandra.repositories.type | org.springframework.boot.autoconfigure.data.RepositoryType | Type of Cassandra repositories to enable. | auto |  | 
| spring.data.cassandra.retry-policy | java.lang.Class | Class name of the retry policy. The class must have a default constructor. |  | true,error | 
| spring.data.couchbase.consistency | org.springframework.data.couchbase.core.query.Consistency | null |  | true,error | 
| spring.data.couchbase.repositories.type | org.springframework.boot.autoconfigure.data.RepositoryType | Type of Couchbase repositories to enable. | auto |  | 
| spring.data.elasticsearch.cluster-name | java.lang.String | Elasticsearch cluster name. |  | true,error | 
| spring.data.elasticsearch.cluster-nodes | java.lang.String | Comma-separated list of cluster node addresses. |  | true,error | 
| spring.data.elasticsearch.properties | java.util.Map<java.lang.String,java.lang.String> | Additional properties used to configure the client. |  | true,error | 
| spring.data.elasticsearch.repositories.enabled | java.lang.Boolean | Whether to enable Elasticsearch repositories. | true |  | 
| spring.data.jdbc.repositories.enabled | java.lang.Boolean | Whether to enable JDBC repositories. | true |  | 
| spring.data.jpa.repositories.bootstrap-mode | org.springframework.data.repository.config.BootstrapMode | Bootstrap mode for JPA repositories. | default |  | 
| spring.data.jpa.repositories.enabled | java.lang.Boolean | Whether to enable JPA repositories. | true |  | 
| spring.data.ldap.repositories.enabled | java.lang.Boolean | Whether to enable LDAP repositories. | true |  | 
| spring.data.mongodb.repositories.type | org.springframework.boot.autoconfigure.data.RepositoryType | Type of Mongo repositories to enable. | auto |  | 
| spring.data.neo4j.auto-index | null | Auto index mode. | none | true,error,Automatic index creation is no longer supported. | 
| spring.data.neo4j.embedded.enabled | java.lang.Boolean | Whether to enable embedded mode if the embedded driver is available. |  | true,error,Embedded mode is no longer supported, please use Testcontainers instead. | 
| spring.data.neo4j.open-in-view | java.lang.Boolean | Register OpenSessionInViewInterceptor that binds a Neo4j Session to the thread for the entire processing of the request. |  | true,error | 
| spring.data.neo4j.password | java.lang.String | Login password of the server. |  | true,warning,spring.neo4j.authentication.password | 
| spring.data.neo4j.repositories.enabled | java.lang.Boolean | Whether to enable Neo4j repositories. | true | true,error,spring.data.neo4j.repositories.type | 
| spring.data.neo4j.repositories.type | org.springframework.boot.autoconfigure.data.RepositoryType | Type of Neo4j repositories to enable. | auto |  | 
| spring.data.neo4j.uri | java.lang.String | URI used by the driver. Auto-detected by default. |  | true,warning,spring.neo4j.uri | 
| spring.data.neo4j.use-native-types | java.lang.Boolean | Whether to use Neo4j native types wherever possible. |  | true,error,Native type support is now built-in. | 
| spring.data.neo4j.username | java.lang.String | Login user of the server. |  | true,warning,spring.neo4j.authentication.password | 
| spring.data.r2dbc.repositories.enabled | java.lang.Boolean | Whether to enable R2DBC repositories. | true |  | 
| spring.data.redis.repositories.enabled | java.lang.Boolean | Whether to enable Redis repositories. | true |  | 
| spring.datasource.jmx-enabled | java.lang.Boolean | Whether to enable JMX support (if provided by the underlying pool). | false | true,error,spring.datasource.tomcat.jmx-enabled | 
| spring.elasticsearch.jest.connection-timeout | java.time.Duration | Connection timeout. |  | true,error | 
| spring.elasticsearch.jest.multi-threaded | java.lang.Boolean | Whether to enable connection requests from multiple execution threads. |  | true,error | 
| spring.elasticsearch.jest.password | java.lang.String | Login password. |  | true,error | 
| spring.elasticsearch.jest.proxy.host | java.lang.String | Proxy host the HTTP client should use. |  | true,error | 
| spring.elasticsearch.jest.proxy.port | java.lang.Integer | Proxy port the HTTP client should use. |  | true,error | 
| spring.elasticsearch.jest.read-timeout | java.time.Duration | Read timeout. |  | true,error | 
| spring.elasticsearch.jest.uris | java.util.List<java.lang.String> | Comma-separated list of the Elasticsearch instances to use. |  | true,error | 
| spring.elasticsearch.jest.username | java.lang.String | Login username. |  | true,error | 
| spring.flyway.error-handlers | org.flywaydb.core.api.errorhandler.ErrorHandler[] | null |  | true,error,Flyway pro edition only. | 
| spring.flyway.sql-migration-suffix | java.lang.String | null |  | true,error,spring.flyway.sql-migration-suffixes | 
| spring.flyway.vault-secrets | java.util.List<java.lang.String> | null |  | true,error,Removed in the open source release of Flyway 7.12. | 
| spring.flyway.vault-token | java.lang.String | null |  | true,error,Removed in the open source release of Flyway 7.12. | 
| spring.flyway.vault-url | java.lang.String | null |  | true,error,Removed in the open source release of Flyway 7.12. | 
| spring.git.properties | java.lang.String | Resource reference to a generated git info properties file. |  | true,error,spring.info.git.location | 
| spring.http.converters.preferred-json-mapper | java.lang.String | Preferred JSON mapper to use for HTTP message conversion. By default, auto-detected according to the environment. |  | true,error,spring.mvc.converters.preferred-json-mapper | 
| spring.http.encoding.charset | java.nio.charset.Charset | Charset of HTTP requests and responses. Added to the Content-Type header if not set explicitly. |  | true,error,server.servlet.encoding.charset | 
| spring.http.encoding.enabled | java.lang.Boolean | Whether to enable http encoding support. | true | true,error,server.servlet.encoding.enabled | 
| spring.http.encoding.force | java.lang.Boolean | Whether to force the encoding to the configured charset on HTTP requests and responses. | false | true,error,server.servlet.encoding.force | 
| spring.http.encoding.force-request | java.lang.Boolean | Whether to force the encoding to the configured charset on HTTP requests. Defaults to true when force has not been specified. | true | true,error,server.servlet.encoding.force-request | 
| spring.http.encoding.force-response | java.lang.Boolean | Whether to force the encoding to the configured charset on HTTP responses. | false | true,error,server.servlet.encoding.force-response | 
| spring.http.encoding.mapping | java.util.Map<java.util.Locale,java.nio.charset.Charset> | Locale in which to encode mapping. |  | true,error,server.servlet.encoding.mapping | 
| spring.http.log-request-details | java.lang.Boolean | Whether logging of (potentially sensitive) request details at DEBUG and TRACE level is allowed. | false | true,error,spring.mvc.log-request-details | 
| spring.jackson.joda-date-time-format | java.lang.String | Joda date time format string. If not configured, "date-format" is used as a fallback if it is configured with a format string. |  | true,error | 
| spring.jmx.default-domain | java.lang.String | JMX domain name. |  |  | 
| spring.jmx.enabled | java.lang.Boolean | Expose management beans to the JMX domain. | false |  | 
| spring.jmx.server | java.lang.String | MBeanServer bean name. | mbeanServer |  | 
| spring.jmx.unique-names | java.lang.Boolean | Whether unique runtime object names should be ensured. | false |  | 
| spring.jta.bitronix.properties.allow-multiple-lrc | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.asynchronous2-pc | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.background-recovery-interval | java.lang.Integer | null |  | true,error | 
| spring.jta.bitronix.properties.background-recovery-interval-seconds | java.lang.Integer | null |  | true,error | 
| spring.jta.bitronix.properties.current-node-only-recovery | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.debug-zero-resource-transaction | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.default-transaction-timeout | java.lang.Integer | null |  | true,error | 
| spring.jta.bitronix.properties.disable-jmx | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.exception-analyzer | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.filter-log-status | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.force-batching-enabled | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.forced-write-enabled | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.graceful-shutdown-interval | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.jndi-transaction-synchronization-registry-name | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.jndi-user-transaction-name | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.journal | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.log-part1-filename | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.log-part2-filename | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.max-log-size-in-mb | java.lang.Integer | null |  | true,error | 
| spring.jta.bitronix.properties.resource-configuration-filename | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.server-id | java.lang.String | null |  | true,error | 
| spring.jta.bitronix.properties.skip-corrupted-logs | java.lang.Boolean | null |  | true,error | 
| spring.jta.bitronix.properties.warn-about-zero-resource-transaction | java.lang.Boolean | null |  | true,error | 
| spring.jta.enabled | java.lang.Boolean | Whether to enable JTA support. | true |  | 
| spring.jta.narayana.default-timeout | java.time.Duration | Transaction timeout. If a duration suffix is not specified, seconds will be used. | 60s | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.expiry-scanners | java.util.List<java.lang.String> | Comma-separated list of expiry scanners. | ["com.arjuna.ats.internal.arjuna.recovery.ExpiredTransactionStatusManagerScanner"] | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.log-dir | java.lang.String | Transaction object store directory. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.one-phase-commit | java.lang.Boolean | Whether to enable one phase commit optimization. | true | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.periodic-recovery-period | java.time.Duration | Interval in which periodic recovery scans are performed. If a duration suffix is not specified, seconds will be used. | 120s | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-backoff-period | java.time.Duration | Back off period between first and second phases of the recovery scan. If a duration suffix is not specified, seconds will be used. | 10s | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-db-pass | java.lang.String | Database password to be used by the recovery manager. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-db-user | java.lang.String | Database username to be used by the recovery manager. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-jms-pass | java.lang.String | JMS password to be used by the recovery manager. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-jms-user | java.lang.String | JMS username to be used by the recovery manager. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.recovery-modules | java.util.List<java.lang.String> | Comma-separated list of recovery modules. |  | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.transaction-manager-id | java.lang.String | Unique transaction manager id. | 1 | true,error,Narayana support has moved to third party starter. | 
| spring.jta.narayana.xa-resource-orphan-filters | java.util.List<java.lang.String> | Comma-separated list of orphan filters. |  | true,error,Narayana support has moved to third party starter. | 
| spring.kafka.admin.ssl.keystore-location | org.springframework.core.io.Resource | Location of the key store file. |  | true,error,spring.kafka.admin.ssl.key-store-location | 
| spring.kafka.admin.ssl.keystore-password | java.lang.String | Store password for the key store file. |  | true,error,spring.kafka.admin.ssl.key-store-password | 
| spring.kafka.admin.ssl.truststore-location | org.springframework.core.io.Resource | Location of the trust store file. |  | true,error,spring.kafka.admin.ssl.trust-store-location | 
| spring.kafka.admin.ssl.truststore-password | java.lang.String | Store password for the trust store file. |  | true,error,spring.kafka.admin.ssl.trust-store-password | 
| spring.kafka.consumer.ssl.keystore-location | org.springframework.core.io.Resource | Location of the key store file. |  | true,error,spring.kafka.consumer.ssl.key-store-location | 
| spring.kafka.consumer.ssl.keystore-password | java.lang.String | Store password for the key store file. |  | true,error,spring.kafka.consumer.ssl.key-store-password | 
| spring.kafka.consumer.ssl.truststore-location | org.springframework.core.io.Resource | Location of the trust store file. |  | true,error,spring.kafka.consumer.ssl.trust-store-location | 
| spring.kafka.consumer.ssl.truststore-password | java.lang.String | Store password for the trust store file. |  | true,error,spring.kafka.consumer.ssl.trust-store-password | 
| spring.kafka.producer.ssl.keystore-location | org.springframework.core.io.Resource | Location of the key store file. |  | true,error,spring.kafka.producer.ssl.key-store-location | 
| spring.kafka.producer.ssl.keystore-password | java.lang.String | Store password for the key store file. |  | true,error,spring.kafka.producer.ssl.key-store-password | 
| spring.kafka.producer.ssl.truststore-location | org.springframework.core.io.Resource | Location of the trust store file. |  | true,error,spring.kafka.producer.ssl.trust-store-location | 
| spring.kafka.producer.ssl.truststore-password | java.lang.String | Store password for the trust store file. |  | true,error,spring.kafka.producer.ssl.trust-store-password | 
| spring.kafka.ssl.keystore-location | org.springframework.core.io.Resource | Location of the key store file. |  | true,error,spring.kafka.ssl.key-store-location | 
| spring.kafka.ssl.keystore-password | java.lang.String | Store password for the key store file. |  | true,error,spring.kafka.ssl.key-store-password | 
| spring.kafka.ssl.truststore-location | org.springframework.core.io.Resource | Location of the trust store file. |  | true,error,spring.kafka.ssl.trust-store-location | 
| spring.kafka.ssl.truststore-password | java.lang.String | Store password for the trust store file. |  | true,error,spring.kafka.ssl.trust-store-password | 
| spring.kafka.streams.cache-max-bytes-buffering | java.lang.Integer | null |  | true,error,spring.kafka.streams.cache-max-size-buffering | 
| spring.liquibase.check-change-log-location | java.lang.Boolean | Check the change log location exists. | true | true,error,Liquibase has it's own check that checks if the change log location exists making this property redundant. | 
| spring.mvc.converters.preferred-json-mapper | java.lang.String | Preferred JSON mapper to use for HTTP message conversion. By default, auto-detected according to the environment. |  |  | 
| spring.mvc.favicon.enabled | java.lang.Boolean | Whether to enable resolution of favicon.ico. |  | true,error | 
| spring.mvc.formcontent.filter.enabled | java.lang.Boolean | Whether to enable Spring's FormContentFilter. | true |  | 
| spring.mvc.formcontent.putfilter.enabled | java.lang.Boolean | Whether to enable Spring's HttpPutFormContentFilter. | true | true,error,spring.mvc.formcontent.filter.enabled | 
| spring.mvc.hiddenmethod.filter.enabled | java.lang.Boolean | Whether to enable Spring's HiddenHttpMethodFilter. | false |  | 
| spring.mvc.locale | java.util.Locale | null |  | true,error,spring.web.locale | 
| spring.mvc.locale-resolver | org.springframework.boot.autoconfigure.web.WebProperties$LocaleResolver | null |  | true,error,spring.web.locale-resolver | 
| spring.rabbitmq.dynamic | java.lang.Boolean | Whether to create an AmqpAdmin bean. | true |  | 
| spring.rabbitmq.listener.simple.transaction-size | java.lang.Integer | null |  | true,error | 
| spring.rabbitmq.publisher-confirms | java.lang.Boolean | null |  | true,error | 
| spring.rabbitmq.template.queue | java.lang.String | null |  | true,error,spring.rabbitmq.template.default-receive-queue | 
| spring.reactor.stacktrace-mode.enabled | null | Whether Reactor should collect stacktrace information at runtime. | false | true,spring.reactor.debug-agent.enabled | 
| spring.resources.add-mappings | java.lang.Boolean | null |  | true,error,spring.web.resources.add-mappings | 
| spring.resources.cache.cachecontrol.cache-private | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.cache-private | 
| spring.resources.cache.cachecontrol.cache-public | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.cache-public | 
| spring.resources.cache.cachecontrol.max-age | java.time.Duration | null |  | true,error,spring.web.resources.cache.cachecontrol.max-age | 
| spring.resources.cache.cachecontrol.must-revalidate | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.must-revalidate | 
| spring.resources.cache.cachecontrol.no-cache | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.no-cache | 
| spring.resources.cache.cachecontrol.no-store | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.no-store | 
| spring.resources.cache.cachecontrol.no-transform | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.no-transform | 
| spring.resources.cache.cachecontrol.proxy-revalidate | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.cachecontrol.proxy-revalidate | 
| spring.resources.cache.cachecontrol.s-max-age | java.time.Duration | null |  | true,error,spring.web.resources.cache.cachecontrol.s-max-age | 
| spring.resources.cache.cachecontrol.stale-if-error | java.time.Duration | null |  | true,error,spring.web.resources.cache.cachecontrol.stale-if-error | 
| spring.resources.cache.cachecontrol.stale-while-revalidate | java.time.Duration | null |  | true,error,spring.web.resources.cache.cachecontrol.stale-while-revalidate | 
| spring.resources.cache.period | java.time.Duration | null |  | true,error,spring.web.resources.cache.period | 
| spring.resources.cache.use-last-modified | java.lang.Boolean | null |  | true,error,spring.web.resources.cache.use-last-modified | 
| spring.resources.chain.cache | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.cache | 
| spring.resources.chain.compressed | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.compressed | 
| spring.resources.chain.enabled | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.enabled | 
| spring.resources.chain.gzipped | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.compressed | 
| spring.resources.chain.html-application-cache | java.lang.Boolean | null |  | true,error | 
| spring.resources.chain.strategy.content.enabled | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.strategy.content.enabled | 
| spring.resources.chain.strategy.content.paths | java.lang.String[] | null |  | true,error,spring.web.resources.chain.strategy.content.paths | 
| spring.resources.chain.strategy.fixed.enabled | java.lang.Boolean | null |  | true,error,spring.web.resources.chain.strategy.fixed.enabled | 
| spring.resources.chain.strategy.fixed.paths | java.lang.String[] | null |  | true,error,spring.web.resources.chain.strategy.fixed.paths | 
| spring.resources.chain.strategy.fixed.version | java.lang.String | null |  | true,error,spring.web.resources.chain.strategy.fixed.version | 
| spring.resources.static-locations | java.lang.String[] | null |  | true,error,spring.web.resources.static-locations | 
| spring.sql.init.enabled | java.lang.Boolean | Whether basic script-based initialization of an SQL database is enabled. | true | true,warning,spring.sql.init.mode | 
| spring.webflux.hiddenmethod.filter.enabled | java.lang.Boolean | Whether to enable Spring's HiddenHttpMethodFilter. | false |  | 
| spring.webflux.session.timeout | null | null | 30m |  | 
| spring.webservices.wsdl-locations | java.util.List<java.lang.String> | Comma-separated list of locations of WSDLs and accompanying XSDs to be exposed as beans. |  |  | 
