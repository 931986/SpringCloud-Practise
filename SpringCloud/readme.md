


1.eureka  定位服务，实现负载均衡和中间服务的故障转移
2.load banlancer 将请求均匀的分摊到多个服务上，从而达到系统的高可用
默认轮询算法，并且可以更换默认的负载均衡算法,
ribbonClient本质是配置  服务的分配给客户的方式

3.openForeign
简化ribbon的操作
Feign集成了Ribbon，利用Ribbon维护了Payment的服务列表信息，并且通过轮询实现了客户端的负载均衡，而与Ribbon不同的是，通过Feign值需要定义服务绑定接口且一声明式的方法，优雅而简单的实现了服务调用