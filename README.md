# dubbo-demo
简单dubbo例子
lok-dubbo-consumer为客户(消费)端工程 war
url为localhost:8081/xxx

lok-dubbo-provider为服务端工程 war
url为localhost:8082/xxx

lok-dubbo-interface为服务接口暴露工程 jar

目前用spring的注解管理依赖注入，未使用dubbo的@Reference和@Service，因用dubbo的存在与spring容器加载冲突问题，网上有比较多资料，这里暂时不探讨。
