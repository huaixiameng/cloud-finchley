cloud-finchley:父工程，主要对依赖的版本进行控制
eureka-service:对服务进行监控；client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。
    eureka server 从每个client实例接收心跳消息。 如果心跳超时，则通常将该实例从注册server中删除。
eureka-client:服务端，进行业务处理
eureka-feign:通过feign进行服务端之间的调用，feign自带负载均衡功能（feign集成了ribbon），默认规则为轮询
eureka-hystrix-feign:hystrix（断路器）服务调用失败自定义返回信息;feign自带断路器hystrix,只需要进行配置
eureka-zuul:zuul的主要功能是路由转发和过滤器


