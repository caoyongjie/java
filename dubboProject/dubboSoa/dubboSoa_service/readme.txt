1、打包
2、拷贝 dubboSoa_service-0.0.1-SNAPSHOT.jar 包到 server 的lib(依赖包)中
3、执行
java -Djava.ext.dirs=D:\workspaceXiaoXian\dubboProject\dubboSoa\dubboSoa_service_server\target\dubboSoa_service_server\WEB-INF\lib\ -cp dubboSoa_service-0.0.1-SNAPSHOT.jar com.soa.dubbo.container.AppProvider

